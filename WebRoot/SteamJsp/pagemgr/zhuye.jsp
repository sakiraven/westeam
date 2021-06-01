<%@page import="cn.entity.CommodityInformation"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <c:if test="${commoditySelect==null}">
	<script>location.href="../../CommodityInformationServlet?opr=commoditySelect&selectType=zhuye"</script>
</c:if>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html">
<head lang="en">
<meta charset="UTF-8">
<title></title>
<!--引入css样式需要改名字-->
	<link rel="stylesheet" href="../css/siwangbiaoqian.css">
    <link rel="stylesheet" href="../css/friend.css">
    <link rel="stylesheet" href="../css/tongzhi.css">
	<link rel="stylesheet" href="../css/zhuye.css">
</head>
<!--默认-->
<iframe src="daohang.jsp" style=" position: absolute;z-index: 100;" scrolling="no" frameborder="0" width="1023px" height="300px"></iframe>
<br style="background-color:  rgb(27,40,56);">
<!--body代码全部写在 bodayall里面-->
<body style="background-color:  rgb(27,40,56);">
	<!--body代码全部写在 bodayall里面-->
	<div class="bodayall">
		<!-- 左侧分类-->
		<div id="xuanzelan" >
			<h4 style="color: #a9b6b6">
				推荐</br> </br>
			</h4>
			<a href="" style="color: #4ea2bf">由好友推荐</a></br> <a href="" style="color: #4ea2bf">标签</a></br> </br>
			<h4 style="color: #a9b6b6">
				探索列队</br>
			</h4>
			<a href="" style="color: #4ea2bf">推荐</a></br> <a href="" style="color: #4ea2bf">新品</a></br> </br>
			<h4 style="color: #a9b6b6">
				浏览分类</br>
			</h4>
			<a href="rexiao.jsp" style="color: #4ea2bf">热销商品</a></br> <a href="" style="color: #4ea2bf">最近更新</a></br> <a href="" style="color: #4ea2bf">新品</a></br> <a href="" style="color: #4ea2bf">即将推出</a></br> <a href="" style="color: #4ea2bf">优惠</a></br> <a href="" style="color: #4ea2bf">虚拟实现</a></br> <a href="" style="color: #4ea2bf">支持Steam控制器</a></br> </br>
			<h4 style="color: #a9b6b6">
				按类型浏览</br>
			</h4>
			<a href="" style="color: #4ea2bf">免费游玩</a></br> <a href="" style="color: #4ea2bf">抢先体验</a></br> <a href="" style="color: #4ea2bf">休闲</a></br> <a href="" style="color: #4ea2bf">体育</a></br> <a href="" style="color: #4ea2bf">冒险</a></br> <a href="" style="color: #4ea2bf">动作</a></br> <a href="" style="color: #4ea2bf">大型多人在线</a></br> <a href="" style="color: #4ea2bf">模拟</a></br> <a href="" style="color: #4ea2bf">独立</a></br> <a href="" style="color: #4ea2bf">竞速</a></br> <a href="" style="color: #4ea2bf">策略</a></br> <a href="" style="color: #4ea2bf">角色扮演</a></br>
		</div>
		<!-- 轮播和三角号-->
		<div class="sanjiao" >
			<img class="jianhao you" src="../images/you.png " width="15" height="28" > <img class="jianhao zuo" src="../images/zuo.png" width="15" height="28" > <img name="lunbo" id="" class="jianhao shangpin" src="../images/zuo.png" width="500" height="300"> <span class="dahei"><h3 id="lunboming">Devil May Cry 5-D e l u x e E d i t io n</h3>

			<c:forEach items="${commoditySelect}" var="item" begin="0" end="7" varStatus="status">
					<div class="lunbozu shangpin">
						<input class="lunbotu" type="text" hidden="true" id="${status.index}" value="${item.coverPicture}"> <input class="lunboming" type="text" hidden="true" value="${item.name}"> <input class="lunbojiage shangpin" type="text" hidden="true" value="￥${item.money}">
					</div>
			</c:forEach>

				<h5>现已推出</h5>
				<h6>热销商品</h6>
				<div class="baise">
					<!--白色透明-->
				</div> </span>
			<div class="zuobiant" ></div>
			<div class="youbiant"></div>
		</div>
		<!-- 透明轮播球-->
		<div class="qiuqiu">
			<div name="xiaoqiu" class="one"></div>
			<div name="xiaoqiu" class="two"></div>
			<div name="xiaoqiu" class="three"></div>
			<div name="xiaoqiu" class="four"></div>
			<div name="xiaoqiu" class="five"></div>
			<div name="xiaoqiu" class="six"></div>
			<div name="xiaoqiu" class="seven"></div>
			<div name="xiaoqiu" class="eight"></div>
		</div>
		<!-- 精选和推荐-->
		<div class="wenzi">
			<h3>精选和推荐</h3>
		</div>
		<!--新品发售-->
		<div class="xl">
			<div class="xinpin">
				<h3>新品发售</h3>
			</div>
			<div class="liulan">
				<h3>
					<a href="" style="color: white">浏览所有</a>
				</h3>
			</div>
		</div>
		<!--轮播下部分-->
		<div class="xialunbo">
			<!--复轮播-->
			<!-- <div class="fulunbo">

				<div class="da1 da">
					<img src="../testimages/da01.png" width="230px" height="230px">
				</div>
				<div class="da2 da">
					<img src="../testimages/da02.png" width="230px" height="230px">
				</div>
				<div class="da3 da">
					<img src="../testimages/da03.png" width="230px" height="230px">
				</div>
			</div> -->
			<div class="fulunbo">
				<c:forEach items="${commoditySelect}" var="item" begin="8" end="10" varStatus="status">
					<div class="da${status.index-7} da shangpin" id="${status.index}">
						<img src="../shoppicture/${item.coverPicture}" width="230px" height="230px">
					</div>
				</c:forEach>

			</div>
			<!--复轮播蓝色条和文字-->
			<div class="datiao">
				<!-- <div class="dt1 dt">
					<span class="time"></br>周三上午十点（太平洋时间。）</span></br> </br> <span class="money">￥356</span>
				</div>

				<div class="dt3 dt">
					<span class="time"></br>周三上午十点（太平洋时间。）</span></br> </br> <span class="money">￥356</span>
				</div>

				<div class="dt2 dt">
					<span class="time"></br>周三上午十点（太平洋时间。）</span></br> </br> <span class="money">￥356</span>
				</div> -->
				<c:forEach items="${commoditySelect}" var="item" begin="8" end="10" varStatus="status">
					<div class="dt${status.index-7} dt" >
						<span class="time"></br>${item.data}</span></br> </br> <span class="money">￥${item.money}</span>
					</div>
				</c:forEach>
			</div>

		</div>
		<!-- logo-->
		<div class="logo">
			<img src="../images/logo01.png" width="150px" height="120px">
		</div>
		<!-- 轮播下部分左右符号-->
		<!--<div class="fujian" >-->
		<!--<div class="zuobian"><img src="../images/zuo.png"></div>-->
		<!--<div class="youbian"><img src="../images/you.png"></div>-->
		<!--</div>-->
		<!--<div lass="touming">-->
		<!--<div class="zuobiantouming"></div>-->
		<!--<div class="youbiantouming"></div>-->
		<!--</div>-->
		<!-- 小logo-->
		<div class="lo">
			<div class="logo05">
				<img src="../images/logo05.png ">
			</div>
			<div class="logo06">
				<img src="../images/logo06.png ">
			</div>
			<div class="logo07">
				<img src="../images/logo07.png ">
			</div>
		</div>
		<!-- 绿色条-->
		<div class="lvse"></div>
		<div class="lv1"></div>
		<div class="lv2"></div>
		<div class="lv3"></div>
		<div class="lv4">
			<h5 id="price">￥365</h5>
		</div>

	</div>
<%@ include file="siwangbiaoqian.jsp" %>
</body>
<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/zhuye.js"></script>
<script src="../js/siwangbiaoqian.js"></script>
</html>
