<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
	<title>添加新物料</title>
    <%@ include file="/WEB-INF/jsp/public/common.jspf" %>
</head>
<body> 

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 添加新物料
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id="MainArea">

    <s:form action="materialsAction_%{ id == null ? 'add' : 'edit' }">
    	<s:hidden name="id"></s:hidden>
    
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 添加新物料 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr>
                        <td width="100">物料类别</td>
                        <td>
		<s:select cssClass="InputStyle" id="categoryId" name="categoryId" list="#categoryList" required="required"
	      		listKey="id" listValue="name" headerKey="" headerValue="-------------------------------------请选择所属类别----------------------------------">
	    </s:select>
			</td>
                    </tr>
		     
		     <tr>
                        <td width="100">物料名称</td>
                        <td><s:textfield name="name" cssClass="InputStyle" /> *</td>
                    </tr>
		    <tr>
                        <td width="100">规格</td>
                        <td><s:textfield name="specifications" cssClass="InputStyle" /> *</td>
                    </tr>
<tr>
                        <td width="100">最低库存</td>
                        <td><s:textfield name="lowestInventory" cssClass="InputStyle" /> *</td>
                    </tr>
<tr>
                        <td width="100">最高库存</td>
                        <td><s:textfield name="highestInventory" cssClass="InputStyle" /> *</td>
                    </tr>

<tr>
                        <td width="100">安全库存</td>
                        <td><s:textfield name="safeInventory" cssClass="InputStyle" /> *</td>
                    </tr>
		    <tr>
                        <td width="100">无发生额时间</td>
                        <td><s:textfield name="noAmountOfTime" cssClass="InputStyle" /> *</td>
                    </tr>
                    <tr>
                        <td>说明</td>
                        <td><s:textarea name="description" cssClass="TextareaStyle"></s:textarea></td>
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

