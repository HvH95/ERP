<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<title>角色展示页面</title>
</head>

<body>
	<a href="addView.action">添加角色</a>
	<a href="list.action">回到角色列表</a>
	<form action="query.action" method="post">
		搜索角色姓名: <input type="text" name="username"> <br /> <input
			type="submit" value="提交">
	</form>
	<ul>
		<c:forEach items="${tblRoleList}" var="r">
			<li>姓名${r.name}<a href="editView.action?uuid=${r.uuid}">修改</a>&nbsp;
				<a href="delete.action?uuid=${r.uuid}">删除</a></li>
		</c:forEach>
	</ul>
</body>
</html>
