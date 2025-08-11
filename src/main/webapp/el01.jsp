<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${fac =(n)-> n == 1? 1 :n* fac(n-1);'' }
${fac(5) }
${greaterThan= (a,b)->a>b?true:false;''}
${greaterThan(20,30)}

</body>
</html>