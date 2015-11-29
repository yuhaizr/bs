<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
    <title>物料类别管理</title>
   <%@ include file="/WEB-INF/jsp/public/common.jspf" %>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 物料类别管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
				
					<th>类别编号</th>
					<th>类别名称</th>
					<th>说明</th>
					<th>相关操作</th>
			       </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="recordList">
        
        <s:iterator value="recordList">
			<tr class="TableDetail1 template">
		<td>${ id }</td>
						<td>${ name }</td>
						<td>${ description }</td>
						<td>
						<s:a id="a" action="categoryAction_delete?id=%{id}" onClick="return confirm('确定要删除?')"  title="删除"><i class="fa fa-trash-o fa-lg"></i></s:a>
						<s:a id="a" action="categoryAction_editUI?id=%{id}" title="修改"><i class="fa fa-edit fa-lg"></i></s:a></td>

	</tr>
        </s:iterator>

        </tbody>
    </table>
    <!-- 其他功能超链接 -->
    <div id="TableTail">
		<div id="TableTail_inside">
			<s:a action="categoryAction_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
    
</div>
<div>
<%@ include  file="/WEB-INF/jsp/public/pageView.jspf"%>
<s:form action="categoryAction_list"></s:form>
</div>
</body>
</html>
