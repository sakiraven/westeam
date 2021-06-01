package cn.dao;

import java.util.List;

import cn.entity.Notice;

public interface NoticeDao {

	/**
	 * @param user_info_id
	 * @return �û��鿴֪ͨ
	 */
	List<Notice> NdQuery(int user_info_id);
	
	/**
	 * @param sendUserId
	 * @param sendToUserId
	 * @param type
	 * @return �鿴 ��Ӻ������� �Ƿ����
	 */
	List<Notice> NdQuery(int sendUserId,int sendToUserId,int type);
	
	/**
	 * @param Notice
	 * @return �û�ɾ��֪ͨ
	 */
	int NdDelete(int nic_id);
	
	/**
	 * @param user_id
	 * @return ɾ���˻� ������
	 */
	int NdMgrDelete(int user_id);
	
	/**
	 * @param user_Info_Id
	 * @param notice
	 * @return ����Ա����֪ͨ��Ϣ
	 */
	int NdInsert(int user_Info_Id,String message);
	
	/**
	 * @param sendUserId
	 * @param sentToUserId
	 * @return ���ͺ������������Ϣ
	 */
	int NdInsert(int sendUserId,int sendToUserId,String name);
	
	
}
