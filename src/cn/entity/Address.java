package cn.entity;

/**
 * @author 地址 实体表
 * 
 */
public class Address {
	private int address_Id;
	private int user_Info_Id;
	private String address;
	private String timesTamp;
	private int address_Mark;

	/**
	 * @return 获取
	 */
	/**
	 * @param 更改
	 */
	/**
	 * @return 获取地址id
	 */
	public int getAddress_Id() {
		return address_Id;
	}

	/**
	 * @param 更改用户id
	 */
	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}

	/**
	 * @return 获取用户信息id
	 */
	public int getUser_Info_Id() {
		return user_Info_Id;
	}

	/**
	 * @param 更改用户信息id
	 */
	public void setUser_Info_Id(int user_Info_Id) {
		this.user_Info_Id = user_Info_Id;
	}

	/**
	 * @return 获取地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param 更改地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return 获取创建时间
	 */
	public String getTimesTamp() {
		return timesTamp;
	}

	/**
	 * @param 更改船舰时间
	 */
	public void setTimesTamp(String timesTamp) {
		this.timesTamp = timesTamp;
	}

	/**
	 * @return 获取默认地址状态(1为默认地址)
	 */
	public int getAddress_Mark() {
		return address_Mark;
	}

	/**
	 * @param 更改默认地址状态
	 *            (1为默认地址)
	 */
	public void setAddress_Mark(int address_Mark) {
		this.address_Mark = address_Mark;
	}
}
