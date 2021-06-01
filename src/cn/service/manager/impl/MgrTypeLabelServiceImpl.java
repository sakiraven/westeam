package cn.service.manager.impl;

import java.util.List;

import cn.dao.TypeLabelDao;
import cn.dao.TypeLabelIndexDao;
import cn.dao.impl.TypeLabelDaoImpl;
import cn.dao.impl.TypeLabelIndexDaoImpl;
import cn.entity.TypeLabel;
import cn.service.manager.MgrTypeLabelService;

public class MgrTypeLabelServiceImpl implements MgrTypeLabelService {

	public List<TypeLabel> MgrQuery() {
		TypeLabelDao tld = new TypeLabelDaoImpl();
		return tld.TldQuery();
	}

	public int MgrInsert(String type) {
		TypeLabelDao tld = new TypeLabelDaoImpl();
		List<TypeLabel> getlt = tld.TldQuery();
		for (TypeLabel string : getlt) {
			if(string.getType().equals(type))
			return 0;
		}
		return tld.TldInsert(type);
	}

	public int MgrUpDate(int[] type_Id, String[] type) {
		TypeLabelDao tld = new TypeLabelDaoImpl();
		return tld.TldUpDate(type_Id, type);
	}

	public int MgrDelete(int type_Id[]) {
		TypeLabelIndexDao tllid = new TypeLabelIndexDaoImpl();
		if(tllid.TlidDeleteThis(type_Id)==-1)
			return -2;
		TypeLabelDao tld = new TypeLabelDaoImpl();
		return tld.TldDelete(type_Id);
	}

}
