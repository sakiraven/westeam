package cn.service.manager;

import java.util.List;

import cn.entity.PlayLabel;

public interface MgrPlayLabelService {

	/**
	 * @return 删除商品标签 ciid 商品标签 language_id 语言标签id
	 */
	int MgrDelete(int playId[]);

	/**
	 * @return 查询所有标签
	 */
	List<PlayLabel> MgrQuery();

	/**
	 * @param play
	 *            标签
	 * @return 插入标签
	 */
	int MgrInsert(String play);

	/**
	 * @param Language_Id
	 *            标签id
	 * @param language
	 *            标签
	 * @return 更新标签
	 */
	int MgrUpDate(int play_Id[], String play[]);
}
