package cn.entity;

/**
 * @author ����Ա֪ͨʵ��
 * 
 */
public class Notice {
	private int nic_Id;
	private int sendToUserId;
	private String mgr_Message;
	private int type;
	private int sendUserId;
	/**
	 * @return ���͵��û�
	 */
	public int getSendUserId() {
		return sendUserId;
	}

	/**
	 * @param sendUserId ���͵��û�
	 */
	public void setSendUserId(int sendUserId) {
		this.sendUserId = sendUserId;
	}

	/**
	 * @return ֪ͨ���� 0 �û� 1 ����Ա
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            ֪ͨ���� 0�û� 1 ����Ա
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return ����id
	 */
	public int getNic_Id() {
		return nic_Id;
	}

	/**
	 * @return ����id
	 */
	public void setNic_Id(int nic_Id) {
		this.nic_Id = nic_Id;
	}

	/**
	 * @return �û���Ϣid
	 */
	public int getSendToUserId() {
		return sendToUserId;
	}

	/**
	 * @return �û���Ϣid
	 */
	public void setSendToUserId(int sendToUserId) {
		this.sendToUserId = sendToUserId;
	}

	/**
	 * @return ����Ա����
	 */
	public String getMgr_Message() {
		return mgr_Message;
	}

	/**
	 * @param mgr_Message
	 *            ����Ա����
	 */
	public void setMgr_Message(String mgr_Message) {
		this.mgr_Message = mgr_Message;
	}

}
