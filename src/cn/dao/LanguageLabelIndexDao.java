package cn.dao;

import java.util.List;

import cn.entity.Language_Label;

/**
 * @author 语言标签 索引 接口
 *
 */
public interface LanguageLabelIndexDao {

	/**
	 * @return 删除商品标签
	 * ciid 商品标签
	 * language_id 语言标签id
	 */
	int LlidDelete(int ciid,int Language_Id);
	
	/**
	 * @param ciid
	 * @return 管理员清空外键
	 */
	int LlidMgrDelete(int ciid);
	
	/**
	 * @param languageId
	 * @return 管理员清除外键
	 */
	int LlidMgrDeleteThis(int languageId[]);
}
