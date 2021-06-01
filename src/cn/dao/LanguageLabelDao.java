package cn.dao;

import java.util.List;

import cn.entity.Language_Label;


/**
 * @author ���Ա�ǩ�ӿ�
 *
 */
public interface LanguageLabelDao {
	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<Language_Label> LldQuery();
	
//	/**
//	 * @return ��ѯ���б�ǩ
//	 */
//	List<String> LldQuery(String languageLabel);
	
	/**
	 * @param ciid
	 * @return ��ѯ��Ʒ��������
	 */
	List<String> LldQuery(int ciid);
	
	/**
	 * @param language ��ǩ
	 * @return �����ǩ
	 */
	int LldInsert(String language);
	/**
	 * @param Language_Id ��ǩid
	 * @param language ��ǩ
	 * @return 
	 */
	int LldUpDate(int Language_Id[], String language[]);
	
	/**
	 * @param Language_Id ����
	 * @return ɾ�����Ա�ǩ
	 */
	int LldDelete(int Language_Id[]);
}
