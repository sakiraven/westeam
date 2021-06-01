package cn.service.client;

import java.util.List;

import cn.entity.UserInformation;

public interface ClientUserInformationService {

	/**
	 * @return ��ѯ������ϸ��Ϣ
	 */
	List<UserInformation> ClientQuery(int aid);
	

	/**
	 * @param userInfoId
	 * @return �鿴����
	 */
	List<UserInformation> ClientFriendQuery(int userInfoId);
	
	/**
	 * @param money
	 * @param aid
	 * @return ��ֵ���
	 */
	int ClientChongZhi(int money , int userInfoId);
	
	/**
	 * @param userInfoId
	 * @return �޸��û���Ϣ
	 * aid�޸�
	 */
	int ClientUpDate(UserInformation ui);
	
	/**
	 * @param userName
	 * @return ��������
	 */
	UserInformation ClientFriendQuery(String userName);
	
	/**
	 * @param userId
	 * @return �鿴�����û�����Ϣ
	 */
	UserInformation ClientCtName(int userId);
}
