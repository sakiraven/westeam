package cn.dao;

import java.util.List;

import cn.entity.Message;

public interface MessageDao {

	/**
	 * @param sendToId
	 * @return �鿴������������
	 */
	List<Message> MdQuery(int sendToId,int sendId);
	/**
	 * @param me
	 * @return ������Ϣ
	 */
	int MdInser(Message me);
	
	/**
	 * @param sendToId
	 * @param sendId
	 * @return ���ķ����˵��Ķ�״̬
	 */
	int MdUpDate(int sendToId,int sendId);
	
	/**
	 * @param message_Id
	 * @return �û�ɾ�� ��Ϣ
	 */
	int MdDelete(int sendTo,int send);
	
	/**
	 * @param aid
	 * @return ����Ա������
	 */
	int MdMgrDelete(int aid);
	
	/**
	 * @param sendToId
	 * @param sendId
	 * @return ɾ�����
	 */
	int MdUpDateDel(int sendToId,int sendId);
	
	/**
	 * @param sendToId
	 * @param sendId
	 * @return ɾ������ʱ�����Ϣ
	 */
	int MdClear(int sendToId,int sendId);
}
