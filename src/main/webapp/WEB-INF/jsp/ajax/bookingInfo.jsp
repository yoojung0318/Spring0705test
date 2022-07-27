<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약확인</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	 <div id="wrap" >
            <header class="mt-4">
                <div class="text-center display-4">통나무 팬션</div>
                <nav class="mt-4">
                    <ul class="nav nav-fill">
                        <li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">예약안내</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">커뮤니티</a></li>
                    </ul>
                </nav>
            </header>
            <section>
            	<h3 class="text-center mt-3">예약 목록 보기</h3>
            	<div>
            		<table class="table">
            			<thead>
            				<tr>
	            				<th>이름</th>
	            				<th>예약날짜</th>
	            				<th>숙박일수</th>
	            				<th>숙박인원</th>
	            				<th>전화번호</th>
	            				<th>예약상태</th>
	            				<th> </th>
            				</tr>
            			</thead>
            			<tbody>
            				<c:forEach var="booking" items="${ bookingList}">
	            				<tr>
		            				<td>${booking.name}</td>
		            				<td><fmt:formatDate value="${booking.date }" pattern="yyyy년 M월 dd일"/></td>
		            				<td>${booking.day }</td>
		            				<td>${booking.headcount }</td>
		            				<td>${booking.phoneNumber }</td>
		            				<c:choose>
		            					<c:when test="${booking.state == '대기중' }">
		            						<td class="text-info">${booking.state}</td>
		            					</c:when>
		            					
		            					<c:when test="${booking.state == '확정' }">
		            						<td class="text-success">${booking.state}</td>
		            					</c:when>
		            					
		            					<c:otherwise>
		            						<td>#{booking.state}</td>	
		            					</c:otherwise>
		            				</c:choose>	
		            				<td><button class="button btn-danger">삭제</button></td>		
		            			</tr>	
	            			</c:forEach>
            			</tbody>
            		</table>
            	</div>
            </section>
            
            <footer class="mt-5 ml-3">
            	제주특별자치도 제주시 애월읍 <br>
            	사업자등록번호:111-22 <br>
            	Copyright © 
            </footer>

</body>
</html>