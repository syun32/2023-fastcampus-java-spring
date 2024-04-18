<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<header class="d-flex justify-content-center py-2 bg-light border-bottom">
	<h2 class="heading-section">도서 고객 및 대여관리 프로그램 ver 1.0</h2>
</header>
<nav>
	<ul class="nav justify-content-center">
		<li class="nav-item"><a class="nav-link" href="<c:url value='/register'/>">고객등록</a></li>
		<li class="nav-item"><a class="nav-link" href="<c:url value='/userlist'/>">고객목록조회/수정</a></li>
		<li class="nav-item"><a class="nav-link" href="<c:url value='/userrent'/>">고객대여리스트</a></li>
		<li class="nav-item"><a class="nav-link" href="<c:url value='/rentprice'/>">고객대여금액조회</a></li>
		<li class="nav-item"><a class="nav-link" href="<c:url value='/'/>">홈으로</a></li>
	</ul>
</nav>
