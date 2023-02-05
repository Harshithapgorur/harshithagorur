<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xworkz</title>
</head>
<body>
<form action="jspfile" method="post">
firstName<input type="text" name="first">
lastName<input type="text" name="last">
gender<input type="radio" name="gender" value="male">male
<input type="radio" name="gender" value="female">female
<input type="radio" name="gender" value="other">other
reason<input type="textarea" name="reason">
address<input type="textarea" name="address">
<input type="submit" value="send">
</form>

</body>
</html>