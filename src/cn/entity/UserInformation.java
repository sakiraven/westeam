package cn.entity;

/**
 * @author �û���Ϣ ʵ���
 * 
 */
public class UserInformation {
	private int user_Info_Id;
	private int aid;
	private String picture;
	private String nickName;
	private int blance;

	
	/**
	 * @return �۸�
	 */
	public int getBlance() {
		return blance;
	}

	/**
	 * @param blance �۸�
	 */
	public void setBlance(int blance) {
		this.blance = blance;
	}

	/**
	 * @return �û���Ϣid ����
	 */
	public int getUser_Info_Id() {
		return user_Info_Id;
	}

	/**
	 * @param user_Info_Id
	 *            �û���Ϣid ����
	 */
	public void setUser_Info_Id(int user_Info_Id) {
		this.user_Info_Id = user_Info_Id;
	}

	/**
	 * @return �˺�id ���
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * @param aid
	 *            �˺�id ���
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	/**
	 * @return ͷ��·��
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture
	 *            ͷ��·��
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * @return �ǳ�
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName
	 *            �ǳ�
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
