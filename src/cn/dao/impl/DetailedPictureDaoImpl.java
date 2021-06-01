package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.BaseDao;
import cn.dao.DetailedPictureDao;
import cn.entity.Comment;
import cn.entity.DetailedPicture;

/**
 * @author œÍœ∏Õº∆¨  µœ÷¿‡
 *
 */
public class DetailedPictureDaoImpl extends BaseDao implements DetailedPictureDao{

	public List<DetailedPicture> DpdQuery(int ciid) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		DetailedPicture dp = null;
		List<DetailedPicture> GetDpLt = new ArrayList<DetailedPicture>();
		String sql = "select * from Detailed_Picture where ciid=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, ciid);
			rs = pst.executeQuery();
			while (rs.next()) {
				dp = new DetailedPicture();
				dp.setCiid(rs.getInt("ciid"));
				dp.setDetailed(rs.getString("detailed"));
				dp.setDetailed_Id(rs.getInt("detailed_id"));
				GetDpLt.add(dp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetDpLt;
	}

	public int DpdUpDate(String PictureName,String beforPictureName) {
		String sql = "update detailed_picture set detailed = ? where detailed = ?";
		Object ot[] = {PictureName,beforPictureName};
		return super.untilUpDate(ot, sql);
	}

	public int DpdDelete( String beforPictureName) {
		String sql = "delete from detailed_picture where detailed=?";
		Object ot[] = {beforPictureName};
		return super.untilUpDate(ot, sql);
	}

	public int DpdMgrDelete(int ciid) {
		String sql = "delete from detailed_picture where ciid=?";
		Object ot[] = {ciid};
		return super.untilUpDate(ot, sql);
	}

	
}
