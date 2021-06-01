package cn.dao;

import java.util.List;

import cn.entity.Comment;

/**
 * @author ���۽ӿ�
 *
 */
public interface CommentDao {
	/**
	 * @return ��ѯȫ������
	 */
	List<Comment> CdQuery();
	
	/**
	 * @param ciid ��Ʒid
	 * @return ��ѯ��Ʒ������
	 */
	List<Comment> CdQuery(int ciid,int thisPage,int Commentcount);
	
	/**
	 * @param ciid ��Ʒid
	 * @return ��ѯ�û�����Ʒ������
	 */
	List<Comment> CdQuery(int ciid,int userInfoId);
	
	/**
	 * @param ct ����ʵ��
	 * @return ��������
	 */
	int CdInsert(Comment ct);
	
	/**
	 * @param ciid ��Ʒid
	 * @param user_Info_Id �û�id
	 * @return
	 */
	int CdDelete(int ciid,int user_Info_Id);
	
	/**
	 * @param aid
	 * @return ɾ���˻� ������
	 */
	int CdMgrDelete(int aid);
	
	/**
	 * @param commentId
	 * @return ����������
	 */
	int CdMgrDeleteCiid(int ciid);
	
	/**
	 * @param ctid
	 * @return ����ctidɾ��
	 */
	int CdDeleteSingle(int ctid);
	
	/**
	 * @param ciid
	 * @return �·ݷ����ѯ��������
	 */
	List<Integer> CdQueryMonth(int ciid,int dateYear);
	
	/**
	 * @param ciid
	 * @param month
	 * @return �·ݲ�ѯ����
	 */
	List<Comment> CdQueryMMComment(int ciid ,int month,int dateYear,int type);
	
	/**
	 * @param userId
	 * @return ��ѯ�û��м�������
	 */
	int CdQueryCommentNum(int userId);
}
