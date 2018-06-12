<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot</title>
<link rel="stylesheet" href="/resources/css/foundation.css">
<link rel="stylesheet" href="/resources/css/app.css">
</head>
<body>
	<div class="strong">
		<h1>Foreign Exchange rates</h1>
	</div>
	<hr>

	<div>
		<h2>Country : ${country}</h2>
	</div>
	<div>
		<table>
			<c:forEach items="${rates}" var="entry">
				<tr>
					<td>${entry.key}</td>
					<td>${entry.value}</td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>