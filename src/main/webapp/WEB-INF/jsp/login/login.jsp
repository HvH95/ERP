<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE>
<html>
<head>

</head>

<body>
	<a href="loginsubmit.action">a</a>
	<form action="loginsubmit.action" method="post" id="login_form">
		
	</form>
	<input type="text" name="username" form="login_form" />
	<input type="password" name="pwd" form="login_form" />
	<input type="submit" value="提交" form="login_form" >
	<c:if test="error!=null">
		${error}
	</c:if>
</body>
</html>
