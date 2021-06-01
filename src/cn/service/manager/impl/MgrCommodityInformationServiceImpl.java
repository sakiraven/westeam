package cn.service.manager.impl;

import java.util.List;

import cn.dao.CommentDao;
import cn.dao.CommodityInformationDao;
import cn.dao.DetailedPictureDao;
import cn.dao.LanguageLabelIndexDao;
import cn.dao.PlayLabelIndexDao;
import cn.dao.TypeLabelDao;
import cn.dao.TypeLabelIndexDao;
import cn.dao.UserGamesDao;
import cn.dao.impl.CommentDaoImpl;
import cn.dao.impl.CommodityInformationDaoImpl;
import cn.dao.impl.DetailedPictureDaoImpl;
import cn.dao.impl.LanguageLabelIndexDaoImpl;
import cn.dao.impl.PlayLabelIndexDaoImpl;
import cn.dao.impl.TypeLabelDaoImpl;
import cn.dao.impl.TypeLabelIndexDaoImpl;
import cn.dao.impl.UserGamesDaoImpl;
import cn.entity.CommodityInformation;
import cn.service.manager.MgrCommodityInformationService;

public class MgrCommodityInformationServiceImpl implements
		MgrCommodityInformationService {

	public int MgrUpDate(CommodityInformation ci) {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidUpDate(ci);
	}

	public int MgrDelete(int ciid) {
		TypeLabelIndexDao tlid = new TypeLabelIndexDaoImpl();
		if (tlid.TlidMgrDelete(ciid) == -1)
			return -2;
		PlayLabelIndexDao plid = new PlayLabelIndexDaoImpl();
		if (plid.PlidMgrDelete(ciid) == -1)
			return -3;
		LanguageLabelIndexDao llid = new LanguageLabelIndexDaoImpl();
		if (llid.LlidMgrDelete(ciid) == -1)
			return -4;
		DetailedPictureDao dpd = new DetailedPictureDaoImpl();
		if (dpd.DpdMgrDelete(ciid) == -1)
			return -5;
		CommentDao cd = new CommentDaoImpl();
		if (cd.CdMgrDeleteCiid(ciid) == -1)
			return -6;
		UserGamesDao ugd = new UserGamesDaoImpl();
		if (ugd.UgdMgrDeleteCiid(ciid) == -1)
			return -7;
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidDelete(ciid);
	}

	public List<CommodityInformation> MgrQuery() {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidQueryDate();
	}

	public CommodityInformation MgrQuery(int ciid) {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return null;
	}

	public List<String> MgrQueryComment() {
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		return cid.CidQueryComment();
	}

	public int MgrDeleteSingle(int ctid) {
		
		return 0;
	}

	
}
