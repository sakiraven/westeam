package cn.service.manager;

import java.util.List;

import cn.entity.Account;

/**
 * @author ����Ա �˺�service
 *
 */
public interface MgrAccountService {
	/**
	 * @param aid
	 * @return ɾ���˺�
	 */
	int MgrDelete(int aid);

	/**
	 * @return �鿴����
	 */
	List<Account> MgrQuery();
}
