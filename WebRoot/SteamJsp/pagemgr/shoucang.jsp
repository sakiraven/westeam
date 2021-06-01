<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <!--引入css样式需要改名字-->
    <link rel="stylesheet"  href="../css/denglu_zuijingengxin.css">
      <link rel="stylesheet" href="../css/siwangbiaoqian.css">
    <link rel="stylesheet" href="../css/friend.css">
    <link rel="stylesheet" href="../css/tongzhi.css">
</head>
    <!--默认-->
<iframe src="daohang.jsp" style=" position: absolute;z-index: 100;" scrolling="no" frameborder="0" width="1024px" height="300px"></iframe>
<body style="background-color:  rgb(27,40,56);">
<!--body代码全部写在 bodayall里面-->
<div class="biaoti">
<h1 style="color:white">收藏</h1>
</div>
<!-- <div class="geshu">
    <span>第</span>
    <span>1</span>
    <span>页</span>
    <span>共</span>
    <span>1</span>
    <span>页</span>
</div> -->
<!-- <div class="lianjie">
    <a href="skldf">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <a href="skldf">下一页</a>
</div> -->
<div class="bodayall">
    <div class="kongbai">
        <img src="../testimages/111.PNG" width="374" height="278" id="nbnb" hidden="true"/>
    </div>

  <div>
  <c:forEach items="${shouCang}" var="item">
    <div class="er" >
        <div class="tupian"> <img src="../shoppicture/${item.coverPicture}" width="200" height="81"/></div>
       <div class="neirong">
           <p> ${item.name}</p>
           <p> 发售日期： ${item.data} </p>
       </div>
        <div class="jiaqian">
        </div>
    </div>
   </c:forEach>
  </div>

</div>
</body>
<%@ include file="siwangbiaoqian.jsp" %>
<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/siwangbiaoqian.js"></script>
<script src="../js/shoucang.js"></script>
</html>
