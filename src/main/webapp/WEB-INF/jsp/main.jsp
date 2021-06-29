<%@page import="dao.postDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.Post,java.util.List"%>
<%
postDAO pDAO = new postDAO();
List<model.Post> listPost = pDAO.getNewPost();
System.out.println("listPost : " + listPost);
%>
<%
String x = "a";
x = request.getParameter("x");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メインページ</title>
<link rel="stylesheet" href="main.css">
<%
if (x != null) {
%>
<script>
	alert('投稿が完了しました！');
</script>
<%
}
%>
</head>
<body>
	<header class="header-4">
		<div class="header-inner">

			<img class="syumi" src="/team07Project/logo.png">

			<nav class="header-nav">

				<input type="submit" value="マイページ">

				<div></div>
				<form action="/team07Project/Logout" method="get">
					<input type="submit" value="ログアウト">
				</form>
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
			for (Post post : listPost) {
			%>

			<div class="card">
				<div class="card__imgframe"></div>
				<div class="card__textbox">
					<div class="card__titletext"><%=post.getTitle()%></div>
					<div class="card__overviewtext"><%=post.getText()%></div>
				</div>
			</div>

			<%
			}
			%>
		</div>
	</div>
</body>
</html>