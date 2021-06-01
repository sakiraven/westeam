package cn.service.manager;

import java.util.List;

import cn.entity.Comment;

public interface MgrCommentService {

	/**
	 * @return 查询全部评论
	 */
	List<Comment> MgrQuery();
	
	/**
	 * @param ciid 商品id
	 * @param user_info_id 用户id
	 * @return 删除指定评论
	 */
	int MgrDelete(int ciid,int userInfoId,String mgrMessage);
	
	/**
	 * @param ctid
	 * @return 删除单条评论
	 */
	int MgrDeleteSingle(int ctid);
}
