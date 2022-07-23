<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>問い合わせ登録</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/common/style.css">
</head>
<body>
	<!-- ブラウザ全体  div-->
	<div>

		<!-- ヘッダー-->
		<%@ include file="/common/header.jsp"%>

		<!-- 書籍登録コンテンツ部分 -->
			<div id="main" class="container">
				<!--  入力フォーム -->
				<form action="<%=request.getContextPath()%>/insertInquiry">
					<table class="input-table" align="center">
						<tr>
							<th>NAME</th>
							<td><input type="text" name="name"></td>
						</tr>
						<tr>
							<th>SEX</th>
							<td><input type="text" name="sex"></td>
						</tr>
						<tr>
							<th>AGE</th>
							<td><input type="text" name="age"></td>
						</tr>
						<tr>
							<th>Email</th>
							<td><input type="text" name="email"></td>
						</tr>
						<tr>
							<th>Address</th>
							<td><input type="text" name="address"></td>
						</tr>
						<tr>
							<th>Date</th>
							<td><input type="text" name="date"></td>
						</tr>
						<tr>
							<th>Category</th>
							<td><input type="text" name="category"></td>
						</tr>
						<tr>
							<th>Description</th>
							<td><input type="text" name="description"></td>
						</tr>
					</table>
					<input type="submit" value="登録">
				</form>
			</div>

		<!-- フッター -->
		<%@ include file="/common/footer.jsp"%>

	</div>
</body>

</html>