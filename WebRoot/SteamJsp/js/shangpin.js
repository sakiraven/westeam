$(function () {
	$(".zhanshi").attr("src",$(".tugg:eq(0)").attr("src"));
	$(".tug:eq(0)").css({"border": "1px solid white"});
    $(".tug").click(function () {
        $(".zhanshi").attr("src", $(this).find("img:eq(0)").attr("src"));
        $(this).siblings().css({"border": "none"});
        $(this).css({"border": "1px solid white"});
    });
    $(".zuoanniu").click(function(){
        $(".zhanshi").attr("src", $(this).find("img:eq(index)x").attr("src"));
        $(this).siblings().css({"border": "none"});
        $(this).css({"border": "1px solid white"});
    });
    
});
//*******************************查看月份评论
$(function(){
	$("body").on("click",".ctMonth",function(){
		var ctMonth = $(this).index()+1;
		var ciid = $(".ciid").attr("id");
		var type = -1;
		if(ctMonth%2!=0){
			type=1;
			ctMonth=(ctMonth+1)/2;
		}else{
			type=0;
			ctMonth=ctMonth/2;
		}
		$.post("../../CommentServlet?opr=ctMonthSelect&ctMonth="+ctMonth+"&ciid="+ciid+"&type="+type,callBack);
		function callBack(data){
			if(data!=0||-1){
				$("#pinglun").load("comment/comment.jsp");
			}
		}
	});
});

//*********************************发表评论
$(function(){
	var type = -1;
	$("body").on("click",".haoping",function(){
		type = 1;
		pingjia();
	});
	$("body").on("click",".chaping",function(){
		type = 0;
		pingjia();
	});
	function pingjia(){
		var userInfoId = $(".userInfoId").val();
		if(isNaN(userInfoId)){
			alert("请登录并购买");
			return;
		}
		var text = $(".fabiao_pinglun").val();
		if(text.length==0){
			alert("内容不能为空");
		}else{
			var ciid = $(".ciid").attr("id");
			var userId = $(".userInfoId").val();
			$.post("../../CommentServlet","opr=commentSend&text="+text+"&ciid="+ciid+"&userId="+userId+"&type="+type,callBack);
			function callBack(data){
				if(data==-2){
					alert("请先购买游戏");
				}else if(data==0){
					alert("无法重复评论");
				}else{
					$("#pinglun").load("comment/comment.jsp");
				}
			}
		}
	}
});
//商品购买
$(function(){
	$(".tianjiagouwuche").click(function(){
		var ciid = $(".ciid").attr("id");
		var userInfoId = $(".userInfoId").val();
		if(userInfoId==null||userInfoId==""||userInfoId.length==0||userInfoId==null){
			alert("请登陆后添加购物车")
			return;
		}
		$.post("../../UserGamesServlet","opr=buyCarRe&ciid="+ciid,callBackRe);
		function callBackRe(data){
			if(data>0){
				alert("游戏库已存在")
				return;
			}else
				buyCar();
			
		}
		function buyCar(){
			
			//var ciid = $(".ciid").attr("id");
			var name = $(".biaoti").text();
			var picture=$(".fengmian").attr("src");
			var price =  $(".price").text();
			var strBuyCar = getCookie(userInfoId+"BuyCar");
			var arr = strBuyCar.split("~0_0~");
			var result = 0;
			var temp = "";
			
			for ( var i = 0; i < arr.length; i++) {
				var arrOne = arr[i].split("+");
				for(var j=0;j<arrOne.length;j++){
					var temp = arrOne[j].split("!^_^!");
					//alert(temp[1])
					if(temp[0]!="ciid")
						continue;
					if(temp[1]==ciid){
						result = -1;
						break;
					}
					if(result==-1)
						break;
				}
			}
			if(result==-1){
				alert("无法添加购物车 已存在")
			}else{
				if(!(strBuyCar==null||strBuyCar==""||strBuyCar.length==0||strBuyCar==null)){
					strBuyCar+="~0_0~"
				}
				strBuyCar +="name!^_^!"+name+"+ciid!^_^!"+ciid+"+picture!^_^!"+picture+"+price!^_^!"+price;
				cookieSava(userInfoId+"BuyCar",strBuyCar,5);
				alert("已添加至购物车")
			}
		}
	});
	//保存cookie
	function cookieSava(cookieName,cookieValue,cookieDates){
		var date = new Date();
		date.setDate(date.getDate()+cookieDates);
		document.cookie = cookieName+"="+cookieValue+";expires="+date.toString();
	}
	//获取cookie
	function getCookie(cookieName){
		var cookieStr = unescape(document.cookie);
		var arr = cookieStr.split(";");
		var cookieValue = "";
		for(var i=0;i<arr.length;i++){
			var temp = arr[i].split("=");
			if($.trim(temp[0])==cookieName){
				cookieValue = temp[1];
				break;
			}
		}
		return cookieValue;
	}
	//*****************************************收藏
	$(".shouCang").click(function(){
	/*	var shoucang = getCookie("shoucang");
		if(shoucang!=null&&shoucang!=""&&shoucang.length!=0&&shoucang!=null)
			shoucang+="&s&";
		var name = $(".biaoti").text();
		var picture=$(".fengmian").attr("src");
		var price =  $(".price").text();*/
		var userInfoId = $(".userInfoId").val();
		var ciid = $(".ciid").attr("id");
		var index = $(".ciid").attr("name");
		$.post("../../CommodityInformationServlet","opr=shoucang&commodityIndex="+index,callBack);
		function callBack(data){
			if(data>0)
				alert("收藏成功");
				else
				alert("已经收藏");
		}
	});
});













