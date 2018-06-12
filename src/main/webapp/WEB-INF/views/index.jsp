<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/foundation.css">
<link rel="stylesheet" href="/resources/css/app.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
	<div class="primary callout">
		<h1>Foreign Exchange Rates</h1>
	</div>


	<div class="grid-x grid-padding-x ">
		<div class="large-6 medium-6 cell callout_new">
			<form action="message" method="get" onsubmit="return validate()">
				<div>Country</div>
				<select id="country" name="country">
					<option value="">--- Select Option ----</option>
					<option value="INR">Indian Rupee(INR)</option>
					<option value="GBP">Britain Pound(GBP)</option>
					<option value="USD">United States(USD)</option>
					<option value="AED">Australian(AED)</option>
				</select>
				<div>
					<input type="submit" value="Submit">
				</div>
			</form>
			
		</div>
	</div>
	<c:if test="${form.submitted}">
	<div class="grid-x grid-padding-x callout_new1">
		<h3>Currency : ${country}</h3>


		<table>
			<thead>
			<tr style="boder:1px solid">
			<td>Currency</td>
			<td>Rates</td>
			</tr>
			</thead>
			<c:forEach items="${rates}" var="entry">
				<tr class="table_border">
					<td class="table_border">${entry.key}</td>
					<td class="table_border">${entry.value}</td>
				</tr>
			</c:forEach>

		</table>
	</div>
</c:if>

</body>
</html>