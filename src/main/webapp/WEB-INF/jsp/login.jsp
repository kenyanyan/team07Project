<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %>
	<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	if(id.equals("ﾃﾞｰﾀﾍﾞｰｽのID") && pass.equals("ﾃﾞｰﾀﾍﾞｰｽのPW")){
		session.setAttribute("id",id);
		response.sendRedirect("main.jsp");
	}else if(id.equals("ﾃﾞｰﾀﾍﾞｰｽのID")){
		out.println("<script>alert('pwエラー'); history.back();</script>");
	}else if(pass.equals("ﾃﾞｰﾀﾍﾞｰｽのPW")){
		out.println("<script>alert('IDエラー'); history.back();</script>");
	}else{
		out.println("<script>alert('ID,PWエラー'); history.back();</script>");
	}
		%>
<!DOCTYPE html>
<html>
<<<<<<< HEAD
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
=======
<head>
<meta charset="UTF-8">
<title>ろぐいんページ</title>
</head>
<body>
ここはログイン画面


</body>
</html>


>>>>>>> refs/heads/JEON
