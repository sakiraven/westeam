package cn.service.client;

public interface ClientFriendService {
	/**
	 * @param user_id
	 * @param friend_id
	 * @return ��Ӻ���
	 */
	int ClientInsert(int user_id,int friend_id);
	
	/**
	 * @param user_id
	 * @param friend
	 * @return �û�ɾ������
	 */
	int ClientDelete(int user_id, int friend_id);
	
	/**
	 * @param user_id
	 * @param friend_id
	 * @return ��Ӻ�������֪ͨ
	 */
	int ClientInsert(int sendUserId,int sendToUserId,String name);
}
