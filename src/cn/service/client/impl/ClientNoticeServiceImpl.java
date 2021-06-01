package cn.service.client.impl;

import java.util.List;

import cn.dao.NoticeDao;
import cn.dao.impl.NoticeDaoImpl;
import cn.entity.Notice;
import cn.service.client.ClientNoticeService;

public class ClientNoticeServiceImpl implements ClientNoticeService {

	public int ClientDelete(int nic_id) {
		NoticeDao nd = new NoticeDaoImpl();
		return nd.NdDelete(nic_id);
	}

	public List<Notice> ClientQuery(int userInfoId) {
		NoticeDao nd = new NoticeDaoImpl();
		return nd.NdQuery(userInfoId);
	}

}
