<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 코어 라이브러리</title>
</head>
<body>

	<h1>1. JSTL core 변수</h1>

	<c:set var="number1" value="385" />
	<c:set var="number2">25</c:set>
	
	<h3>첫번째 숫자 : ${number1 }</h3>
	<h3>두번째 숫자 : ${number2 }</h3>
	
	<hr>
	
	<h1>2. JSTL core 연산</h1>
	<h3>더하기 : ${number1 + number2 }</h3>
	<h3>빼기 : ${number1 - number2 }</h3>
	<h3>곱하기 : ${number1 * number2 }</h3>
	<h3>나누기 : ${number1 / number2 }</h3>
	
	<hr>
	
	<h1>3. JSTL core out</h1>
	
	<c:out value="<title>core out</title>" />
	
	<hr>
	
	<h1> 4. JSTL core if</h1>
	
	<c:set var="average" value="${(number1 + number2) / 2 }" />

	<c:if test="${average >= 10 }" >
		<h1>${average }</h1>
	</c:if>	
	
	<c:if test="${average < 10 }" >
		<h3>${average }</h3>
	</c:if>
	
	<hr>
	
	<h1>5. JSTL core if</h1>
	
	
	<c:if test="${number1 * number2 > 100 }">
		<c:out value="<script>alert('너무 큰수 입니다')</script>" escapeXml="false" />
	
	</c:if>
	
	
	
	
</body>
</html>