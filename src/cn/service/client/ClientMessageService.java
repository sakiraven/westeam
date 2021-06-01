package cn.service.client;

import java.util.List;

import cn.entity.Message;



public interface ClientMessageService {
	/**
	 * @param sendToId
	 * @return 查看单人所有收信
	 */
	List<Message> ClientQuery(int sendToId, int sendId);
	
	/**
	 * @param me
	 * @return 发送消息
	 */
	int ClientInser(Message me);
	
	/**
	 * @param message_Id
	 * @return 用户删除 信息
	 */
	int ClientDelete(int sendToId,int sendId);
	
	/**
	 * @param sendToId
	 * @return 查看单人所有收信
	 */
	List<Message> ClientQueryStatus(int sendToId, int sendId);
}
