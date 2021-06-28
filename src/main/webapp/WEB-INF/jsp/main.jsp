<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メインページ</title>
<img src="otin2.png" alt="ロゴのスクショ">
</head>
<<<<<<< HEAD
<body>
	<hr>
	<div align="flex-start">
		<tr>
		<form action="/team07Project/Post" method="get">
			<td colspan="2"><input type="submit" value="新規投稿"></td>
		</tr>
		<div align="center">
			<div class="Inner">
				<div class="List">
				<% for (int i=0; i<4; i++){ %>
					<div class="List-Item">
						<div class="List-Item-Content one">
							<div class="List-Item-Content-Number">ユーザー名</div>
							<div class="List-Item-Content-Title">タイトル</div>
							<div class="List-Item-Content-Description">
								テキストテキストテキスト<br> テキストテキストテキスト
							</div>
						</div>
					</div>
				<%}%>
				</div>
			</div>
		</div>
	</div>

</body>
</html>