package cn.service.client;

import java.util.List;

import cn.entity.PlayLabel;

public interface ClientPlayLabelService {


	/**
	 * @return ��ѯ���б�ǩ
	 */
	List<PlayLabel> ClientQuery();
	
	/**
	 * @param ciid
	 * @return ��ѯ��Ʒ�����淨
	 */
	List<String> ClientQuery(int ciid);
}
