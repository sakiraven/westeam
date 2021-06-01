package cn.dao;

import java.util.List;

import cn.entity.TypeLabel;

public interface TypeLabelDao {
	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<TypeLabel> TldQuery();
	
	/**
	 * @param ciid
	 * @return ��Ʒ����
	 */
	List<String> TldQuery(int ciid);
	
	/**
	 * @param type ��ǩ
	 * @return �����ǩ
	 */
	int TldInsert(String type);
	/**
	 * @param Type_Id ��ǩid
	 * @param type ��ǩ
	 * @return
	 */
	int TldUpDate(int Type_Id[], String type[]);
	
	/**
	 * @param Type_Id ����
	 * @return ɾ�����ͱ�ǩ
	 */
	int TldDelete(int Type_Id[]);
}
