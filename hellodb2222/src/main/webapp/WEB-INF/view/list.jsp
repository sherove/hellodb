<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>�̸�</th>
		<th>����</th>
		<th>����</th>
		<th>����</th>
	</tr>
	

	<c:forEach var="list" items="${list }" >
		<tr>
		<td>${list.name}</td>
		<td>${list.kor}</td>
		<td>${list.math}</td>
		<td>${list.eng}</td>
		</tr>
	</c:forEach>
</table>

<input type="button" value="�Է�" onclick="insertBtn_click()">

</body>

<script type="text/javascript">
function insertBtn_click(){
	alert("gg");
}
</script>
</html>