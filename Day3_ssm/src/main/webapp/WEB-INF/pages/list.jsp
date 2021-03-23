<%--
  Created by IntelliJ IDEA.
  User: Hasee
  Date: 2021/3/23
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>查询所有账户信息</h3>
<c:forEach items="${all}" var="account">
    ${account.name}<br/>
</c:forEach>

</body>
</html>