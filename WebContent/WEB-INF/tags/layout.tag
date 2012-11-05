<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<title><spring:message code="layout.title"/></title>
</head>
<!-- Selle faili abil saab kirjeldada rakenduse üldise layouti -->
<body>
	<jsp:doBody />
	
	<br/>
	<div>
		<a href="${pageContext.request.contextPath}/j_spring_security_logout">
			<spring:message code="layout.logout"/>
		</a>
	</div>
	
</body>