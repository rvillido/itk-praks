<jsp:useBean id="guard" class="ee.itcollege.i377.praktikum2.Guard" scope="session" />
<html>
<head>
	<title>Tabel</title>
</head>
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Surname</th>
			<th>Age</th>
		</tr>
		<tr>
			<td>${guard.firstName}</td>
			<td>${guard.surname}</td>
			<td>${guard.age}</td>
		</tr>
	</table>
</body>
</html>