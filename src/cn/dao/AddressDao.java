package cn.dao;

import java.util.List;

import cn.entity.Address;

/**
 * @author 地址 dao接口
 *
 */
public interface AddressDao {
	/**
	 * @return 查询地址 key=0查询所有 key=1查询指定用户地址
	 */
	List<Address> AdQuery(int user_info_id,int key);
	
	/**
	 * @param as地址对象
	 * @return 插值 地址表
	 */
	int AdInsert(Address as);
	
	/**
	 * @param user_info_id 用户信息id
	 * @return 删除地址
	 */
	int AdDelete(int user_info_id);
	
	/**
	 * @param as 地址实体对象
	 * @return 更新表 地址 是否默认地址 
	 */
	int AdUpDate(Address as);
}
