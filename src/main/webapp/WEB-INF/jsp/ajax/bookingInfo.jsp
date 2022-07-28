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

		<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
        <link rel="stylesheet" href="/jstl/test05/css/style.css" type="text/css">
</head>
<body>
        <div id="wrap" >
            <div class="text-center display-4">통나무 팬션</div>
            <header class="mt-4">
                
                <nav class="mt-4">
                    <ul class="nav nav-fill">
                        <li class="nav-item"><a class="nav-link" href="#">팬션소개</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">예약하기</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">예약목록</a></li>
                    </ul>
                </nav>
            </header>
            <section>
             	<h2 class="my-4 text-center">예약 목록 보기</h2>
                <table class="table text-center">
                   
                    <thead>
                        <tr>
                            <th>이름</th>
                            <th>예약날짜</th>
                            <th>숙박일수</th>
                            <th>숙박인원</th>
                            <th>전화번호</th>
                            <th>예약상태</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="booking" items="${bookingList }">
                    	<tr>
                    		<td>${booking.name }</td>
                    		<td><fmt:formatDate value="${booking.date }" pattern="yyyy년 M월 d일" /></td>
                    		<td>${booking.day }</td>
                    		<td>${booking.headcount }</td>
                    		<td>${booking.phoneNumber }</td>
                    		<c:choose>
                    			<c:when test="${booking.state eq '대기중' }">
                    				<td class="text-info">${booking.state }</td>		
                    			</c:when>
                    			
                    			<c:when test="${booking.state eq '확정' }">
                    				<td class="text-success">${booking.state } </td>
                    			</c:when>
                    			
                    			<c:otherwise>
                    				<td>${booking.state }</td>
                    			</c:otherwise>
                    		</c:choose>
                    		
                    		<td><button type="button" class="btn btn-danger btn-sm">삭제</button></td>
                    	</tr>
                   	</c:forEach>
                   
                    
               
                    </tbody>

                </table>

            </section>
            

            <footer class="mt-3 ml-4">
                <address>
                    제주특별자치도 제주시 애월읍  <br>
                    사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
                    Copyright 2025 tongnamu All right reserved
                </address>

            </footer>


        </div>

    <script>
        
    </script>
    </body>
</html>