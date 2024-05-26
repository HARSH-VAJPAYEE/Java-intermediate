<%@ page isELIgnored="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
	dfaslkfjladksfgkladj
	<c:forEach items="${userListself}" var="country">
		<p>${country.email}</p>
		<c:out value="${country.email}"/>
	</c:forEach>
</body>
</html>