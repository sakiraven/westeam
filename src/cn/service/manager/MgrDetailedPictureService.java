package cn.service.manager;

public interface MgrDetailedPictureService {
	/**
	 * @param ciid��Ʒid
	 * @param beforPictureNameͼƬ��
	 * @return ɾ��ͼƬ
	 */
	int MgrDelete( String beforPictureName);
	
	/**
	 * @param PictureName�޸ĺ�ͼƬ��
	 * @param ciid��Ʒid
	 * @param beforPictureName�޸�ǰͼƬ��
	 * @return �޸�ͼƬ
	 */
	int MgrUpDate(String PictureName,  String beforPictureName);
}
