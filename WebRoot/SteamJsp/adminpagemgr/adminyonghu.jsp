<%@page import="cn.entity.UserInformation"%>
<%@page import="cn.entity.Account"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="yonghukuang">
	<%
		List<Account> getlt = (List<Account>) session
				.getAttribute("accountSelect");
			List<UserInformation> getltUser= (List<UserInformation>) session
				.getAttribute("userInfoSelect");
		String key = (String) session.getAttribute("key");
		int okey = 0;
		if (key != null)
			okey = Integer.parseInt(key);
	%>
	<form>
		用户名:<input type="text" name="yonghu" disabled="true" value="<%=getlt.get(okey).getName()%>"/><br />
		<br /> 密&nbsp;&nbsp;&nbsp;码:<input type="text" name="mima" disabled="true" value="<%=getlt.get(okey).getPassword()%>"/><br />
		 <br /> 昵&nbsp;&nbsp;&nbsp;称:<input type="text" name="nicheng" disabled="true" value="<%=getltUser.get(okey).getNickName() %>"/><br />
		<br />
		<!--    头&nbsp;&nbsp;&nbsp;像:<input hidden="true" type="text" name="touxiang" disabled="true"> -->
		<br />
		<br />
		<br /> <span class="yonghuanniu"><input type="button" value="删除">
		</span>
	</form>
</div>
