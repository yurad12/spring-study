<%@ page import="com.yujeong.servlet.domain.member.MemberRepository" %>
<%@ page import="com.yujeong.servlet.domain.member.Member" %><%--
  Created by IntelliJ IDEA.
  User: yujeongee
  Date: 1/16/24
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("JspClass.jsp_service_method");
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getUsername()%></li>
    <li>age=<%=member.getAge()%></li>
</ul>
<a href ="/index.html">메인</a>
</body>
</html>
