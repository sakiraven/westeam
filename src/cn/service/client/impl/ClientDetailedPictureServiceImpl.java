package cn.service.client.impl;

import java.util.List;

import cn.dao.DetailedPictureDao;
import cn.dao.impl.DetailedPictureDaoImpl;
import cn.entity.DetailedPicture;
import cn.service.client.ClientDetailedPictureService;

public class ClientDetailedPictureServiceImpl implements
		ClientDetailedPictureService {

	public List<DetailedPicture> ClientQuery(int ciid) {
		DetailedPictureDao dpd = new DetailedPictureDaoImpl();
		return dpd.DpdQuery(ciid);
	}

}
