package cn.dao;

/**
 * @author �淨��ǩ���� �ӿ�
 *
 */
public interface PlayLabelIndexDao {
	/**
	 * @return ɾ���淨��ǩ
	 * ciid ��Ʒ��ǩ
	 * Play_Id �淨��ǩid
	 */
	int PlidDelete(int ciid,int Play_Id);
	
	/**
	 * @param ciid
	 * @return ����Ա������
	 */
	int PlidMgrDelete(int ciid);
	
	/**
	 * @param ciid
	 * @return ����Ա������
	 */
	int PlidDeleteThis(int playId[]);
	
	
}
