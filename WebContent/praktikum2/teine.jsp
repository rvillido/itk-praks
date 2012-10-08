<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="guard" class="ee.itcollege.i377.praktikum2.Guard" scope="session"/>
<jsp:setProperty name="guard" property="*"/>

<jsp:getProperty name="guard" property="firstName" /> ${guard.firstName} <br/>
<jsp:getProperty name="guard" property="surname" /> <br/>
<a href="esimene.jsp">Back</a>

<c:redirect url="esimene.jsp"/>
