var xmlHttp;
function createxmlHttpRequest() {
	if (window.ActiveXObject) {
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	} else if (window.XMLHttpRequest)
		xmlHttp = new XMLHttpRequest();
}

function del() {
	event.returnValue = confirm("确定删除该新闻及其所有的评论吗？");
}
function pageSkip(skippage) {
	// <li>编号：<input type="text" id="dispatch_id">
	// <li>收货人：<input type="text" id="recipients_name">
	// <li>发货单明细单位名称：<input type="text" id="dispatchDetailed_unitsname">
	var dispatch = new Object();
	var recipients = new Object();
	var dispatchDetailed = new Object();
	dispatch.id = $.trim($("#dispatch_id").val());
	recipients.name = $.trim($("#recipients_name").val());
	dispatchDetailed.unitsname =  $.trim($("#dispatchDetailed_unitsname").val());
	dispatch.recipients = recipients;
	dispatch.dispatchDetailed = dispatchDetailed;

	$.ajax({
		type : "POST",
		url : "/DispatchManagement/skip/shipDispatch.do",
		data : {
			dispatch : JSON.stringify(dispatch),
			skippage : skippage
		},
		datatype : "html",
		success : function(d) {
			$("body").html(d);
			$("#dispatch_id").val(dispatch.id);
			$("#recipients_name").val(recipients.name);
			$("#dispatchDetailed_unitsname").val(dispatchDetailed.unitsname);
		},
		error : function() {
		},
		timeout : 1000000,
	})
}
//刷新当前页面
function reurl(){ 
    url = location.href; //把当前页面的地址赋给变量 url 
    var times = url.split("?"); //分切变量 url 分隔符号为 "?" 
    if(times[1] != 1){ //如果?后的值不等于1表示没有刷新 
        url += "?1"; //把变量 url 的值加入 ?1 
        self.location.replace(url); //刷新页面 
    } 
}