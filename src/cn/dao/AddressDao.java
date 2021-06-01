package cn.dao;

import java.util.List;

import cn.entity.Address;

/**
 * @author ��ַ dao�ӿ�
 *
 */
public interface AddressDao {
	/**
	 * @return ��ѯ��ַ key=0��ѯ���� key=1��ѯָ���û���ַ
	 */
	List<Address> AdQuery(int user_info_id,int key);
	
	/**
	 * @param as��ַ����
	 * @return ��ֵ ��ַ��
	 */
	int AdInsert(Address as);
	
	/**
	 * @param user_info_id �û���Ϣid
	 * @return ɾ����ַ
	 */
	int AdDelete(int user_info_id);
	
	/**
	 * @param as ��ַʵ�����
	 * @return ���±� ��ַ �Ƿ�Ĭ�ϵ�ַ 
	 */
	int AdUpDate(Address as);
}
