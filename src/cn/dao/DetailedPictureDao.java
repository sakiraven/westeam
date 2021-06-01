package cn.dao;

import java.util.List;

import cn.entity.DetailedPicture;

/**
 * @author 商品表详细图片库
 * 
 */
public interface DetailedPictureDao {

	/**
	 * @param ciid商品id
	 * @return 查询商品详细图片
	 */
	List<DetailedPicture> DpdQuery(int ciid);

	/**
	 * @param PictureName修改后图片名
	 * @param ciid商品id
	 * @param beforPictureName修改前图片名
	 * @return 修改图片
	 */
	int DpdUpDate(String PictureName,  String beforPictureName);

	/**
	 * @param ciid商品id
	 * @param beforPictureName图片名
	 * @return 删除图片
	 */
	int DpdDelete( String beforPictureName);
	
	/**
	 * @param ciid
	 * @return 管理员删除外键
	 */
	int DpdMgrDelete(int ciid);
}
