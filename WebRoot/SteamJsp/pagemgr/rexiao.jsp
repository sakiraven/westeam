<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%-- <c:if test="${commoditySelect==null}">
	<script>
		location.href="../../CommodityInformationServlet?opr=commoditySelect&selectType=hot";
	</script>
</c:if>
 --%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <!--引入css样式需要改名字-->
    <link rel="stylesheet" href="../css/rexiao.css">
    <link rel="stylesheet" href="../css/siwangbiaoqian.css">
    <link rel="stylesheet" href="../css/friend.css">
    <link rel="stylesheet" href="../css/tongzhi.css">

</head>
<!--默认-->


<iframe src="daohang.jsp" style=" position: absolute;z-index: 100;" id="rexiaobug"  scrolling="no" frameborder="0" width="1005px" height="330px"></iframe>
<body style="background-color:  rgb(27,40,56);">
<!--body代码全部写在 bodayall里面-->
<div class="biaoti">全部商品</div>

<div class="bodayall">
    <!-- 下部搜索栏-->

    <div class="sousuo">
        <p>


            <input class="wupinsousuo" name="sousuo" type="text" placeholder="请输入搜索词或标签">
            <button id="anniu" name="anniu">搜索</button>
            <span class="paixubiaoqian">排序依据</span>
            <select id="xiala">
                <option value="0" id="xiala0">相关性</option>
                <option value="1" id="xiala1">发行日期</option>
                <option value="2" id="xiala2">名称</option>
                <option value="3" id="xiala3">价格从低到高</option>
                <option value="4" id="xiala4">价格从高到低</option>
                <option value="5" id="xiala5">用户评测</option>
            </select>

        </p>

    </div>
 <div class="labelAll">
   <%--  <!-- 缩小范围标签-->
    <div class="suoxiaofanwei">
        <p class="label1" style="background-color: #323e4c">
            <label id="label-fanwei">&nbsp;&nbsp;以标签缩小范围</label>
        </p>
        <!-- 缩小范围内部-->
        <div class="suoxiaofanweinei">
            <form>
                <!--<input type="checkbox"> 独立动作冒险休闲-->
                <c:forEach items="${typeSelect}" var="item" begin="0" end="4">
                <p>&nbsp;&nbsp;<input type="checkbox" value="${item.type_Id}" class="type">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item.type}<br></p>
				</c:forEach>
            </form>
        </div>
    </div>
    <!--显示已选类型-->
    <div class="yixuanleixing">
        <p class="label2" style="background-color: #323e4c">
            <label id="label-fanwei2">&nbsp;&nbsp;显示已选类型</label>
        </p>
        <!-- 缩小范围内部-->
        <div class="suoxiaofanweinei">
            <form>

                <c:forEach items="${typeSelect}" var="item" begin="5" end="9">
                <p>&nbsp;&nbsp;<input  value="${item.type_Id}" type="checkbox" class="type">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item.type}<br></p>
				</c:forEach>

            </form>
        </div>
    </div>
    <!--依玩家人数缩小范围-->
    <div class="wjrs">
        <p class="label2" style="background-color: #323e4c">
            <label id="label-fanwei3">&nbsp;&nbsp;显示已选类型</label>
        </p>
        <!-- 缩小范围内部-->
        <div class="suoxiaofanweinei">
            <form>
                <!--<input type="checkbox"> 独立动作冒险休闲-->
               <c:forEach items="${typeSelect}" var="item" begin="10" end="15">
                <p>&nbsp;&nbsp;<input value="${item.type_Id}"  type="checkbox" class="type">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item.type}<br></p>
				</c:forEach>
            </form>
        </div>
    </div>

    <!--依功能特色缩小范围-->
    <div class="ygnts">
        <p class="label2" style="background-color: #323e4c">
            <label id="label-fanwei4">&nbsp;&nbsp;依功能特色缩小范围</label>
        </p>
        <!-- 缩小范围内部-->
        <div class="suoxiaofanweinei">
            <form>
                <!--<input type="checkbox"> 独立动作冒险休闲-->
               <c:forEach items="${typeSelect}" var="item" begin="16" end="20">
                <p>&nbsp;&nbsp;<input  value="${item.type_Id}" type="checkbox">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item.type}<br></p>
				</c:forEach>

            </form>
        </div>
    </div> --%>
 </div>




    <div class="liebiao">
    <div class="liebiaoshuju">

<c:forEach items="${commoditySelect}" var="item">
        <div class="liebiao1">
            <div class="shuju1"><img src="../shoppicture/${item.coverPicture}"></div>
            <p>${item.name}</p><br><img class="winlogo" src="../images/${item.from}.png">
            <div class="qian">&yen;&nbsp;</div>
            <span>${item.money}</span>
        </div>
</c:forEach>

<div class="shuliang">
            <span> &nbsp; </span>
            <span> &nbsp;</span>
            <span> &nbsp;</span>
            <span>&nbsp; </span>
            <span> &nbsp; </span>
            <span> &nbsp;</span>
            <span> &nbsp;</span>
        </div>
        <div class="shangxiaye">
            <c:if test="${pageIndex>0}">
            	<button class="shang"id="shang" name="${pageIndex}" value="${pageType}"><${pageIndex}</button>
            </c:if>
            &nbsp;&nbsp;&nbsp;
             <c:if test="${fn:length(commoditySelect)==11}">
            	<button class="xia"id="xia" name="${pageIndex}" value="${pageType}">${pageIndex+2}></button>
            	</c:if>
        </div>
</div >

    </div>

</div>
<%@ include file="siwangbiaoqian.jsp" %>

<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/siwangbiaoqian.js"></script>
<script src="../js/rexiao.js"></script>
</body>
</html>
