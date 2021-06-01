package cn.service.client;

import java.util.List;

import cn.entity.Message;



public interface ClientMessageService {
	/**
	 * @param sendToId
	 * @return �鿴������������
	 */
	List<Message> ClientQuery(int sendToId, int sendId);
	
	/**
	 * @param me
	 * @return ������Ϣ
	 */
	int ClientInser(Message me);
	
	/**
	 * @param message_Id
	 * @return �û�ɾ�� ��Ϣ
	 */
	int ClientDelete(int sendToId,int sendId);
	
	/**
	 * @param sendToId
	 * @return �鿴������������
	 */
	List<Message> ClientQueryStatus(int sendToId, int sendId);
}
