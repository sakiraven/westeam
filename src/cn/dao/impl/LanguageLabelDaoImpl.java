package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.LanguageLabelDao;
import cn.entity.Comment;
import cn.entity.Language_Label;

/**
 * @author 语言标签实现类
 * 
 */
public class LanguageLabelDaoImpl extends BaseDao implements LanguageLabelDao {

	/*
	 * 查询标签
	 */
	public List<Language_Label> LldQuery() {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Language_Label> GetLdLt = new ArrayList<Language_Label>();
		Language_Label ll = null;
		String sql = "select * from language_label ";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ll = new Language_Label();
				ll.setLanguage(rs.getString("language"));
				ll.setLanguage_Id(rs.getInt("language_id"));
				GetLdLt.add(ll);
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
	public int LldInsert(String language) {
		String sql = "insert language_label (language) values(?)";
		Object ot[] = { language };
		return super.untilUpDate(ot, sql);
	}

	/**
	 * @param Language_Id
	 *            语言id数组
	 * @param language
	 *            语言标签数组
	 * @return 更新标签
	 */
	public int LldUpDate(int Language_Id[], String language[]) {
		// sb.append("REPLACE INTO language_label (language_id,`language`) VALUES ");
		// int a = 0;
		// for (int i = 0; i < language.length; i++) {
		// sb.append("(?,?)");
		// if (language.length - 1 != i)
		// sb.append(",");
		// ot[a] = Language_Id[i];
		// ot[a + 1] = language[i];
		// a += 2;
		// }
		StringBuffer sb = new StringBuffer();
		Object ot[] = new Object[language.length * 3];
		sb.append("UPDATE `language_label` SET `language` = CASE language_id ");

		for (int i = 0; i < Language_Id.length; i++) {
			sb.append(" WHEN ? THEN ? ");
		}
		sb.append(" END WHERE language_id IN (");

		for (int i = 0; i < Language_Id.length; i++) {
			sb.append(" ? ");
			if (i != Language_Id.length - 1)
				sb.append(",");
		}
		sb.append(")");
		int a = 0;
		for (int i = 0; i < Language_Id.length; i++) {
			ot[a] = Language_Id[i];
			ot[a+1] = language[i];
			a += 2;
		}
		for (int i = 0; i < Language_Id.length; i++) {
			ot[a] = Language_Id[i];
			a++;
		}
		return super.untilUpDate(ot, sb.toString());
	}

	/*
	 * 删除标签
	 */
	public int LldDelete(int Language_Id[]) {
		StringBuffer sql = new StringBuffer("delete from language_label where ");
		Object ot[]=new Object[Language_Id.length];
		for (int i = 0; i < ot.length; i++) {
			ot[i]=Language_Id[i];
			sql.append(" language_id = ?");
			if(i!=ot.length-1)
				sql.append(" or");
		}
		return super.untilUpDate(ot, sql.toString());
	}

	/*
	 * 查看商品符合语言
	 */
	public List<String> LldQuery(int ciid) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<String> GetLdLt = new ArrayList<String>();
		String sql = "SELECT * FROM language_label WHERE language_id IN (SELECT language_id FROM language_label_index WHERE ciid = ?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ciid);
			rs = pst.executeQuery();
			while (rs.next()) {
				GetLdLt.add(rs.getString("language"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetLdLt;
	}

//	public List<String> LldQuery(String languageLabel) {
//		Connection con = super.getCon();
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		List<String> GetLdLt = new ArrayList<String>();
//		String sql = "SELECT * FROM language_label WHERE language = ?";
//		try {
//			pst = con.prepareStatement(sql);
//			pst.setString(1, languageLabel);
//			rs = pst.executeQuery();
//			while (rs.next()) {
//				GetLdLt.add(rs.getString("language"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			super.closeAll(con, pst, rs);
//		}
//		return GetLdLt;
//	}

}
