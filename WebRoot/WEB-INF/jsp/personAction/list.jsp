<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
<title>个人信息</title>
<%@ include  file="/WEB-INF/jsp/public/common.jspf"%>
<style type="text/css">
#form{
	margin-top:10px;
	margin-right:100px;
}
#top{
	border:solid #CCC 1px;
	border-radius:10px;
}
</style>
</head>

<body class="container">
<div class="page-header">
  <h1>个人信息</h1>
</div>
<div id="top">
  <s:form action="unitAction_%{id==null?'add':'edit'}" role="form" cssClass="form-horizontal" method="post" id="form">
   	<s:hidden name="id"></s:hidden>
    	<s:iterator value="#user">
			<table class="table table-bordered table-hover table-striped">
				<tbody>
					<tr>
						<td>编号</td>
						<td>${ id }</td>
					</tr>

					<tr>
						<td>姓名</td>
						<td>${ name }</td>
					</tr>
					<tr>
						<td>性别</td>
						<td>${ sex }</td>
					</tr>
					<tr>
						<td>出生日期</td>
						<td>${ birthday }</td>
					</tr>
					<tr>
						<td>联系电话</td>
						<td>${ phoneNumber }</td>
					</tr>
					<tr>
						<td>Email</td>
						<td>${ email }</td>
					</tr>
					<tr>
						<td>住址</td>
						<td>${ address }</td>
					</tr>

				</tbody>
			</table>
		</s:iterator>
		      
    </div>
  </s:form>
</div>
<div class="col-md-8"><a href="javascript:history.go(-1);" class="btn btn-primary" role="button">返回</a> </div>
                  	<div class="col-md-8">
			<s:if test="#user.loginName=='admin'">
			</s:if>
			<s:else>
				<s:a action="personAction_editUI?id=%{#user.id}"
					cssClass="btn btn-default btn-sm" role="button">修改个人信息</s:a>
			</s:else>
			</div>
</body>
</html>