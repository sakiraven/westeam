<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${login==null}">
	<script>
		location.href="denglu.jsp";
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <!--引入css样式需要改名字-->
    <link rel="stylesheet" href="../css/gouwuche.css">
     <link rel="stylesheet" href="../css/siwangbiaoqian.css">
    <link rel="stylesheet" href="../css/friend.css">
    <link rel="stylesheet" href="../css/tongzhi.css">
</head>
<!--默认-->
<iframe src="daohang.jsp" style="  scrolling="no" frameborder="0" width="1024px" height="300px"></iframe>
<body style="background-color:  rgb(27,40,56);">
<!--body代码全部写在 bodayall里面-->
<div class="bodayall">
    <div class="admin">
        <div class="suoyou"><a href="zhuye.html" style="color: #ecd8da"><h6>所有商品</h6></a></div>
        <div class="ninde" id="${userInfo[0].blance}"><h5>> 您的购物车</h5></div>
        <div class="dazi"><h1>您的购物车</h1></div>
    </div>
    <div class="to">
        <div class="touming"></div>
    </div>
    <div class="to">
        <div class="touming1"></div>
    </div>
    <div class="zongtiao">
       <!--  <div class="yitiao">
            <div class="tu">
                <div class="tupian">
                    <img src="../images/gouwuche.png">htmlPicture
                    <span>
                    <span class="wenzi"> <a href="javascript:;">The Jackbox Party Pack 5</a>htmlName </span>
                    </span>
                    <span>
                    <span class="jiage">￥54</span>htmlPrice
                    <a href="javascript:;" class="yichu">移除</a>htmlDel
                    </span>
                    </br></br>
                </div>
                <div class="shui">
                    <div class="shuiping"></div>
                </div>
            </div>
        </div> -->
    </div>
</div>
<div class="zongdu">
    <span class="geshu">预计总额:<span class="total"></span></span>
</div>
<div class="goumai"><button class="anniu">购买</button></div>
<%@ include file="siwangbiaoqian.jsp" %>
<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/siwangbiaoqian.js"></script>
<script src="../js/gouwuche.js"></script>
</body>
</html>
