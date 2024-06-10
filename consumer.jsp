<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ConsumerServlet" method="post">
	<label>Consumer No :</label>
	<input type="number" name="consumerno" required="required">
	<br>
	<br>
	<label>Consumer Name :</label>
	<input type="text" name="consumername" required="required">
	<br>
	<br>
	<label>Previous Month Reading :</label>
	<input type="number" name="pmonthreading" required="required">
	<br>
	<br>
	<label>Current Meter Reading :</label>
	<input type="number" name="cmonthreading" required="required">
	<br>
	<br>
	 <label>type of connection : </label><br>  
	<input type="radio" id="connection" name="connection" value="domestic" required="required"/>Domestic    
	<br>  
	<input type="radio" id=connection name="connection" value="commercial" required="required"/>Commercial <br/> 
	<br>
	<input type="submit" name="submit" value="Go!">
	</form>
</body>
</html>