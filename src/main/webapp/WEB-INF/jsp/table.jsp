<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/statics/basics.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/statics/index/css/css.css" />
<title>Insert title here</title>
</head>
<body>
	<div>订单查询</div>
	<div>
		<ul>
			<li>编号：<input type="text" id="dispatch_id">
			<li>收货人：<input type="text" id="recipients_name">
			<li>发货单明细单位名称：<input type="text" id="dispatchDetailed_unitsname">
			<li><input type="button" value="查询" onclick="pageSkip(1)">
		</ul>
	</div>
	<div>
		<table>
			<thead>
				<tr>
					<th>dispatch_id</th>
					<th>dispatch_sum</th>
					<th>dispatch_addtime</th>
					<th>dispatch_dispatchDate</th>
					<th>recipients_id</th>
					<th>recipients_name</th>
					<th>recipients_address</th>
					<th>recipients_addtime</th>
					<th>recipients_phone</th>
					<th>dispatchDetailed_id</th>
					<th>dispatchDetailed_discount</th>
					<th>dispatchDetailed_discountamount</th>
					<th>dispatch_id</th>
					<th>dispatchDetailed_price</th>
					<th>dispatchDetailed_productname</th>
					<th>dispatchDetailed_unit</th>
					<th>dispatchDetailed_unitsname</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${page.pagelist}" var="dispatch">
					<c:forEach items="${dispatch.dispatchDetailedList}"
						var="dispatchDetailed">
						<tr>
							<td>${dispatch.id}</td>
							<td>${dispatch.sum}</td>
							<td>${dispatch.addtime}</td>
							<td>${dispatch.dispatchDate}</td>
							<td>${dispatch.recipients.id}</td>
							<td>${dispatch.recipients.name}</td>
							<td>${dispatch.recipients.address}</td>
							<td>${dispatch.recipients.addtime}</td>
							<td>${dispatch.recipients.phone}</td>
							<td>${dispatch.recipients.id}</td>
							<td>${dispatch.dispatchDetailed.discount}</td>
							<td>${dispatch.dispatchDetailed.discountamount}</td>
							<td>${dispatch.id}</td>
							<td>${dispatch.dispatchDetailed.price}</td>
							<td>${dispatch.dispatchDetailed.productname}</td>
							<td>${dispatch.dispatchDetailed.unit}</td>
							<td>${dispatch.dispatchDetailed.unitsname}</td>
						</tr>
					</c:forEach>
				</c:forEach>
			</tbody>
			<tfoot>
			</tfoot>
		</table>
		<ul id="dh">
			<!-- 上一页 -->
			<c:if test="${page.currentPage>1}">
				<li><a onclick="pageSkip(1)">首页</a></li>
				<li><a onclick="pageSkip(${page.currentPage-1})">上一页</a></li>
			</c:if>
			<c:if test="${page.currentPage<=1}">
				<li><a href="javascript:void();" title="首页">首页</a></li>
				<li><a>上一页</a></li>
			</c:if>

			<!-- 页码 -->
			<c:forEach items="${page.pageBar}" var="i">
				<c:if test="${page.currentPage==i}">
					<li><a href="#">${i}</a></li>
				</c:if>
				<c:if test="${page.currentPage!=i}">
					<li><a onclick="pageSkip(${i})">${i}</a></li>
				</c:if>
			</c:forEach>

			<!-- 下一页和尾页-->
			<c:if test="${(page.currentPage)<page.totalPage}">
				<li><a onclick="pageSkip(${page.currentPage+1})">下一页</a></li>
				<li><a onclick="pageSkip(${page.totalPage})">尾页</a></li>
			</c:if>
			<c:if test="${page.currentPage==page.totalPage}">
				<li><a>下一页</a></li>
				<li><a>尾页</a></li>
			</c:if>

			<li><a href="#">共${page.totalPage}页</a></li>
		</ul>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/index/js/js.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/statics/js/jquery-1.12.4.min.js"></script>
</body>
</html>