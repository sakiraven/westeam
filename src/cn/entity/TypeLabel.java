package cn.entity;

/**
 * @author 类型标签 实体表
 * 
 */
public class TypeLabel {
	private int type_Id;
	private String type;

	/**
	 * @return 商品类型id 主键
	 */
	public int getType_Id() {
		return type_Id;
	}

	/**
	 * @param type_Id
	 *            商品类型id 主键
	 */
	public void setType_Id(int type_Id) {
		this.type_Id = type_Id;
	}

	/**
	 * @return 标签内容
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            标签内容
	 */
	public void setType(String type) {
		this.type = type;
	}

}
