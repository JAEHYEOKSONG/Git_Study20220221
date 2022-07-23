<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>問い合わせ登録確認</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/common/style.css">
</head>
<body>
	<!-- ブラウザ全体  div-->
	<div>

		<!-- ヘッダー-->
		<%@ include file="/common/header.jsp"%>

		<h1>問い合わせ登録を完了致しました。
		<br>メール送信しましたので、確認お願い致します。</h1>
		<p>登録</p>
		<p>キャンセル</p>
		<!-- フッター -->
		<%@ include file="/common/footer.jsp"%>

	</div>
</body>

</html>