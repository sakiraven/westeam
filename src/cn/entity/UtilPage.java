package cn.entity;

/**
 * @author 工具类 页
 *
 */
public class UtilPage {
	private int pageCount;
	private int commodityCount = 3;
	private int thisPage;
	/**
	 * @return 总页数
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * @param pageCount 总页数
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * @return 每页多少商品
	 */
	public int getCommodityCount() {
		return commodityCount;
	}
	/**
	 * @param commodityCount 每页多少商品
	 */
	public void setCommodityCount(int commodityCount) {
		this.commodityCount = commodityCount;
	}
	/**
	 * @return 本页
	 */
	public int getThisPage() {
		return thisPage;
	}
	/**
	 * @param thisPage 本页
	 */
	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}
	
}
