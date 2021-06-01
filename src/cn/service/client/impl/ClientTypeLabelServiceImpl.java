package cn.service.client.impl;

import java.util.List;

import cn.dao.TypeLabelDao;
import cn.dao.impl.TypeLabelDaoImpl;
import cn.entity.TypeLabel;
import cn.service.client.ClientTypeLabelService;

public class ClientTypeLabelServiceImpl implements ClientTypeLabelService {

	public List<TypeLabel> ClientQuery() {
		TypeLabelDao tld = new TypeLabelDaoImpl();
		return tld.TldQuery();
	}

	public List<String> ClientQuery(int ciid) {
		TypeLabelDao tld = new TypeLabelDaoImpl();
		return tld.TldQuery(ciid);
	}

}
