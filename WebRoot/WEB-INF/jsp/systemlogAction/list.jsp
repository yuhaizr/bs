<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
    <title>岗位管理</title>
   <%@ include file="/WEB-INF/jsp/public/common.jspf" %>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 系统日志
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
			<th>主机名</th>
					<th>IP地址</th>
					<th>操作名称</th>
					<th>操作时间</th>
					<th>用户</th>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="recordList">
        
        <s:iterator value="recordList">
			<tr class="TableDetail1 template">
			<td>${host}</td>
						<td>${ipAddr}</td>
						<td>${path}</td>
						<td>${date}</td>
						<td>${user.name}</td>
			</tr>
        </s:iterator>

        </tbody>
    </table>
    
    
</div>
<div>
	<%@ include  file="/WEB-INF/jsp/public/pageView.jspf"%>
	<s:form action="systemlogAction_list"></s:form>
</div>
</body>
</html>
