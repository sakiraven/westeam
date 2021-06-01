<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="zuoneishang">
	<input type="text" class="sousuohaoyou" placeholder="搜索好友" style="color:white">
	<button class="sousuo_tianjiahaoyou">搜索</button>
</div>
<div class="zuonei" style="overflow-y:scroll;overflow-x:visible;">
	<c:forEach items="${friendSelect}" var="item" varStatus="status">

		<div class="haoyou1">
			<input type="text" class="friendId" hidden="true" value="${item.user_Info_Id}"> <img class="touxiang" src="../userpicture/${item.picture}">
			<div class="name">${item.nickName}</div>
			 <c:if test="${messageStatus[status.index]==0}">
				<button class="zhuangtaianniu"></button>
			</c:if>
			<button class="shanchu">删除</button>
		</div>
	</c:forEach>
</div>
<div class="sousuo_haoyouliebiao">

</div>
