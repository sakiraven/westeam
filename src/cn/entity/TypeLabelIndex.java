package cn.entity;

/**
 * @author 类型标签索引 实体表
 * 
 */
public class TypeLabelIndex {

	private int type_Label_Id;
	private int type_Id;
	private int ciid;

	/**
	 * @return 类型标签id 主键
	 */
	public int getType_Label_Id() {
		return type_Label_Id;
	}

	/**
	 * @param type_Label_Id
	 *            类型标签id 主键
	 */
	public void setType_Label_Id(int type_Label_Id) {
		this.type_Label_Id = type_Label_Id;
	}

	/**
	 * @return 类型id 外键
	 */
	public int getType_Id() {
		return type_Id;
	}

	/**
	 * @param type_Id
	 *            类型id 外键
	 */
	public void setType_Id(int type_Id) {
		this.type_Id = type_Id;
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
