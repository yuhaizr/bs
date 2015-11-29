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
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 系统通知管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
				<th>通知编号</th>
					<th>通知主题</th>
					<th>通知摘要</th>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="recordList">
        
        <s:iterator value="recordList">
			<tr class="TableDetail1 template">
			<td>${host}</td>
						<td><s:a action="systemNoticeAction_listInfo?id=%{id}">${id}</s:a></td>
						<td id="comment"><s:a action="systemNoticeAction_listInfo?id=%{id}">
							<i class="fa fa-bell fa-lg"></i>&nbsp;&nbsp;${name}</s:a>
							<input type="hidden" value="${viewyn}" >
						</td>
						<td><s:a action="systemNoticeAction_listInfo?id=%{id}">${summary}</s:a></td>
			</tr>
        </s:iterator>

        </tbody>
    </table>
    
    
</div>
<div>
	<%@ include  file="/WEB-INF/jsp/public/pageView.jspf"%>
	<s:form action="systemNoticeAction_list"></s:form>
</div>
</body>
</html>
