package cn.service.manager;

import java.util.List;

import cn.entity.CommodityInformation;

public interface MgrCommodityInformationService {

	/**
	 * @param ci
	 * @return 更新商品信息
	 * 1游戏名  2发行商 3开发商 4游戏简介 5关于 6游戏价格 7商品id
	 * 
	 */
	int MgrUpDate(CommodityInformation ci);

	/**
	 * @param ciid
	 * @return 根据ciid删除
	 */
	int MgrDelete(int ciid);

	/**
	 * @return 查询全部
	 */
	List<CommodityInformation>MgrQuery();
	
	/**
	 * @param ciid
	 * @return 查看商品详细信息
	 */ 
	CommodityInformation MgrQuery(int ciid);
	
	/**
	 * @param ciid
	 * @return 查看评论名称
	 */
	List<String> MgrQueryComment();
	
	/**
	 * @param ctid
	 * @return 根据ctid删除
	 */
	int MgrDeleteSingle(int ctid);
}
