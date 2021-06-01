<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="zuonei" style="overflow-y:scroll;overflow-x:visible;">
	<c:forEach items="${noticeSelect}" var="item">
		<c:if test="${item.type==0}">
			<div class="xiaoxibiaoti">
				<div class="xiaoximing">好友通知</div>
				<img class="tongzhibiaotiguanbi" src="../images/7456f2328fa4ed7.jpg" id="${item.nic_Id}"/>
			</div>
		</c:if>
		<c:if test="${item.type==1}">
			<div class="xiaoxibiaoti">
				<div class="xiaoximing">管理员通知</div>
				<img class="tongzhibiaotiguanbi" src="../images/7456f2328fa4ed7.jpg" id="${item.nic_Id}"/>
			</div>
		</c:if>
	</c:forEach>
</div>
