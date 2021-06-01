package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.FriendsDao;
import cn.entity.Friends;
import cn.entity.UserInformation;

public class FriendsDaoImpl extends BaseDao implements FriendsDao {
	public int FdInsert(int user_id, int friend_id) {
		//String sql = "insert frivends (user_id,friend_id) values(?,?)";
		String sql  = "REPLACE INTO `friends` (`user_id`,`friend_id`) VALUES (?,?),(?,?)";
		Object ot[] = { user_id, friend_id ,friend_id,user_id};
		return super.untilUpDate(ot, sql);
	}

	public int FdDelete(int user_id, int friend_id) {
		String sql = "delete from friends where user_id=? and friend_id=? OR  user_id=? AND friend_id=? ";
		Object ot[] = { user_id, friend_id,friend_id, user_id};
		return super.untilUpDate(ot, sql);
	}

	public int FdMgrDelete(int aid) {
		String sql = "DELETE FROM friends WHERE user_id in (SELECT user_info_id FROM user_information WHERE aid = ?) or friend_id in (SELECT user_info_id FROM user_information WHERE aid = ?)";
		Object ot[] = { aid,aid };
		return super.untilUpDate(ot, sql);
	}

	
}
