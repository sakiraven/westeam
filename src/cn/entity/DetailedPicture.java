package cn.entity;

/**
 * @author ÏêÇéÍ¼Æ¬ ÊµÌå±í
 * 
 */
public class DetailedPicture {
	private int detailed_Id;
	private String detailed;
	private int ciid;

	/**
	 * @return ÏêÏ¸Í¼Æ¬id Ö÷¼ü
	 */
	public int getDetailed_Id() {
		return detailed_Id;
	}

	/**
	 * @param detailed_Id
	 *            ÏêÏ¸Í¼Æ¬id Ö÷¼ü
	 */
	public void setDetailed_Id(int detailed_Id) {
		this.detailed_Id = detailed_Id;
	}

	/**
	 * @return ÏêÏ¸Í¼Æ¬Â·¾¶
	 */
	public String getDetailed() {
		return detailed;
	}

	/**
	 * @param detailed
	 *            ÏêÏ¸Í¼Æ¬Â·¾¶
	 */
	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}

	/**
	 * @return ÉÌÆ·idÍâ¼ü
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid
	 *            ÉÌÆ·idÍâ¼ü
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

}
