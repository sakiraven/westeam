package cn.dao;

public interface TypeLabelIndexDao {
	/**
	 * @param ciid ��Ʒid
	 * @param type_Id ����id
	 * @return ɾ����ǩ
	 */
	int TlidDelete(int ciid,int type_Id);
	
	/**
	 * @param ciid
	 * @return �����Ʒ���
	 */
	int TlidMgrDelete(int ciid);
	
	/**
	 * @param 
	 * @return ����Ա������
	 */
	int TlidDeleteThis(int TypeId[]);
	
}
