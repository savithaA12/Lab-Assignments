<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New BOOK reg page</title>
</head>
<body>
<form action="bookcontroller" method="post">
	<input type="hidden" name="id" value="0">
	<table>
		<tr>
			<td>Enter Author's Name</td>
			<td><input type="text" name="Author's Name"></td>
		</tr>
		<tr>
			<td>Enter Title</td>
			<td><input type="text" name="Title"></td>
		</tr>
		
		<tr>
			<td>Enter Price</td>
			<td><input type="text" name="Price"></td>
		</tr>
		<tr>
			<td><input type="submit"></td>
		</tr>
	</table>
</form>
</body>
</html>
