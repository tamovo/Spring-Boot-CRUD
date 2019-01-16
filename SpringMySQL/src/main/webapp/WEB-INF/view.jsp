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


<table>
  <tr>
    <th>ID</th>
   <td>${lists.id}</td> 
  </tr>
  
    <tr>
    <th>Person Name</th>
   <td>${lists.personName}</td> 
  </tr>
    <tr>
    <th>Phone NO</th>
   <td>${lists.phoneNo}</td> 
  </tr>
 
</table>


</body>
</html>
