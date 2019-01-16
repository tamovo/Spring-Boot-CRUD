<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<title> Contact List </title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>


<form method="post" action="/save">
  Id:<br>
  <input type="text" name="id" value="${lists.id}"/>
  <br>
   Person Name:<br>
  <input type="text" name="personname" value="${lists.personName}"/>
  <br>
  Phone No: <br>
  <input type="text" name="phoneno" value="${lists.phoneNo}"/>
  <input type="submit" value="Submit"/>
</form> 

</body>
</html>
