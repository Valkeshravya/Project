<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="userheader.jsp" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="uform" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<uform:form class="form-inline" action="login"  method="post" modelAttribute="usr">
 <div class="form-group">
EMAILID<uform:input  path="emailId" class="form-control"/>
</div>
 <div class="form-group">
PASSWORD<uform:input  path="password" class="form-control"/>
</div>
<input type="submit" value="Login"/>
</uform:form>
</body>
</html>