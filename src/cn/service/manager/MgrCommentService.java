package cn.service.manager;

import java.util.List;

import cn.entity.Comment;

public interface MgrCommentService {

	/**
	 * @return ��ѯȫ������
	 */
	List<Comment> MgrQuery();
	
	/**
	 * @param ciid ��Ʒid
	 * @param user_info_id �û�id
	 * @return ɾ��ָ������
	 */
	int MgrDelete(int ciid,int userInfoId,String mgrMessage);
	
	/**
	 * @param ctid
	 * @return ɾ����������
	 */
	int MgrDeleteSingle(int ctid);
}
