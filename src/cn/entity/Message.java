package cn.entity;

public class Message {
	private int message_Id;
	private int send_User_Id;
	private int sendto_User_Id;
	private String message;
	private int delStatus;
	private int status;
	
	/**
	 * @return 阅读状态
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status 阅读状态
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return 删除状态
	 */
	public int getDelStatus() {
		return delStatus;
	}

	/**
	 * @param delStatus
	 * 删除状态
	 */
	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	/**
	 * @return 信息
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            信息
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return 主键id
	 */
	public int getMessage_Id() {
		return message_Id;
	}

	/**
	 * @param message_Id
	 *            主键id
	 */
	public void setMessage_Id(int message_Id) {
		this.message_Id = message_Id;
	}

	/**
	 * @return 发送者id
	 */
	public int getSend_User_Id() {
		return send_User_Id;
	}

	/**
	 * @param send_User_Id
	 *            发送者id
	 */
	public void setSend_User_Id(int send_User_Id) {
		this.send_User_Id = send_User_Id;
	}

	/**
	 * @return 收信者id
	 */
	public int getSendto_User_Id() {
		return sendto_User_Id;
	}

	/**
	 * @param sendto_User_Id
	 *            收信者id
	 */
	public void setSendto_User_Id(int sendto_User_Id) {
		this.sendto_User_Id = sendto_User_Id;
	}

}
