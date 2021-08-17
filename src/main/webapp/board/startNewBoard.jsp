<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 작성</title>
</head>
<body>
<h1> 게시판 작성</h1>
<form action="board-insert-process.do" name="board" method="post">
<p> 글 제목 : <input type="text" name="b_title"></p>
<p> 내용 : <input type="text" name="b_content"></p>
<p><input type ="submit" value="submit"></p>
</form>
</body>
</html>