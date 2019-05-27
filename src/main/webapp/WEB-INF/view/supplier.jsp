<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sform" %>
      <%@ page isELIgnored="false" %>
       <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<sform:form class="form-inline" action="addSup"  method="post" modelAttribute="sup">
 <div class="form-group">
<sform:input  path="supplierName" class="form-control" placeholder="Enter Supplier Name" />
</div>
<div class="form-group">
<sform:input  path="supplierDescription" class="form-control" placeholder="Enter Supplier Description" />
</div>
<div class="form-group">
<sform:input  path="supplierAddress" class="form-control" placeholder="Enter Supplier Address" />
</div>

<sform:input  path="supplierId" type="hidden" />
<input type="submit"  value="${buttonName}" />
</sform:form>
</body>
</html>