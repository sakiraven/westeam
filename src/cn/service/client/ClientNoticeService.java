package cn.service.client;

import java.util.List;

import cn.entity.Notice;

public interface ClientNoticeService {
	/**
	 * @return �û�ɾ��֪ͨ
	 */
	int ClientDelete(int nic_id);
	
	/**
	 * @param userInfoId
	 * @return �鿴����֪ͨ
	 */
	List<Notice> ClientQuery(int userInfoId);
}
