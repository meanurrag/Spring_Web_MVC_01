<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td> Book ID</td>
				<td> Book Name</td>
				<td> Book Price</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">
			<tr>
				<td> ${book.bookID}</td>
				<td> ${book.bookName}</td>
				<td> ${book.bookPrice}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>