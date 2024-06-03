<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2024-05-28
  Time: 오후 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
    <title>로그인이요</title>
</head>
<body>
    <h1>하이요</h1>
    <form id="loginForm" name="loginForm" method="post" action="/Login/Login">
    <div id="loginDiv">
        <input id="id" name="id" type="text">
        <input id="pw" name="pw" type="password">
    </div>
    <button type="button" id="loginBtn" onclick="loginSubmit()">
        로그인하기
    </button>
    </form>
</body>

<script>
    function loginSubmit(){
        let loginForm = document.loginForm;
        loginForm.submit();
    }
</script>
</html>
