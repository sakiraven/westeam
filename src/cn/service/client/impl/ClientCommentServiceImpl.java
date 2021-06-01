package cn.service.client.impl;

import java.util.List;

import cn.dao.CommentDao;
import cn.dao.CommodityInformationDao;
import cn.dao.impl.CommentDaoImpl;
import cn.dao.impl.CommodityInformationDaoImpl;
import cn.entity.Comment;
import cn.entity.CommodityInformation;
import cn.service.client.ClientCommentService;

public class ClientCommentServiceImpl implements ClientCommentService {

	public List<Comment> ClientQuery(int ciid,int thisPage,int commentCount) {
		CommentDao cd = new CommentDaoImpl();
		return cd.CdQuery(ciid,thisPage,commentCount);
	}

	public int ClientInsert(Comment ct) {
		CommentDao cd = new CommentDaoImpl();
		CommodityInformationDao cid = new CommodityInformationDaoImpl();
		if(cid.CidGameBox(ct.getCiid(), ct.getUser_Info_Id())==null)
			return -2;
		if(cd.CdQuery(ct.getCiid(), ct.getUser_Info_Id()).size()!=0)
			return 0;
		return cd.CdInsert(ct);
	}

	public List<Comment> ClientQueryCommentMM(int year, int month, int ciid,int type) {
		CommentDao cd = new CommentDaoImpl();
		return cd.CdQueryMMComment(ciid, month, year,type);
	}

	public List<Integer> ClientQueryCount(int year, int ciid) {
		CommentDao cd = new CommentDaoImpl();
		return cd.CdQueryMonth(ciid, year);
	}

	public int ClientQueryCommentNum(int userId) {
		CommentDao cd = new CommentDaoImpl();
		return cd.CdQueryCommentNum(userId);
	}

}
