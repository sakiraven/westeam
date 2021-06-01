package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.UserInformationDao;
import cn.entity.Account;
import cn.entity.CommodityInformation;
import cn.entity.Friends;
import cn.entity.UserInformation;

/**
 * @author 用户信息 (实现类)
 * 
 */
public class UserInformationDaoImpl extends BaseDao implements
		UserInformationDao {
	/**
	 * @return 查询所有详细信息 key=0查询所有 key=1
	 */
	public List<UserInformation> UidQuery(int key, int aid) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		UserInformation ui = null;
		List<UserInformation> GetUiLt = new ArrayList<UserInformation>();
		String sql = "select * from user_information";
		if (key > 0) {
			sql = "select * from user_information where aid = ?";
		}
		try {
			pst = con.prepareStatement(sql);
			if (key > 0) {
				pst.setInt(1, aid);
			}
			rs = pst.executeQuery();
			while (rs.next()) {
				ui = new UserInformation();
				ui.setAid(rs.getInt("aid"));
				ui.setNickName(rs.getString("nickname"));
				ui.setPicture(rs.getString("picture"));
				ui.setUser_Info_Id(rs.getInt("user_info_id"));
				ui.setBlance(rs.getInt("balance"));
				GetUiLt.add(ui);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetUiLt;
	}

	/**
	 * @return 插入信息
	 */
	public int UidInsertInfo(UserInformation ui) {
		String sql = "insert user_information(aid,nickname) values(?,?)";
		Object ot[] = { ui.getAid(), ui.getNickName() };
		return super.untilUpDate(ot, sql);
	}

	/**
	 * @return 删除 用户信息表信息
	 */
	public int UidMgrDelete(int aid) {
		String sql = "delete from user_information where aid = ?";
		Object ot[] = { aid };
		return super.untilUpDate(ot, sql);
	}

	/**
	 * @return 更改user_infomation信息 （头像 和 昵称）
	 */
	public int UidUpDate(UserInformation ui) {
		String sql = "update user_information set picture = ?,nickname = ? where aid = ?";
		Object ot[] = { ui.getPicture(), ui.getNickName(), ui.getAid() };
		return super.untilUpDate(ot, sql);
	}

	/**
	 * @param user_id
	 * @return 查询好友
	 */
	public List<UserInformation> UidFriendQuery(int user_id) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		UserInformation ui = null;
		List<UserInformation> getlt = new ArrayList<UserInformation>();
		String sql = "SELECT * FROM `user_information` WHERE user_info_id IN( SELECT friend_id FROM friends WHERE user_id = ?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, user_id);
			rs = pst.executeQuery();
			while (rs.next()) {
				ui = new UserInformation();
				ui.setAid(rs.getInt("aid"));
				ui.setNickName(rs.getString("nickname"));
				ui.setPicture(rs.getString("picture"));
				ui.setUser_Info_Id(rs.getInt("user_info_id"));
				getlt.add(ui);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return getlt;
	}

	public int UidChongZhi(int money, int userInfoId) {
		String sql = "update  user_information set balance = balance+? where user_info_id = ?";
		Object ot[]={money ,userInfoId};
		return super.untilUpDate(ot, sql);
	}

	public int UidXiaoFei(int money, int userInfoId) {
		String sql = "update user_information set balance = balance-? where user_info_id = ?";
		Object ot[]={money, userInfoId};
		return super.untilUpDate(ot, sql);
	}

	public int UidQuery(int userInfoId) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "Select * from user_information where user_info_id=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1,userInfoId);
			rs = pst.executeQuery();
			if(rs.next()){
				return rs.getInt("balance");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		
		return 0;
	}

	public List<UserInformation> UidQueryComment(int ctid) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		UserInformation ui = null;
		List<UserInformation> getlt = new ArrayList<UserInformation>();
		String sql = "SELECT * FROM user_information WHERE user_info_id IN (SELECT user_info_id FROM COMMENT WHERE comment_id=?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ctid);
			rs = pst.executeQuery();
			while (rs.next()) {
				ui = new UserInformation();
				ui.setAid(rs.getInt("aid"));
				ui.setNickName(rs.getString("nickname"));
				ui.setPicture(rs.getString("picture"));
				ui.setUser_Info_Id(rs.getInt("user_info_id"));
				getlt.add(ui);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return getlt;
	}
	
	public UserInformation UidQuery(String userName) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM `user_information` WHERE aid = (SELECT aid FROM `account` WHERE NAME = ? and admin=0)";
		UserInformation ui = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, userName);
			rs = pst.executeQuery();
			while(rs.next()){
				ui = new UserInformation();
				ui.setAid(rs.getInt("aid"));
				ui.setUser_Info_Id(rs.getInt("user_info_id"));
				ui.setNickName(rs.getString("nickname"));
				ui.setPicture(rs.getString("picture"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		return ui;
	}

	public UserInformation UidQueryCtName(int userId) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		UserInformation ui = null;
		String sql = "SELECT * FROM user_information WHERE user_info_id=?";
			
		try{
			pst= con.prepareStatement(sql);
			pst.setInt(1, userId);
			rs = pst.executeQuery();
			while (rs.next()) {
				ui = new UserInformation();
				ui.setAid(rs.getInt("aid"));
				ui.setNickName(rs.getString("nickname"));
				ui.setPicture(rs.getString("picture"));
				ui.setUser_Info_Id(rs.getInt("user_info_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return ui;
	}
}
