package cn.dao;

import java.util.List;

import cn.entity.CommodityInformation;

/**
 * @author 商品信息接口
 *
 */
public interface CommodityInformationDao {

	/**
	 * @return 查询 无条件
	 */
	List<CommodityInformation>CidQuery(int thisPage,int commdityCount);
	
	/**
	 * @param type_Id
	 * @return 查询 根据类型筛选 游戏
	 */
	List<CommodityInformation>CidQuery(int type_Id[],int key,String name,int thisPage,int commdityCount);
	
	/**
	 * @param gameName
	 * @return 查询 根据游戏名字查询
	 */
	List<CommodityInformation>CidQuery(String gameName);
	
	/**
	 * @param user_Info_Id
	 * @return 查询 用户游戏库 
	 */
	List<CommodityInformation>CidQuery(int user_Info_Id);
	
	/**
	 * @return 查询 无条件
	 */
	List<CommodityInformation>CidQueryDate();
	
	/**
	 * @param ci
	 * @return 更新商品
	 * 1游戏名
	 * 2时间
	 * 3发行商
	 * 4开发商
	 * 5简介
	 * 6关于
	 * 7价格
	 * 8图片
	 */
	int CidUpDate(CommodityInformation ci);
	
	/**
	 * @param ciid
	 * @return 根据ciid删除
	 */
	int CidDelete(int ciid);
	
	/**
	 * @param ciid
	 * @return 查看单次商品信息
	 */
	CommodityInformation CidSingle(int ciid); 
	
	/**
	 * @param ciid
	 * @return 查看有评论的商品名
	 */
	List<String> CidQueryComment();
	
	/**
	 * @param ciid
	 * @return 查看游戏库是否存在游戏
	 */
	CommodityInformation CidGameBox(int ciid,int userId);
}
