package cn.service.client;

import java.util.List;

import cn.entity.TypeLabel;

public interface ClientTypeLabelService {

	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<TypeLabel> ClientQuery();
	
	/**
	 * @param ciid
	 * @return ��ѯ��Ʒ��������
	 */
	List<String> ClientQuery(int ciid);
}
