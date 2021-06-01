package cn.dao;

import java.util.List;

import cn.entity.UserGames;

/**
 * @author �û���ӿ�
 *
 */
public interface UserGamesDao {
	/**
	 * @param ug �û���Ϸ�����
	 * @return ������Ϸ�� ���û�id
	 */
	int UgdInsert(int user_info_id,int ciid[]);
	
	/**
	 * @param user_info_id
	 * @return �û�ɾ����Ϸ
	 */
	int UgdDelete(int user_info_id,int ciid);
	
	/**
	 * @param aid
	 * @return ����Ա����û���Ϸ
	 */
	int UgdMgrDelete(int aid);
	/**
	 * @return ��ѯ���� ����
	 */
	List<String> UgdQuery(int user_info_id);
	
	/**
	 * @param user_info_id
	 * @return ��ո����
	 */
	int UgdMgrDeleteCiid(int ciid);
}
