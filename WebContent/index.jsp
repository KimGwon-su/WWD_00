<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>수강생관리</title>
<style>
	header{
		height: 60px;
		padding: 5px;
		background-color: #38B6EE;
		color: white;
		text-align: center;
		}
	nav{
		background-color: #DBFCE1;
		height: 30px;
		padding: 2px;
		}
	section{
		padding: 5px;
		background-color: #13C899;
		min-height: 500px;
		}
	footer{
		color: black;
		background-color: #EDFF7C;
		text-align: center;
		}		
	a{
		text-decoration: none;
		color: black;
		}
</style>
</head>
<body>
	<header><h3>학원수강관리</h3></header>
	<nav>
		<a href = "insertStudent.jsp">수강생 등록</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href = "getStudnet.jsp">수강생 목록 조회/수정</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href = "insertRegister.jsp">수강신청</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href = "getRegisters.jsp">수강조회</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href = "index.jsp">홈으로</a>
	</nav>
	<section>
		<h4 align = "center">학원 수강관리 프로그램</h4>
		국제학원의 수강생 정보 수강신청 정보 데이터베이스를 구축하고 수강생관리  프로그램을 작성하는
		프로그램이다.<br>
		프로그램 작성 순서<br>
		<ol>
			<li>수강생정보 테이블을 생성한다.</li> <!-- li는 리스트 -->
			<li>과목정보 테이블을 생성한다.</li>
			<li>수강정보 테이블을 생성한다.</li>
			<li>수강생정보, 과목정보, 수강정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.</li>
			<li>수강생정보 입력 화면프로그램을 작성한다.</li>
			<li>수가생 정보 조회 프로그램을 작성한다.</li>
			<li>수강생신청 화면 프로그램을 작성한다.</li>
			<li>수강신청 정보 조회 프로그램을 작성한다.</li>
		</ol>
	</section>
	<footer>HRDKOREA Copyright&copy; 2016 All right reserved. Human Resources Development
	Service of Korea.
	</footer>
</body>
</html>