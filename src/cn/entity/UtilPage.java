package cn.entity;

/**
 * @author ������ ҳ
 *
 */
public class UtilPage {
	private int pageCount;
	private int commodityCount = 3;
	private int thisPage;
	/**
	 * @return ��ҳ��
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * @param pageCount ��ҳ��
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * @return ÿҳ������Ʒ
	 */
	public int getCommodityCount() {
		return commodityCount;
	}
	/**
	 * @param commodityCount ÿҳ������Ʒ
	 */
	public void setCommodityCount(int commodityCount) {
		this.commodityCount = commodityCount;
	}
	/**
	 * @return ��ҳ
	 */
	public int getThisPage() {
		return thisPage;
	}
	/**
	 * @param thisPage ��ҳ
	 */
	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}
	
}
