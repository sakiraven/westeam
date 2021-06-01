package cn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.entity.UserInformation;

public class BaseDao {
	String className = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/steam";
	String user = "root";
	String password = "123456";

	public Connection getCon() {
		Connection con = null;
		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void closeAll(Connection con, PreparedStatement pst, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (pst != null)
				pst.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int untilUpDate(Object[] ot, String sql) {
		Connection con = this.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		int key = 0;
		try {
			pst = con.prepareStatement(sql);
			if (pst != null) {
				for (int i = 0; i < ot.length; i++) {
					pst.setObject(i + 1, ot[i]);
				}
			}
			key = pst.executeUpdate();
		} catch (SQLException e) {
			key = -1;
			e.printStackTrace();
		} finally {
			this.closeAll(con, pst, rs);
		}
		return key;
	}
		
}
