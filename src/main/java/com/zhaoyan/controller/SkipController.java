package com.zhaoyan.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.zhaoyan.doman.Dispatch;
import com.zhaoyan.doman.DispatchDetailed;
import com.zhaoyan.doman.Recipients;
import com.zhaoyan.myutil.Page;
import com.zhaoyan.service.IDispatchservice;

@Controller
@RequestMapping("/skip")
public class SkipController {
	private Logger log = Logger.getLogger(SkipController.class);// log日志
	@Resource
	private IDispatchservice iDispatchservice;// 菜单接口
/*	@Resource
	private RedisAPI redisAPI;// Redis
*/
	/**
	 * 初次打开页面
	 * @Title: customerInfo
	 * @param session
	 * @param model
	 * @return String
	 */
	@RequestMapping("/inquire")
	public String customerInfo(HttpSession session, Model model) {
		
			// 初始化page
			Page<Dispatch> page = new Page<Dispatch>();
			//当前页是1
			page.setCurrentPage(1);
			//实例化查询条件
			Dispatch dispatch=new Dispatch();
			//设置总条数
			page.setTotalRecord(iDispatchservice.selectDispatchCount(dispatch));
			//初始化查询条件（首页默认条件是空，只需要设置其实行和页数就可以了）
			dispatch.setStarLine((page.getCurrentPage()-1)*page.getPageSize());//起始行
			dispatch.setRowCount(page.getPageSize());//起行数
			// 获取分页数据
			List<Dispatch> list =iDispatchservice.selectDispatch(dispatch) ;
			page.setPagelist(list);// 将list放入到page中
			model.addAttribute("page", page);
		return "index";

	}
	/*
	 * 
	 */
	@RequestMapping("/shipDispatch")
	public String shipDispatch(HttpServletRequest request,HttpServletResponse response, Model model,String dispatch,String skippage) {
		
		// 初始化page
		Page<Dispatch> page = new Page<Dispatch>();
		//当前页是1
		page.setCurrentPage(Integer.parseInt(skippage));
		//实例化查询条件
		Dispatch dispatch1=new Dispatch();
		dispatch1=JSON.parseObject(dispatch, Dispatch.class);
		//设置总条数
		page.setTotalRecord(iDispatchservice.selectDispatchCount(dispatch1));
		//初始化查询条件（首页默认条件是空，只需要设置其实行和页数就可以了）
		dispatch1.setStarLine((page.getCurrentPage()-1)*page.getPageSize());//起始行
		dispatch1.setRowCount(page.getPageSize());//起行数
		// 获取分页数据
		List<Dispatch> list =iDispatchservice.selectDispatch(dispatch1) ;
		page.setPagelist(list);// 将list放入到page中
		model.addAttribute("page", page);
		return "index";
	}
}