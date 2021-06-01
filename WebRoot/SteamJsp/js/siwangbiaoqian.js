
$(function() {
	var tio = 0;
	tio = parseInt($(".siwangbiaoqian").css("top"));
	$(window).scroll(function() {
		var scroTop = parseInt($(this).scrollTop());
		$(".siwangbiaoqian").offset({
			top : scroTop + tio
		});
	});
});

$(function() {
	var tio = 0;
	tio = parseInt($(".liaotian1").css("top"));
	$(window).scroll(function() {
		var scroTop = parseInt($(this).scrollTop());
		$(".liaotian1").offset({
			top : scroTop + tio
		});

	});
});
$(function() {
	var tio = 0;
	tio = parseInt($(".tongzhi").css("top"));
	$(window).scroll(function() {
		var scroTop = parseInt($(this).scrollTop());
		$(".tongzhi").offset({
			top : scroTop + tio
		});

	});
});

$(function() {
	var tio = 0;
	tio = parseInt($(".benrenyouxi").css("top"));
	$(window).scroll(function() {
		var scroTop = parseInt($(this).scrollTop());
		$(".benrenyouxi").offset({
			top : scroTop + tio
		});

	});
});

$(function() {
	$(".span1").hover(function() {
		$(".daohang_zhankai_1:eq(" + $(this).index() + ")").show();
	}, function() {
		$(".daohang_zhankai_1:eq(" + $(this).index() + ")").hide();
	});
});
//****************************************************好友
$(function() {
	//var mineId = -1;
	var mineId = mineId = $(".userInfoId").val();
	var friendId = -1;
	var friendIndex=0;
	// 好友窗体展示隐藏
	$(".guanggaohaoyou").click(function() {
		$(".liaotian1").toggle();
		// 好友刷新
		if($(".liaotian1").is(":visible"))
			friend();
	});
	// 刷新左侧好友窗体
	function friend() {
		//mineId = $(".userInfoId").val();
		$.post("../../UserInformationServlet", "opr=friendSelect&mineId="
				+ mineId, callBack);
		function callBack(data) {
			$(".zuoneida").load("siwangbiaoqian/friend.jsp");
		}
	}
	// 展示聊天窗体
	$(".zuoneida").on("click",".touxiang",function() {
				$(".name1").html($(this).next().text());
				friendIndex=$(this).parent().index();
				// mineId = $(".userInfoId").val();
				friendId = $(this).prev().val();
				$.post("../../MessageServlet", "opr=messageSelect&mineId="
						+ mineId + "&friendId=" + friendId+"&friendIndex="+friendIndex, callBack);
				function callBack(data) {
					if (data == 0) {
						$(".xiaoxikuang").html("");
					} else {
						$(".xiaoxikuang").load("siwangbiaoqian/message.jsp");
					}
				}
				// 好友刷新
				friend();
			});
	// 发送按钮
	$(".fasonganniu").click(function() {
				if (mineId != -1 && friendId != -1) {
					var message = $("#shuru").val();
					// alert(mineId+"-"+message+"-"+friendId)
					$.post("../../MessageServlet", "opr=messageSend&mineId="
							+ mineId + "&friendId=" + friendId + "&message="
							+ message+"&friendIndex="+friendIndex, callBack);
					function callBack(data) {
						$(".xiaoxikuang").load("siwangbiaoqian/message.jsp");
						$("#shuru").val("");
					}
				}
			});
	// 消息清空
	$(".qingkonganniu").click(function() {
				if (mineId != -1 && friendId != -1) {
					if (confirm("是否清空消息列表？", "确定", "取消") == true) {
						$.post("../../MessageServlet",
								"opr=messageDelete&mineId=" + mineId
										+ "&friendId=" + friendId+"&friendIndex="+friendIndex, callBack);
						function callBack(data) {
							$(".xiaoxikuang")
									.load("siwangbiaoqian/message.jsp");
						}
					}
				}
			});
	// 删除好友
	$(".zuoneida").on(
			"click",
			".shanchu",
			function() {
				if (confirm("确定删除" + $(this).parent().find(".name").text()
						+ "好友？", "确定", "取消") == true) {
					$.post("../../FriendServlet", "opr=friendDelete&mineId="
							+ mineId + "&friendId="
							+ $(this).parent().find(".friendId").val(),
							callBack);
					function callBack(data) {
						if (data < 0) {
							alert(data);
							alert("删除异常");
						} else {
							$(".zuoneida").load("siwangbiaoqian/friend.jsp");
							$(".xiaoxikuang").html("");
							$(".name1").html("");
							friendId = -1;
						}
					}
				}
			});
	/*
	 * //搜索框获取焦点时 $(".zuoneida").on("focus",".sousuohaoyou",function(){
	 * $(this).attr("placeholder",""); }); //所搜框失去焦点时
	 * $(".zuoneida").on("blur",".sousuohaoyou",function(){
	 * $(this).attr("placeholder","搜索好友"); });
	 */
	// 点击搜索时
	$(".zuoneida").on("click",".sousuo_tianjiahaoyou",function() {
				var userName = $(".sousuohaoyou").val();
				if (userName.length != 0) {
					$.post("../../UserInformationServlet", "opr=friendFind&userName="+ userName, callBack);
					function callBack(data) {
						if (data == 0)
							alert("未查询到匹配好友");
						else {
							$(".sousuo_haoyouliebiao").html("");
							$(".sousuo_haoyouliebiao").html(data);
						}
					}
				}
			});
	//发送好友请求 添加按钮
	$(".zuoneida").on("click",".sousuo_tianjia",function() {
		var friendAddId = $(".sousuo_tianjia").attr("name");
		$.post("../../FriendServlet", "opr=friendAdd&friendAddId="+ friendAddId+"&mineId="+mineId, callBack);
		function callBack(data) {
			if (data == 0)
				alert("已拥有对方好友，或等在好友请求");
			else if(data==-1){
				alert("无法添加自己");
			}else{
				alert("好友请求已发送");
			}
		}
	});
	//搜索框输入时隐藏搜索好友
	 $(".zuoneida").on('input',".sousuohaoyou",function(){
		 $(".sousuo_haoyouliebiao").html("");
	 });
	 //鼠标离开zuoneida时隐藏搜索好友
	 $(".zuoneida").on("mouseleave",function() {
		 $(".sousuo_haoyouliebiao").html("");
	 });
});

