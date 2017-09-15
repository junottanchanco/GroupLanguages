<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><c:out value="${language.name}"/></title>
</head>
<body>
	<a href="/languages/delete/${id}"><button>Delete</button></a>
	<a href="/"><button>Dashboard</button></a>
	<br><form:form method="POST" action="/languages/edit/${id}" modelAttribute="language">
		<form:label path="name">Name<br>
		<form:errors path="name"/>
		<form:input path="name"/></form:label><br>
		
		<form:label path="creator">Creator<br>
		<form:errors path="creator"/>
		<form:input path="creator"/></form:label><br>
		
		<form:label path="currentVersion">Version<br>
		<form:errors path="currentVersion"/>
		<form:input type="number" path="currentVersion"/></form:label><br>
		
		<br><input type="submit" value="Update"/>
	</form:form>
</body>
</html>