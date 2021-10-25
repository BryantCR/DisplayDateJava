<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Display Date</title>
	</head>
	<body>
		<a class="timelinks" onclick="dateAlertFunction()" href="/date">
			Date Template
		</a>
		<a class="timelinks" onclick="timeAlertFunction()" href="/time">
			Time Template
		</a>
		<script src="./js/Alert.js"></script>
	</body>
</html>
