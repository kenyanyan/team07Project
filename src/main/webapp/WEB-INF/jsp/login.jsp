<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8">
		<title>Sign in</title>
	</head>
	<body>
		<hr>
		<div align="flex-start">
			<table border="0">
				<form action="list.html" method="get">
					<tr>
						<th>
							メールアドレス
						</th>
						<td>
							<input type="text" name="mailaddress" value="" size="24">
						</td>
					</tr>
					<tr>
						<th>
							パスワード
						</th>
						<td>
							<input type="password" name="password" value="" size="24">
						</td>
						<img src="otin.png" alt="ロゴのスクショ">
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="Sign in">
							<input type="submit" value="Sign up">
						</td>
					</tr>
				</form>
			</table>
		</div>
	</body>
</html>