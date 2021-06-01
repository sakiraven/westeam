package cn.service.client;

import java.util.List;

import cn.entity.Comment;

public interface ClientCommentService {
	/**
	 * @param ciid 
	 * @return 查看商品评论
	 */
	List<Comment> ClientQuery(int ciid,int thisPage,int commentCount);
	
	/**
	 * @param ct 评论实体
	 * @return 插入评论 -1异常 0插入失败 已有评论 1插入成功
	 */
	int ClientInsert(Comment ct);
	
	/**
	 * @param year
	 * @param month
	 * @param ciid
	 * @return
	 */
	List<Comment> ClientQueryCommentMM(int year,int month,int ciid,int type);
	
	/**
	 * @param year
	 * @param month
	 * @return 查看每月评价数量
	 */
	List<Integer> ClientQueryCount(int year,int ciid);
	
	/**
	 * @param userId
	 * @return 查询用户有几条评论
	 */
	int ClientQueryCommentNum(int userId);
}
