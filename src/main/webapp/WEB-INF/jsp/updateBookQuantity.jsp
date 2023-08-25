<%@ page import="com.adam.bookshop.model.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Book Quantity</title>
</head>
<body>
<h1>Update Book Quantity</h1>

<table border="1">
    <tr>
        <th>Book ID</th>
        <th>Book Name</th>
        <th>Current Quantity</th>
        <th>New Quantity</th>
        <th>Action</th>
    </tr>
    <%
        List<Book> books = (List<Book>) request.getAttribute("books");
        if (books != null) {
            for (Book book : books) {
    %>
    <tr>
        <td><%= book.getId() %></td>
        <td><%= book.getBookName() %></td>
        <td><%= book.getQuantity() %></td>
        <td>
            <form action="/bookshop/updateBookQuantity" method="post">
                <input type="number" name="newQuantity" min="0">
                <input type="hidden" name="bookId" value="<%= book.getId() %>">
                <input type="submit" value="Update">
            </form>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
