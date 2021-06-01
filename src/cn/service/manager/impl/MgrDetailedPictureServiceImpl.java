package cn.service.manager.impl;

import cn.dao.DetailedPictureDao;
import cn.dao.impl.DetailedPictureDaoImpl;
import cn.service.manager.MgrDetailedPictureService;

public class MgrDetailedPictureServiceImpl implements MgrDetailedPictureService {

	public int MgrDelete(String beforPictureName) {
		DetailedPictureDao dpd = new DetailedPictureDaoImpl();
		return dpd.DpdDelete(beforPictureName);
	}

	public int MgrUpDate(String PictureName, String beforPictureName) {
		DetailedPictureDao dpd = new DetailedPictureDaoImpl();
		return dpd.DpdUpDate(PictureName, beforPictureName);
	}

}
