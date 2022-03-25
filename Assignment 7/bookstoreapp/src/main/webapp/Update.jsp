<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update an existing BOOK</title>
</head>
<body>
<form action="bookcontroller" method="post">
    <input type="hidden" name="id" value="${Book.id}">
	<table>
		<tr>
			<td>Enter Author's Name</td>
			<td><input type="text" name="Author's Name" value="${Book.Author's Name}" readonly></td>
		</tr>
		<tr>
			<td>Enter Title</td>
			<td><input type="text" name="Title" value="${Book.Title}"></td>
		</tr>
		
		<tr>
			<td>Enter Price</td>
			<td><input type="text" name="Price" value="${Book.Price}"></td>
		</tr>
		<tr>
			<td><input type="submit"></td>
		</tr>
	</table>
</form>
</body>
</html>
