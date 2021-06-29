<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//リクエストスコープ 
int is_mail = (int) request.getAttribute("is_mail");
boolean is_pass = (boolean) request.getAttribute("is_pass");
boolean is_pass2 = (boolean) request.getAttribute("is_pass2");
boolean is_name = (boolean) request.getAttribute("is_name");
boolean is_db = (boolean) request.getAttribute("is_db");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" Content="text/html;charset=Shift_JIS">

<title>会員登録</title>
<style type="text/css">
.error {
	color: red;
	font-size: 70%;
}
</style>
<link rel="stylesheet" href="regist.css">
</head>
<body>
	<div class="form">
		<form class="register-form" method="post"
			action="/team07Project/MenberRegist" accept-charset="shift_jis">

			<label>ID</label><input type="email" name="mail"
				placeholder="xxx@●●●.com">
			<%
			if (is_mail == 1) {
			%>
			<div class="error">メールアドレスが入力されていません</div>
			<%
			} else if (is_mail == 2) {
			%>
			<div class="error">入力された内容がメールアドレスの書式ではありません</div>
			<%
			}
			%>
			<label>パスワード</label><input type="password" name="pass" id="pass"
				placeholder="パスワード">
			<%
			if (!is_pass) {
			%>
			<div class="error">パスワードを8文字以上で入力してください</div>
			<%
			}
			%>
			<label>パスワード(確認)</label><input type="password" name="pass2"
				id="pass2" placeholder="パスワード確認">
			<%
			if (!is_pass2) {
			%>
			<div class="error">入力されたパスワードが一致しません</div>
			<%
			}
			%>
			<label>ニックネーム</label><input type="text" name="name"
				placeholder="ニックネームの入力">
			<%
			if (!is_name) {
			%>
			<div class="error">名前を入力してください</div>
			<%
			} else if (!is_db) {
			%>
			<div class="error">DBの接続エラーです 管理者にお問い合わせください</div>
			<%
			}
			%>
			<div>
			<input type="hidden" name="regist" value="regist">
				<button>会員登録</button>
				<p>
				<button type="button" onclick="history.back()">ログイン画面に戻る</button>
			</div>
		</form>
	</div>
</body>
</html>