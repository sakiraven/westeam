package cn.dao;

import java.util.List;

import cn.entity.PlayLabel;

/**
 * @author 玩法标签接口
 *
 */
public interface PlayLabelDao {
	/**
	 * @return 查询所有标签
	 */
	/*List<String> PldQuery();*/
	
	/**
	 * @return 查询所有标签
	 */
	List<PlayLabel> PldQuery();
	
	/**
	 * @return 查询商品标签
	 */
	List<String> PldQuery(int ciid);
	/**
	 * @param play 标签
	 * @return 插入标签
	 */
	int PldInsert(String play);
	/**
	 * @param play_Id 标签id
	 * @param play 标签
	 * @return
	 */
	int PldUpDate(int play_Id[], String play[]);
	
	/**
	 * @param play_Id 主键
	 * @return 删除标签
	 */
	int PldDelete(int play_Id[]);
	
	
}
