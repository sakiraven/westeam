package cn.service.client;

import java.util.List;

import cn.entity.TypeLabel;

public interface ClientTypeLabelService {

	/**
	 * @return 查询所有标签
	 */
	List<TypeLabel> ClientQuery();
	
	/**
	 * @param ciid
	 * @return 查询商品符合类型
	 */
	List<String> ClientQuery(int ciid);
}
