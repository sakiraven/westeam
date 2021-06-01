package cn.service.client;

import java.util.List;

import cn.entity.PlayLabel;

public interface ClientPlayLabelService {


	/**
	 * @return 查询所有标签
	 */
	List<PlayLabel> ClientQuery();
	
	/**
	 * @param ciid
	 * @return 查询商品符合玩法
	 */
	List<String> ClientQuery(int ciid);
}
