<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<title>部门展示页面</title>
</head>

<body>
	<a href="addView.action">添加员工</a>
	<a href="list.action">回到员工列表</a>
	<form action="query.action" method="post" id="form_emp"></form>
	搜索员工姓名:<input type="text" name="username" form="form_emp"><br/>
	<input type="submit" value="提交" form="form_emp">
	<ul>
		<c:forEach items="${tblEmpList}" var="t">
			<li>姓名${t.username}<a href="editView.action?uuid=${t.uuid}">修改</a>&nbsp; <a
				href="delete.action?uuid=${t.uuid}">删除</a></li>
		</c:forEach>
	</ul>
</body>
</html>
