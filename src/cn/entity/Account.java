package cn.entity;

/**
 * @author �˺� ʵ���
 * 
 */
public class Account {

	private int aid;
	private String name;
	private String password;
	private int admin;

	/**
	 * @return ��ȡ�û�id
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * @param �����û�id
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	/**
	 * @return ��ȡ�û��˺�
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param �����û��˺�
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return ��ȡ�û�����
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param �����û�����
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return ��ȡ�û�����
	 */
	public int getAdmin() {
		return admin;
	}

	/**
	 * @param �����û�����
	 */
	public void setAdmin(int admin) {
		this.admin = admin;
	}
}
