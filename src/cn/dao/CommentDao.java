package cn.dao;

import java.util.List;

import cn.entity.Comment;

/**
 * @author 评论接口
 *
 */
public interface CommentDao {
	/**
	 * @return 查询全部评论
	 */
	List<Comment> CdQuery();
	
	/**
	 * @param ciid 商品id
	 * @return 查询商品下评论
	 */
	List<Comment> CdQuery(int ciid,int thisPage,int Commentcount);
	
	/**
	 * @param ciid 商品id
	 * @return 查询用户在商品下评论
	 */
	List<Comment> CdQuery(int ciid,int userInfoId);
	
	/**
	 * @param ct 评论实体
	 * @return 插入评论
	 */
	int CdInsert(Comment ct);
	
	/**
	 * @param ciid 商品id
	 * @param user_Info_Id 用户id
	 * @return
	 */
	int CdDelete(int ciid,int user_Info_Id);
	
	/**
	 * @param aid
	 * @return 删除账户 清空外键
	 */
	int CdMgrDelete(int aid);
	
	/**
	 * @param commentId
	 * @return 清空评论外键
	 */
	int CdMgrDeleteCiid(int ciid);
	
	/**
	 * @param ctid
	 * @return 根据ctid删除
	 */
	int CdDeleteSingle(int ctid);
	
	/**
	 * @param ciid
	 * @return 月份分组查询好评差评
	 */
	List<Integer> CdQueryMonth(int ciid,int dateYear);
	
	/**
	 * @param ciid
	 * @param month
	 * @return 月份查询评论
	 */
	List<Comment> CdQueryMMComment(int ciid ,int month,int dateYear,int type);
	
	/**
	 * @param userId
	 * @return 查询用户有几条评论
	 */
	int CdQueryCommentNum(int userId);
}
