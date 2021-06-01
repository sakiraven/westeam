package cn.service.client;

public interface ClientFriendService {
	/**
	 * @param user_id
	 * @param friend_id
	 * @return 添加好友
	 */
	int ClientInsert(int user_id,int friend_id);
	
	/**
	 * @param user_id
	 * @param friend
	 * @return 用户删除好友
	 */
	int ClientDelete(int user_id, int friend_id);
	
	/**
	 * @param user_id
	 * @param friend_id
	 * @return 添加好友请求通知
	 */
	int ClientInsert(int sendUserId,int sendToUserId,String name);
}
