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

<h2>HTML Table</h2>

<table>
  <tr>
    <th>ID</th>
    <th>PersonName</th>
    <th>PhoneNo</th>
    <th>Action </th>
  </tr>
  <!-- th defines the header cell of the table, td is the rest -->
  <c:forEach var="list" items="${lists}">
    <tr>
    <td>${list.id} </td>
    <td>${list.personName}</td>
    <td>${list.phoneNo}</td>
    <td>
    
    <a href="/view/${list.id}">View</a>
    <a href="/delete/${list.id}">Delete</a>
    <a href="/edit/${list.id}">Edit</a>
    </td>
  </tr>
  </c:forEach>
</table>

<form method="post" action="/save">
  Phone No:<br>
  <input type="number" name="phoneno"/>
  <br>
   Person Name:<br>
  <input type="text" name="personname"/>
  <br><br>
  <input type="submit" value="Submit"/>
</form> 

</body>
</html>
