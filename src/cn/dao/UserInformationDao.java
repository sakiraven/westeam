package cn.dao;

import java.util.List;

import cn.entity.Account;
import cn.entity.CommodityInformation;
import cn.entity.Friends;
import cn.entity.UserInformation;

/**
 * 用户信息 dao接口
 * 
 */
public interface UserInformationDao {

	/**
	 * @param aid
	 * @return 账号搜索好友
	 */
	UserInformation UidQuery(String userName);
	
	/**
	 * @return 查询所有详细信息 key=0查询所有 key=1 查询个人
	 */
	List<UserInformation> UidQuery(int key, int aid);

	/**
	 * @param uiUser_Information 对象
	 * @return插入详细信息 aid 昵称 条件aid
	 */
	int UidInsertInfo(UserInformation ui);

	/**
	 * @param aid账号id 外键
	 * @return插入详细信息 aid 头像 昵称 条件aid
	 */
	int UidMgrDelete(int aid);

	/**
	 * @param uiUser_Information 对象
	 * @return 修改方法 禁止修改aid 和主键
	 */
	int UidUpDate(UserInformation ui);

	/**
	 * @param userInfoId
	 * @return 查看单人所有好友
	 */
	List<UserInformation> UidFriendQuery(int userInfoId);

	/**
	 * @param money
	 * @param aid
	 * @return 充值金额
	 */
	int UidChongZhi(int money , int userInfoId);
	
	/**
	 * @param money
	 * @param aid
	 * @return 消费金额
	 */
	int UidXiaoFei(int money , int userInfoId);
	
	/**
	 * @param userInfoId
	 * @return 查看余额
	 */
	int UidQuery(int userInfoId);
	
	/**
	 * @param ctid
	 * @return 根据评论id查询用户id
	 */
	List<UserInformation> UidQueryComment(int ctid);
	
	/**
	 * @return 读评论用户信息
	 */
	UserInformation UidQueryCtName(int userId);

}
