package cn.service.manager;

import java.util.List;

import cn.entity.UserInformation;

public interface MgrUserInformationService {

	List<UserInformation> MgrQueryComment(int ctid);
}