//****************************************************通知按钮
$(function() {
	var mineId = mineId = $(".userInfoId").val();
	$(".guanggaotongzhi").click(function() {
		var tog = $(".tongzhi").toggle();
		if($(".tongzhi").is(":visible"))
			notice();
	});
	//通知界面刷新
	function notice() {
		$.post("../../NoticeServlet", "opr=noticeSelect&mineId="+ mineId, callBack);
		function callBack(data) {
			$(".tongzhizuonei").load("siwangbiaoqian/notice.jsp");
		}
	}
	//详细列表打开
	$(".tongzhizuonei").on("click",".xiaoximing",function(){
		var index = $(this).parent().index();
		$.post("../../NoticeServlet", "opr=noticeOpen&index="+ index, callBack);
		function callBack(data) {
			$(".tongzhiyounei").load("siwangbiaoqian/noticeOpen.jsp");
		}
	});
	//接受添加好友
	$(".tongzhiyounei").on("click",".jieshouhaoyouqingqiu",function(){
		var friendId = $(this).attr("name");
		var nid = $(this).attr("id");
		$.post("../../FriendServlet", "opr=friendAcc&friendId="+ friendId+"&mineId="+mineId+"&nid="+nid, callBack);
		function callBack(data) {
			$(".tongzhizuonei").load("siwangbiaoqian/notice.jsp");
			$(".tongzhiyounei").html("");
		}
	});
	//删除通知
	$(".tongzhizuonei").on("click",".tongzhibiaotiguanbi",function(){
		if(confirm("是否删除该条信息？", "确定", "取消")){
			var nid = $(this).attr("id");
			$.post("../../NoticeServlet", "opr=noticeDelete&mineId="+mineId+"&nid="+nid, callBack);
			function callBack(data) {
				$(".tongzhizuonei").load("siwangbiaoqian/notice.jsp");
				$(".tongzhiyounei").html("");
			}
		}
	});
	
});
//****************************************************游戏库
$(function() {
	var mineId = mineId = $(".userInfoId").val();
	$(".guanggaowode").click(function() {
		$(".benrenyouxi").toggle();
		if($(".benrenyouxi").is(":visible"))
			gameBox();
	});
	function gameBox(){
		$.post("../../CommodityInformationServlet", "opr=gameBoxSelect&mineId="+mineId, callBack);
		function callBack(data) {
			$(".youxikuang").load("siwangbiaoqian/gamebox.jsp");
		}
	}
});
//***************************************************个人信息
$(function(){
$(".guanggaoxinxi").click(function(){
		location.href="yonghuxinxi.jsp";
	});
});
//结算
$(function(){
	$(".guanggaojiesuan").click(function(){
		
	});
});



//游戏库关闭按钮
$(function() {
	$(".wode_guanbi").click(function() {
		$(".benrenyouxi").hide();
	});
});

//好友关闭
$(function() {
	$(".guanbiduihua").click(function() {
		$(".liaotian1").hide();
	});
});
//通知关闭
$(function() {
	$(".tongzhiguanbi").click(function() {
		$(".tongzhi").hide();
	});

});
//登录注册按钮
$(function(){
	$("body").on("click",".login",function(){
		location.href="denglu.jsp";
	});
	$("body").on("click",".zhuce",function(){
		location.href="zhuce.jsp";
	});
});
//购物车
$(function(){
	$("body").on("click",".guanggaojiesuan",function(){
		location.href="gouwuche.jsp";
	});
});
$(function(){
	$("body").on("click",".guanggaozhuxiao",function(){
		location.href="../../AccountServlet?opr=zhuXiao";
	});
})
