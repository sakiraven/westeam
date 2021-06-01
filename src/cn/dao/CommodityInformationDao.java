package cn.dao;

import java.util.List;

import cn.entity.CommodityInformation;

/**
 * @author ��Ʒ��Ϣ�ӿ�
 *
 */
public interface CommodityInformationDao {

	/**
	 * @return ��ѯ ������
	 */
	List<CommodityInformation>CidQuery(int thisPage,int commdityCount);
	
	/**
	 * @param type_Id
	 * @return ��ѯ ��������ɸѡ ��Ϸ
	 */
	List<CommodityInformation>CidQuery(int type_Id[],int key,String name,int thisPage,int commdityCount);
	
	/**
	 * @param gameName
	 * @return ��ѯ ������Ϸ���ֲ�ѯ
	 */
	List<CommodityInformation>CidQuery(String gameName);
	
	/**
	 * @param user_Info_Id
	 * @return ��ѯ �û���Ϸ�� 
	 */
	List<CommodityInformation>CidQuery(int user_Info_Id);
	
	/**
	 * @return ��ѯ ������
	 */
	List<CommodityInformation>CidQueryDate();
	
	/**
	 * @param ci
	 * @return ������Ʒ
	 * 1��Ϸ��
	 * 2ʱ��
	 * 3������
	 * 4������
	 * 5���
	 * 6����
	 * 7�۸�
	 * 8ͼƬ
	 */
	int CidUpDate(CommodityInformation ci);
	
	/**
	 * @param ciid
	 * @return ����ciidɾ��
	 */
	int CidDelete(int ciid);
	
	/**
	 * @param ciid
	 * @return �鿴������Ʒ��Ϣ
	 */
	CommodityInformation CidSingle(int ciid); 
	
	/**
	 * @param ciid
	 * @return �鿴�����۵���Ʒ��
	 */
	List<String> CidQueryComment();
	
	/**
	 * @param ciid
	 * @return �鿴��Ϸ���Ƿ������Ϸ
	 */
	CommodityInformation CidGameBox(int ciid,int userId);
}
