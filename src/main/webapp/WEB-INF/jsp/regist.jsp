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
            <h1><a href="index.html"><img class="logo" src="images/logo.png" alt="しゅみったー"></a></h1>
            <nav>
                <ul class="main-nav">
                   

                </ul>
            </nav>
        </header>
 <form name="myForm" method="post" action="study_member_add.html">
        <h2 style="text-align:center"><label>ID:</label><input type="email" name="mail" placeholder="takuro1103y@gmail.com" required></h2>
        <h2 style="text-align:center"><label>パスワード:</label><input type="password" name="pass" id="pass" required></h2>
        <h2 style="text-align:center"><label>パスワード(確認):</label><input type="password" name="pass2" id="pass2" required></h2>
        <h2 style="text-align:center"><label>ニックネーム:</label><input type="text"  name="name" placeholder="たくろう" required></h2>
        <h2 style="text-align:center"><input type="submit" value="会員登録"></h2>
    </form>
</body>
</html>