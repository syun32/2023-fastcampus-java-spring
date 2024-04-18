<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="java.net.URLDecoder"%>
<!DOCTYPE html>
<html>
<head>
<title>[고객변경] 도서 고객 및 대여관리 프로그램</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<%@include file="header.jsp"%>

	<section class="container px-5">
		<div class="container py-3">
			<form:form name="frm" modelAttribute="user">
				<h5 class="text-center">고객변경화면</h5>
			    
				<div class="input-group py-3">
				  <span class="input-group-text">고객번호</span>
				  <input type="text" class="form-control bg-light" name="cust_no" value="${userDto.cust_no}" readonly>
				</div>
				<div class="input-group pb-3">
				  <span class="input-group-text">고객이름</span>
				  <input type="text" class="form-control" name="cust_name" value="${userDto.cust_name}" placeholder="홍길동" autofocus>
				</div>
				<div class="input-group pb-3">
				  <span class="input-group-text">전화번호</span>
				  <input type="text" class="form-control" name="phone" value="${userDto.phone}" placeholder="010-1234-1234">
				</div>
				<div class="input-group pb-3">
				  <span class="input-group-text">이메일</span>
				  <input type="text" class="form-control" name="cust_email" value="${userDto.cust_email}" placeholder="1111@fastcampus.com">
				</div>
				<div class="input-group pb-3">
				  <span class="input-group-text">고객등급(P,G,S)</span>
				  <input type="text" class="form-control" name="grade" value="${userDto.grade}" placeholder="P, G, S">
				</div>
				<div class="text-center pb-3">
       				<button type="button" onclick="formCheck()" class="btn btn-primary">수정</button>
       				<button type="button" onClick="location.href='<c:url value='/userlist'/>'" class="btn btn-secondary">조회</button>
       			</div>

		        <script>
		            function formCheck() {
		                 let msg ='';
		                 let frm = document.frm;
		     
			                 if(frm.cust_name.value.length==0) {
			                	 alert('고객이름을 입력해주세요.');
			                	 document.getElementsByName("cust_name")[0].focus();
			                     return;
			                 }
			                 else if(frm.cust_name.value.length > 20) {
			                	 alert('20자 이하의 고객이름을 입력해주세요.');
			                	 document.getElementsByName("cust_name")[0].focus();
			                     return;
			                 }
			     
			                 if(frm.phone.value.length==0) {
			                	 alert('전화번호를 입력해주세요.');
			                	 document.getElementsByName("phone")[0].focus();
			                     return;
			                 }
			                 else if(frm.phone.value.length > 20) {
			                	 alert('20자 이하의 전화번호를 입력해주세요.');
			                	 document.getElementsByName("phone")[0].focus();
			                     return;
			                 }
	
			                 if(frm.cust_email.value.length==0) {
			                	 alert('이메일을 입력해주세요.');
			                	 document.getElementsByName("cust_email")[0].focus();
			                     return;
			                 }
			                 else if(frm.cust_email.value.length > 20) {
			                	 alert('50자 이하의 이메일을 입력해주세요.');
			                	 document.getElementsByName("cust_email")[0].focus();
			                     return;
			                 }
			                 
			                 if(frm.grade.value.length==0) {
			                	 alert('고객등급을 입력해주세요.');
			                	 document.getElementsByName("grade")[0].focus();
			                     return;
			                 }
			                 else if(!(frm.grade.value=="P" || frm.grade.value=="G" || frm.grade.value=="S")) {
			                	 alert('P / G / S 중 하나의 고객등급을 입력해주세요.');
			                	 document.getElementsByName("grade")[0].focus();
			                     return;
			                 }
			
			                 frm.submit();
			            }
			        </script>
			</form:form>
		</div>
	</section>

	<%@include file="footer.jsp"%>
</body>
</html>
