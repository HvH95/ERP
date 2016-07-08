<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<title>部门添加</title>
</head>

<body>
	<form action="add.action" method="post" id="form_submit"></form>

	<input type="text" name="tblEmp.username" form="form_submit" /> 用户名
	<br />
	<input type="password" name="tblEmp.pwd" form="form_submit" /> 密码
	<br />
	<input type="text" name="tblEmp.name" form="form_submit" /> 姓名
	<br />
	<input type="text" name="tblEmp.email" form="form_submit" /> 邮件
	<br />
	<input type="text" name="tblEmp.tele" form="form_submit" /> tele
	<br />
	<input type="text" name="tblEmp.address" form="form_submit" /> 地址
	<br />
	<input type="radio" name="tblEmp.gender" value="0" form="form_submit">女
	<input type="radio" name="tblEmp.gender" value="1" form="form_submit">男
	性别
	<br />
	<select name="tblEmp.depuuid" form="form_submit">
		<c:forEach var="d" items="${depList}">
			<option  value="${d.uuid}">${d.name}</option>
		</c:forEach>
	</select>
	<c:forEach var="r" items="${roleList}">
		<input type="checkbox" name="roleUuids" value="${r.uuid}"
			form="form_submit" />${r.name} &nbsp;
	</c:forEach>
	<input type="submit" form="form_submit" value="添加" />
</body>
</html>
