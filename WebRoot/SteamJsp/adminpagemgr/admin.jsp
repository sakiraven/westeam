<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link rel="stylesheet" href="../css/admincss.css">
<body class="qwer">

	<div class="zhengti">
		<div class="biaoti">
			<img src="../images/logo_steam.png">
		</div>
		<div class="sousuo">
			<span hidden="true"><input type="text" /><img class="tupian" src="../images/search_icon_btn.png">
			</span>
		</div>
		<div class="guanli">
			<div class="biaoqian">
				<span class="biaoqian_span">用户标签</span> <span class="biaoqian_span">商品信息标签</span> <span class="biaoqian_span">其他标签</span>
			</div>
			<div class="biaoqianxianshi"></div>
		</div>
		<div class="xianshi"></div>
	</div>
</body>
<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/admin.js"></script>
</html>
