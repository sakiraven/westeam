package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.MessageDao;
import cn.entity.Message;

public class MessageDaoImpl extends BaseDao implements MessageDao{

	public List<Message> MdQuery(int  sendToId, int sendId ) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM message WHERE sendto_user_id = ? AND send_user_id = ? AND del_status!=? OR sendto_user_id = ? AND send_user_id = ? AND del_status!=?";
		List<Message> getlt = new ArrayList<Message>();
		Message me = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, sendToId);
			pst.setInt(2, sendId);
			pst.setInt(3, sendId);
			pst.setInt(4, sendId);
			pst.setInt(5, sendToId);
			pst.setInt(6, sendId);
			rs = pst.executeQuery();
			while(rs.next()){
				me = new Message();
				me.setMessage(rs.getString("message"));
				me.setMessage_Id(rs.getInt("message_Id"));
				me.setSend_User_Id(rs.getInt("send_user_id"));
				me.setSendto_User_Id(rs.getInt("sendto_User_Id"));
				me.setDelStatus(rs.getInt("del_status"));
				me.setStatus(rs.getInt("status"));
				getlt.add(me);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		
		return getlt;
	}

	public int MdInser(Message me) {
		String sql = "insert message(send_user_id,sendto_user_id,message) values(?,?,?)";
		Object ot [] = {me.getSend_User_Id(),me.getSendto_User_Id(),me.getMessage()};
		return super.untilUpDate(ot, sql);
	}

	public int MdUpDate(int sendToId, int sendId) {
		String sql = "UPDATE message SET `status` = 1 WHERE sendto_user_id =? AND send_user_id = ?";
		Object ot[]={sendId, sendToId};
		return super.untilUpDate(ot, sql);
	}

	public int MdDelete(int sendTo,int send) {
		String sql = "delete from message where sendto_user_id = ? and send_user_id= ? and del_status=? or sendto_user_id = ? and send_user_id= ? and del_status=?";
		Object ot[]={sendTo,send,sendTo,send,sendTo,sendTo};
		return super.untilUpDate(ot, sql);
	}

	public int MdMgrDelete(int aid) {
		String sql = "DELETE FROM message WHERE send_user_id in (SELECT user_info_id FROM user_information WHERE aid =  ?) OR sendto_user_id in (SELECT user_info_id FROM user_information WHERE aid =  ?)";
		Object ot[]={aid,aid};
		return super.untilUpDate(ot, sql);
	}

	public int MdUpDateDel(int sendToId, int sendId) {
		String sql = "UPDATE message SET `del_status` = ? WHERE sendto_user_id =? AND send_user_id = ? or sendto_user_id =? AND send_user_id = ? ";
		Object ot[]={sendId,sendToId,sendId,sendId,sendToId};
		return super.untilUpDate(ot, sql);
	}

	public int MdClear(int sendToId, int sendId) {
		String sql = "delete from message where sendto_user_id = ? and send_user_id= ? or sendto_user_id = ? and send_user_id= ? ";
		Object ot[]={sendToId,sendId,sendId,sendToId};
		return super.untilUpDate(ot, sql);
	}

}
