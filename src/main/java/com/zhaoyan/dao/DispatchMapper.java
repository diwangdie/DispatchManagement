/**  
 *
 * @Title: DispatchMapper.java
 * @Prject: DispatchManagement
 * @Package: com.zhaoyan.dao
 * @Description: TODO
 * @author: zhaoyan  
 * @date: 2018年11月19日 上午9:43:54
 * 
 */
package com.zhaoyan.dao;

import java.util.List;

import com.zhaoyan.doman.Dispatch;

/**
 * 发货单dao层mapper接口
 * 
 * @ClassName: DispatchMapper
 * @Description: TODO
 * @author: zhaoyan
 * @date: 2018年11月19日 上午9:43:54
 */
public interface DispatchMapper {
	// 分页条件查询发货单
	List<Dispatch> selectDispatch(Dispatch dispatch);
	// 条件查询发货单的总数
	int selectDispatchCount(Dispatch dispatch);
}
