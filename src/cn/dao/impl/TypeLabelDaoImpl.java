package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.entity.TypeLabel;

public class TypeLabelDaoImpl extends BaseDao implements cn.dao.TypeLabelDao {

	/*
	 * 查询标签
	 */
	public List<TypeLabel> TldQuery() {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<TypeLabel> GetLdLt = new ArrayList<TypeLabel>();
		TypeLabel tl = null;
		String sql = "select * from type_label ";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				tl = new TypeLabel();
				tl.setType(rs.getString("type"));
				tl.setType_Id(rs.getInt("type_id"));
				GetLdLt.add(tl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetLdLt;
	}

	/*
	 * 查询标签
	 */
	public List<String> TldQuery(int ciid) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<String> GetLdLt = new ArrayList<String>();
		String sql = "select * from type_label where type_id in(select type_id from type_label_index where ciid = ?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ciid);
			rs = pst.executeQuery();
			while (rs.next()) {
				GetLdLt.add(rs.getString("type"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetLdLt;
	}
	
	/*
	 * 插入新标签
	 */
	public int TldInsert(String type) {
		String sql = "insert type_label (type) values(?)";
		Object ot[] = { type };
		return super.untilUpDate(ot, sql);
	}

	/**
	 * @param type_Id
	 *            类型id数组
	 * @param type
	 *            类型标签数组
	 * @return 更新标签
	 */
	public int TldUpDate(int type_Id[], String type[]) {
//		StringBuffer sb = new StringBuffer();
//		sb.append("REPLACE INTO type_label (type_id,`type`) VALUES ");
//		Object ot[] = new Object[type.length * 2];
//		int a = 0;
//		for (int i = 0; i < type.length; i++) {
//			sb.append("(?,?)");
//			if (type.length - 1 != i)
//				sb.append(",");
//				ot[a] = type_Id[i];
//			ot[a + 1] = type[i];
//			a = +2;
//		}
		StringBuffer sb = new StringBuffer();
		Object ot[] = new Object[type_Id.length * 3];
		sb.append("UPDATE `type_label` SET `type` = CASE type_id ");

		for (int i = 0; i < type_Id.length; i++) {
			sb.append(" WHEN ? THEN ? ");
		}
		sb.append(" END WHERE type_id IN (");

		for (int i = 0; i < type_Id.length; i++) {
			sb.append(" ? ");
			if (i != type_Id.length - 1)
				sb.append(",");
		}
		sb.append(")");
		int a = 0;
		for (int i = 0; i < type_Id.length; i++) {
			ot[a] = type_Id[i];
			ot[a+1] = type[i];
			a += 2;
		}
		for (int i = 0; i < type_Id.length; i++) {
			ot[a] = type_Id[i];
			a++;
		}
		return super.untilUpDate(ot, sb.toString());
	}

	/* 
	 * 删除标签
	 */
	public int TldDelete(int type_Id[]) {
		StringBuffer sql = new StringBuffer("delete from type_label where ");
		Object ot[]=new Object[type_Id.length];
		for (int i = 0; i < ot.length; i++) {
			ot[i]=type_Id[i];
			sql.append(" type_id = ?");
			if(i!=ot.length-1)
				sql.append(" or");
		}
		return super.untilUpDate(ot, sql.toString());
	}

}
