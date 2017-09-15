<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Languages</title>
</head>
<body>
	<table class="table" border="1">
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
	<c:forEach items="${languages}" var="language" varStatus="loop">
		<tr>
			<td><a href="/languages/show/${loop.index}"><c:out value="${language.name}"/></a></td>
			<td><c:out value="${language.creator}"/></td>
			<td><c:out value="${language.currentVersion}"/></td>
			<td><a href="/languages/delete/${loop.index}">delete</a>/<a href="/languages/edit/${loop.index}">edit</a></td>
		</tr>
	</c:forEach>
	</table><br>
	<form:form method="POST" action="/languages/new" modelAttribute="language">
		<form:label path="name">Name<br>
		<form:errors path="name"/>
		<form:input path="name"/></form:label><br>
		
		<form:label path="creator">Creator<br>
		<form:errors path="creator"/>
		<form:input path="creator"/></form:label><br>
		
		<form:label path="currentVersion">Version<br>
		<form:errors path="currentVersion"/>
		<form:input type="number" path="currentVersion"/></form:label><br>
		
		<br><input type="submit" value="Submit"/>
	</form:form>
</body>
</html>