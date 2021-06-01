package cn.service.client;

import java.util.List;

import cn.entity.DetailedPicture;

public interface ClientDetailedPictureService {

	/**
	 * @param ciid商品id
	 * @return 查询商品详细图片
	 */
	List<DetailedPicture> ClientQuery(int ciid);
	
	
}
