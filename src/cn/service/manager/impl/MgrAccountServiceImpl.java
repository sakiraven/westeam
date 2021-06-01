package cn.service.manager.impl;

import java.util.HashMap;
import java.util.List;

import cn.dao.AccountDao;
import cn.dao.CommentDao;
import cn.dao.FriendsDao;
import cn.dao.MessageDao;
import cn.dao.NoticeDao;
import cn.dao.UserGamesDao;
import cn.dao.UserInformationDao;
import cn.dao.impl.AccountDaoImpl;
import cn.dao.impl.CommentDaoImpl;
import cn.dao.impl.FriendsDaoImpl;
import cn.dao.impl.MessageDaoImpl;
import cn.dao.impl.NoticeDaoImpl;
import cn.dao.impl.UserGamesDaoImpl;
import cn.dao.impl.UserInformationDaoImpl;
import cn.entity.Account;
import cn.entity.UserGames;
import cn.service.manager.MgrAccountService;

public class MgrAccountServiceImpl implements MgrAccountService {

	public int MgrDelete(int aid) {
		MessageDao md = new MessageDaoImpl();
		if (md.MdMgrDelete(aid) == -1)
			return -2;
		CommentDao cd = new CommentDaoImpl();
		if (cd.CdMgrDelete(aid) == -1)
			return -3;
		NoticeDao nd = new NoticeDaoImpl();
		if (nd.NdMgrDelete(aid) == -1)
			return -4;
		FriendsDao fd = new FriendsDaoImpl();
		if (fd.FdMgrDelete(aid) == -1)
			return -5;
		UserGamesDao ugd = new UserGamesDaoImpl();
		if (ugd.UgdMgrDelete(aid) == -1)
			return -6;
		UserInformationDao uid = new UserInformationDaoImpl();
		if (uid.UidMgrDelete(aid) == -1)
			return -7;
		AccountDao ad = new AccountDaoImpl();
		if (ad.AdMgrDelete(aid) == -1)
			return -1;
		return 1;
	}

	public List<Account> MgrQuery() {
		AccountDao ad = new AccountDaoImpl();
		return ad.AdQuery();
	}

}
