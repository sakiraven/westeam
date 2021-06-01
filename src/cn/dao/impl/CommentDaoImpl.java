package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.CommentDao;
import cn.entity.Account;
import cn.entity.Comment;

/**
 * @author 评论接口
 *
 */
public class CommentDaoImpl extends BaseDao implements CommentDao {

	/* 
	 * 查询评论 无条件
	 */
	public List<Comment> CdQuery() {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Comment ct = null;
		List<Comment> GetCtLt = new ArrayList<Comment>();
		String sql = "select * from comment";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ct = new Comment();
				ct.setBad(rs.getInt("bad"));
				ct.setCiid(rs.getInt("ciid"));
				ct.setComment_Id(rs.getInt("comment_id"));
				ct.setDate(rs.getString("date"));
				ct.setGood(rs.getInt("good"));
				ct.setNeiRong(rs.getString("neirong"));
				ct.setType(rs.getInt("type"));
				ct.setUser_Info_Id(rs.getInt("user_info_id"));
				GetCtLt.add(ct);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetCtLt;
	}

	/*
	 * 查询商品评论
	 * ciid 商品id
	 */
	public List<Comment> CdQuery(int ciid,int thisPage,int commentCount) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Comment ct = null;
		List<Comment> GetCtLt = new ArrayList<Comment>();
		String sql = "select * from comment where ciid=? ORDER BY `date` DESC  limit ?,?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ciid);
			pst.setInt(2, thisPage*commentCount);
			pst.setInt(3, commentCount);
			rs = pst.executeQuery();
			while (rs.next()) {
				ct = new Comment();
				ct.setBad(rs.getInt("bad"));
				ct.setCiid(rs.getInt("ciid"));
				ct.setComment_Id(rs.getInt("comment_id"));
				ct.setDate(rs.getString("date"));
				ct.setGood(rs.getInt("good"));
				ct.setNeiRong(rs.getString("neirong"));
				ct.setType(rs.getInt("type"));
				ct.setUser_Info_Id(rs.getInt("user_info_id"));
				GetCtLt.add(ct);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetCtLt;
	}

	/* 
	 * 插入商品评论
	 */
	public int CdInsert(Comment ct) {
		String sql = "INSERT INTO `steam`.`comment` (`ciid`,`neirong`,`type`,user_info_id) VALUES(?,?,?,?);";
		Object ot[] = { ct.getCiid(), ct.getNeiRong(), ct.getType(), ct.getUser_Info_Id() };
		return super.untilUpDate(ot, sql);
	}
	

	/* 
	 * 删除评论
	 */
	public int CdDelete(int ciid, int user_info_id) {
		String sql = "delete from comment where ciid= ? and user_info_id=?";
		Object ot[] = {ciid,user_info_id};
		return super.untilUpDate(ot, sql);
	}

	public List<Comment> CdQuery(int ciid, int UserInfoId) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Comment ct = null;
		List<Comment> GetCtLt = new ArrayList<Comment>();
		String sql = "select * from comment where ciid=? and user_info_id=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ciid);
			pst.setInt(2, UserInfoId);
			rs = pst.executeQuery();
			while (rs.next()) {
				ct = new Comment();
				/*ct.setBad(rs.getInt("bad"));
				ct.setCiid(rs.getInt("ciid"));
				ct.setComment_id(rs.getInt("comment_id"));
				ct.setDate(rs.getString("date"));
				ct.setGood(rs.getInt("good"));
				ct.setNeirong(rs.getString("neirong"));
				ct.setType(rs.getInt("type"));
				ct.setUser_info_id(rs.getInt("user_info_id"));*/
				GetCtLt.add(ct);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetCtLt;
	}

	public int CdMgrDelete(int aid) {
		String sql = "DELETE FROM comment WHERE user_info_id in (SELECT user_info_id FROM user_information WHERE aid = ?)";
		Object ot[] = { aid };
		return super.untilUpDate(ot, sql);
	}

	public int CdMgrDeleteCiid(int ciid) {
		String sql = "DELETE FROM comment WHERE ciid = ?";
		Object ot[] = { ciid };
		return super.untilUpDate(ot, sql);
	}

	public int CdDeleteSingle(int ctid) {
		String sql = "DELETE FROM comment WHERE comment_id = ?";
		Object ot[] = { ctid };
		return super.untilUpDate(ot, sql);
	}

	public List<Integer> CdQueryMonth(int ciid,int dateYear) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Integer> getlt = new ArrayList<Integer>();
		int  getintGood[] = new int[12];
		int  getintBad[] = new int[12];
		String sql = "SELECT MONTH(`date`) AS MONTH,COUNT(ciid),type FROM `comment` WHERE YEAR(`date`) = ? and ciid=?   GROUP BY MONTH (`date`),type;";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, dateYear);
			pst.setInt(2, ciid);
			rs = pst.executeQuery();
			while(rs.next()){
				if(rs.getInt(3)==0)
					getintGood[rs.getInt(1)-1]=rs.getInt(2);
				if(rs.getInt(3)==1)
					getintBad[rs.getInt(1)-1]=rs.getInt(2);
				
			}
			/*for (int i : getint) {
				getlt.add(i);
			}*/
			
			for (int i = 0,j=0; i < 24; i+=2,j++) {
				getlt.add(getintGood[j]);
				getlt.add(getintBad[j]);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		
		return getlt;
	}

	public List<Comment> CdQueryMMComment(int ciid, int month, int dateYear,int type) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Comment> getlt = new ArrayList<Comment>();
		Comment ct = null;
		String sql = "SELECT * FROM `comment` WHERE YEAR(`date`) = ? AND MONTH(`date`)= ? and ciid=? and type=?;";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, dateYear);
			pst.setInt(2, month);
			pst.setInt(3, ciid);
			pst.setInt(4, type);
			rs = pst.executeQuery();
			while(rs.next()){
				ct = new Comment();
				ct.setBad(rs.getInt("bad"));
				ct.setCiid(rs.getInt("ciid"));
				ct.setComment_Id(rs.getInt("comment_id"));
				ct.setDate(rs.getString("date"));
				ct.setGood(rs.getInt("good"));
				ct.setNeiRong(rs.getString("neirong"));
				ct.setType(rs.getInt("type"));
				ct.setUser_Info_Id(rs.getInt("user_info_id"));
				getlt.add(ct);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		
		return getlt;
	}
	
	public int CdQueryCommentNum(int userId) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT COUNT(1) FROM COMMENT WHERE user_info_id = ?";
		int result=0;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, userId);
			rs = pst.executeQuery();
			while(rs.next()){
				result=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		return result;
	}

}
