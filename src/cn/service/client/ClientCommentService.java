package cn.service.client;

import java.util.List;

import cn.entity.Comment;

public interface ClientCommentService {
	/**
	 * @param ciid 
	 * @return �鿴��Ʒ����
	 */
	List<Comment> ClientQuery(int ciid,int thisPage,int commentCount);
	
	/**
	 * @param ct ����ʵ��
	 * @return �������� -1�쳣 0����ʧ�� �������� 1����ɹ�
	 */
	int ClientInsert(Comment ct);
	
	/**
	 * @param year
	 * @param month
	 * @param ciid
	 * @return
	 */
	List<Comment> ClientQueryCommentMM(int year,int month,int ciid,int type);
	
	/**
	 * @param year
	 * @param month
	 * @return �鿴ÿ����������
	 */
	List<Integer> ClientQueryCount(int year,int ciid);
	
	/**
	 * @param userId
	 * @return ��ѯ�û��м�������
	 */
	int ClientQueryCommentNum(int userId);
}
