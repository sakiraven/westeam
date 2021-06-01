$(function(){
	window.onload=rs;
	//*************************加载
	function rs(){
		var userInfoId = $(".userInfoId").val();
		var strBuyCar = getCookie(userInfoId+"BuyCar");
		var arr = strBuyCar.split("~0_0~");
		var temp = "";
		
		var html1="<div class=\"yitiao\"><div class=\"tu\"><div class=\"tupian\">";
		var htmlPicture="";
		var html3="<span><span class=\"wenzi\">";
		var htmlName="";
		var html5="</span></span><span>";
		var htmlPrice="";
		var htmlDel ="";
		var html7="</span></br></br></div><div class=\"shui\"><div class=\"shuiping\"></div></div></div></div>";
		var html ="";
		$(".zongtiao").html("");
		for ( var i = 0; i < arr.length; i++) {
			var arrOne = arr[i].split("+");
			for(var j=0;j<arrOne.length;j++){
				var temp = arrOne[j].split("!^_^!");
				if(temp[0]=="name")
					htmlName="<a href=\"javascript:;\">"+temp[1]+"</a>";
				if(temp[0]=="ciid")
					htmlDel="<a href=\"javascript:;\" id=\""+temp[1]+"\" class=\"yichu\">移除</a>";
				if(temp[0]=="picture")
					htmlPicture="<img src='"+temp[1]+"'>";
				if(temp[0]=="price")
					htmlPrice="<span class=\"jiage\">￥<span class=\"price\">"+temp[1]+"</span></span>";
			}
			
			html = html1+htmlPicture+html3+htmlName+html5+htmlPrice+htmlDel+html7+html;
		}
		$(".zongtiao").html("");
		$(".zongtiao").html(html);
		
		 balance();
	}
	//*******计价
	function balance(){
		var total =0;
		$(".price").each(function(){
			total+=parseInt($(this).text());
			$(".total").html(total);
		});
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
	//**************************************移除
	$(".zongtiao").on("click",".yichu",function(){
		var delIndex =$(this).parent().parent().parent().parent().index();
		var length = $(".yitiao").length;
		var userInfoId = $(".userInfoId").val();
		var strBuyCar = getCookie(userInfoId+"BuyCar");
		var arr = strBuyCar.split("~0_0~");
		//alert(length-delIndex-1)
		//alert(arr[length-delIndex-1])
		var BuyCar="";
		//alert(length-delIndex)
		for ( var i = 0; i < arr.length; i++) {
			if(i==length-delIndex-1)
				continue;
			if(BuyCar!="")
				BuyCar+="~0_0~"
			BuyCar+=arr[i]
			alert(arr[i])
		}
		//.split("~0_0~").length
		//alert(userInfoId+"BuyCar")
		
		//****保存cookie
		var date = new Date();
		//alert(date.getDate())
		date.setDate(date.getDate()+5)
		document.cookie = userInfoId+"BuyCar="+BuyCar+";expires="+date.toString();
		//****删除元素
		$(".yitiao:eq("+delIndex+")").remove();
		balance();
	});
	//*********************************购买
	$(".anniu").on("click",function(){
		var ciid =  new Array();
		var userInfoId = $(".userInfoId").val();
		var total = parseInt($(".total").text());
		var balance = $(".ninde").attr("id");
		if(isNaN(total)){
			alert("购物车为空")
			return;
		}
		if(balance<total){
			alert("当前余额为"+balance+"--余额不足请充值");
			return;
		}
		$(".yichu").each(function(){
			ciid.push($(this).attr("id"));
		});
		$.post("../../UserGamesServlet","opr=gameBuy&ciid="+ciid+"&userInfoId="+userInfoId+"&total="+total,callBack);
		function callBack(data){
			if(data>0){
				alert("购物成功,余额为"+data)
				var date = new Date();
				//alert(date.getDate())
				date.setDate(date.getDate()+5);
				document.cookie = userInfoId+"BuyCar="+";expires="+date.toString();
				$(".ninde").attr("id",data);
				$(".yitiao").remove();
				$(".total").html("");
			}
		}
	});
});





