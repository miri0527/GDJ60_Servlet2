<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--uri(절대경로) -->
<a href = "/GDJ60_Servlet2/html/member.jsp">MEMBER</a><br>
<a href = "/GDJ60_Servlet2/html/product.jsp">PRODUCT</a><br>
<a href = "/GDJ60_Servlet2/">HOME</a><br>
<!--product라는 mapping이 없기 때문에 product는 의미가 없어지고 /만 있는 것만 인식한다  -->
<a href = "/GDJ60_Servlet2/product">PRODUCT_CONTROLLER</a><br>
<!--상대경로(url)중요  -->
<a href = "./member.jsp">MEMBER</a><br>
<a href = "/GDJ60_Servlet2/html/product.jsp">PRODUCT</a><br>
<a href = "../">HOME</a><br>
<!--../ -> 한단계 나오는 것  -->

<a href = "../product.do">PRODUCT_CONTROLLER</a>

<!-- index가 html안에 있어서 한단계 나오고 sub로 들어가야된다 -->
<a href = "../sub/sub1.jsp">sub1 상대경로</a>
<a href = "/GDJ60_Servlet2/sub/sub1.jsp">sub1 절대경로</a>
	<!-- <h1>제목1</h1>
	<h2>제목2</h2>
	<h3>제목3</h3>
	<hr>
	
	Text
	<hr>
	<h4>제목4</h4>
	<h5>제목5</h5>
	<h6>제목6</h6>
	생각이 많은 건 말이야<br>
	당연히 해야 할 일이야<br>
	<p>
	나에겐 우리가 지금 일순위야<br>
	안전한 유리병을 핑계로<br>
	</p>
	<p>
	바람을 가둬 둔 것 같지만<br>
	기억나? 그날의 우리가<br>
	잡았던 그 손엔 말이야<br>
	</p> -->
	
</body>
</html>