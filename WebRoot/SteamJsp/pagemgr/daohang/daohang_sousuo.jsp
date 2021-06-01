<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach items="${commoditySelect}" var = "item" begin="0" end="1">
<div class="sousuo_game">
	<img src="../testimages/da03.png" alt="" />
	<div class="game_title">
		<p class="game_biaoti">${item.name}</p>
		<span1 class="qianfuhao">￥</span1>
		<span1 class="game_money">124</span1>
	</div>
</div>
</c:forEach>
