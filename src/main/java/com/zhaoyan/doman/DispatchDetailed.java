/**  
 *
 * @Title: DispatchDetailed.java
 * @Prject: DispatchManagement
 * @Package: com.zhaoyan.doman
 * @Description: TODO
 * @author: zhaoyan  
 * @date: 2018年11月19日 上午9:35:30
 * 
 */
package com.zhaoyan.doman;

/**发货单明细
 * @ClassName: DispatchDetailed
 * @Description: TODO
 * @author: zhaoyan
 * @date: 2018年11月19日 上午9:35:30
 */
public class DispatchDetailed extends Base{
	private String id;// 发货单明细id
	private String dispatchid;// 发货单id
	private String unitsname;// 发货单明细单位名称
	private String productname;// 产品名称
	private String unit;// 单位
	private String price;// 单价
	private String discount;// 折扣
	private String discountamount;// 折后金额

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDispatchid() {
		return dispatchid;
	}

	public void setDispatchid(String dispatchid) {
		this.dispatchid = dispatchid;
	}

	public String getUnitsname() {
		return unitsname;
	}

	public void setUnitsname(String unitsname) {
		this.unitsname = unitsname;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDiscountamount() {
		return discountamount;
	}

	public void setDiscountamount(String discountamount) {
		this.discountamount = discountamount;
	}

}
