package cn.service.client;

import java.util.List;

import cn.entity.Language_Label;

public interface ClientLanguageLabelService {
	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<Language_Label> ClientQuery();
	
	/**
	 * @param ciid
	 * @return ��ѯ��Ʒ��������
	 */
	List<String> ClientQuery(int ciid);
}
