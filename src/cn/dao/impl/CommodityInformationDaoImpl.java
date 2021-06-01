package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.CommodityInformationDao;
import cn.entity.CommodityInformation;
import cn.entity.Friends;
import cn.entity.UserInformation;

public class CommodityInformationDaoImpl extends BaseDao implements
		CommodityInformationDao {

	/*
	 * 查询 无条件查询
	 */
	public List<CommodityInformation> CidQuery(int thisPage, int commdityCount) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		CommodityInformation ci = null;
		List<CommodityInformation> GetCiLt = new ArrayList<CommodityInformation>();
		String sql = "select * from commodity_information limit ?,?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, thisPage * commdityCount);
			pst.setInt(2, commdityCount);
			rs = pst.executeQuery();
			while (rs.next()) {
				ci = new CommodityInformation();
				ci.setCiid(rs.getInt("ciid"));
				ci.setCoverPicture(rs.getString("cover_picture"));
				ci.setData(rs.getString("data"));
				ci.setFaXing(rs.getString("faxing"));
				ci.setFrom(rs.getString("from"));
				ci.setGuanYu(rs.getString("guanyu"));
				ci.setKaiFa(rs.getString("kaifa"));
				ci.setMoney(rs.getInt("money"));
				ci.setName(rs.getString("name"));
				ci.setPlayJianJie(rs.getString("play_jianjie"));
				GetCiLt.add(ci);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetCiLt;
	}

	/*
	 * 查询 用户游戏库
	 */
	public List<CommodityInformation> CidQuery(int user_info_id) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		CommodityInformation ci = null;
		List<CommodityInformation> GetCiLt = new ArrayList<CommodityInformation>();
		String sql = "SELECT * FROM commodity_information WHERE ciid IN (SELECT ciid FROM user_games WHERE user_info_id = ?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, user_info_id);
			rs = pst.executeQuery();
			while (rs.next()) {
				ci = new CommodityInformation();
				ci.setCiid(rs.getInt("ciid"));
				ci.setCoverPicture(rs.getString("cover_picture"));
				ci.setData(rs.getString("data"));
				ci.setFaXing(rs.getString("faxing"));
				ci.setFrom(rs.getString("from"));
				ci.setGuanYu(rs.getString("guanyu"));
				ci.setKaiFa(rs.getString("kaifa"));
				ci.setMoney(rs.getInt("money"));
				ci.setName(rs.getString("name"));
				ci.setPlayJianJie(rs.getString("play_jianjie"));
				GetCiLt.add(ci);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetCiLt;
	}

	/*
	 * 游戏类型筛选游戏
	 */
	public List<CommodityInformation> CidQuery(int[] type_id, int key,
			String name, int thisPage, int commdityCount) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		CommodityInformation ci = null;
		List<CommodityInformation> GetCiLt = new ArrayList<CommodityInformation>();
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM commodity_information WHERE ciid IN(SELECT ciid FROM type_label_index WHERE type_id =?)");
		for (int i = 0; i < (type_id.length - 1); i++) {
			sql.append("AND ciid IN(SELECT ciid FROM type_label_index WHERE type_id =?)");
		}
		if (key ==1 )
			sql.append(" AND `name` LIKE '%" + name + "%'");
		else if(key==2){
			sql=new StringBuffer();
			sql.append("select * from commodity_information where `name` LIKE '%"+name+"%'");
		}
		sql.append(" limit "+thisPage*commdityCount+","+commdityCount);
		try {
			pst = con.prepareStatement(sql.toString());
			if(key!=2){
				for (int i = 0; i < type_id.length; i++) {
					pst.setInt(i + 1, type_id[i]);
				}
			}
				
			
			/*
			 * if(key > 0) pst.setString(type_id.length+1, name);
			 */
			rs = pst.executeQuery();
			while (rs.next()) {
				ci = new CommodityInformation();
				ci.setCiid(rs.getInt("ciid"));
				ci.setCoverPicture(rs.getString("cover_picture"));
				ci.setData(rs.getString("data"));
				ci.setFaXing(rs.getString("faxing"));
				ci.setFrom(rs.getString("from"));
				ci.setGuanYu(rs.getString("guanyu"));
				ci.setKaiFa(rs.getString("kaifa"));
				ci.setMoney(rs.getInt("money"));
				ci.setName(rs.getString("name"));
				ci.setPlayJianJie(rs.getString("play_jianjie"));
				GetCiLt.add(ci);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetCiLt;
	}

	/*
	 * 按照游戏名称查询
	 */
	public List<CommodityInformation> CidQuery(String GameName) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		CommodityInformation ci = null;
		List<CommodityInformation> GetCiLt = new ArrayList<CommodityInformation>();
		String sql = "SELECT * FROM commodity_information WHERE name like '%"
				+ GameName + "%'";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ci = new CommodityInformation();
				ci.setCiid(rs.getInt("ciid"));
				ci.setCoverPicture(rs.getString("cover_picture"));
				ci.setData(rs.getString("data"));
				ci.setFaXing(rs.getString("faxing"));
				ci.setFrom(rs.getString("from"));
				ci.setGuanYu(rs.getString("guanyu"));
				ci.setKaiFa(rs.getString("kaifa"));
				ci.setMoney(rs.getInt("money"));
				ci.setName(rs.getString("name"));
				ci.setPlayJianJie(rs.getString("play_jianjie"));
				GetCiLt.add(ci);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetCiLt;
	}

	/*
	 * 商品更新 除平台和ciid
	 */
	public int CidUpDate(CommodityInformation ci) {
		String sql = "UPDATE `steam`.`commodity_information` SET `name` = ?,`faxing` = ?,`kaifa` = ?,`play_jianjie` = ?,`guanyu` = ?,`Money` = ? WHERE `ciid` = ? ;";
		Object ot[] = { ci.getName(),  ci.getFaXing(),
				ci.getKaiFa(), ci.getPlayJianJie(), ci.getGuanYu(),
				ci.getMoney(), ci.getCiid()};
		return super.untilUpDate(ot, sql);
	}

	/*
	 * 删除商品
	 */
	public int CidDelete(int ciid) {
		String sql = "delete from commodity_information where ciid = ?";
		Object ot[] = { ciid };
		return super.untilUpDate(ot, sql);
	}

	/*
	 * 按照日期排序
	 */
	public List<CommodityInformation> CidQueryDate() {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		CommodityInformation ci = null;
		List<CommodityInformation> GetCiLt = new ArrayList<CommodityInformation>();
		String sql = "SELECT * FROM commodity_information ORDER BY `data`";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ci = new CommodityInformation();
				ci.setCiid(rs.getInt("ciid"));
				ci.setCoverPicture(rs.getString("cover_picture"));
				ci.setData(rs.getString("data"));
				ci.setFaXing(rs.getString("faxing"));
				ci.setFrom(rs.getString("from"));
				ci.setGuanYu(rs.getString("guanyu"));
				ci.setKaiFa(rs.getString("kaifa"));
				ci.setMoney(rs.getInt("money"));
				ci.setName(rs.getString("name"));
				ci.setPlayJianJie(rs.getString("play_jianjie"));
				GetCiLt.add(ci);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetCiLt;
	}

	public CommodityInformation CidSingle(int ciid) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM commodity_information where ciid=? ";
		CommodityInformation ci = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ciid);
			rs = pst.executeQuery();
			while(rs.next()){
				ci = new CommodityInformation();
				ci.setCiid(rs.getInt("ciid"));
				ci.setCoverPicture(rs.getString("cover_picture"));
				ci.setData(rs.getString("data"));
				ci.setFaXing(rs.getString("faxing"));
				ci.setFrom(rs.getString("from"));
				ci.setGuanYu(rs.getString("guanyu"));
				ci.setKaiFa(rs.getString("kaifa"));
				ci.setMoney(rs.getInt("money"));
				ci.setName(rs.getString("name"));
				ci.setPlayJianJie(rs.getString("play_jianjie"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		return ci;
	}

	public List<String> CidQueryComment() {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<String> getlt = new ArrayList<String>();
		String sql = "SELECT * FROM COMMENT INNER JOIN  `commodity_information` ON commodity_information.`ciid`=comment.`ciid`";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				getlt.add(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		
		return getlt;
	}

	public CommodityInformation CidGameBox(int ciid, int userId) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		CommodityInformation ci = null;
		String sql = "SELECT * FROM `user_games` WHERE ciid = ? AND user_info_id=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ciid);
			pst.setInt(2, userId);
			rs = pst.executeQuery();
			while(rs.next()){
				ci = new CommodityInformation();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll(con, pst, rs);
		}
		return ci;
	}

}
