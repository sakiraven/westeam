package cn.dao.impl;

import cn.dao.BaseDao;
import cn.dao.PlayLabelIndexDao;

public class PlayLabelIndexDaoImpl extends BaseDao implements
		PlayLabelIndexDao {

	public int PlidDelete(int ciid,int Play_Id) {
		String sql = "delete from play_label_index where ciid=? and play_id = ? ";
		Object ot[]={ciid,Play_Id};
		return super.untilUpDate(ot, sql);
	}

	public int PlidMgrDelete(int ciid) {
		String sql = "delete from play_label_index where ciid=? ";
		Object ot[]={ciid};
		return super.untilUpDate(ot, sql);
	}

	public int PlidDeleteThis(int playId[]) {
		StringBuffer sql = new StringBuffer("delete from play_label_index where ");
		Object ot[]=new Object[playId.length];
		for (int i = 0; i < ot.length; i++) {
			ot[i]=playId[i];
			sql.append(" play_id = ?");
			if(i!=ot.length-1)
				sql.append(" or");
		}
		return super.untilUpDate(ot, sql.toString());
	}
}
