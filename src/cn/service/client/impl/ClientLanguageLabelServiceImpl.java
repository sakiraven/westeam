package cn.service.client.impl;

import java.util.List;

import cn.dao.LanguageLabelDao;
import cn.dao.impl.LanguageLabelDaoImpl;
import cn.entity.Language_Label;
import cn.service.client.ClientLanguageLabelService;

public class ClientLanguageLabelServiceImpl implements ClientLanguageLabelService {
	
	public List<Language_Label> ClientQuery() {
		LanguageLabelDao lld = new LanguageLabelDaoImpl();
		return lld.LldQuery();
	}

	public List<String> ClientQuery(int ciid) {
		LanguageLabelDao lld = new LanguageLabelDaoImpl();
		return lld.LldQuery(ciid);
	}

}
