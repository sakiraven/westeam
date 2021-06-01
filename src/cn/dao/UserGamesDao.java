package cn.dao;

import java.util.List;

import cn.entity.UserGames;

/**
 * @author 用户库接口
 *
 */
public interface UserGamesDao {
	/**
	 * @param ug 用户游戏库对象
	 * @return 增加游戏库 按用户id
	 */
	int UgdInsert(int user_info_id,int ciid[]);
	
	/**
	 * @param user_info_id
	 * @return 用户删除游戏
	 */
	int UgdDelete(int user_info_id,int ciid);
	
	/**
	 * @param aid
	 * @return 管理员清空用户游戏
	 */
	int UgdMgrDelete(int aid);
	/**
	 * @return 查询日期 购买
	 */
	List<String> UgdQuery(int user_info_id);
	
	/**
	 * @param user_info_id
	 * @return 清空给外键
	 */
	int UgdMgrDeleteCiid(int ciid);
}
