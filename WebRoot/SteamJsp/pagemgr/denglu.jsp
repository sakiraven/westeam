<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <c:if test="${login!=null}">
	<script>
		alert("请先退出再登陆");
		location.href="zhuye.jsp";
	</script>
</c:if>  --%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../css/denglu_zuijingengxin.css">
</head>
<iframe src="daohang.jsp" style=" position: absolute;z-index: 100;" scrolling="no" frameborder="0" width="1005px" height="300px"></iframe>
<body style="background-color:  rgb(27,40,56);">
<div class="timu">

    <div class="lianggekuang">

        <!--左一-->
        <div class="denglu">
        <form>
            <h1 class="shangbiaoti">登录</h1>

            <p>steam账户名称</p>
            <input class="wenben" id="username" type="text" name="userName" placeholder="请输入用户名"/>

            <p>

            <p> 密 &nbsp; 码</p>
            <input class="wenben" id="password" type="password" name="psw" placeholder="请输入密码"/>
            </p>

            <input class="anniu" type="button" id="dee" name="butReset" value="登陆"/>
            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            <input onclick="window.open('../pagemgr/zhuce.jsp','_self')" class="anniu" id="anniu2" type="button" name="butButton" value="加入steam"/>
            </form>
        </div>


        <!-- 左二-->
        <div class="wenzi">
            <p class="shangbiaoti">创建</p></br>

            <p>一个新的免费账户</p></br>

            <p>欢迎免费加入轻松使用，继续创建</p></br>

            <p> Stean账户并获取Steam,适合PC和</p></br>

            <p> Mac玩家的前沿5数字解决方案</p>
        </div>
    </div>
    <div class="gebi">
        <h4 class="shangbiaoti">为什么加入STEAM?</h4></br>
        <br>
        <ul>
            <li>购买和下载完整零售游戏</li>
            <li>加入Steam社区</li>
            <li>游戏时与好友聊天</li>
            <li>在任何电脑上都能玩</li>
            <li>安排游戏，比赛或LAN聚会</li>
            <li>获取自动游戏更新以及更多</li></br>

        </ul>
        <img class="youxiatu" src="../images/denglujiemianyoucetupian.png">
    </div>
    <a href="" class="wangji">忘记您的密码？</a>
    <a href="" class="liaojie">了解更多 steam 相关信息</a>
</div>
<!--<div style="width: 500px;height: 500px;background-color: #009966;position: absolute;top: 0px ;left: 200px">-->
    <!--<div style="width: 40px;height:40px;background-color: #8c091c;position: relative;top: 0px ;left: 200px"></div>-->
</div>
</body>

 <script  src="../js/jquery-1.12.4.js"></script>
<script  src="../js/denglu.js"></script>
</html>
