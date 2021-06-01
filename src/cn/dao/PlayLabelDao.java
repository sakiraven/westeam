package cn.dao;

import java.util.List;

import cn.entity.PlayLabel;

/**
 * @author �淨��ǩ�ӿ�
 *
 */
public interface PlayLabelDao {
	/**
	 * @return ��ѯ���б�ǩ
	 */
	/*List<String> PldQuery();*/
	
	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<PlayLabel> PldQuery();
	
	/**
	 * @return ��ѯ��Ʒ��ǩ
	 */
	List<String> PldQuery(int ciid);
	/**
	 * @param play ��ǩ
	 * @return �����ǩ
	 */
	int PldInsert(String play);
	/**
	 * @param play_Id ��ǩid
	 * @param play ��ǩ
	 * @return
	 */
	int PldUpDate(int play_Id[], String play[]);
	
	/**
	 * @param play_Id ����
	 * @return ɾ����ǩ
	 */
	int PldDelete(int play_Id[]);
	
	
}
