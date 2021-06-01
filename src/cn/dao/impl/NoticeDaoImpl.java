package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import cn.dao.BaseDao;
import cn.dao.NoticeDao;
import cn.entity.Notice;

public class NoticeDaoImpl extends BaseDao implements NoticeDao {

	/* 
	 * 用户查询管理员通知
	 */
	public List<Notice> NdQuery(int user_info_id) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Notice ne = null;
		List<Notice> getlt = new ArrayList<Notice>();
		String sql = "select * from notice where user_info_id=?";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, user_info_id);
			rs = pst.executeQuery();
			while(rs.next()){
				ne = new Notice();
				ne.setMgr_Message(rs.getString("Mgr_message"));
				ne.setNic_Id(rs.getInt("nic_id"));
				ne.setSendToUserId(rs.getInt("user_info_id"));
				ne.setType(rs.getInt("type"));
				ne.setSendUserId(rs.getInt("send_user_id"));
				getlt.add(ne);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		
		return getlt;
	}

	/* 
	 * 查看添加用户请求是否存在
	 */
	public List<Notice> NdQuery(int sendUserId,int sendToUserId,int type) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Notice ne = null;
		List<Notice> getlt = new ArrayList<Notice>();
		String sql = "select * from notice where user_info_id=? and send_user_id= ? and type = ?";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, sendToUserId);
			pst.setInt(2, sendUserId);
			pst.setInt(3, type);
			rs = pst.executeQuery();
			while(rs.next()){
				ne = new Notice();
				ne.setMgr_Message(rs.getString("Mgr_message"));
				ne.setNic_Id(rs.getInt("nic_id"));
				ne.setSendToUserId(rs.getInt("user_info_id"));
				ne.setType(rs.getInt("type"));
				ne.setSendUserId(rs.getInt("send_user_id"));
				getlt.add(ne);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		
		return getlt;
	}
	
	/* 
	 * 用户删除管理员通知
	 */
	public int NdDelete(int nic_id) {
		String sql = "delete from notice where nic_id = ?";
		Object ot [] = {nic_id};
		return super.untilUpDate(ot, sql);
	}

	/*
	 * 管理员删除账户清空外键
	 */
	public int NdMgrDelete(int aid) {
		String sql = "delete from notice where user_info_id in (select user_info_id from user_information where aid = ?) or send_user_id in(select send_user_id from user_information where aid = ?)";
		Object ot [] = {aid,aid};
		return super.untilUpDate(ot, sql);
	}

	/* 
	 * 插入通知
	 */
	@Override
	public int NdInsert(int userInfoId,String mgrMessage) {
		String sql = "insert notice(user_info_id,mgr_message) values(?,?)";
		Object ot [] = {userInfoId,mgrMessage};
		return super.untilUpDate(ot, sql);
	}

	public int NdInsert(int sendUserId, int sendToUserId,String name) {
		String sql = "insert notice(send_user_id,user_info_id,mgr_message,type) values(?,?,?,0)";
		String message="昵称为"+name+"的用户请求加你好友";
		Object ot [] = {sendUserId,sendToUserId,message};
		return super.untilUpDate(ot, sql);
	}

}
