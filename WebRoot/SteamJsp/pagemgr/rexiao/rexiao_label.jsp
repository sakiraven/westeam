<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
   <!-- 缩小范围标签-->
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
    </div>
