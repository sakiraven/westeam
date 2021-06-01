<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${login==null}">
	<script>
		location.href = "../pagemgr/denglu.jsp";
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title></title>
</head>
<body style="background-color: #1c2c3e">
	<iframe src="daohang.jsp"  scrolling="no" frameborder="0" width="1024px"></iframe>
	<link rel="stylesheet" href="../css/yonghuxinxi.css">
	<div>
		<form action="../../UserInformationServlet?opr=mineUpdate" method="post" enctype="multipart/form-data">
			<div class="kuang">
				<div class="touxiang">
					<img src="../userpicture/${userInfo[0].picture}">
					<p>
						<c:out value="${userInfo[0].nickName}"></c:out>
					</p>
				</div>
				<div class="jianbian"></div>
			<%-- 	<div class="neirong">
					<span class="qwer" hidden="">帐号: <input type="text" name="" value="${login.name}" /> </span></br> </br> <span class="qwer">昵称:<input type="text" name="" value="${userInfo[0].nickName}" /> </span></br> </br> <span class="qwer">密码:<input type="password" name="" value="${login.password}" /> </span></br> </br> </br>
				</div>
				<div class="jianbian"></div>
				<div class="zxc">
					<p>&nbsp;&nbsp;头像:</p> --%>
				<%-- 	<div class="tupian">
						<span class="da"><img src="../userpicture/${userInfo[0].picture}"> (200px)</span><span class="zhong"><img src="../userpicture/${userInfo[0].picture}"> &nbsp;(100px)</span><span class="xiao"><img src="../userpicture/${userInfo[0].picture}">&nbsp;&nbsp;&nbsp; (50px)</span></br> <span class="shangchuan">
						</span>
					</div> --%>
					<input type="file" id="fileP" name="file"  value="" style="position: absolute;left:500px;color:white;" >
				</div>
				<div class="jianbian"></div>
				<div class="asd">
					<div class="jine">
						<span style="color:white;">钱包余额:</span><span style="color:white;">￥ <span class="balance" style="color:white;">${userInfo[0].blance}</span>
						</span>&nbsp;&nbsp;&nbsp; <input class="jineaniu" type="button" value="前去充值"><br> <br>
					</div>
					<div class="chongzhianniu" hidden="true">
						<span hidden="true">帐&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:<input type="text"> </span><br> <br>
						 <span>充值金额:<input type="text" class="money" value="" > </span>
						<br> <br> <span class="chongzhi"><input type="button" class="chongZhi" value="确定">&nbsp;&nbsp;<input type="button" value="取消"> </span>
					</div>
					<div class="baocun">
						<span><input class="anniu1" type="submit" value="保存头像">&nbsp;&nbsp;&nbsp;<!--  <input class="anniu2" type="button" value="修改信息">  --></span>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/yonghuxinxi.js"></script>
</html>
