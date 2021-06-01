package cn.dao;

import java.util.List;

import cn.entity.TypeLabel;

public interface TypeLabelDao {
	/**
	 * @return 查询所有标签
	 */
	List<TypeLabel> TldQuery();
	
	/**
	 * @param ciid
	 * @return 商品类型
	 */
	List<String> TldQuery(int ciid);
	
	/**
	 * @param type 标签
	 * @return 插入标签
	 */
	int TldInsert(String type);
	/**
	 * @param Type_Id 标签id
	 * @param type 标签
	 * @return
	 */
	int TldUpDate(int Type_Id[], String type[]);
	
	/**
	 * @param Type_Id 主键
	 * @return 删除类型标签
	 */
	int TldDelete(int Type_Id[]);
}
