package cn.service.manager.impl;

import java.util.List;

import cn.dao.LanguageLabelDao;
import cn.dao.LanguageLabelIndexDao;
import cn.dao.impl.LanguageLabelDaoImpl;
import cn.dao.impl.LanguageLabelIndexDaoImpl;
import cn.entity.Language_Label;
import cn.service.manager.MgrLanguageLabelService;

public class MgrLanguageLabelServiceImpl implements MgrLanguageLabelService {

	public List<Language_Label> MgrQuery() {
		LanguageLabelDao lld = new LanguageLabelDaoImpl();
		return lld.LldQuery();
	}

	public int MgrInsert(String language) {
		LanguageLabelDao lld = new LanguageLabelDaoImpl();
		List<Language_Label> getlt = lld.LldQuery();
		for (Language_Label string : getlt) {
			if(string.getLanguage().equals(language))
			return 0;
		}
			
		return lld.LldInsert(language);
	}

	public int MgrUpDate(int[] Language_Id, String[] language) {
		LanguageLabelDao lld = new LanguageLabelDaoImpl();
		return lld.LldUpDate(Language_Id, language);
	}

	public int MgrDelete(int Language_Id[]) {
		LanguageLabelIndexDao llid = new LanguageLabelIndexDaoImpl();
		llid.LlidMgrDeleteThis(Language_Id);
		LanguageLabelDao lld = new LanguageLabelDaoImpl();
		return lld.LldDelete(Language_Id);
	}

}
