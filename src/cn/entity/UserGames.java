package cn.entity;

/**
 * @author �û���Ϸ ʵ���
 * 
 */
public class UserGames {
	private int user_Info_Id;
	private int ciid;
	private int user_Game_Id;
	private int buy_Date;

	/**
	 * @return   ����ʱ��
	 */
	public int getBuy_Date() {
		return buy_Date;
	}
	/**
	 * @return   ����ʱ��
	 */
	public void setBuy_Date(int buy_Date) {
		this.buy_Date = buy_Date;
	}

	/**
	 * @return �û���Ϣid ���
	 */
	public int getUser_Info_Id() {
		return user_Info_Id;
	}

	/**
	 * @param user_Info_Id
	 *            �û���Ϣid ���
	 */
	public void setUser_Info_Id(int user_Info_Id) {
		this.user_Info_Id = user_Info_Id;
	}

	/**
	 * @return ��Ʒid ���
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid
	 *            ��Ʒid ���
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

	/**
	 * @return �û���Ϸid ����
	 */
	public int getUser_game_id() {
		return user_Game_Id;
	}

	/**
	 * @param user_Game_Id
	 *            �û���Ϸid ����
	 */
	public void setUser_Game_Id(int user_Game_Id) {
		this.user_Game_Id = user_Game_Id;
	}
}
