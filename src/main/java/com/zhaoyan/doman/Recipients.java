/**  
 *
 * @Title: Recipients.java
 * @Prject: DispatchManagement
 * @Package: com.zhaoyan.doman
 * @Description: TODO
 * @author: zhaoyan  
 * @date: 2018年11月19日 上午9:32:45
 * 
 */
package com.zhaoyan.doman;

import java.util.Date;

/**收件人类
 * @ClassName: Recipients
 * @Description: TODO
 * @author: zhaoyan
 * @date: 2018年11月19日 上午9:32:45
 */
public class Recipients {
	private String id;//收件人id
	private String name;//收件人名字
	private String phone;//收件人电话
	private String address;//收件人地址
	private String postcode;//收件人邮编
	private Date addtime;//收件人新增时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

}
