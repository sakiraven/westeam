package cn.service.client;

import java.util.List;

import cn.entity.UserInformation;

public interface ClientUserGamesService {

	/**
	 * @param ug 用户游戏库对象
	 * @return 增加游戏库 按用户id
	 * 0有本游戏 -1 异常 -2余额不足
	 */
	int ClientInsert(int userInfoId,int ciid[],int money);
	
	/**
	 * @param user_info_id
	 * @return 用户删除游戏
	 */
	int ClientDelete(int user_Info_Id,int ciid);
	
	/**
	 * @return 查询日期 购买
	 */
	List<String> ClientQuery(int user_Info_Id);
	
	/**
	 * @param ciid
	 * @return 确认游戏库是否存在游戏
	 */
	int ClientQueryRe(int ciid,int userInfoId);
}
