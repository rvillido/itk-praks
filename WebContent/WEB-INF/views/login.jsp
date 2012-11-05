<%@ taglib tagdir="/WEB-INF/tags" prefix="pr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<pr:layout>
	<h3><spring:message code="login.title"/></h3>
 
	<c:if test="${not empty error}">
		<div>
			<spring:message code="login.error" 
				arguments='${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}'/>
		</div>
	</c:if>
 
	<form name='f' action="j_spring_security_check" method='POST'>
 
		<table>
			<tr>
				<td><spring:message code="login.user"/>:</td>
				<td><input type='text' name='j_username' value=''>
				</td>
			</tr>
			<tr>
				<td><spring:message code="login.password"/>:</td>
				<td><input type='password' name='j_password' />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit" value='<spring:message code="login.submit"/>' />
				</td>
			</tr>
		</table>
 
	</form>
</pr:layout>