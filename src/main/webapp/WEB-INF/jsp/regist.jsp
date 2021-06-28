<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>会員登録</title>
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
						placeholder="takuro1103y@gmail.com">
				</h2>

				<h2 style="text-align: left">
					<label>パスワード:</label><input type="password" name="pass" id="pass">
				</h2>
				<h2 style="text-align: left">
					<label>パスワード(確認):</label><input type="password" name="pass2"
						id="pass2">
				</h2>
				<h2 style="text-align: left">
					<label>ニックネーム:</label><input type="text" name="name"
						placeholder="たくろう">
				</h2>
				<h2 style="text-align: left">
					<input type="submit" value="会員登録">
				</h2>
			</form>
		</div>
	</div>
</body>
</html>