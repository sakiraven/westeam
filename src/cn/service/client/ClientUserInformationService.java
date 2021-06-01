package cn.service.client;

import java.util.List;

import cn.entity.UserInformation;

public interface ClientUserInformationService {

	/**
	 * @return 查询个人详细信息
	 */
	List<UserInformation> ClientQuery(int aid);
	

	/**
	 * @param userInfoId
	 * @return 查看好友
	 */
	List<UserInformation> ClientFriendQuery(int userInfoId);
	
	/**
	 * @param money
	 * @param aid
	 * @return 充值金额
	 */
	int ClientChongZhi(int money , int userInfoId);
	
	/**
	 * @param userInfoId
	 * @return 修改用户信息
	 * aid修改
	 */
	int ClientUpDate(UserInformation ui);
	
	/**
	 * @param userName
	 * @return 搜索好友
	 */
	UserInformation ClientFriendQuery(String userName);
	
	/**
	 * @param userId
	 * @return 查看评论用户的信息
	 */
	UserInformation ClientCtName(int userId);
}
