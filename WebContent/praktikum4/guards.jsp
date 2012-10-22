<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dao" class="ee.itcollege.i377.praktikum4.dao.GuardDaoImpl" />
<jsp:useBean id="guard" class="ee.itcollege.i377.praktikum4.entities.Guard" scope="session"/>

<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Age</th>
	</tr>
	<c:forEach var="guard" items="${dao.guards}">
		<tr>
			<td>${guard.id}</td>
			<td>${guard.name}</td>
			<td>${guard.age}</td>
		</tr>
	</c:forEach>
</table>
<br/>
<form method="post" action="/jpaTestServlet">
	<input type="text" name="name"/><br/>
	<input type="text" name="age"/><br/>
	<input type="submit" value="Submit"/>
</form>