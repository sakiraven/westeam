package cn.service.manager;

import java.util.List;

import cn.entity.PlayLabel;

public interface MgrPlayLabelService {

	/**
	 * @return ɾ����Ʒ��ǩ ciid ��Ʒ��ǩ language_id ���Ա�ǩid
	 */
	int MgrDelete(int playId[]);

	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<PlayLabel> MgrQuery();

	/**
	 * @param play
	 *            ��ǩ
	 * @return �����ǩ
	 */
	int MgrInsert(String play);

	/**
	 * @param Language_Id
	 *            ��ǩid
	 * @param language
	 *            ��ǩ
	 * @return ���±�ǩ
	 */
	int MgrUpDate(int play_Id[], String play[]);
}
