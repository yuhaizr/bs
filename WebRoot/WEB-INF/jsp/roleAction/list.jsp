<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <%@ include file="/WEB-INF/jsp/public/common.jspf" %>
<head>
    <title>岗位管理</title>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 岗位管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
				<!--<td width="200px">岗位编号</td>
            	--><td width="200px">岗位名称</td>
                <td width="300px">岗位说明</td>
                <td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer">
        
        <s:iterator value="recordList">
			<tr class="TableDetail1 template">
				<td>${name}&nbsp;</td>
				<td>${description}&nbsp;</td>
				<td>
					<s:a action="roleAction_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
					<s:a action="roleAction_editUI?id=%{id}">修改</s:a>
					<s:a action="roleAction_setPrivilegeUI?id=%{id}">设置权限</s:a>
				</td>
			</tr>
        </s:iterator>

        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
		<div id="TableTail_inside">
			<s:a action="roleAction_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
</div>
<div>
<%@ include file="/WEB-INF/jsp/public/pageView.jspf"%>
	<s:form action="roleAction_list"></s:form>
	</div>
</body>
</html>
