package cn.entity;

public class Message {
	private int message_Id;
	private int send_User_Id;
	private int sendto_User_Id;
	private String message;
	private int delStatus;
	private int status;
	
	/**
	 * @return �Ķ�״̬
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status �Ķ�״̬
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return ɾ��״̬
	 */
	public int getDelStatus() {
		return delStatus;
	}

	/**
	 * @param delStatus
	 * ɾ��״̬
	 */
	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	/**
	 * @return ��Ϣ
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            ��Ϣ
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return ����id
	 */
	public int getMessage_Id() {
		return message_Id;
	}

	/**
	 * @param message_Id
	 *            ����id
	 */
	public void setMessage_Id(int message_Id) {
		this.message_Id = message_Id;
	}

	/**
	 * @return ������id
	 */
	public int getSend_User_Id() {
		return send_User_Id;
	}

	/**
	 * @param send_User_Id
	 *            ������id
	 */
	public void setSend_User_Id(int send_User_Id) {
		this.send_User_Id = send_User_Id;
	}

	/**
	 * @return ������id
	 */
	public int getSendto_User_Id() {
		return sendto_User_Id;
	}

	/**
	 * @param sendto_User_Id
	 *            ������id
	 */
	public void setSendto_User_Id(int sendto_User_Id) {
		this.sendto_User_Id = sendto_User_Id;
	}

}
