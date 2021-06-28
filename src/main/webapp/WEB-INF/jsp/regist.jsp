<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//リクエストスコープ 
int is_mail = (int) request.getAttribute("is_mail");
boolean is_pass = (boolean) request.getAttribute("is_pass");
boolean is_pass2 = (boolean) request.getAttribute("is_pass2");
boolean is_name = (boolean) request.getAttribute("is_name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>会員登録</title>
<style type="text/css">
.error {
	color: red;
	font-size: 70%;
}
</style>
</head>
<body>
	<header class="page-header">
		<h1>
			<a href="index.html"><img class="logo" src="images/logo.png"
				alt="しゅみったー"></a>
		</h1>
		<nav>
			<ul class="main-nav">


			</ul>
		</nav>
	</header>
	<div style="width: 30%; margin: 0 auto;">
		<div>
			<form name="myForm" method="post"
				action="/team07Project/MenberRegist">
				<h2 style="text-align: left">
					<label>ID:</label><input type="email" name="mail"
						placeholder="xxx@●●●.com">
					<%
					if (is_mail == 1) {
					%>
					<div class="error">メールアドレスが入力されていません</div>
					<%
					} else if (is_mail == 2) {
					%>
					<div>入力された内容がメールアドレスの書式ではありません</div>
					<%
					}
					%>
				</h2>

				<h2 style="text-align: left">
					<label>パスワード:</label><input type="password" name="pass" id="pass">
					<%
					if (!is_pass) {
					%>
					<div class="error">パスワードを8文字以上で入力してください</div>
					<%
					}
					%>
				</h2>
				<h2 style="text-align: left">
					<label>パスワード(確認):</label><input type="password" name="pass2"
						id="pass2">
					<%
					if (!is_pass2) {
					%>
					<div class="error">入力されたパスワードが一致しません</div>
					<%
					}
					%>
				</h2>
				<h2 style="text-align: left">
					<label>ニックネーム:</label><input type="text" name="name"
						placeholder="ニックネームの入力">
					<%
					if (!is_name) {
					%>
					<div class="error">名前を入力してください</div>
					<%
					}
					%>
				</h2>
				<h2 style="text-align: left">
					<input type="submit" value="会員登録">
				</h2>
			</form>
		</div>
	</div>
</body>
</html>