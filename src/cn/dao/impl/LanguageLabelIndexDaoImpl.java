package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.LanguageLabelIndexDao;
import cn.entity.Language_Label;

/**
 * @author 语言标签索引 实现类
 *
 */
public class LanguageLabelIndexDaoImpl extends BaseDao implements
		LanguageLabelIndexDao {

	/* 
	 * 删除语言标签
	 */
	public int LlidDelete(int ciid,int Language_Id) {
		String sql = "delete from language_label_index where ciid=? and language_id = ? ";
		Object ot[]={ciid,Language_Id};
		return super.untilUpDate(ot, sql);
	}

	/* 
	 * 删除外键
	 */
	public int LlidMgrDelete(int ciid) {
		String sql = "delete from language_label_index where ciid=? ";
		Object ot[]={ciid};
		return super.untilUpDate(ot, sql);
	}

	@Override
	public int LlidMgrDeleteThis(int languageId[]) {
		StringBuffer sql = new StringBuffer("delete from language_label_index where ");
		Object ot[]=new Object[languageId.length];
		for (int i = 0; i < ot.length; i++) {
			ot[i]=languageId[i];
			sql.append(" language_id = ?");
			if(i!=ot.length-1)
				sql.append(" or");
		}
		return super.untilUpDate(ot, sql.toString());
	}

	

}
