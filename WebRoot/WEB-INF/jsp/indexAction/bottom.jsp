<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>bottom</title>
<%@ include  file="/WEB-INF/jsp/public/common.jspf"%>
<style>
p{
	text-align: center;
}
a:link,a:active,a:hover,a:visited{
	color: #000000;
	cursor: pointer;
	text-decoration: none;
}
span{
	color:#000;
	cursor: pointer;
}
</style>
</head>

<body>
	<p><span>©2015 毕业设计</span> | <a>关于我们</a> | <a href="${pageContext.request.contextPath}/systemInfo.jsp" target="right">系统说明</a></p>
</body>
</html>
