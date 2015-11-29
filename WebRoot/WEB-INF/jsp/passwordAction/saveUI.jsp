<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
	<title>密码修改</title>
    <%@ include file="/WEB-INF/jsp/public/common.jspf" %>
</head>
<body> 

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 密码修改
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id="MainArea">

    <s:form action="passwordAction_edit">
    	<s:hidden name="id"></s:hidden>
    
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 岗位信息 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr>
                        <td width="100">请输入旧密码</td>
                   
		        <td><s:textfield name="oldpassword" cssClass="InputStyle" /> *</td>
                    <s:fielderror fieldName="oldpassword" cssStyle="color:red"></s:fielderror>
		    </tr>
                    <tr>
                        <td width="100">请输入新密码</td>
                        <td><s:textfield name="newpassword" cssClass="InputStyle" /> *</td>
                    <s:fielderror fieldName="oldpassword" cssStyle="color:red"></s:fielderror>

		    </tr>
		    <tr>
                        <td width="100">请再次输入新密码</td>
                        <td><s:textfield name="confirmpassword" cssClass="InputStyle" /> *</td>
                    </tr>
                </table>
            </div>
        </div>
        
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/style/images/save.png"/>
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath}/style/images/goBack.png"/></a>
        </div>
    </s:form>
</div>

</body>
</html>

