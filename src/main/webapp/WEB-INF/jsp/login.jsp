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
<head>
<meta charset="UTF-8">
<title>ろぐいんページ</title>
</head>
<body>
ここはログイン画面


</body>
</html>


