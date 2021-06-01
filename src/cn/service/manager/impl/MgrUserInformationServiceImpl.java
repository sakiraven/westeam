package cn.service.manager.impl;

import java.util.List;

import cn.dao.UserInformationDao;
import cn.dao.impl.UserInformationDaoImpl;
import cn.entity.UserInformation;
import cn.service.manager.MgrUserInformationService;

public class MgrUserInformationServiceImpl implements MgrUserInformationService {

	public List<UserInformation> MgrQueryComment(int ctid) {
		UserInformationDao uid = new UserInformationDaoImpl();
		return uid.UidQueryComment(ctid);
	}

}
