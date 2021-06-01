package cn.service.client.impl;

import java.util.List;

import cn.dao.CommodityInformationDao;
import cn.dao.UserGamesDao;
import cn.dao.UserInformationDao;
import cn.dao.impl.CommodityInformationDaoImpl;
import cn.dao.impl.UserGamesDaoImpl;
import cn.dao.impl.UserInformationDaoImpl;
import cn.entity.CommodityInformation;
import cn.entity.UserGames;
import cn.entity.UserInformation;
import cn.service.client.ClientUserGamesService;

public class ClientUserGamesServiceImpl implements ClientUserGamesService {

	public int ClientInsert(int userInfoId, int ciid[], int money) {
		UserInformationDao uid = new UserInformationDaoImpl();
		UserGamesDao ugd = new UserGamesDaoImpl();
		uid.UidXiaoFei(money, userInfoId);
		return ugd.UgdInsert(userInfoId, ciid);
	}

	public int ClientDelete(int user_Info_Id, int ciid) {
		UserGamesDao ugd = new UserGamesDaoImpl();
		return ugd.UgdDelete(user_Info_Id, ciid);
	}

	public List<String> ClientQuery(int user_info_id) {
		UserGamesDao ugd = new UserGamesDaoImpl();
		return ugd.UgdQuery(user_info_id);
	}

	public int ClientQueryRe(int ciid, int userInfoId) {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		List<CommodityInformation> getlt = cid.CidQuery(userInfoId);
		for (CommodityInformation commodityInformation : getlt) {
			if (commodityInformation.getCiid() == ciid)
				return 1;
		}
		return 0;
	}

}
