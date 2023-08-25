<%@ taglib prefix="core" uri="http://www.springframework.org/tags" %>
<%@ page import="com.adam.bookshop.model.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>List of Books</title>
<%--  <link href="${pageContext.request.contextPath}/resources/static/style.css" rel="stylesheet">--%>
  <link rel="stylesheet" type="text/css" href="style.css">


<%--  <link href="<core:url value="/static/style.css" />" rel="stylesheet" type="text/css">--%>

</head>
<body>
<h1>List of Books</h1>

<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Type</th>
    <th>Length</th>
    <th>Quantity</th>
    <th>Cover Type</th>
    <th>Image URL</th>
    <th>Date Added</th>
    <th>Last Update</th>
  </tr>
  <%
    List<Book> books = (List<Book>) request.getAttribute("books");
    if (books != null) {
      for (Book book : books) {
  %>
  <tr>
    <td><%= book.getId() %></td>
    <td><%= book.getBookName() %></td>
    <td><%= book.getType() %></td>
    <td><%= book.getLength() %></td>
    <td><%= book.getQuantity() %></td>
    <td><%= book.getCoverType() %></td>
    <td><img src="<%= book.getImageUrl() %>" alt="<%= book.getBookName() %>" width="50" height="50" /></td>
    <td><%= book.getDateAdded() %></td>
  </tr>
  <%
      }
    }
  %>
</table>

</body>
</html>
