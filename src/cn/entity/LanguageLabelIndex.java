package cn.entity;

/**
 * @author 语言标签索引 实体表
 * 
 */
public class LanguageLabelIndex {
	private int language_Index_Id;
	private int language_Id;
	private int ciid;

	/**
	 * @return 语言索引id 主键
	 */
	public int getLanguage_Index_Id() {
		return language_Index_Id;
	}

	/**
	 * @param language_Index_Id
	 *            语言索引id 主键
	 */
	public void setLanguage_Index_Id(int language_Index_Id) {
		this.language_Index_Id = language_Index_Id;
	}

	/**
	 * @return 语言id 外键
	 */
	public int getLanguage_Id() {
		return language_Id;
	}

	/**
	 * @param language_Id
	 *            语言id 外键
	 */
	public void setLanguage_Id(int language_Id) {
		this.language_Id = language_Id;
	}

	/**
	 * @return 商品id 外键
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid
	 *            商品id 外键
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

}
