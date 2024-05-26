<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<form action="./first" method="post">
		email: <input type="text" name="email" /> first name: <input
			type="text" name="firstName" /> last name: <input type="text"
			name="lastName" /> <input type="submit" value="save" />
	</form>

	<c:forEach items="${userList}" var="country">
		<p>${country}</p>
	</c:forEach>
</body>
</html>
