package cn.service.client;

import java.util.List;

import cn.entity.DetailedPicture;

public interface ClientDetailedPictureService {

	/**
	 * @param ciid��Ʒid
	 * @return ��ѯ��Ʒ��ϸͼƬ
	 */
	List<DetailedPicture> ClientQuery(int ciid);
	
	
}
