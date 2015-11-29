<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
    <title>用户列表</title>
    <%@ include file="/WEB-INF/jsp/public/common.jspf" %>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head"> 
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 用户管理
        </div>
        <div id="Title_End">
        </div>
          </div>
</div>
	<div  id="search">
				<s:form action="userAction_search" role="form" method="post">
					
			 		<span><s:select name="condition" id="condition"
						list="#{'loginName':'登录名','name':'姓名','departmentName':'所属部门'}" 
						headerKey="" headerValue="请选择条件"/>
					      </span>
						      <span>  
						      <input type="text" id="content" style="height:12px;" name="content" value="${ content }">
						       </span>
						        <span>
						      	  <button  type="submit">查询</button>
						        </span> 
					      
					
				</s:form>
    	</div>
  

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align=center valign=middle id=TableTitle>
                <td width="100">登录名</td>
                <td width="100">姓名</td>
                <td width="100">所属部门</td>
                <td width="200">岗位</td>
                <td>备注</td>
                <td>相关操作</td>
            </tr>
        </thead>
        
        <!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="userList">
        
        <s:iterator value="recordList">
            <tr class="TableDetail1 template">
                <td>${loginName}&nbsp;</td>
                <td>${name}&nbsp;</td>
                <td>${department.name}&nbsp;</td>
                <td>
                	<s:iterator value="roles">
                		${name}
                	</s:iterator>
                </td>
                <td>${description}&nbsp;</td>
                <td>
                	<s:a action="userAction_delete?id=%{id}" onclick="return delConfirm()">删除</s:a>
                    <s:a action="userAction_editUI?id=%{id}">修改</s:a>
					<s:a action="userAction_initPassword?id=%{id}" onclick="return window.confirm('您确定要初始化密码为1234吗？')">初始化密码</s:a>
                </td>
            </tr>
        </s:iterator> 
            
        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <s:a action="userAction_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
</div>
<div>
<%@ include file="/WEB-INF/jsp/public/pageView.jspf"%>
	<s:form action="userAction_list"></s:form>
	</div>
</body>
</html>