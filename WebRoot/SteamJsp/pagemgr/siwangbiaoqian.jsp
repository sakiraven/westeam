<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${login==null}">
	<div class="siwangbiaoqian">
		<div style="background-color: #2a3668;width: 320px;height:2px;margin: 0px ">
			<button class="login">登&nbsp;&nbsp;&nbsp;录</button>

			<button class="zhuce">注&nbsp;&nbsp;&nbsp;册</button>

			<!--  <button> 结&nbsp;&nbsp;&nbsp;算</button>
        <button class="guanggaowode"> 我&nbsp;&nbsp;&nbsp;的</button>  -->

		</div>
	</div>
</c:if>
<c:if test="${login!=null}">
	<div class="siwangbiaoqian">
		<div style="background-color: #2a3668;width: 320px;height:2px;margin: 0px ">
			<button class="guanggaohaoyou">好&nbsp;&nbsp;&nbsp;友</button>
			<button class="guanggaotongzhi">通&nbsp;&nbsp;&nbsp;知</button>
			<button class="guanggaojiesuan">结&nbsp;&nbsp;&nbsp;算</button>
			<button class="guanggaowode">我&nbsp;&nbsp;&nbsp;的</button>
			<button class="guanggaoxinxi">信&nbsp;&nbsp;&nbsp;息</button>
			<button class="guanggaozhuxiao">注&nbsp;&nbsp;&nbsp;销</button>
			<input class="userInfoId" type="text" value="${userInfo[0].user_Info_Id}" hidden="true"> <input class="aid" type="text" value="${login.aid}" hidden="true">
		</div>
	</div>
</c:if>

<div class="liaotian1" style="display:none;">
	<!-- <input class="shuru" type="">-->
	  <textarea class="shuru" id="shuru" style="OVERFLOW:hidden" maxlength="32"></textarea>
	<!-- <input type="text" class="shuru" id="shuru" maxlength="32" /> -->
	<div class="qingkong">
		<input type="button" class="qingkonganniu" value="清空">
	</div>
	<div class="fasong">
		<input type="button" class="fasonganniu" value="发送">
	</div>


	<div class="zuoneida">
		<!--  <div class="zuonei" style="overflow-y:scroll;overflow-x:visible;">
            <div class="haoyou1">
                <img src="../images/denglujiemianyoucetupian.png">
                <div class="name">测试小酱油6</div>
                <button class="shanchu">删除</button>
            </div>
            <div class="haoyou1">
                <img src="../images/denglujiemianyoucetupian.png">

                <div class="name">测试小酱油7</div>
                <button class="shanchu">删除</button>
            </div>
            <div class="haoyou1">
                <img src="../images/denglujiemianyoucetupian.png">
                <div class="name">测试小酱油8</div>
                <button class="shanchu">删除</button>
            </div>
            <div class="haoyou1">
                <img src="../images/denglujiemianyoucetupian.png">
                <div class="name">测试小酱油9</div>
                <button class="shanchu">删除</button>
            </div>
        </div> -->
	</div>
	<div class="liaotianbiaoti">
		<div class="name1"></div>
		<img class="guanbiduihua" src="../images/7456f2328fa4ed7.jpg">
	</div>
	<div class="xiaoxikuang" style="overflow-y:scroll;overflow-x:visible;">
		<!-- <div class="kehuzhenghe">
            <img class="kehutouxiang" src="../images/7456f2328fa4ed7.jpg">

            <div class="kehuduanxiaoxi">
                asdasdasadasd
            </div>
        </div>

        <div class="kehuzhenghe">
            <img class="kehutouxiang" src="../images/7456f2328fa4ed7.jpg">

            <div class="kehuduanxiaoxi">
                asdasdasadasd
            </div>
        </div>
        <div class="kehuzhenghe">
            <img class="kehutouxiang" src="../images/7456f2328fa4ed7.jpg">

            <div class="kehuduanxiaoxi">
                asdasdasadasd
            </div>
        </div>
        <div class="kehuzhenghe">
            <img class="kehutouxiang" src="../images/7456f2328fa4ed7.jpg">

            <div class="kehuduanxiaoxi">
                asdasdasadasd
            </div>
        </div>
        <div class="ziyongzhenghe">
            <img class="ziyongtouxiang" src="../images/7456f2328fa4ed7.jpg">

            <div class="ziyongduanxiaoxi">
                asdasdasadasdasdasdasadasdasdasd
            </div>
        </div>
        <div class="kehuzhenghe">
            <img class="kehutouxiang" src="../images/7456f2328fa4ed7.jpg">

            <div class="kehuduanxiaoxi">
                asdasdasadasd
            </div>
        </div>

        <div class="ziyongzhenghe">
            <img class="ziyongtouxiang" src="../images/7456f2328fa4ed7.jpg">

            <div class="ziyongduanxiaoxi">
                asdas
            </div>
        </div>
        <div class="kehuzhenghe">
            <img class="kehutouxiang" src="../images/7456f2328fa4ed7.jpg">

            <div class="kehuduanxiaoxi">
                asdasdasadasd
            </div>
        </div> -->
	</div>
</div>
<div class="tongzhi" style="display:none;">
	<div class="tongzhiyoushang">
		<div class="tongzhiyoushangzhenghe"></div>
		<img class="tongzhiguanbi" src="../images/7456f2328fa4ed7.jpg">
	</div>
	<div class="tongzhizuonei">
		<!-- <div class="zuonei" style="overflow-y:scroll;overflow-x:visible;">
			<div class="xiaoxibiaoti">
				<div class="xiaoximing">啊师傅函1</div>
				<img class="tongzhibiaotiguanbi" src="../images/7456f2328fa4ed7.jpg" />
				<button class="tongzhianniu"></button>
			</div>
			<div class="xiaoxibiaoti">
				<div class="xiaoximing">啊师傅函2</div>
				<img class="tongzhibiaotiguanbi" src="../images/7456f2328fa4ed7.jpg" />
				<button class="tongzhianniu"></button>
			</div>
			<div class="xiaoxibiaoti">
				<div class="xiaoximing">啊师傅函3</div>
				<img class="tongzhibiaotiguanbi" src="../images/7456f2328fa4ed7.jpg" />
				<button class="tongzhianniu"></button>
			</div>
		</div> -->
	</div>
	<div class="tongzhiyounei" style="overflow-y:scroll;overflow-x:visible;">
		<!-- 空能力是否及时发送看风景ask发觉是否式防空能力是否及时发送看风景ask发觉是否式防空能力是否及时发送看风景ask发觉是否式防空能力是否及时发送看风景ask发觉是否式防空能力是否及时发送看风景ask发觉是否式防空能力是否及时发送看风景ask发觉是否式防空能力是否及时发送看风景ask发觉是否式防空能力是否及时发送看风景ask发觉是否式防空能力是否及时发送看风景ask发觉是否
		<button class="jieshouhaoyouqingqiu">添加</button> -->
	</div>
</div>
<div class="benrenyouxi" hidden="true" style="display:none;">
	<div class="wodebiaoti">
		我的游戏 <img class="wode_guanbi" src="../images/7456f2328fa4ed7.jpg">

	</div>
 	<div class="youxikuang" style="overflow-y:scroll;overflow-x:visible;">
		<!-- <div class="wode_youximing">
			<img src="../images/denglujiemianyoucetupian.png">

			<div class="wode_youxibiaoti">Devil May Cry 5 - Deluxe Edition</div>
		</div> -->
	</div>
</div>
