package cn.service.client;

import java.util.List;

import cn.entity.Notice;

public interface ClientNoticeService {
	/**
	 * @return 用户删除通知
	 */
	int ClientDelete(int nic_id);
	
	/**
	 * @param userInfoId
	 * @return 查看所有通知
	 */
	List<Notice> ClientQuery(int userInfoId);
}
