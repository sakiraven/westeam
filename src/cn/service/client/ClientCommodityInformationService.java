package cn.service.client;

import java.util.List;

import cn.entity.CommodityInformation;

/**
 * @author �ͻ��� ��Ʒ��Ϣservice
 *
 */
public interface ClientCommodityInformationService {

	/**
	 * @return �鿴������Ʒ
	 */
	List<CommodityInformation> ClientQuery(int thisPage,int commdityCount);
	
	/**
	 * @param user_Info_Id
	 * @return �鿴�û���Ϸ��
	 */
	List<CommodityInformation> ClientQuery(int user_Info_Id);
	
	/**
	 * @param type_Id
	 * @return �����Ͳ鿴��Ϸ
	 * key 1 ���� 0����ɸѡ
	 */
	List<CommodityInformation> ClientQuery(int type_Id[],int key,String name,int thisPage,int commdityCount);
	
	/**
	 * @param gameName
	 * @return ��ѯ ������Ϸ���ֲ�ѯ
	 */
	List<CommodityInformation> ClientQuery(String gameName);
	
	/**
	 * @return ʱ���ѯ
	 */
	List<CommodityInformation> ClientQueryDate();
	
	/**
	 * @param ciid
	 * @param userId
	 * @return �鿴�û��Ƿ������Ϸ
	 */
	CommodityInformation ClientQueryGameBox(int ciid,int userId);
}
