package cn.dao;

import java.util.List;

import cn.entity.Account;

/**
 * @author 账号 dao接口
 * 
 */
public interface AccountDao {
	/**
	 * @return 查看所有用户
	 */
	List<Account> AdQuery();

	/**
	 * @return 登录;
	 */
	Account AdQuery(String userName, String password);

	/**
	 * @return 注册
	 */
	int AdInsert(Account at);

	/**
	 * @return 修改表
	 */
	int AdUpData(Account at);

	/**
	 * @param aid
	 * @return 删除账号
	 */
	int AdMgrDelete(int aid);

	/**
	 * @return 注册验证是否有相同用户名账号
	 */
	Account AdQuery(String UserName);

}
