/**
 * Created by ��Ͱֱ� on 2019/3/8.
 */
//ȫ����Ʒ ��ҳ��ת
$(function(){
   $(".span1").click(function(){
	   var index = $(this).index();
	   if(index==0)
		   parent.location.href="../../CommodityInformationServlet?opr=commoditySelect&selectType=zhuye";
	   else if(index==1)
		   parent.location.href="rexiao.jsp";
	   else if(index==2)
		   parent.location.href="shoucang.jsp";
   });
});
//����
$(function(){
	$("body").on("input",".sousuo_quanbu",function(){
		var txt= $(".sousuo_quanbu").val();
		if(txt.length<1){
			$(".wudisousuokuang").hide();
		}else{
			$.post("../../CommodityInformationServlet","opr=sousuo&name="+txt,callBack);
			function callBack(data){
				if(data.length<20)
					$(".wudisousuokuang").hide();
				else
					$(".wudisousuokuang").show();
				$(".wudisousuokuang").html(data);
			}
		}
	});
//���������Ʒ
	$("body").on("click",".sousuo_game",function(){
		var commodityIndex = $(this).index();
		parent.location.href="../../CommodityInformationServlet?opr=shopSelect&commodityIndex="+commodityIndex;
	});
});