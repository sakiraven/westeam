package cn.dao.impl;

import cn.dao.BaseDao;
import cn.dao.TypeLabelIndexDao;

/**
 * @author 类型标签库实现类
 *
 */
public class TypeLabelIndexDaoImpl extends BaseDao implements TypeLabelIndexDao{

	/* 
	 * 删除商品类型
	 */
	public int TlidDelete(int ciid,int Type_Id) {
		String sql = "delete from type_label_index where ciid=? and type_id = ? ";
		Object ot[]={ciid,Type_Id};
		return super.untilUpDate(ot, sql);
	}

	@Override
	public int TlidMgrDelete(int ciid) {
		String sql = "delete from type_label_index where ciid=? ";
		Object ot[]={ciid};
		return super.untilUpDate(ot, sql);
	}

	public int TlidDeleteThis(int[] TypeId) {
		StringBuffer sql = new StringBuffer("delete from type_label_index where ");
		Object ot[]=new Object[TypeId.length];
		for (int i = 0; i < ot.length; i++) {
			ot[i]=TypeId[i];
			sql.append(" type_id = ?");
			if(i!=ot.length-1)
				sql.append(" or");
		}
		return super.untilUpDate(ot, sql.toString());
	}

}
