<%@page import="cn.entity.CommodityInformation"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="shangpinkuang">
	<form>
		<%
			List<CommodityInformation> getlt = (List<CommodityInformation>) session
					.getAttribute("commoditySelect");
			String key = (String) session.getAttribute("key");
			int okey = 0;
			if (key != null)
				okey = Integer.parseInt(key);
		%>
		<span hidden="true">封面图片:<input type="text" name="fengmian" /><input type="file" /> </span></br> </br> 商品名称:<input type="text" name="shangpin" value="<%=getlt.get(okey).getName()%>" /></br> </br> 发布日期:<input type="text" name="riqi" readonly="readonly" value="<%=getlt.get(okey).getData()%>"/></br> </br> 价&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;格:<input type="text" name="jiage" value = "<%=getlt.get(okey).getMoney()%>"></br> </br> 开&nbsp;发&nbsp;商: <input type="text" name="kaifa"  value="<%=getlt.get(okey).getKaiFa()%>"/><input type="text" value = "<%=getlt.get(okey).getCiid()%>" name="ciid" hidden="true"></br> </br> 发&nbsp;行&nbsp;商: <input type="text" name="faxing"  value="<%=getlt.get(okey).getFaXing()%>"/></br> </br> 游戏简介:
		<textarea cols="30" rows="6" style="overflow:auto " name="jianjie"> <%=getlt.get(okey).getPlayJianJie()%></textarea>
		</br> </br> 关于内容:
		<textarea cols="30" rows="6" style="overflow:auto " name="guanyu"><%=getlt.get(okey).getGuanYu()%></textarea>
		</br> </br> <!-- 玩法:<input type="checkbox" value="" name="wanfa">多人<input type="checkbox" value="" name="wanfa">单人<input type="checkbox" value="" name="wanfa">联机<input type="checkbox" value="" name="wanfa">qwe<input type="checkbox" value="" name="wanfa">qwe<input type="checkbox" value="" name="wanfa">qwe</br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="" name="wanfa">多人<input type="checkbox" value="" name="wanfa">单人<input
			type="checkbox" value="" name="wanfa">联机<input type="checkbox" value="" name="wanfa">qwe<input type="checkbox" value="" name="wanfa">qwe<input type="checkbox" value="" name="wanfa">qwe</br> 语言:<input type="checkbox" value="" name="yuyan">多人<input type="checkbox" value="" name="yuyan">单人<input type="checkbox" value="" name="yuyan">联机<input type="checkbox" value="" name="yuyan">qwe<input type="checkbox" value="" name="yuyan">qwe<input
			type="checkbox" value="" name="yuyan">qwe</br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="" name="yuyan">多人<input type="checkbox" value="" name="yuyan">单人<input type="checkbox" value="" name="yuyan">联机<input type="checkbox" value="" name="yuyan">qwe<input type="checkbox" value="" name="yuyan">qwe<input type="checkbox" value="" name="yuyan">qwe</br> 类型:<input type="checkbox" value="" name="leixing">多人<input
			type="checkbox" value="" name="leixing">单人<input type="checkbox" value="" name="leixing">联机<input type="checkbox" value="" name="leixing">qwe<input type="checkbox" value="" name="leixing">qwe<input type="checkbox" value="" name="leixing">qwe</br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="多人" name="leixing">多人<input type="checkbox" value="单人" name="leixing">单人<input type="checkbox" value="联机" name="leixing">联机<input
			type="checkbox" value="" name="leixing">qwe<input type="checkbox" value="" name="leixing">qwe<input type="checkbox" value="" name="leixing">qwe</br> </br>  --></br> <span class="shangpinanniu"><input type="button" class="del" value="删除">&nbsp;&nbsp;<input type="button" class="update"  value="修改"> </span>

	</form>
</div>
