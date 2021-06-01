package cn.entity;

/**
 * @author 商品信息 实体表
 * 
 */
/**
 * @author Clown-MZ
 *
 */
public class CommodityInformation {

	private int ciid;
	private String name;
	private String data;
	private String faXing;
	private String kaiFa;
	private String playJianJie;
	private String guanYu;
	private int Money;
	private String coverPicture;
	private String from;

	/**
	 * @return 商品id
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid
	 *            商品id
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

	/**
	 * @return 游戏名
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            游戏名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return 发行日期
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data
	 *            发行日期
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return 发行商
	 */
	public String getFaXing() {
		return faXing;
	}

	/**
	 * @param faxing
	 *            发行商
	 */
	public void setFaXing(String faxing) {
		this.faXing = faxing;
	}

	/**
	 * @return 开发商
	 */
	public String getKaiFa() {
		return kaiFa;
	}

	/**
	 * @param kaifa
	 *            开发商
	 */
	public void setKaiFa(String kaifa) {
		this.kaiFa = kaifa;
	}

	/**
	 * @return 简介
	 */
	public String getPlayJianJie() {
		return playJianJie;
	}

	/**
	 * @param play_jianjie
	 *            简介
	 */
	public void setPlayJianJie(String play_jianjie) {
		this.playJianJie = play_jianjie;
	}

	/**
	 * @return 关于
	 */
	public String getGuanYu() {
		return guanYu;
	}

	/**
	 * @param guanyu
	 *            关于
	 */
	public void setGuanYu(String guanyu) {
		this.guanYu = guanyu;
	}

	/**
	 * @return 游戏价格
	 */
	public int getMoney() {
		return Money;
	}

	/**
	 * @param money
	 *            游戏价格
	 */
	public void setMoney(int money) {
		Money = money;
	}

	/**
	 * @return 标题图片
	 */
	public String getCoverPicture() {
		return coverPicture;
	}

	/**
	 * @param cover_picture
	 *            标题图片
	 */
	public void setCoverPicture(String cover_picture) {
		this.coverPicture = cover_picture;
	}

	/**
	 * @return 平台
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from
	 *            平台
	 */
	public void setFrom(String from) {
		this.from = from;
	}

}
