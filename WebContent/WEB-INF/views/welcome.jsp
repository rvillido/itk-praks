<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pr" %>

<pr:layout>
	
	<h3><spring:message code="welcome.username"/>: ${username}</h3>	
 
</pr:layout>