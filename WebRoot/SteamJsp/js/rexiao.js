//进入商品
$(function(){
	$(".liebiao").on("click",".liebiao1",function(){
		var commodityIndex=$(this).index();
		location.href="../../CommodityInformationServlet?opr=shopSelect&commodityIndex="+commodityIndex;
	});
});
//上下页
$(function(){
	var pageIndex=0;
	$("body").on("click","#xia",function(){
	pageIndex=parseInt($(this).attr("name"))+1;
		huanye();
	});
	$("body").on("click","#shang",function(){
	pageIndex=parseInt($(this).attr("name"))-1;
	huanye();
	});
	//换页
	function huanye(){
		var pageType= parseInt($("#xia").val());
		if(window.isNaN(pageType))
			pageType=parseInt($("#shang").val());
		var name = $(".wupinsousuo").val();
		if(pageType==0)
			$.post("../../CommodityInformationServlet","opr=commoditySelect&selectType=hotNext&pageIndex="+pageIndex,callBack);
		if(pageType==1){
			var chks=$("input:checked");
			var arrayObj = "";
			if(chks.length!=0){
				chks.each(function(i,input){
					arrayObj=arrayObj+$(this).val();
					if(chks.length!=i+1)
					arrayObj=arrayObj+",";
				});
			$.post("../../CommodityInformationServlet","opr=commodityType&typeId="+arrayObj+"&key=1&name="+name+"&pageIndex="+pageIndex,callBack);
			}
		}
		if(pageType==2){
			$.post("../../CommodityInformationServlet","opr=commodityType&typeId="+arrayObj+"&key=2&name="+name+"&pageIndex="+pageIndex,callBack);
		}
		
		function callBack(data){
			$(".liebiaoshuju").load("rexiao/rexiao.jsp");
		}	
	}
});
//类型筛选
$(function(){
	
	$("body").on("click",".type",function(){
		var chks=$("input:checked")
		var arrayObj = "";
		if(chks.length!=0){
			chks.each(function(i,input){
				arrayObj=arrayObj+$(this).val();
				if(chks.length!=i+1)
				arrayObj=arrayObj+",";
			});
			
			$.post("../../CommodityInformationServlet","opr=commodityType&typeId="+arrayObj+"&key=0",callBack);
			function callBack(data){
					$(".liebiaoshuju").load("rexiao/rexiao.jsp");
			}	
		}else {
			$.post("../../CommodityInformationServlet","opr=commoditySelect&selectType=hot&pageIndex=0",callBack);
			function callBack(data){
				$(".liebiaoshuju").load("rexiao/rexiao.jsp");
			}
		}
	});
	//搜索按钮
	$("body").on("click","#anniu",function(){
		/*if($(".wupinsousuo").val().length==0)
			return;*/
		var chks=$("input:checked")
		var arrayObj = "";
		if(chks.length!=0){
			chks.each(function(i,input){
				arrayObj=arrayObj+$(this).val();
				if(chks.length!=i+1)
				arrayObj=arrayObj+",";
			});
			var name = $(".wupinsousuo").val();
			$.post("../../CommodityInformationServlet","opr=commodityType&typeId="+arrayObj+"&key=1&name="+name,callBack);
			function callBack(data){
					$(".liebiaoshuju").load("rexiao/rexiao.jsp");
			}	
		}else{
			var name = $(".wupinsousuo").val();
			$.post("../../CommodityInformationServlet","opr=commodityType&typeId="+arrayObj+"&key=2&name="+name,callBack);
			function callBack(data){
				$(".liebiaoshuju").load("rexiao/rexiao.jsp");
			}	
		}
	});
});
//刷新
$(function(){
	window.onload=rs;
	function rs(){
		$.post("../../CommodityInformationServlet","opr=remove",callBack);
		function callBack(data){
			$.post("../../CommodityInformationServlet","opr=commoditySelect&selectType=hotNext&pageIndex=0",callBackList)
			function callBackList(data){
				$(".liebiaoshuju").html(data);
				$(".labelAll").load("rexiao/rexiao_label.jsp");
			}
		}
		
	}
});







