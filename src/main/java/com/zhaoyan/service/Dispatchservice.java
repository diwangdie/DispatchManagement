/**  
 *
 * @Title: Dispatchservice.java
 * @Prject: DispatchManagement
 * @Package: com.zhaoyan.service
 * @Description: TODO
 * @author: zhaoyan  
 * @date: 2018年11月20日 上午10:23:20
 * 
 */
package com.zhaoyan.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhaoyan.dao.DispatchMapper;
import com.zhaoyan.doman.Dispatch;
import com.zhaoyan.doman.DispatchDetailed;

/**
 * @ClassName: Dispatchservice
 * @Description: TODO
 * @author: zhaoyan
 * @date: 2018年11月20日 上午10:23:20
 */
@Service
public class Dispatchservice implements IDispatchservice {
@Resource
private DispatchMapper dispatchMapper;
	/* 
	 * @Title: selectDispatch
	 * @Description: TODO
	 * @param dispatch
	 * @return
	 * @see com.zhaoyan.service.IDispatchservice#selectDispatch(com.zhaoyan.doman.Dispatch)
	 */
	@Override
	public List<Dispatch> selectDispatch(Dispatch dispatch) {
		// TODO Auto-generated method stub
		return dispatchMapper.selectDispatch(dispatch);
	}
	/* 
	 * @Title: selectDispatchCount
	 * @Description: TODO
	 * @param dispatch
	 * @return
	 * @see com.zhaoyan.service.IDispatchservice#selectDispatchCount(com.zhaoyan.doman.Dispatch)
	 */
	@Override
	public int selectDispatchCount(Dispatch dispatch) {
		// TODO Auto-generated method stub
		return dispatchMapper.selectDispatchCount(dispatch);
	}

	

}
