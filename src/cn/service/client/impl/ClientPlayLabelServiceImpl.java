package cn.service.client.impl;

import java.util.List;

import cn.dao.PlayLabelDao;
import cn.dao.impl.PlayLabelDaoImpl;
import cn.entity.PlayLabel;
import cn.service.client.ClientPlayLabelService;

public class ClientPlayLabelServiceImpl implements ClientPlayLabelService{

	public List<PlayLabel> ClientQuery() {
		PlayLabelDao pld = new PlayLabelDaoImpl();
		return pld.PldQuery();
	}

	public List<String> ClientQuery(int ciid) {
		PlayLabelDao pld = new PlayLabelDaoImpl();
		return pld.PldQuery(ciid);
	}
	
}
