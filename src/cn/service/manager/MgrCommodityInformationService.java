package cn.service.manager;

import java.util.List;

import cn.entity.CommodityInformation;

public interface MgrCommodityInformationService {

	/**
	 * @param ci
	 * @return ������Ʒ��Ϣ
	 * 1��Ϸ��  2������ 3������ 4��Ϸ��� 5���� 6��Ϸ�۸� 7��Ʒid
	 * 
	 */
	int MgrUpDate(CommodityInformation ci);

	/**
	 * @param ciid
	 * @return ����ciidɾ��
	 */
	int MgrDelete(int ciid);

	/**
	 * @return ��ѯȫ��
	 */
	List<CommodityInformation>MgrQuery();
	
	/**
	 * @param ciid
	 * @return �鿴��Ʒ��ϸ��Ϣ
	 */ 
	CommodityInformation MgrQuery(int ciid);
	
	/**
	 * @param ciid
	 * @return �鿴��������
	 */
	List<String> MgrQueryComment();
	
	/**
	 * @param ctid
	 * @return ����ctidɾ��
	 */
	int MgrDeleteSingle(int ctid);
}
