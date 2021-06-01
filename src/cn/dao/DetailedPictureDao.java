package cn.dao;

import java.util.List;

import cn.entity.DetailedPicture;

/**
 * @author ��Ʒ����ϸͼƬ��
 * 
 */
public interface DetailedPictureDao {

	/**
	 * @param ciid��Ʒid
	 * @return ��ѯ��Ʒ��ϸͼƬ
	 */
	List<DetailedPicture> DpdQuery(int ciid);

	/**
	 * @param PictureName�޸ĺ�ͼƬ��
	 * @param ciid��Ʒid
	 * @param beforPictureName�޸�ǰͼƬ��
	 * @return �޸�ͼƬ
	 */
	int DpdUpDate(String PictureName,  String beforPictureName);

	/**
	 * @param ciid��Ʒid
	 * @param beforPictureNameͼƬ��
	 * @return ɾ��ͼƬ
	 */
	int DpdDelete( String beforPictureName);
	
	/**
	 * @param ciid
	 * @return ����Աɾ�����
	 */
	int DpdMgrDelete(int ciid);
}
