<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:forEach items="${commoditySelect}" var="item">
        <div class="liebiao1">
            <div class="shuju1"><img src="../shoppicture/${item.coverPicture}"></div>
            <p>${item.name}</p><br><img class="winlogo" src="../images/${item.from}.png">
            <div class="qian">&yen;&nbsp;</div>
            <span>${item.money}</span>
        </div>
</c:forEach>
<div class="shuliang" >
            <span>&nbsp; </span>
            <span>&nbsp; </span>
            <span> &nbsp;</span>
            <span>&nbsp; </span>
            <span> &nbsp;</span>
            <span> &nbsp;</span>
            <span> &nbsp;</span>
        </div>
        <div class="shangxiaye">
            <c:if test="${pageIndex>0}">
            	<button class="shang"id="shang" name="${pageIndex}" value="${pageType}"><${pageIndex}</button>
            </c:if>
            ${pageIndex+1}
            <c:if test="${fn:length(commoditySelect)==11}">
           		 &nbsp;<button class="xia"id="xia" name="${pageIndex}" value="${pageType}">${pageIndex+2}></button>
            </c:if>
        </div>
