$(function(){
	$(".jineaniu").click(function (){
		$(".chongzhianniu").toggle();
	});
	$("form").submit(function(){
		if($("#fileP").val().length==0){
			alert("请选择图片")
			return false;
		}
	});
	$(".chongZhi").click(function(){
		var money = $.trim($(".money").val());
		if(money%1!=0||money.length==0||money<0||money.length>=6){
			alert("请输入6位以内正整数")
		}else{
			$.post("../../UserInformationServlet","opr=userInfoUpdate&key=1&money="+money,callBack);
			function callBack(data){
				$(".balance").text(data);
			}
		}
			
	});
});