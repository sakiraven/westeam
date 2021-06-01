<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form  class="biaoqiankuang">
    <div class="biaoqianzhengti">
         <p>标签:</p>
         <c:forEach items="${typeSelect}" var="item" varStatus="status">
        	<span><input type="checkbox" class="check" value="${item.type_Id}"><input class="wenben" type="text" name="" disabled="disabled" value="${item.type}"/></span>
        </c:forEach>

        <br/><br/><br/>
        <span>添加标签:<input type="text" class="addLabel"/></span>
        <br/><br/><br/>
        <span class="buutonAll">
        <input type="button" value="保存" class="typeSave"/>
         <input type="button" value="修改" class="typeUpdate"/>
         <input type="button" value="删除" class="typeDel"/>
         </span>
    </div>
</form>

