package cn.service.client;

import cn.entity.Account;
import cn.entity.UserInformation;

/**
 * @author �˺�
 *
 */
public interface ClientAccountService {
	
	/**
	 * @return ��¼;
	 */
	Account ClientDengLu(String UserName,String password);
	
	/**
	 * @return ע�� 0ע��ʧ�� >1ע��ɹ� -1�쳣
	 */
	int ClientZhuCe(Account at,UserInformation ui);
	
	/**
	 * @param at �˺Ŷ���
	 * @param ui �û���Ϣ����
	 * @return �޸� 1 ����
	 */
	int ClientUpdate(Account at);
	
	/**
	 * @return ��֤�˺��Ƿ�ע��
	 */
	Account ClientYanZheng(String UserName);
}
