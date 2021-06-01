package cn.service.client;

import java.util.List;

import cn.entity.UserInformation;

public interface ClientUserGamesService {

	/**
	 * @param ug �û���Ϸ�����
	 * @return ������Ϸ�� ���û�id
	 * 0�б���Ϸ -1 �쳣 -2����
	 */
	int ClientInsert(int userInfoId,int ciid[],int money);
	
	/**
	 * @param user_info_id
	 * @return �û�ɾ����Ϸ
	 */
	int ClientDelete(int user_Info_Id,int ciid);
	
	/**
	 * @return ��ѯ���� ����
	 */
	List<String> ClientQuery(int user_Info_Id);
	
	/**
	 * @param ciid
	 * @return ȷ����Ϸ���Ƿ������Ϸ
	 */
	int ClientQueryRe(int ciid,int userInfoId);
}
