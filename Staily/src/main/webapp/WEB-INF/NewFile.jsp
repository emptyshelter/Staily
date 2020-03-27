<%@page import="com.itwill.staily.detail.model.dto.Reply" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="0" cellpadding="0" cellspacing="1" width="590"
	bgcolor="BBBBBB">
	<tr>
		<td width=50 align=center bgcolor="E6ECDE" height="22"><fmt:message key="list.label.no"/></td>
		<td width=300 align=center bgcolor="E6ECDE"><fmt:message key="list.label.title"/></td>
		<td width=120 align=center bgcolor="E6ECDE"><fmt:message key="list.label.name"/></td>
		<td width=120 align=center bgcolor="E6ECDE"><fmt:message key="list.label.date"/></td>
	</tr>
	
	<c:forEach items="${replyList}" var="reply">
	<!-- guest start -->
	<tr>
		<td width=50 align=center bgcolor="ffffff" height="20">${reply.rNo}</td>
		<td width=300 bgcolor="ffffff" style="padding-left: 10"><a
			href="guest_view.do?guest_no=${reply.pNo}" class="user">
				<c:out value="${reply.pNo}"/>
		</a></td>
		<td width=120 align=center bgcolor="ffffff">${reply.rContent}</td>
	</tr>
	<!-- guest end -->
	</c:forEach>
	
</table>
</body>
</html>