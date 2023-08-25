<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
  <title>Book Details</title>
</head>
<body>
<h1>Book Details</h1>

<p>Book Name: ${book.bookName}</p>
<p>Cover: ${book.imageUrl}</p>
<p>Type: ${book.type}</p>
<!-- And so on for the other fields of the book -->

</body>
</html>
