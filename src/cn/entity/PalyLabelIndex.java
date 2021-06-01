package cn.entity;

/**
 * @author 玩法标签索引 实体表
 * 
 */
public class PalyLabelIndex {
	private int paly_Index_Id;
	private int play_Id;
	private int ciid;

	/**
	 * @return 玩法索引id 主键
	 */
	public int getPaly_index_id() {
		return paly_Index_Id;
	}

	/**
	 * @param paly_Index_Id
	 *            玩法索引id 主键
	 */
	public void setPaly_index_id(int paly_Index_Id) {
		this.paly_Index_Id = paly_Index_Id;
	}

	/**
	 * @return 玩法id 外键
	 */
	public int getPlay_Id() {
		return play_Id;
	}

	/**
	 * @param play_Id
	 *            玩法id 外键
	 */
	public void setPlay_Id(int play_Id) {
		this.play_Id = play_Id;
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
