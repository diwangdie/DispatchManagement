/**  
 *
 * @Title: Dispatch.java
 * @Prject: DispatchManagement
 * @Package: com.zhaoyan.doman
 * @Description: TODO
 * @author: zhaoyan  
 * @date: 2018年11月19日 上午9:31:44
 * 
 */
package com.zhaoyan.doman;

import java.util.Date;
import java.util.List;

/**
 * 发货单
 * 
 * @ClassName: Dispatch
 * @Description: TODO
 * @author: zhaoyan
 * @date: 2018年11月19日 上午9:31:44
 */
public class Dispatch extends Base{
	private String id;// 发货单id
	private Date dispatchDate;// 发货时间
	private double sum;// 发货单金额
	private Date addtime;// 发货单新增时间
	private Recipients recipients;// 收件人
	private List<DispatchDetailed> dispatchDetailedList;// 发货单明细
	private DispatchDetailed dispatchDetailed;// 用于查询时放查询条件

	public DispatchDetailed getDispatchDetailed() {
		return dispatchDetailed;
	}

	public void setDispatchDetailed(DispatchDetailed dispatchDetailed) {
		this.dispatchDetailed = dispatchDetailed;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(Date dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Recipients getRecipients() {
		return recipients;
	}

	public void setRecipients(Recipients recipients) {
		this.recipients = recipients;
	}

	public List<DispatchDetailed> getDispatchDetailedList() {
		return dispatchDetailedList;
	}

	public void setDispatchDetailedList(List<DispatchDetailed> dispatchDetailedList) {
		this.dispatchDetailedList = dispatchDetailedList;
	}

}
