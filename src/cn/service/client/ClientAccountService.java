package cn.service.client;

import cn.entity.Account;
import cn.entity.UserInformation;

/**
 * @author 账号
 *
 */
public interface ClientAccountService {
	
	/**
	 * @return 登录;
	 */
	Account ClientDengLu(String UserName,String password);
	
	/**
	 * @return 注册 0注册失败 >1注册成功 -1异常
	 */
	int ClientZhuCe(Account at,UserInformation ui);
	
	/**
	 * @param at 账号对象
	 * @param ui 用户信息对象
	 * @return 修改 1 密码
	 */
	int ClientUpdate(Account at);
	
	/**
	 * @return 验证账号是否被注册
	 */
	Account ClientYanZheng(String UserName);
}
