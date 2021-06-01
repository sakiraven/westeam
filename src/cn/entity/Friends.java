package cn.entity;

/**
 * @author 好友表
 *
 */
public class Friends {

	private int fd_Id;
	private int user_Id;
	private int friend_Id;
	/**
	 * @return 主键id
	 */
	public int getFd_Id() {
		return fd_Id;
	}
	/**
	 * @param fd_Id 主键id
	 */
	public void setFd_Id(int fd_Id) {
		this.fd_Id = fd_Id;
	}
	/**
	 * @return 我的id
	 */
	public int getUser_Id() {
		return user_Id;
	}
	/**
	 * @param user_Id 我的id
	 */
	public void setUser_id(int user_Id) {
		this.user_Id = user_Id;
	}
	/**
	 * @return 好友id
	 */
	public int getFriend_Id() {
		return friend_Id;
	}
	/**
	 * @param friend_Id 好友id
	 */
	public void setFriend_Id(int friend_Id) {
		this.friend_Id = friend_Id;
	}

}
