package cn.service.manager.impl;

import java.util.List;

import cn.dao.CommentDao;
import cn.dao.NoticeDao;
import cn.dao.impl.CommentDaoImpl;
import cn.dao.impl.NoticeDaoImpl;
import cn.entity.Comment;
import cn.entity.Notice;
import cn.service.manager.MgrCommentService;

public class MgrCommentServiceImpl implements MgrCommentService {

	/* 
	 * 查看所有评论
	 */
	public List<Comment> MgrQuery() {
		CommentDao cd = new CommentDaoImpl();
		return cd.CdQuery();
	}

	/*
	 * 删除评论
	 */
	public int MgrDelete(int ciid, int userInfoId,String mgrMessage) {
		CommentDao cd = new CommentDaoImpl();
		NoticeDao nd = new NoticeDaoImpl();
		return cd.CdDelete(ciid, userInfoId)+nd.NdInsert(userInfoId, mgrMessage);
	}

	public int MgrDeleteSingle(int ctid) {
		CommentDao cd = new CommentDaoImpl();
		return cd.CdDeleteSingle(ctid);
	}

}
