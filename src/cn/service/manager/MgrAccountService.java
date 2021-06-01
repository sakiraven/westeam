package cn.service.manager;

import java.util.List;

import cn.entity.Account;

/**
 * @author 管理员 账号service
 *
 */
public interface MgrAccountService {
	/**
	 * @param aid
	 * @return 删除账号
	 */
	int MgrDelete(int aid);

	/**
	 * @return 查看所有
	 */
	List<Account> MgrQuery();
}
