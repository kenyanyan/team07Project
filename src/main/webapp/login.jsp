<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%

	boolean is_check = (boolean) request.getAttribute("is_check");

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
        <title>Sign in</title>
        <link rel="stylesheet" href="login.css">
</head>
<body>
	<%
	if (!is_check) {
	%>
	<div>メールアドレスまたはパスワードが正しくありません</div>
	<%
	}
	%>
	<form action="/team07Project/Login" method="post">
		<input type="hidden" name="post" value="post">
		<hr>
		<div align="flex-tart">
			<table border="0">
				<tr>
					<th>メールアドレス</th>
					<td><input type="text" name="id" value="" size="24"></td>
				</tr>
				<tr>
					<th>パスワード</th>
					<td><input type="password" name="pw" value="" size="24">
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Sign in">
					</td>
				</tr>
			</table>
		</div>
	</form>
	<form action="/team07Project/MenberRegist">
		<input type="submit" value="Sign up">
	</form>
</body>
</html>