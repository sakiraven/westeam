package cn.service.manager;

import java.util.List;

import cn.entity.Language_Label;

public interface MgrLanguageLabelService {
	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<Language_Label> MgrQuery();

	/**
	 * @param language
	 *            ��ǩ
	 * @return �����ǩ
	 */
	int MgrInsert(String language);

	/**
	 * @param Language_Id
	 *            ��ǩid
	 * @param language
	 *            ��ǩ
	 * @return ���±�ǩ
	 */
	int MgrUpDate(int Language_Id[], String language[]);

	/**
	 * @param Language_Id
	 *            ����
	 * @return ɾ�����Ա�ǩ
	 */
	int MgrDelete(int Language_Id[]);
}
