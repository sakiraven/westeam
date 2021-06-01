package cn.dao;

import java.util.List;

import cn.entity.Language_Label;


/**
 * @author 语言标签接口
 *
 */
public interface LanguageLabelDao {
	/**
	 * @return 查询所有标签
	 */
	List<Language_Label> LldQuery();
	
//	/**
//	 * @return 查询所有标签
//	 */
//	List<String> LldQuery(String languageLabel);
	
	/**
	 * @param ciid
	 * @return 查询商品符合语言
	 */
	List<String> LldQuery(int ciid);
	
	/**
	 * @param language 标签
	 * @return 插入标签
	 */
	int LldInsert(String language);
	/**
	 * @param Language_Id 标签id
	 * @param language 标签
	 * @return 
	 */
	int LldUpDate(int Language_Id[], String language[]);
	
	/**
	 * @param Language_Id 主键
	 * @return 删除语言标签
	 */
	int LldDelete(int Language_Id[]);
}
