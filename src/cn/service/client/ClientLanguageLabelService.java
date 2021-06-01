package cn.service.client;

import java.util.List;

import cn.entity.Language_Label;

public interface ClientLanguageLabelService {
	/**
	 * @return 查询所有标签
	 */
	List<Language_Label> ClientQuery();
	
	/**
	 * @param ciid
	 * @return 查询商品符合语言
	 */
	List<String> ClientQuery(int ciid);
}
