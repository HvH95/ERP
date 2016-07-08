<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE>
<html>
<head>
<title>部门修改</title>
</head>

<body>
	<form action="${pageContext.request.contextPath}/emp/edit.action"
		method="post" id="form_submit"></form>
		<input type="text" name="username" value="${tblEmp.username}" form="form_submit" />
	<input type="password" name="pwd" value="${tblEmp.username}" form="form_submit" />
	<input type="text" name="name" value="${tblEmp.username}" form="form_submit" />
	<input type="text" name="email" value="${tblEmp.username}" form="form_submit" />
	<input type="text" name="tele" value="${tblEmp.username}" form="form_submit" />
	<input type="text" name="address" value="${tblEmp.username}"  form="form_submit" />
	<c:if test="${tblEmp.gender==0}">
		<input type="radio" name="gender"  checked="checked" value="0">女
	</c:if>
	<c:if test="${tblEmp.gender==1}">
		<input type="radio" name="gender" checked="checked" value="1">男
	</c:if>
	<input type="hidden" name="uuid" value="${tblEmp.uuid}"  form="form_submit" />
	<br/>
	<c:forEach var="r" items="${list}">
		<input type="checkbox" name="name" value="${r.uuid}"/>${r.name} &nbsp;
	</c:forEach>
	<input type="submit" form="form_submit" value="修改" />
</body>
</html>
