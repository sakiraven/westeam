package cn.service.client.impl;

import cn.dao.AccountDao;
import cn.dao.UserInformationDao;
import cn.dao.impl.AccountDaoImpl;
import cn.dao.impl.UserInformationDaoImpl;
import cn.entity.Account;
import cn.entity.UserInformation;

/**
 * @author 客户端功能
 *
 */
public class ClientAccountServiceImpl implements cn.service.client.ClientAccountService {

	public Account ClientDengLu(String UserName, String password) {
		AccountDao ad = new AccountDaoImpl();
		return ad.AdQuery(UserName, password);
	}

	public int ClientZhuCe(Account at,UserInformation ui) {
		AccountDao ad = new AccountDaoImpl();
		int result = 0;
		//if(ad.AdQuery(at.getName())==null){
			ad.AdInsert(at);
			Account ciid = ad.AdQuery(at.getName());
			UserInformationDao uid = new UserInformationDaoImpl();
			ui.setAid(ciid.getAid());
			uid.UidInsertInfo(ui);
			result = uid.UidQuery(0, 0).size();
		//}
		return result;
	}

	public int ClientUpdate(Account at) {
		AccountDao ad = new AccountDaoImpl();
		UserInformationDao uid = new UserInformationDaoImpl();
		return ad.AdUpData(at);
	}

	@Override
	public Account ClientYanZheng(String UserName) {
		AccountDao ad = new AccountDaoImpl();
		return ad.AdQuery(UserName);
	}

}










