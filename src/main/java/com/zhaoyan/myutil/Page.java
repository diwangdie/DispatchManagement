/**  
 *
 * @Title: Page.java
 * @Prject: LSLocation
 * @Package: com.zhaoyan.common
 * @Description: TODO
 * @author: zhaoyan  
 * @date: 2018年6月26日 下午1:27:49
 * 
 */
package com.zhaoyan.myutil;

import java.util.List;

/**
 * @ClassName: Page
 * @Description: TODO
 * @author: zhaoyan
 * @date: 2018年6月26日 下午1:27:49
 */
public class Page<T> {
	 /**显示页码条目数，即页码数量顶多是10个*/
	private final static int PAGEITEMCOUNT = 10;
	/** 保存查询的结果集合 */
	private List<T> pagelist;
	/** 总记录数 */
	private int totalRecord;
	/** 页面显示的数目 */
	private int pageSize = 5;
	/** 总页码数 */
	private Integer totalPage;
	/** 当前页码 */
	private int currentPage = 1;
	/** 前一页 */
	private int previousPage;
	/** 后一页 */
	private int nextPage;
	/** 条目数 */
	private int[] pageBar;
	/** 开始页 */
	private int startIndex;
	/** 结束页 */
	private int endIndex;

	/*
	 * public int getSelectEndIndex() { //oracle中的结束查询条件，供传入数据库参数使用 return
	 * this.getStartIndex()+this.pageSize - 1; }
	 */

	public int getStartIndex() {
		this.startIndex = (this.currentPage - 1) * this.pageSize;
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() { // 从数据库中获取的结束索引，供页面使用
		int end = this.getStartIndex() + this.getPageSize(); // 不包含最后一条记录-1
		if (end > this.getTotalRecord()) {
			end = this.getStartIndex() + (this.getTotalRecord() % this.getPageSize());
		}
		this.endIndex = end;
		return this.endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public List<T> getPagelist() {
		return pagelist;
	}

	public void setPagelist(List<T> pagelist) {
		this.pagelist = pagelist;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() { // 得到总页码数
		if (this.totalRecord % this.pageSize == 0) {
			this.totalPage = this.totalRecord / this.pageSize;
		} else {
			this.totalPage = this.totalRecord / this.pageSize + 1;
		}

		return totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPreviousPage() {
		if (this.currentPage - 1 < 1) { // 如果上一页小于1，则说明当前页码已经是第一页了
			this.previousPage = 1;
		} else {
			this.previousPage = this.currentPage - 1;
		}
		return previousPage;
	}

	public int getNextPage() {
		if (this.currentPage + 1 >= this.totalPage) { // 如果下一页大于总数页，则说明当前页码已经是最后一页了
			this.nextPage = this.totalPage;
		} else {
			this.nextPage = this.currentPage + 1;
		}
		return nextPage;
	}

	public int[] getPageBar() {
		int startPage; // 记住页码的起始位置
		int endPage; // 记住页码的结束位置，因为页码条目是既定的，由startpage，endpage两个变量通过循环就可以得全部页码
		int pageBar[] = null;
		if (this.getTotalPage() <= PAGEITEMCOUNT) { // 当总页码不足或等于既定页面大小时
			pageBar = new int[this.totalPage];
			startPage = 1;
			endPage = this.totalPage;
		} else { // 当总页码大于既定页面大小时
			pageBar = new int[PAGEITEMCOUNT];
			startPage = this.currentPage - (PAGEITEMCOUNT / 2 - 1); // 为了保证当前页在中间
			endPage = this.currentPage + PAGEITEMCOUNT / 2;

			if (startPage < 1) {
				startPage = 1;
				endPage = PAGEITEMCOUNT;
			}

			if (endPage > this.totalPage) {
				endPage = this.totalPage;
				startPage = this.totalPage - (PAGEITEMCOUNT - 1);
			}
		}

		int index = 0;
		for (int i = startPage; i <= endPage; i++) {
			pageBar[index++] = i;
		}

		this.pageBar = pageBar;
		return this.pageBar;
	}
}
