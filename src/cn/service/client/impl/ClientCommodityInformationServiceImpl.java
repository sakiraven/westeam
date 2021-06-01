package cn.service.client.impl;

import java.util.List;

import cn.dao.CommodityInformationDao;
import cn.dao.impl.CommodityInformationDaoImpl;
import cn.entity.CommodityInformation;
import cn.service.client.ClientCommodityInformationService;

public class ClientCommodityInformationServiceImpl implements ClientCommodityInformationService{

	public List<CommodityInformation> ClientQuery(int thisPage,int commdityCount) {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidQuery(thisPage,commdityCount);
	}

	public List<CommodityInformation> ClientQuery(int user_Info_Id) {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidQuery(user_Info_Id);
	}

	public List<CommodityInformation> ClientQuery(int[] type_Id,int key,String name,int thisPage,int commdityCount) {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidQuery(type_Id,key,name,thisPage,commdityCount);
	}

	public List<CommodityInformation> ClientQuery(String gameName) {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidQuery(gameName);
	}

	public List<CommodityInformation> ClientQueryDate() {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidQueryDate();
	}

	public CommodityInformation ClientQueryGameBox(int ciid, int userId) {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidGameBox(ciid, userId);
	}

}
