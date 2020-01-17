<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="db.DBConn"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>수강생관리</title>
<style>
header {
	height: 60px;
	padding: 5px;
	background-color: #38B6EE;
	color: white;
	text-align: center;
}

nav {
	background-color: #DBFCE1;
	height: 30px;
	padding: 2px;
}

section {
	padding: 5px;
	background-color: #13C899;
	min-height: 500px;
}

footer {
	color: black;
	background-color: #EDFF7C;
	text-align: center;
}

a {
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
	<header>
		<h3>학원수강관리</h3>
	</header>
	<nav>
		<a href="insertStudent.jsp">수강생 등록</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="getStudnet.jsp">수강생 목록 조회/수정</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="insertRegister.jsp">수강신청</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="getRegisters.jsp">수강조회</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="index.jsp">홈으로</a>
	</nav>
	<section>
		<h4 align="center">수강생 조회/수정</h4>
		<table border="1" width="700px" align="center">
			<tr>
				<th>수강생번호</th>
				<th>이름</th>
				<th>연락처</th>
				<th>생년월일</th>
				<th>메일주소</th>
				<th>주소</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>수강과목수</th>
			</tr>
			<%
		//1,2단계
		Connection conn = new DBConn().getConnection();
		//3단계 sql
		String sql = "select STUDENT_NO,STUDENT_NAME,STUDENT_ADDR,STUDENT_PHONE,STUDENT_BIRTH,STUDENT_EMAIL,STUDENT_ID,STUDENT_PW," +
						"(select count(*)from register_tbl_01 where student_no = STUDENT_TBL)01.STUDENT_NO) as register_cnt" +
							" from STUDENT_TBL_01 order by STUDENT_NO";
						
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			String student_id = rs.getString("STUDENT_ID");

		String student_pw = rs.getString("STUDENT_PW");
	%>
			<tr>
				<td style="text-align: center;"><a
					href="updateStudents.jsp?student_no=<%=rs.getString("STUDENT_NO")%>"><%=rs.getString("STUDENT_NO") %>
				</a></td>
				<td><%=rs.getString("STUDENT_NAME") %></td>
				<td style="text-align: left;"><%=rs.getString("STUDENT_PHONE") %></td>
				<td style="text-align: center;"><%=rs.getString("STUDENT_BIRTH")%></td>
				<td style="text-align: left;"><%=rs.getString("STUDENT_EMAIL") %></td>
				<td style="text-align: center;"><%=student_id ==null?"":student_id %></td>
				<td style="text-align: left;"><%=student_pw == null?"" : student_pw %></td>
				<td style="text-align: right;"><%=rs.getString("register_cnt") %></td>
			</tr>
	<%}
		//6단계 연결해제
		conn.close();
	%>
		</table>
	</section>
	<footer>HRDKOREA Copyright&copy; 2016 All right reserved.
		Human Resources Development Service of Korea. </footer>
</body>
</html>