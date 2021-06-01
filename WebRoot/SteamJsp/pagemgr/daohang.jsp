<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="../css/daohang.css">
<!---测试------->
<link rel="stylesheet" href="../css/dds.css">
<nav class="nav">
	<%-- 	<c:if test="${login==null}">
		<div id="aa">
			<a href="#" class="dengluzhuce">登录</a> &nbsp;&nbsp;<a href="#" class="dengluzhuce">注册</a>
		</div>
	</c:if>
	<c:if test="${login!=null}">
		<div id="aa">
			<a href="javascript:;" class="dengluzhuce" style="color:white">欢迎您：${userInfo[0].nickName}</a>
		</div>
	</c:if> --%>
	<div class="navall">
		<div class="nav_zuo">
			<img src="../images/logo_steam.png" class="logo">
			<ul class="nav_fuwu">
				<!--<li>商品</li>-->
				<!--<li>社区</li>-->
				<!--<li>关于</li>-->
				<!--<li>客服</li>-->
			</ul>
		</div>

		<!-- <img src="../images/cluster_bg.png" class="all_xuse"> -->

		<div class="daohang_fuwu">
			<span class="span1" id="span1">主页面<img src="../images/新三角.png"> </span> <span class="span1">全部商品<img src="../images/新三角.png"> </span> <span class="span1">收藏<img src="../images/新三角.png"> </span> <span class="span1">暂无<img src="../images/新三角.png"> </span> <span class="span1">暂无<img src="../images/新三角.png"> </span>
			<!--   <span class="span1">硬件<img src="../images/新三角.png"> </span>
			  <span class="span1">新闻</span>  -->

			<form action="#" method="post">
				<input class="sousuo_quanbu" type="text" name="sousuo_quanbu"> <input class="suosuo_quanbu_anniu" type="image" src="../images/search_icon_btn.png">
				<!-- <div class="sousuokuang">
					asdasd
				</div> -->
			</form>
			<div class="wudisousuokuang" hidden="true">
				<!-- <div class="sousuo_game">
					<img src="../testimages/da03.png" alt="" />
					<div class="game_title">
						<p class="game_biaoti">Assassin's Creed@ Odyseey</p>
						<span1 class="qianfuhao">￥</span1>
						<span1 class="game_money">124</span1>
					</div>
				</div> -->
				<!-- <div class="sousuo_game">
					<img src="../testimages/da03.png" alt="" />
					<div class="game_title">
						<p class="game_biaoti">Assassin's Creed@ Odyseey</p>
						<span1 class="qianfuhao">￥</span1>
						<span1 class="game_money">124</span1>
					</div>
				</div> -->

				<!--<div class="sousuo_game" ><img src="../testimages/da03.png" alt=""/> <div class="game_title4"> <p class="game_biaoti">Assassin's Creed@ Odyseey</p> <span1 class="qianfuhao">￥</span1> <span1 class="game_money">124</span1></div></div>-->
				<!--<div class="sousuo_game" ><img src="../testimages/da03.png" alt=""/> <div class="game_title4"> <p class="game_biaoti">Assassin's Creed@ Odyseey</p> <span1 class="qianfuhao">￥</span1> <span1 class="game_money">124</span1></div></div>-->
				<!--<div class="sousuo_game" ><img src="../testimages/da03.png" alt=""/> <div class="game_title4"> <p class="game_biaoti">Assassin's Creed@ Odyseey</p> <span1 class="qianfuhao">￥</span1> <span1 class="game_money">124</span1></div></div>-->
				<!--<div class="sousuo_game" ><img src="../testimages/da03.png" alt=""/> <div class="game_title4"> <p class="game_biaoti">Assassin's Creed@ Odyseey</p> <span1 class="qianfuhao">￥</span1> <span1 class="game_money">124</span1></div></div>-->
			</div>
		</div>
		<div class="neirong"></div>

		<div class="xuanting_waigua"></div>
	</div>



</nav>
<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/daohang.js"></script>

