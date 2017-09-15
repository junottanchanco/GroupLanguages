<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><c:out value="${language.name}"/></title>
</head>
<body>
	<a href="/languages/delete/${id}"><button>Delete</button></a>
	<a href="/languages/edit/${id}"><button>Edit</button></a>
	<a href="/"><button>Dashboard</button></a><br>
	
	<br><h1><u><c:out value="${language.name}"/></u></h1><br>
	<h2>Creator: <c:out value="${language.creator}"/></h2><br>
	<h2>Veresion: <c:out value="${language.currentVersion}"/></h2>
</body>
</html>