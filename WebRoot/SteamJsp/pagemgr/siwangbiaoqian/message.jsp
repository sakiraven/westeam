<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach items="${messageSelect}" var="item" varStatus="status">
	<c:if test="${item.send_User_Id==mineId}">
		<div class="ziyongzhenghe">
			<img class="ziyongtouxiang" src="../userpicture/${userInfo[0].picture}">
			<div class="ziyongduanxiaoxi">${item.message}</div>

		</div>
	</c:if>
	<c:if test="${item.send_User_Id!=mineId}">
		<div class="kehuzhenghe">
			<img class="kehutouxiang" src="../userpicture/${friendSelect[friendIndex].picture}">
			<div class="kehuduanxiaoxi">${item.message}</div>
		</div>
	</c:if>
</c:forEach>
<!-- <div class="kehuzhenghe">
	<img class="kehutouxiang" src="../images/7456f2328fa4ed7.jpg">

	<div class="kehuduanxiaoxi">asdasdasadasd</div>
</div>
<div class="ziyongzhenghe">
	<img class="ziyongtouxiang" src="../images/7456f2328fa4ed7.jpg">

	<div class="ziyongduanxiaoxi">asdasdasdasadasdasdasd</div>
</div> -->
