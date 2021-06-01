/**
 * Created by Administrator on 2019/3/8 0008.
 */
$(document).ready(
		function() {
			// 实现左侧选择栏代码
			$("#xuanzelan a").mouseover(function() {

				$(this).css("color", "white");
				var index = $("#xuanzelan a").index(this).show();
			});
			$("#xuanzelan a").mouseout(function() {
				$(this).css("color", "#4ea2bf");
				var index = $("#xuanzelan a").index(this).hide();
			});
			// 实现轮播下部分鼠标悬停图片放大
			$(".da").hover(
					function() {
						$(this).css("border", "3px solid #c8f5fc");
						$(".dt:eq(" + $(this).index() + ")").css("border",
								"3px solid #c8f5fc");
					},
					function() {
						$(this).css("border", "none");
						$(".dt:eq(" + $(this).index() + ")").css("border",
								"none");
					});
			// 鼠标悬停变色
			$(".liulan a  ").hover(function() {
				$(".liulan").addClass("liulan_xuanting");
			}, function() {
				$(".liulan").removeClass("liulan_xuanting");
				$(".liulan").addClass("liulan");
			});
			// 轮播
			$(".one").css("background", "none");
			$(".one").css("background", "rgba(218, 236, 251, 0.7)");
			// var name = '${indexGo[0].name}';
			// alert(name);

			var index = 0;
			initLunBo(index);// 初始化轮播
			$(".youbiant").click(function() {
				
						$("div[name=xiaoqiu]:eq(" + index + ")").css(
								"background", "none");
						$("div[name=xiaoqiu]:eq(" + index + ")").css(
								"background", "rgba(73, 98, 116, 0.7)");
						
						++index;
						

						if (index == $("div[name=xiaoqiu]").size() ) {
							index = 0;
						}
						$("div[name=xiaoqiu]:eq(" + index + ")").css(
								"background", "none");
						$("div[name=xiaoqiu]:eq(" + index + ")").css(
								"background", "rgba(218, 236, 251, 0.7)");
						initLunBo(index);
						
					});
//定时器
			 var timmer = setInterval(function() {
					$("div[name=xiaoqiu]:eq(" + index + ")").css(
							"background", "none");
					$("div[name=xiaoqiu]:eq(" + index + ")").css(
							"background", "rgba(73, 98, 116, 0.7)");
					
					++index;
					

					if (index == $("div[name=xiaoqiu]").size() ) {
						index = 0;
					}
					$("div[name=xiaoqiu]:eq(" + index + ")").css(
							"background", "none");
					$("div[name=xiaoqiu]:eq(" + index + ")").css(
							"background", "rgba(218, 236, 251, 0.7)");
					initLunBo(index);
				},3000);
//左按钮单击
			$(".zuobiant").click(
					function() {
						
						$("div[name=xiaoqiu]:eq(" + index + ")").css(
								"background", "none");
						$("div[name=xiaoqiu]:eq(" + index + ")").css(
								"background", "rgba(73, 98, 116, 0.7)");
						--index;
						$("div[name=xiaoqiu]:eq(" + index + ")").css(
								"background", "none");
						$("div[name=xiaoqiu]:eq(" + index + ")").css(
								"background", "rgba(218, 236, 251, 0.7)");
						if (index == -1) {
							index = $("div[name=xiaoqiu]").size() - 1;
							$("div[name=xiaoqiu]:eq(0)").css("background",
									"none");
							$("div[name=xiaoqiu]:eq(0)").css("background",
									"rgba(73, 98, 116, 0.7)");
						}
						initLunBo(index);
					});
		});
//改变位置
function initLunBo(index) {
	
	var picture = $(".lunbozu:eq(" + index + ")").find(".lunbotu").val();
	var name = $(".lunbozu:eq(" + index + ")").find(".lunboming").val();
	var price = $(".lunbozu:eq(" + index + ")").find(".lunbojiage").val();
	var id = $(".lunbozu:eq(" + index + ")").find(".lunbotu").attr("id");
	$("img[name=lunbo]").attr("src", "../shoppicture/" + picture);
	$("img[name=lunbo]").attr("id", id);
	$("#lunboming").html(name);
	$("#price").html(price);
}
//**************************************************进入商品详情
$(function(){
	$("body").on("click",".shangpin",function(){
		var index = $(this).attr("id");
		location.href="../../CommodityInformationServlet?opr=shopSelect&commodityIndex="+index;
	});
});
//刷新
$(function(){
	window.onload=rs;
	function rs(){
		$.post("../../CommodityInformationServlet","opr=commoditySelect&selectType=123&pageIndex=0",callBackList);
		function callBackList(data){
		}
	}
});
