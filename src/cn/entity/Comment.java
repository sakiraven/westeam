package cn.entity;

/**
 * @author 评论 实体表
 * 
 */
public class Comment {

	private int comment_Id;
	private int user_info_Id;
	private int ciid;
	private String neiRong;
	private int type;
	private String date;

	private int good;
	private int bad;
	
	/**
	 * @return 其他用户好评数
	 */
	public int getGood() {
		return good;
	}
	/**
	 * @return 其他用户好评数
	 */
	public void setGood(int good) {
		this.good = good;
	}
	/**
	 * @return 其他用户差评数
	 */
	public int getBad() {
		return bad;
	}
	/**
	 * @return 其他用户差评数
	 */
	public void setBad(int bad) {
		this.bad = bad;
	}

	/**
	 * @return 获取评论id 主键
	 */
	public int getComment_Id() {
		return comment_Id;
	}

	/**
	 * @param comment_Id
	 *            更改评论id
	 */
	public void setComment_Id(int comment_Id) {
		this.comment_Id = comment_Id;
	}

	/**
	 * @return 获取用户信息id 外键
	 */
	public int getUser_Info_Id() {
		return user_info_Id;
	}

	/**
	 * @param user_Info_Id
	 *            用户新id
	 */
	public void setUser_Info_Id(int user_Info_Id) {
		this.user_info_Id = user_Info_Id;
	}

	/**
	 * @return 获取商品信息id 外键
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid更新商品信息id
	 *            外键
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

	/**
	 * @return 获取内容
	 */
	public String getNeiRong() {
		return neiRong;
	}

	/**
	 * @param neiRong
	 *            更改内容
	 */
	public void setNeiRong(String neiRong) {
		this.neiRong = neiRong;
	}

	/**
	 * @return 获取评论类型 好评or差评
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type更改评论类型
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return 时间
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date 时间
	 */
	public void setDate(String date) {
		this.date = date;
	}

}
