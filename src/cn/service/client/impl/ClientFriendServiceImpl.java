package cn.service.client.impl;

import java.util.List;

import cn.dao.BaseDao;
import cn.dao.FriendsDao;
import cn.dao.MessageDao;
import cn.dao.NoticeDao;
import cn.dao.UserInformationDao;
import cn.dao.impl.FriendsDaoImpl;
import cn.dao.impl.MessageDaoImpl;
import cn.dao.impl.NoticeDaoImpl;
import cn.dao.impl.UserInformationDaoImpl;
import cn.entity.Message;
import cn.entity.UserInformation;
import cn.service.client.ClientFriendService;

public class ClientFriendServiceImpl extends BaseDao implements
		ClientFriendService {

	public int ClientInsert(int user_id, int friend_id) {
		UserInformationDao uid = new UserInformationDaoImpl();
		FriendsDao fd = new FriendsDaoImpl();
		return fd.FdInsert(user_id, friend_id);
	}

	public int ClientDelete(int user_id, int friend_id) {
		FriendsDao fd = new FriendsDaoImpl();
		MessageDao md = new MessageDaoImpl();
		md.MdClear(friend_id, user_id);
		return fd.FdDelete(user_id, friend_id);
	}

	public int ClientInsert(int sendUserId, int sendToUserId, String name) {
		UserInformationDao uid = new UserInformationDaoImpl();
		NoticeDao nd = new NoticeDaoImpl();
		int key1 = 0;
		for (UserInformation item : uid.UidFriendQuery(sendUserId)) {
			int friend=item.getUser_Info_Id();
			if(friend==sendToUserId)
			key1=1;
		}
		
		int key2 = nd.NdQuery(sendUserId, sendToUserId, 0).size();
		if (key1 > 0 || key2 > 0)
			return 0;
		return nd.NdInsert(sendUserId, sendToUserId, name);
	}

}
