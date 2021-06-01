package cn.dao;

import java.util.List;

import cn.entity.Account;
import cn.entity.CommodityInformation;
import cn.entity.Friends;
import cn.entity.UserInformation;

/**
 * �û���Ϣ dao�ӿ�
 * 
 */
public interface UserInformationDao {

	/**
	 * @param aid
	 * @return �˺���������
	 */
	UserInformation UidQuery(String userName);
	
	/**
	 * @return ��ѯ������ϸ��Ϣ key=0��ѯ���� key=1 ��ѯ����
	 */
	List<UserInformation> UidQuery(int key, int aid);

	/**
	 * @param uiUser_Information ����
	 * @return������ϸ��Ϣ aid �ǳ� ����aid
	 */
	int UidInsertInfo(UserInformation ui);

	/**
	 * @param aid�˺�id ���
	 * @return������ϸ��Ϣ aid ͷ�� �ǳ� ����aid
	 */
	int UidMgrDelete(int aid);

	/**
	 * @param uiUser_Information ����
	 * @return �޸ķ��� ��ֹ�޸�aid ������
	 */
	int UidUpDate(UserInformation ui);

	/**
	 * @param userInfoId
	 * @return �鿴�������к���
	 */
	List<UserInformation> UidFriendQuery(int userInfoId);

	/**
	 * @param money
	 * @param aid
	 * @return ��ֵ���
	 */
	int UidChongZhi(int money , int userInfoId);
	
	/**
	 * @param money
	 * @param aid
	 * @return ���ѽ��
	 */
	int UidXiaoFei(int money , int userInfoId);
	
	/**
	 * @param userInfoId
	 * @return �鿴���
	 */
	int UidQuery(int userInfoId);
	
	/**
	 * @param ctid
	 * @return ��������id��ѯ�û�id
	 */
	List<UserInformation> UidQueryComment(int ctid);
	
	/**
	 * @return �������û���Ϣ
	 */
	UserInformation UidQueryCtName(int userId);

}
