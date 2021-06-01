package cn.service.manager.impl;

import cn.dao.NoticeDao;
import cn.dao.impl.NoticeDaoImpl;
import cn.service.manager.MgrNoticeService;

public class MgrNoticeServiceImpl implements MgrNoticeService {

	public int MgrDelete(int userInfoId, String message) {
		NoticeDao nd = new NoticeDaoImpl();
		return nd.NdInsert(userInfoId, message);
	}

}
