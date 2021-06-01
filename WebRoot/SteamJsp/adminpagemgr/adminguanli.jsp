
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="cn.entity.Account"%>
<%@page import="cn.entity.UserInformation"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="guanliwenben">
	<%--  <%
 	List<UserInformation> getUserInfo =(List<UserInformation>) session.getAttribute("userInfoSelect");
 	List<Account> getAccInfo =(List<Account>) session.getAttribute("accountSelect");
 	for(int i =0;i<getAccInfo.size();i++){
 		out.print("<a class='userInfo' href=\"javascript:;\">帐号："+getAccInfo.get(i).getAid()+"昵称："+getAccInfo.get(i).getName()+"</a></br></br>");
 		out.print("<input hidden='true' class='aid' type = 'text' value='"+getAccInfo.get(i).getAid()+"'>");
 	}
  %> --%>

	<c:forEach items="${accountSelect}" var="item">
		<p class="userInfo">账号:${item.name}</p>
	</c:forEach>

	<c:forEach items="${accountSelect}" var="item" >
		<input class="aid" type="text" value="${item.aid}" hidden="true">
		<input class="name" type="text" value="${item.name}"hidden="true">
		<input class="password" type="text" value="${item.password}"hidden="true">
	</c:forEach>
	<c:forEach items="${userInfoSelect}" var="item">
		<input class="nickName" type="text" value="${item.nickName}"hidden="true">
	</c:forEach>

</div>
