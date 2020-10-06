  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> 
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Results</title>
<link rel="stylesheet" href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container text-center">
		<div class="card">
  			<div class="card-body">
    			<h3>Submitted Info</h3>
				<p>Name: ${name}</p>
				<p>Dojo Location: ${location}</p>
				<p>Favorite Language: ${lang}</p>
				<p>Comment: ${comment}</p>
			</div>
	  	</div>
	</div>
		


</body>
</html>