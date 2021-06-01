package cn.service.manager;

import java.util.List;

import cn.entity.TypeLabel;

public interface MgrTypeLabelService {
	/**
	 * @return 查询所有标签
	 */
	List<TypeLabel> MgrQuery();
	
	/**
	 * @param type
	 *            标签
	 * @return 插入标签
	 */
	int MgrInsert(String type);

	/**
	 * @param type_Id
	 *            标签id
	 * @param type
	 *            标签
	 * @return 更新标签
	 */
	int MgrUpDate(int type_Id[], String type[]);
	
	
	/**
	 * @param type_Id
	 *            主键
	 * @return 删除语言标签
	 */
	int MgrDelete(int type_Id[]);

	
}
