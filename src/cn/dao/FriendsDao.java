package cn.dao;

import java.util.List;

import cn.entity.Friends;
import cn.entity.UserInformation;

public interface FriendsDao {

	
	
	/**
	 * @param user_id
	 * @param friend_id
	 * @return 添加好友
	 */
	int FdInsert(int user_id,int friend_id);
	
	/**
	 * @param aid
	 * @return 清空外键
	 */
	int FdMgrDelete(int aid);
	
	/**
	 * @param user_id
	 * @param friend
	 * @return 用户删除好友
	 */
	int FdDelete(int user_id, int friend_id);
}
