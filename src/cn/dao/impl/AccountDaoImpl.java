package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import cn.dao.AccountDao;
import cn.dao.BaseDao;
import cn.entity.Account;

/**
 * @author 账号 (实现类)
 * 
 */
public class AccountDaoImpl extends BaseDao implements AccountDao {

	/* 
	 * 账号登录方法 参数String
	 */
	@Override
	public Account AdQuery(String UserName, String password) {
		Connection con=super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Account at = null;
		String sql = "select * from account where `name` = ? and `password`=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, UserName);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if(rs.next()){
				at = new Account();
				at.setAdmin(rs.getInt("admin"));
				at.setAid(rs.getInt("aid"));
				at.setName(rs.getString("name"));
				at.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		return at;
	}

	
	/* 
	 * @账号注册方法 参数 account实体对象 只添加 账号密码
	 */
	public int AdInsert(Account at) {
		String sql = "INSERT INTO `account` (`name`, `password`) VALUES(?, ?) ;";
		Object ot[] = {at.getName(),at.getPassword()};
		return super.untilUpDate(ot, sql);
	}

	/* 
	 * 修改账号表
	 */
	@Override
	public int AdUpData(Account at) {
		String sql = "UPDATE  `account` SET `password` = ? WHERE `aid` = ? ;";
		Object ot[] = {at.getPassword(),at.getAid()};	
		return super.untilUpDate(ot, sql);
	}


	/*
	 * 删除账号
	 */
	@Override
	public int AdMgrDelete(int aid) {
		String sql="DELETE FROM `account`  WHERE `aid` = ? ;";
		Object ot[]={aid};
		return super.untilUpDate(ot, sql);
	}


	/* 
	 * 
	 */
	public Account AdQuery(String UserName) {
		Connection con=super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Account at = null;
		String sql = "select * from account where name = ?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, UserName);
			rs = pst.executeQuery();
			if(rs.next()){
				at = new Account();
				at.setAdmin(rs.getInt("admin"));
				at.setAid(rs.getInt("aid"));
				at.setName(rs.getString("name"));
				at.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		return at;
	}


	public List<Account> AdQuery() {
		Connection con=super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Account at = null;
		List<Account> getlt = new ArrayList<Account>();
		String sql = "select * from account where admin!=1";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				at = new Account();
				at.setAdmin(rs.getInt("admin"));
				at.setAid(rs.getInt("aid"));
				at.setName(rs.getString("name"));
				at.setPassword(rs.getString("password"));
				getlt.add(at);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		return getlt;
	}

}
