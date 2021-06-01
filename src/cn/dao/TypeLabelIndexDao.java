package cn.dao;

public interface TypeLabelIndexDao {
	/**
	 * @param ciid 商品id
	 * @param type_Id 类型id
	 * @return 删除标签
	 */
	int TlidDelete(int ciid,int type_Id);
	
	/**
	 * @param ciid
	 * @return 清空商品外键
	 */
	int TlidMgrDelete(int ciid);
	
	/**
	 * @param 
	 * @return 管理员清除外键
	 */
	int TlidDeleteThis(int TypeId[]);
	
}
