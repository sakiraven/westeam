package cn.entity;

/**
 * @author ����ͼƬ ʵ���
 * 
 */
public class DetailedPicture {
	private int detailed_Id;
	private String detailed;
	private int ciid;

	/**
	 * @return ��ϸͼƬid ����
	 */
	public int getDetailed_Id() {
		return detailed_Id;
	}

	/**
	 * @param detailed_Id
	 *            ��ϸͼƬid ����
	 */
	public void setDetailed_Id(int detailed_Id) {
		this.detailed_Id = detailed_Id;
	}

	/**
	 * @return ��ϸͼƬ·��
	 */
	public String getDetailed() {
		return detailed;
	}

	/**
	 * @param detailed
	 *            ��ϸͼƬ·��
	 */
	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}

	/**
	 * @return ��Ʒid���
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid
	 *            ��Ʒid���
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

}
