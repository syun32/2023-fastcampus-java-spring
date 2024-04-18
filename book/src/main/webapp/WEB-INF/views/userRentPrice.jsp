<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>[대여금액] 도서 고객 및 대여관리 프로그램</title>
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
			<h5 class="text-center pb-2">고객대여금액조회</h5>
			</p>
			<table class="table text-center table-bordered">
				<thead>
					<tr>
						<th scope="col">고객번호</th>
						<th scope="col">고객이름</th>
						<th scope="col">고객등급</th>
						<th scope="col">총대여금액</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="userDto" items="${list}">
					<tr>
						<td>${userDto.cust_no}</td>
						<td>${userDto.cust_name}</td>
						<td>
							<c:set var="userGrade" value="${userDto.grade}"/>
							<c:if test="${userGrade eq 'P'}">
								Platinum
							</c:if>
							<c:if test="${userGrade eq 'G'}">
								Gold
							</c:if>
							<c:if test="${userGrade eq 'S'}">
								Silver
							</c:if>
						</td>
						<td>${userDto.total_rent_price}</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</section>
	</div>

<%@include file="footer.jsp" %>
</body>
</html>
