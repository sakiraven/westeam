package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.PathDao;

public class PathDaoImpl extends BaseDao implements PathDao {

	public String ShopPicturePath() {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String path=null;
		String sql = "SELECT * FROM path WHERE path_id=1";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				path = rs.getString("picture_path");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return path;
	}

	@Override
	public String UserPicturePath() {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String path=null;
		String sql = "SELECT * FROM path WHERE path_id=2";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				path = rs.getString("picture_path");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return path;
	}

}
