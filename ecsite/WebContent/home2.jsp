<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/style.css">
	<title>Home画面</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>Home</p>
		</div>
		<div>
			このアカウントは、<s:property value="#session.login_user_id" />様です
		</div>
		<span style="color: red;">＊ログインをしてください</span>
		<br>
		<div>
			<s:form action="HomeAction">
				<s:submit value="ログイン" />
			</s:form>
			<s:form action="AdminAction">
				<s:submit value="管理者" />
			</s:form>
			<s:if test="#session.login_user_id!=null">
				<p>ログアウトする場合は
					<a href='<s:url action="LogoutAction" />'>こちら</a></p>
			</s:if>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>