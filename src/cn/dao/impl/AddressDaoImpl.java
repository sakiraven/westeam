package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.dao.AddressDao;
import cn.dao.BaseDao;
import cn.entity.Address;
import cn.entity.UserInformation;

public class AddressDaoImpl extends BaseDao implements AddressDao {

	/**
	 * @return 查询地址 key=0查询所有 key=1查询指定地址
	 */
	public List<Address> AdQuery(int user_info_id,int key) {
		Connection con = super.getCon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Address as = null;
		List<Address> GetAs = new ArrayList<Address>();
		String sql = "select * from address";
		if (key > 0) {
			sql = "select * from address where user_info_id = ?";
		}
		try {
			pst = con.prepareStatement(sql);
			if (key > 0) {
				pst.setInt(1, user_info_id);
			}
			rs = pst.executeQuery();
			while (rs.next()) {
				as = new Address();
				as.setAddress(rs.getString("address"));
				as.setTimesTamp(rs.getString("date"));
				as.setAddress_Id(rs.getInt("address_id"));
				as.setAddress_Mark(rs.getInt("address_mark"));
				as.setUser_Info_Id(rs.getInt("user_info_id"));
				GetAs.add(as);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(con, pst, rs);
		}
		return GetAs;
	}
	/**
	 * @param user_info_id 用户信息id
	 * @return 删除地址
	 */
	public int AdDelete(int user_info_id) {
		String sql = "delete from address where user_info_id = ?";
		Object ot[] = {user_info_id};
		return super.untilUpDate(ot, sql);
	}
	/**
	 * @param as 地址实体对象
	 * @return 更新表 地址 是否默认地址 
	 */
	public int AdUpDate(Address as) {
		String sql = "update address set address = ?,address_mark = ? where user_info_id = ? and address_id=?";
		Object ot[] = {as.getAddress(),as.getAddress_Mark(),as.getUser_Info_Id(),as.getAddress_Id()};
		return super.untilUpDate(ot, sql);
	}
	
	/**
	 * @param as 地址实体对象
	 * @return 插入表 1地址 2用户信息id 3时间 4是否设置默认地址 
	 */
	public int AdInsert(Address as) {
		String sql = "INSERT INTO `steam`.`address` (`address`,`date`,`address_mark`,`user_info_id`) VALUES(?,?,?,?);";
		Object ot[] = {as.getAddress(),as.getTimesTamp(),as.getAddress_Mark(),as.getUser_Info_Id()};
		return super.untilUpDate(ot, sql);
	}

}
