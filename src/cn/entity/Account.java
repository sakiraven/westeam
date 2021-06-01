package cn.entity;

/**
 * @author 账号 实体表
 * 
 */
public class Account {

	private int aid;
	private String name;
	private String password;
	private int admin;

	/**
	 * @return 获取用户id
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * @param 更改用户id
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	/**
	 * @return 获取用户账号
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param 更改用户账号
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return 获取用户密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param 更改用户密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return 获取用户级别
	 */
	public int getAdmin() {
		return admin;
	}

	/**
	 * @param 更改用户级别
	 */
	public void setAdmin(int admin) {
		this.admin = admin;
	}
}
