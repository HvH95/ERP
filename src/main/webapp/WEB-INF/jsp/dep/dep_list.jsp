<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<title>部门展示页面</title>
</head>

<body>
	<a href="addView.action">添加部门</a>
	<ul>
		<c:forEach items="${tblDepList}" var="t">
			<li>部门名${t.name}<a href="editView.action?uuid=${t.uuid}">修改</a>&nbsp; <a
				href="delete/">删除</a></li>
		</c:forEach>
	</ul>
</body>
</html>
