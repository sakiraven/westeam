package cn.service.client;

import java.util.List;

import cn.entity.CommodityInformation;

/**
 * @author 客户端 商品信息service
 *
 */
public interface ClientCommodityInformationService {

	/**
	 * @return 查看所有商品
	 */
	List<CommodityInformation> ClientQuery(int thisPage,int commdityCount);
	
	/**
	 * @param user_Info_Id
	 * @return 查看用户游戏库
	 */
	List<CommodityInformation> ClientQuery(int user_Info_Id);
	
	/**
	 * @param type_Id
	 * @return 按类型查看游戏
	 * key 1 搜索 0类型筛选
	 */
	List<CommodityInformation> ClientQuery(int type_Id[],int key,String name,int thisPage,int commdityCount);
	
	/**
	 * @param gameName
	 * @return 查询 根据游戏名字查询
	 */
	List<CommodityInformation> ClientQuery(String gameName);
	
	/**
	 * @return 时间查询
	 */
	List<CommodityInformation> ClientQueryDate();
	
	/**
	 * @param ciid
	 * @param userId
	 * @return 查看用户是否存在游戏
	 */
	CommodityInformation ClientQueryGameBox(int ciid,int userId);
}
