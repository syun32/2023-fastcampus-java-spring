<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>[Home] 도서 고객 및 대여관리 프로그램</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<%@include file="header.jsp"%>

	<div class="container py-3">
		<section class="container px-5 border">
			<p>
			<h5 class="text-center">도서 고객 및 대여관리 프로그램</h5>
			</p>
			<hr />
			<p class="px-4 pb-5">
				프로그램 작성 순서<br> 
				1. 고객정보 테이블을 생성 한다.<br> 
				2. 대여정보 테이블을 생성 한다.<br>
				3. 고객정보, 대여정보 테이블에 제시된 데이터를 생성한다.<br> 
				4. 고객정보 입력 화면 프로그램을 작성한다.<br>
				5. 고객정보 조회 프로그램을 작성한다.<br> 
				6. 고객대여리스트를 조회하는 프로그램을 작성한다.<br>
				7. 고객별 대여금액을 조회하는 프로그램을 작성한다.
			</p>
		</section>
	</div>

	<%@include file="footer.jsp"%>
</body>
</html>
