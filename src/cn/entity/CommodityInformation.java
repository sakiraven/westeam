package cn.entity;

/**
 * @author ��Ʒ��Ϣ ʵ���
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
	 * @return ��Ʒid
	 */
	public int getCiid() {
		return ciid;
	}

	/**
	 * @param ciid
	 *            ��Ʒid
	 */
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}

	/**
	 * @return ��Ϸ��
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            ��Ϸ��
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return ��������
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data
	 *            ��������
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return ������
	 */
	public String getFaXing() {
		return faXing;
	}

	/**
	 * @param faxing
	 *            ������
	 */
	public void setFaXing(String faxing) {
		this.faXing = faxing;
	}

	/**
	 * @return ������
	 */
	public String getKaiFa() {
		return kaiFa;
	}

	/**
	 * @param kaifa
	 *            ������
	 */
	public void setKaiFa(String kaifa) {
		this.kaiFa = kaifa;
	}

	/**
	 * @return ���
	 */
	public String getPlayJianJie() {
		return playJianJie;
	}

	/**
	 * @param play_jianjie
	 *            ���
	 */
	public void setPlayJianJie(String play_jianjie) {
		this.playJianJie = play_jianjie;
	}

	/**
	 * @return ����
	 */
	public String getGuanYu() {
		return guanYu;
	}

	/**
	 * @param guanyu
	 *            ����
	 */
	public void setGuanYu(String guanyu) {
		this.guanYu = guanyu;
	}

	/**
	 * @return ��Ϸ�۸�
	 */
	public int getMoney() {
		return Money;
	}

	/**
	 * @param money
	 *            ��Ϸ�۸�
	 */
	public void setMoney(int money) {
		Money = money;
	}

	/**
	 * @return ����ͼƬ
	 */
	public String getCoverPicture() {
		return coverPicture;
	}

	/**
	 * @param cover_picture
	 *            ����ͼƬ
	 */
	public void setCoverPicture(String cover_picture) {
		this.coverPicture = cover_picture;
	}

	/**
	 * @return ƽ̨
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from
	 *            ƽ̨
	 */
	public void setFrom(String from) {
		this.from = from;
	}

}
