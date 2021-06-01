package cn.service.util.impl;

import cn.dao.PathDao;
import cn.dao.impl.PathDaoImpl;
import cn.service.util.UtilPathService;

/**
 * @author 工具路径服务实现
 *
 */
public class UtilPathServiceImpl implements UtilPathService{

	public String ShopPicturePath() {
		PathDao pd = new PathDaoImpl();
		return pd.ShopPicturePath();
	}

	public String UserPicturePath() {
		PathDao pd = new PathDaoImpl();
		return pd.UserPicturePath();
	}

}
