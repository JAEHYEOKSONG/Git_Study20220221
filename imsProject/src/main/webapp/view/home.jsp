<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ホーム</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/common/style.css">
</head>
<body>
	<!-- ブラウザ全体  div-->
	<div>

		<!-- ヘッダー-->
		<%@ include file="/common/header.jsp"%>

		<!--　menu ボタン-->
		<div id="main" class="container">
				<li><a href="<%=request.getContextPath()%>/view/insertInquiry.jsp">【問い合わせ登録】</a></li>
				<li><a href="<%=request.getContextPath()%>/view/loginAdmin.jsp">【管理者ログイン】</a></li>
		</div>

		<!-- フッター -->
		<%@ include file="/common/footer.jsp"%>

	</div>
</body>

</html>