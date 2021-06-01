package cn.entity;

/**
 * @author 用户游戏 实体表
 * 
 */
public class UserGames {
	private int user_Info_Id;
	private int ciid;
	private int user_Game_Id;
	private int buy_Date;

	/**
	 * @return   购买时间
	 */
	public int getBuy_Date() {
		return buy_Date;
	}
	/**
	 * @return   购买时间
	 */
	public void setBuy_Date(int buy_Date) {
		this.buy_Date = buy_Date;
	}

	/**
	 * @return 用户信息id 外键
	 */
	public int getUser_Info_Id() {
		return user_Info_Id;
	}

	/**
	 * @param user_Info_Id
	 *            用户信息id 外键
	 */
	public void setUser_Info_Id(int user_Info_Id) {
		this.user_Info_Id = user_Info_Id;
	}

	/**
	 * @return 商品id 外键
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid
	 *            商品id 外键
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

	/**
	 * @return 用户游戏id 主键
	 */
	public int getUser_game_id() {
		return user_Game_Id;
	}

	/**
	 * @param user_Game_Id
	 *            用户游戏id 主键
	 */
	public void setUser_Game_Id(int user_Game_Id) {
		this.user_Game_Id = user_Game_Id;
	}
}
