package cn.entity;

/**
 * @author 管理员通知实体
 * 
 */
public class Notice {
	private int nic_Id;
	private int sendToUserId;
	private String mgr_Message;
	private int type;
	private int sendUserId;
	/**
	 * @return 发送的用户
	 */
	public int getSendUserId() {
		return sendUserId;
	}

	/**
	 * @param sendUserId 发送的用户
	 */
	public void setSendUserId(int sendUserId) {
		this.sendUserId = sendUserId;
	}

	/**
	 * @return 通知类型 0 用户 1 管理员
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            通知类型 0用户 1 管理员
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return 主键id
	 */
	public int getNic_Id() {
		return nic_Id;
	}

	/**
	 * @return 主键id
	 */
	public void setNic_Id(int nic_Id) {
		this.nic_Id = nic_Id;
	}

	/**
	 * @return 用户信息id
	 */
	public int getSendToUserId() {
		return sendToUserId;
	}

	/**
	 * @return 用户信息id
	 */
	public void setSendToUserId(int sendToUserId) {
		this.sendToUserId = sendToUserId;
	}

	/**
	 * @return 管理员留言
	 */
	public String getMgr_Message() {
		return mgr_Message;
	}

	/**
	 * @param mgr_Message
	 *            管理员留言
	 */
	public void setMgr_Message(String mgr_Message) {
		this.mgr_Message = mgr_Message;
	}

}
