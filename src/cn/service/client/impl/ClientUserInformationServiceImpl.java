package cn.service.client.impl;

import java.util.List;

import cn.dao.UserGamesDao;
import cn.dao.UserInformationDao;
import cn.dao.impl.UserGamesDaoImpl;
import cn.dao.impl.UserInformationDaoImpl;
import cn.entity.UserGames;
import cn.entity.UserInformation;
import cn.service.client.ClientUserInformationService;

public class ClientUserInformationServiceImpl implements ClientUserInformationService {

	public List<UserInformation> ClientQuery( int aid) {
		UserInformationDao uid = new UserInformationDaoImpl();
		return uid.UidQuery(1, aid);
	}

	public List<UserInformation> ClientFriendQuery(int userInfoId) {
		UserInformationDao uid = new UserInformationDaoImpl();
		return uid.UidFriendQuery(userInfoId);
	}

	public int ClientChongZhi(int money, int aid) {
		UserInformationDao uid = new UserInformationDaoImpl();
		return uid.UidChongZhi(money, aid);
	}

	public int ClientUpDate(UserInformation ui) {
		UserInformationDao uid = new UserInformationDaoImpl();
		return uid.UidUpDate(ui);
	}

	public UserInformation ClientFriendQuery(String userName) {
		UserInformationDao uid = new UserInformationDaoImpl();
		return uid.UidQuery(userName);
	}

	public UserInformation ClientCtName(int userId) {
		UserInformationDao uid = new UserInformationDaoImpl();
		return uid.UidQueryCtName(userId);
	}


}
