package cn.dao;

import java.util.List;

import cn.entity.Friends;
import cn.entity.UserInformation;

public interface FriendsDao {

	
	
	/**
	 * @param user_id
	 * @param friend_id
	 * @return ��Ӻ���
	 */
	int FdInsert(int user_id,int friend_id);
	
	/**
	 * @param aid
	 * @return ������
	 */
	int FdMgrDelete(int aid);
	
	/**
	 * @param user_id
	 * @param friend
	 * @return �û�ɾ������
	 */
	int FdDelete(int user_id, int friend_id);
}
