package cn.service.manager;

public interface MgrDetailedPictureService {
	/**
	 * @param ciid商品id
	 * @param beforPictureName图片名
	 * @return 删除图片
	 */
	int MgrDelete( String beforPictureName);
	
	/**
	 * @param PictureName修改后图片名
	 * @param ciid商品id
	 * @param beforPictureName修改前图片名
	 * @return 修改图片
	 */
	int MgrUpDate(String PictureName,  String beforPictureName);
}
