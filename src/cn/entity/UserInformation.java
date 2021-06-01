package cn.entity;

/**
 * @author 用户信息 实体表
 * 
 */
public class UserInformation {
	private int user_Info_Id;
	private int aid;
	private String picture;
	private String nickName;
	private int blance;

	
	/**
	 * @return 价格
	 */
	public int getBlance() {
		return blance;
	}

	/**
	 * @param blance 价格
	 */
	public void setBlance(int blance) {
		this.blance = blance;
	}

	/**
	 * @return 用户信息id 主键
	 */
	public int getUser_Info_Id() {
		return user_Info_Id;
	}

	/**
	 * @param user_Info_Id
	 *            用户信息id 主键
	 */
	public void setUser_Info_Id(int user_Info_Id) {
		this.user_Info_Id = user_Info_Id;
	}

	/**
	 * @return 账号id 外键
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * @param aid
	 *            账号id 外键
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	/**
	 * @return 头像路径
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture
	 *            头像路径
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * @return 昵称
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName
	 *            昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
