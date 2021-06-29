<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
boolean is_check = (boolean) request.getAttribute("is_check");
String regist = "a";
regist = request.getParameter("regist");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<title>Sign in</title>
<link rel="stylesheet" href="login.css">
<%
if (regist != null) {
%>
<script>
	alert('会員登録が完了しました！再度、ログインしてください');
</script>
<%
}
%>
</head>
<body>
	<div class="login-page">
		<div class="form">
			<%
			if (!is_check) {
			%>
			<div style="color: red; font-size: 80%">メールアドレスまたはパスワードが正しくありません</div>
			<%
			}
			%>
			<form class="register-form" action="/team07Project/Login"
				method="post">
				<input type="text" placeholder="MailAddress" name="id"> <input
					type="password" placeholder="password" name="pw">
				<button>Sign IN</button>
				<p>
			</form>

			<form action="/team07Project/MenberRegist">
				<button>Sign UP</button>
			</form>
		</div>
<<<<<<< HEAD
	</div>
=======
		</div>
>>>>>>> 806d0c4 (ユーザー登録画面のCSS反映)
</body>
</html>