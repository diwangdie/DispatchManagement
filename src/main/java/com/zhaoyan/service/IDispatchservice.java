/**  
 *
 * @Title: IDispatchservice.java
 * @Prject: DispatchManagement
 * @Package: com.zhaoyan.service
 * @Description: TODO
 * @author: zhaoyan  
 * @date: 2018年11月20日 上午10:22:42
 * 
 */
package com.zhaoyan.service;

import java.util.List;

import com.zhaoyan.doman.Dispatch;

/**
 * @ClassName: IDispatchservice
 * @Description: TODO
 * @author: zhaoyan
 * @date: 2018年11月20日 上午10:22:42
 */
public interface IDispatchservice {
	// 条件查询发货单
	List<Dispatch> selectDispatch(Dispatch dispatch);

	// 条件查询发货单的总数
	int selectDispatchCount(Dispatch dispatch);
}
