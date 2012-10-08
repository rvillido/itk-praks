<jsp:useBean id="guard" class="ee.itcollege.i377.praktikum2.Guard" scope="session" />
<html>
<head>
	<title>Guard</title>
</head>
<body>
	<form action="teine.jsp" method="post">
		First name: <input type="text" value="${guard.firstName}" name="firstName"/><br/>
		Surname: <input type="text" value="${guard.surname}" name="surname"/><br/>
		Age: <input type="text" value="${guard.age}" name="age"/><br/>
		<input type="submit" value="Submit">
	</form>
	<a href="tabel.jsp">Tabel</a>
</body>
</html>