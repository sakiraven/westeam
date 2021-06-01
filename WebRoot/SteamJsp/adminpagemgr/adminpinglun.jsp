<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="kuang">
	 <c:forEach items="${commentSelect}" var="item" varStatus="status">
		<div class="dan">
			<div>
				<span>游戏名:<span class="name">${commoditySelect[status.index]}</span>
				</span></br>
				</br>
			</div>
			<div>
				<textarea cols="30" rows="6" style="resize: none; overflow:auto" name="guanyu" readonly="true">${item.neiRong}</textarea>
				<span class="delComment">删除</span>
				<span class="commentid" hidden="true">${item.comment_Id}</span>
			</div>
		</div>
	</c:forEach>
</div>
