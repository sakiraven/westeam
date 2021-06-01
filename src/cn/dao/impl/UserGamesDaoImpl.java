package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.entity.CommodityInformation;
import cn.entity.UserGames;

/**
 * @author 游戏库实现类
 *
 */
public class UserGamesDaoImpl extends BaseDao implements cn.dao.UserGamesDao {

	@Override
	public int UgdInsert(int user_info_id,int ciid[]) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO user_games ( `user_info_id`,`ciid`) VALUES ");
		Object ot[] = new Object[ciid.length*2];
		for (int i = 0 ,j=0; i < ciid.length; i++,j+=2) {
			sql.append("(?, ?)");
			ot[j]=user_info_id;
			ot[j+1]=ciid[i];
			if(i!=ciid.length-1)
				sql.append(",");
		}
		
		return super.untilUpDate(ot, sql.toString());
	}

	@Override
	public int UgdDelete(int user_info_id,int ciid) {
		String sql = "delete from user_games where user_info_id=? and ciid = ? ";
		Object ot[] = {user_info_id,ciid};
		return super.untilUpDate(ot, sql);
	}

	@Override
	public List<String> UgdQuery(int user_info_id) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<String> GetDateLt = new ArrayList<String>();
		String sql = "SELECT buy_date FROM user_games WHERE user_info_id = ?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, user_info_id);
			rs = pst.executeQuery();
			while (rs.next()) {
				GetDateLt.add(rs.getString("buy_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetDateLt;
	}

	public int UgdMgrDelete(int aid) {
		String sql = "DELETE FROM user_games WHERE user_info_id in(SELECT user_info_id FROM user_information WHERE aid = ?)";
		Object ot[] = {aid};
		return super.untilUpDate(ot, sql);
	}
	
	public int UgdMgrDeleteCiid(int ciid) {
		String sql = "DELETE FROM user_games WHERE ciid = ?";
		Object ot[] = {ciid};
		return super.untilUpDate(ot, sql);
	}

}
