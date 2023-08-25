<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Book</title>
  <link rel="stylesheet" type="text/css" href="style.css">
  <style>
    .error {
      color: #ff0000;
    }
    .errorblock {
      color: #ff0000;
      background-color: #ffEEEE;
      border: 3px solid #ff0000;
      padding: 8px;
      margin: 16px;
    }
  </style>
</head>
<body>
<h1>New Book</h1>

<% if(request.getAttribute("error") != null) { %>
<p class="error"><%= request.getAttribute("error") %></p>
<% } %>

<form:form modelAttribute="book">
  <table>
    <tr>
      <td class="label-cell">Book Name:</td>
      <td class="input-cell"><form:input path="bookName" /></td>
    </tr>
    <tr>
      <td>Book Type:</td>
      <td><form:input path="type" /></td>
    </tr>
    <tr>
      <td>Book Length:</td>
      <td><form:input path="length" /></td>
    </tr>
    <tr>
      <td>Book Quantity:</td>
      <td><form:input path="quantity" /></td>
    </tr>
    <tr>
      <td>Book Cover Type:</td>
      <td><form:input path="coverType" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Save">
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>