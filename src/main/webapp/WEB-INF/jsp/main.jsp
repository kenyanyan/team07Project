<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メインページ</title>
<link rel="stylesheet" href="main.css">
</head>
<body>
	<header class="header-4">
		<div class="header-inner">
			<div class="logo">しゅみったー</div>
			<nav class="header-nav">
				<div>マイページ</div>
				<div>　　　　</div>
				<div>ログアウト</div>
				<div class="header-nav-item">
					<form class="form2">
						<input type="search" class="form2-input" placeholder="記事検索" />
						<button class="form2-button">
							<i class="fa fa-search"></i>
						</button>
					</form>
				</div>
			</nav>
		</div>
	</header>
	<div class="form">
		<form action="/team07Project/Post" method="get">
			<input type="submit" value="新規投稿">
		</form>
		<div class="card-group">
			<%
			for (int i = 0; i < 4; i++) {
			%>

			<div class="card">
				<div class="card__imgframe"></div>
				<div class="card__textbox">
					<div class="card__titletext">タイトルがはいります。</div>
					<div class="card__overviewtext">本文が入ります</div>
				</div>
			</div>

			<%
			}
			%>
		</div>
	</div>
</body>
</html>