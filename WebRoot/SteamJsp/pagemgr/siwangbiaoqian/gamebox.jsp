<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach items="${gameBoxSelect}" var="item">
<div class="wode_youximing">
	<img src="../shoppicture/${item.coverPicture}">
	<div class="wode_youxibiaoti">${item.name}</div>
</div>
</c:forEach>
