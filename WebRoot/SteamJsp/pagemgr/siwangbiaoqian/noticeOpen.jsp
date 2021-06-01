<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
${noticeSelect[index].mgr_Message}
<c:if test="${noticeSelect[index].type==0}">
	<button class="jieshouhaoyouqingqiu" name = "${noticeSelect[index].sendUserId}" id="${noticeSelect[index].nic_Id}">添加</button>
</c:if>
