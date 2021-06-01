package cn.dao;

import java.util.List;

import cn.entity.Notice;

public interface NoticeDao {

	/**
	 * @param user_info_id
	 * @return 用户查看通知
	 */
	List<Notice> NdQuery(int user_info_id);
	
	/**
	 * @param sendUserId
	 * @param sendToUserId
	 * @param type
	 * @return 查看 添加好友请求 是否存在
	 */
	List<Notice> NdQuery(int sendUserId,int sendToUserId,int type);
	
	/**
	 * @param Notice
	 * @return 用户删除通知
	 */
	int NdDelete(int nic_id);
	
	/**
	 * @param user_id
	 * @return 删除账户 清空外键
	 */
	int NdMgrDelete(int user_id);
	
	/**
	 * @param user_Info_Id
	 * @param notice
	 * @return 管理员插入通知信息
	 */
	int NdInsert(int user_Info_Id,String message);
	
	/**
	 * @param sendUserId
	 * @param sentToUserId
	 * @return 发送好友请求插入信息
	 */
	int NdInsert(int sendUserId,int sendToUserId,String name);
	
	
}
