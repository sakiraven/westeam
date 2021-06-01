package cn.dao;

import java.util.List;

import cn.entity.Message;

public interface MessageDao {

	/**
	 * @param sendToId
	 * @return 查看单人所有收信
	 */
	List<Message> MdQuery(int sendToId,int sendId);
	/**
	 * @param me
	 * @return 发送消息
	 */
	int MdInser(Message me);
	
	/**
	 * @param sendToId
	 * @param sendId
	 * @return 更改发件人的阅读状态
	 */
	int MdUpDate(int sendToId,int sendId);
	
	/**
	 * @param message_Id
	 * @return 用户删除 信息
	 */
	int MdDelete(int sendTo,int send);
	
	/**
	 * @param aid
	 * @return 管理员清空外键
	 */
	int MdMgrDelete(int aid);
	
	/**
	 * @param sendToId
	 * @param sendId
	 * @return 删除标记
	 */
	int MdUpDateDel(int sendToId,int sendId);
	
	/**
	 * @param sendToId
	 * @param sendId
	 * @return 删除好友时清空消息
	 */
	int MdClear(int sendToId,int sendId);
}
