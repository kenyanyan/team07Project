<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//ここ
boolean is_title = (boolean) request.getAttribute("is_title");
boolean is_text = (boolean) request.getAttribute("is_text");
boolean is_largeGenre = (boolean) request.getAttribute("is_largeGenre");
boolean is_middleGenre = (boolean) request.getAttribute("is_middleGenre");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>投稿ぺーじ</title>
<style type="text/css">
</style>
<link rel="stylesheet" href="post.css">
</head>
<body>
	<div class="form">
		<form class="register-form" action="/team07Project/Post" method="post">
			<input name="title" placeholder="タイトルの入力"></input>
			<%
			if (!is_title) {
			%>
			<div class="error">タイトルが入力されていません</div>
			<%
			}
			%>
			<textarea name="text" placeholder="本文の入力"></textarea>
			<%
			if (!is_text) {
			%>
			<div class="error">Textが入力されていません</div>
			<%
			}
			%>
			<div class="selectdiv">
				<label> <select name="largeGenre">
						<option value="">大項目</option>
						<option value="book">本</option>
						<option value="movie">映画</option>
						<option value="cooking">料理</option>
						<option value="other">その他</option>
				</select>
				</label>
				<%
				if (!is_largeGenre) {
				%>
				<div class="error">大項目が選択されていません</div>
				<%
				}
				%>
			</div>

			<div class="selectdiv">
				<label> <select name="middleGenre">
						<option value="">中項目</option>
						<option value="book">本</option>
						<option value="movie">映画</option>
						<option value="cooking">料理</option>
						<option value="other">その他</option>
				</select>
				</label>
				<%
				if (!is_middleGenre) {
				%>
				<div class="error">中項目が選択されていません</div>
				<%
				}
				%>
			</div>

			<button>投稿</button>
			<p>
			<button type="button" onclick="history.back()">前の画面に戻る</button>
		</form>
	</div>
</body>
</html>