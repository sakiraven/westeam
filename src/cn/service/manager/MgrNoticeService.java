package cn.service.manager;

public interface MgrNoticeService {
	/**
	 * @param userInfoId
	 * @param message
	 * @return ���뾯��
	 */
	int MgrDelete(int userInfoId,String message);
}
