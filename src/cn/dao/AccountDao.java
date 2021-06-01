package cn.dao;

import java.util.List;

import cn.entity.Account;

/**
 * @author �˺� dao�ӿ�
 * 
 */
public interface AccountDao {
	/**
	 * @return �鿴�����û�
	 */
	List<Account> AdQuery();

	/**
	 * @return ��¼;
	 */
	Account AdQuery(String userName, String password);

	/**
	 * @return ע��
	 */
	int AdInsert(Account at);

	/**
	 * @return �޸ı�
	 */
	int AdUpData(Account at);

	/**
	 * @param aid
	 * @return ɾ���˺�
	 */
	int AdMgrDelete(int aid);

	/**
	 * @return ע����֤�Ƿ�����ͬ�û����˺�
	 */
	Account AdQuery(String UserName);

}
