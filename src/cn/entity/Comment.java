package cn.entity;

/**
 * @author ���� ʵ���
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
	 * @return �����û�������
	 */
	public int getGood() {
		return good;
	}
	/**
	 * @return �����û�������
	 */
	public void setGood(int good) {
		this.good = good;
	}
	/**
	 * @return �����û�������
	 */
	public int getBad() {
		return bad;
	}
	/**
	 * @return �����û�������
	 */
	public void setBad(int bad) {
		this.bad = bad;
	}

	/**
	 * @return ��ȡ����id ����
	 */
	public int getComment_Id() {
		return comment_Id;
	}

	/**
	 * @param comment_Id
	 *            ��������id
	 */
	public void setComment_Id(int comment_Id) {
		this.comment_Id = comment_Id;
	}

	/**
	 * @return ��ȡ�û���Ϣid ���
	 */
	public int getUser_Info_Id() {
		return user_info_Id;
	}

	/**
	 * @param user_Info_Id
	 *            �û���id
	 */
	public void setUser_Info_Id(int user_Info_Id) {
		this.user_info_Id = user_Info_Id;
	}

	/**
	 * @return ��ȡ��Ʒ��Ϣid ���
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid������Ʒ��Ϣid
	 *            ���
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

	/**
	 * @return ��ȡ����
	 */
	public String getNeiRong() {
		return neiRong;
	}

	/**
	 * @param neiRong
	 *            ��������
	 */
	public void setNeiRong(String neiRong) {
		this.neiRong = neiRong;
	}

	/**
	 * @return ��ȡ�������� ����or����
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type������������
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return ʱ��
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date ʱ��
	 */
	public void setDate(String date) {
		this.date = date;
	}

}
