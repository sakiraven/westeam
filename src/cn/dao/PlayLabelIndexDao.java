package cn.dao;

/**
 * @author 玩法标签索引 接口
 *
 */
public interface PlayLabelIndexDao {
	/**
	 * @return 删除玩法标签
	 * ciid 商品标签
	 * Play_Id 玩法标签id
	 */
	int PlidDelete(int ciid,int Play_Id);
	
	/**
	 * @param ciid
	 * @return 管理员清除外键
	 */
	int PlidMgrDelete(int ciid);
	
	/**
	 * @param ciid
	 * @return 管理员清除外键
	 */
	int PlidDeleteThis(int playId[]);
	
	
}
