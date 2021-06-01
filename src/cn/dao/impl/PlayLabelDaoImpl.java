package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.PlayLabelDao;
import cn.entity.PlayLabel;

/**
 * @author 玩法标签 实现类
 *
 */
public class PlayLabelDaoImpl extends BaseDao implements PlayLabelDao {

	/*
	 * 查询标签
	 */
	public List<PlayLabel> PldQuery() {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<PlayLabel> GetLdLt = new ArrayList<PlayLabel>();
		PlayLabel pl = null;
		String sql = "select * from play_label ";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				pl = new PlayLabel();
				pl.setPlay(rs.getString("play"));
				pl.setPlay_Id(rs.getInt("play_id"));
				GetLdLt.add(pl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetLdLt;
	}

	
	public List<String> PldQuery(int ciid) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<String> GetLdLt = new ArrayList<String>();
		String sql = "SELECT * FROM `play_label` WHERE `play_id` in (SELECT `play_id` FROM `play_label_index` WHERE ciid = ?) ";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ciid);
			rs = pst.executeQuery();
			while (rs.next()) {
				GetLdLt.add(rs.getString("play"));
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
	public int PldInsert(String play) {
		String sql = "insert play_label (play) values(?)";
		Object ot[] = { play };
		return super.untilUpDate(ot, sql);
	}

	/**
	 * @param Play_Id
	 *            语言id数组
	 * @param play
	 *            语言标签数组
	 * @return 更新标签
	 */
	public int PldUpDate(int play_Id[], String play[]) {
		StringBuffer sb = new StringBuffer();
		Object ot[] = new Object[play_Id.length * 3];
		sb.append("UPDATE `play_label` SET `play` = CASE play_id ");

		for (int i = 0; i < play_Id.length; i++) {
			sb.append(" WHEN ? THEN ? ");
		}
		sb.append(" END WHERE play_id IN (");

		for (int i = 0; i < play_Id.length; i++) {
			sb.append(" ? ");
			if (i != play_Id.length - 1)
				sb.append(",");
		}
		sb.append(")");
		int a = 0;
		for (int i = 0; i < play_Id.length; i++) {
			ot[a] = play_Id[i];
			ot[a+1] = play[i];
			a += 2;
		}
		for (int i = 0; i < play_Id.length; i++) {
			ot[a] = play_Id[i];
			a++;
		}

		return super.untilUpDate(ot, sb.toString());
	}

	/* 
	 * 删除标签
	 */
	public int PldDelete(int paly_Id[]) {
		StringBuffer sql = new StringBuffer("delete from play_label where ");
		Object ot[]=new Object[paly_Id.length];
		for (int i = 0; i < ot.length; i++) {
			ot[i]=paly_Id[i];
			sql.append(" play_id = ?");
			if(i!=ot.length-1)
				sql.append(" or");
		}
		return super.untilUpDate(ot, sql.toString());
	}

}
