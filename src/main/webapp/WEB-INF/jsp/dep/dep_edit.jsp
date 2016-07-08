<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE>
<html>
<head>
<title>部门修改</title>
</head>

<body>
	<form action="${pageContext.request.contextPath}/dep/edit"
		method="post" id="form_submit"></form>
	<input type="text" name="tblDep.name" form="form_submit"
		value="${tblDep.name }" />
	<input type="text" name="tblDep.tele" form="form_submit"
		value="${tblDep.tele}" />
	<input type="hidden" name="tblDep.uuid" form="form_submit"
		value="${tblDep.uuid}" />
	<input type="submit" form="form_submit" value="修改" />
</body>
</html>
