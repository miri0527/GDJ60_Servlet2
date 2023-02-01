<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--webapp 밑에 만들면 누구나 가능해서 보안에 취약 -> INF 밑에 넣으면 보안 가능하지만 자기도 못들어오기 때문에 Servlet 필요  -->
	<h1>Home Page</h1>
	<!--controller로 거쳐서 가야되기 때문 -> page가 떴을 때의 url 주소를 기준-->
	<!--프론트측 -> 프로젝트 명까지가 절대경로  -->
	<!-- .은 파일  /은 폴더 -->
	<!-- IP:PORT(80은 생략)/경로명?... -> ?앞부분은 url, ?뒤는 서버로 보내는 데이터(parameter) -->
	<!-- https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=아이유 -->
	<!-- query라는 이름으로 아이유라는 것이 들어감 -->
	<!-- & -> 파라미터를 구분하기 위한 기호 -->
	<!--요청 -> URL(ip:port/경로) Method(필수사항), Option(선택사항) 파라미터(이름=값) -->
	<a href = "/product/*?name=test&detail=explain">Product List</a>
	<a href = "./memberList.do">Member List</a>
</body>
</html>