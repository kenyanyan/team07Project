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
<img src="otin2.png" alt="ロゴのスクショ">
</head>
<body>
	<section>
		<form action="/team07Project/Post" method="post">
			<div>
				<textarea name="title" placeholder="タイトルの入力"></textarea>
			</div>
			<%
			if (!is_title) {
			%>
				<div>タイトルが入力されていません</div>
			<%
			}
			%>
			<div>
				<textarea name="text" placeholder="Text"></textarea>
			</div>
			<%
			if (!is_text) {
			%>
				<div>Textが入力されていません</div>
			<%
			}
			%>
			<div>
				<select name="largeGenre">
					<option value="">大項目</option>
					<option value="elephant">本</option>
					<option value="lion">映画</option>
					<option value="penguin">料理</option>
					<option value="penguin">その他</option>
				</select>
			</div>
			<%
			if (!is_largeGenre) {
			%>
				<div>大項目が選択されていません</div>
			<%
			}
			%>
			<div>
				<select name="middleGenre">
					<option value="">中項目</option>
					<option value="elephant">本</option>
					<option value="lion">映画</option>
					<option value="penguin">料理</option>
					<option value="penguin">その他</option>
				</select>
			</div>
			<%
			if (!is_middleGenre) {
			%>
				<div>中項目が選択されていません</div>
			<%
			}
			%>
			<div>
				<label>画像</label>
			</div>
			<div class="btn_area">
				<input type="submit" name="btn_confirm" value="投稿">
			</div>
		</form>
	</section>
</body>
</html>