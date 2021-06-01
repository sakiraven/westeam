package cn.service.manager;

import java.util.List;

import cn.entity.TypeLabel;

public interface MgrTypeLabelService {
	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<TypeLabel> MgrQuery();
	
	/**
	 * @param type
	 *            ��ǩ
	 * @return �����ǩ
	 */
	int MgrInsert(String type);

	/**
	 * @param type_Id
	 *            ��ǩid
	 * @param type
	 *            ��ǩ
	 * @return ���±�ǩ
	 */
	int MgrUpDate(int type_Id[], String type[]);
	
	
	/**
	 * @param type_Id
	 *            ����
	 * @return ɾ�����Ա�ǩ
	 */
	int MgrDelete(int type_Id[]);

	
}
