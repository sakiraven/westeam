package cn.service.manager.impl;

import java.util.List;

import cn.dao.PlayLabelDao;
import cn.dao.PlayLabelIndexDao;
import cn.dao.impl.PlayLabelDaoImpl;
import cn.dao.impl.PlayLabelIndexDaoImpl;
import cn.entity.PlayLabel;
import cn.service.manager.MgrPlayLabelService;

public class MgrPlayLabelServiceImpl implements MgrPlayLabelService {

	public int MgrDelete(int playId[]) {
		PlayLabelIndexDao plid = new PlayLabelIndexDaoImpl();
		if(plid.PlidDeleteThis(playId)<0)
			return -2;
		PlayLabelDao pld = new PlayLabelDaoImpl();
		return pld.PldDelete(playId);
	}

	public List<PlayLabel> MgrQuery() {
		PlayLabelDao pld = new PlayLabelDaoImpl();
		return pld.PldQuery();
	}

	public int MgrInsert(String play) {
		PlayLabelDao pld = new PlayLabelDaoImpl();
		List<PlayLabel> getlt = pld.PldQuery();
		for (PlayLabel string : getlt) {
			if(play.equals(string.getPlay()))
				return 0;
		}
		return pld.PldInsert(play);
	}

	public int MgrUpDate(int[] play_Id, String[] play) {
		PlayLabelDao pld = new PlayLabelDaoImpl();
		return pld.PldUpDate(play_Id, play);
	}

}
