<%@ taglib tagdir="/WEB-INF/tags" prefix="pr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<pr:layout>
	<c:choose>
		<c:when test="${not empty addedGuard}">
			<table>
				<tr>
					<th>Name</th>
					<th>Age</th>
				</tr>
				<tr>
					<td>${addedGuard.name}</td>
					<td>${addedGuard.age}</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<form method="POST" action="guardForm">
				<label>Name</label>
				<input type="text" name="name"/>
				<label>Age</label>
				<input type="text" name="age"/>
				<input type="submit" value="Submit"/>
			</form>
		</c:otherwise>
	</c:choose>
</pr:layout>