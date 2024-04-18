<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>[고객대여] 도서 고객 및 대여관리 프로그램</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
<%@include file="header.jsp" %>

	<div class="container py-3">
		<section class="container px-5 border">
			<p>
			<h5 class="text-center pb-2">고객대여리스트</h5>
			</p>
			<table class="table text-center table-bordered">
				<thead>
					<tr>
						<th scope="col">고객번호</th>
						<th scope="col">대여번호</th>
						<th scope="col">도서코드</th>
						<th scope="col">대여금액</th>
						<th scope="col">대여일자</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="rentDto" items="${list}">
					<tr>
						<td>${rentDto.cust_no}</td>
						<td>${rentDto.rent_no}</td>
						<td>${rentDto.book_code}</td>
						<td>${rentDto.rent_price}</td>
						<td><fmt:formatDate value="${rentDto.rent_date}" pattern="yyyy-MM-dd" type="date"/></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</section>
	</div>

<%@include file="footer.jsp" %>
</body>
</html>
