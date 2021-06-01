package cn.service.manager;

import java.util.List;

import cn.entity.Language_Label;

public interface MgrLanguageLabelService {
	/**
	 * @return 查询所有标签
	 */
	List<Language_Label> MgrQuery();

	/**
	 * @param language
	 *            标签
	 * @return 插入标签
	 */
	int MgrInsert(String language);

	/**
	 * @param Language_Id
	 *            标签id
	 * @param language
	 *            标签
	 * @return 更新标签
	 */
	int MgrUpDate(int Language_Id[], String language[]);

	/**
	 * @param Language_Id
	 *            主键
	 * @return 删除语言标签
	 */
	int MgrDelete(int Language_Id[]);
}
