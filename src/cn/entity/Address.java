package cn.entity;

/**
 * @author ��ַ ʵ���
 * 
 */
public class Address {
	private int address_Id;
	private int user_Info_Id;
	private String address;
	private String timesTamp;
	private int address_Mark;

	/**
	 * @return ��ȡ
	 */
	/**
	 * @param ����
	 */
	/**
	 * @return ��ȡ��ַid
	 */
	public int getAddress_Id() {
		return address_Id;
	}

	/**
	 * @param �����û�id
	 */
	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}

	/**
	 * @return ��ȡ�û���Ϣid
	 */
	public int getUser_Info_Id() {
		return user_Info_Id;
	}

	/**
	 * @param �����û���Ϣid
	 */
	public void setUser_Info_Id(int user_Info_Id) {
		this.user_Info_Id = user_Info_Id;
	}

	/**
	 * @return ��ȡ��ַ
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param ���ĵ�ַ
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return ��ȡ����ʱ��
	 */
	public String getTimesTamp() {
		return timesTamp;
	}

	/**
	 * @param ���Ĵ���ʱ��
	 */
	public void setTimesTamp(String timesTamp) {
		this.timesTamp = timesTamp;
	}

	/**
	 * @return ��ȡĬ�ϵ�ַ״̬(1ΪĬ�ϵ�ַ)
	 */
	public int getAddress_Mark() {
		return address_Mark;
	}

	/**
	 * @param ����Ĭ�ϵ�ַ״̬
	 *            (1ΪĬ�ϵ�ַ)
	 */
	public void setAddress_Mark(int address_Mark) {
		this.address_Mark = address_Mark;
	}
}
