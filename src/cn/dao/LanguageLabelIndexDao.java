package cn.dao;

import java.util.List;

import cn.entity.Language_Label;

/**
 * @author ���Ա�ǩ ���� �ӿ�
 *
 */
public interface LanguageLabelIndexDao {

	/**
	 * @return ɾ����Ʒ��ǩ
	 * ciid ��Ʒ��ǩ
	 * language_id ���Ա�ǩid
	 */
	int LlidDelete(int ciid,int Language_Id);
	
	/**
	 * @param ciid
	 * @return ����Ա������
	 */
	int LlidMgrDelete(int ciid);
	
	/**
	 * @param languageId
	 * @return ����Ա������
	 */
	int LlidMgrDeleteThis(int languageId[]);
}
