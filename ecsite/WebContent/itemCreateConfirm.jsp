<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/style.css">
	<title>ItemCreateConfirm画面</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>ItemCreateConfirm</p>
		</div>
		<div>
			<h3>登録する内容は以下でよろしいですか。</h3>
			<table>
				<s:form action="ItemCreateCompleteAction">
				<tr id="box">
					<td>
						<label>商品名:</label>
					</td>
					<td>
						<s:property value="itemName" escape="false" />
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>商品価格:</label>
					</td>
					<td>
						<s:property value="itemPrice" escape="false" /><span>円</span>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>在庫:</label>
					</td>
					<td>
						<s:property value="itemStock" escape="false" /><span>個</span>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value="登録" />
					</td>
				</tr>
				</s:form>
			</table>
		</div>
		<br>
		<div>
			前の画面に戻る場合は<a href='<s:url action="ItemCreateAction" />'>こちら</a>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>