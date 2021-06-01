

$(function() {
	var aid = -1;
	var ciid = -1;
	var key=0;
	//用户标签单击
	$(".biaoqian_span:eq(0)").click(function() {
		$.post("../../AccountMgrServlet", "opr=accountSelect", callBack);
		function callBack(data) {
			$(".biaoqianxianshi").load("adminguanli.jsp");
			$(".xianshi").load("adminyonghu.jsp");
		}
	});
	//商品信息单击
	$(".biaoqian_span:eq(1)").click(
			function() {$.post("../../CommodityInformationMgrServlet","opr=commoditySelect", callBack);
				function callBack(data) {
					$(".biaoqianxianshi").load("adminguanli_sp.jsp");
					$(".xianshi").load("adminshangpin.jsp");
				}
			});
	
	  $(".biaoqian_span:eq(2)").click(function() {
		  /*$.post("../../AccountMgrServlet", "opr=accountSelect", callBack);
		  function callBack(data) { $(".biaoqianxianshi").load("adminguanli.jsp");*/
		  /*}*/ 
		  $(".biaoqianxianshi").load("adminguanli_other.jsp");
		  $(".xianshi").html("");
	  });
	 


	// 用户传值
	$(".biaoqianxianshi").on("click", ".userInfo", function() {
		key = $(this).index();
		aid = $(".aid:eq(" + key + ")").val();
		$.post("../../AccountMgrServlet","opr=key&key="+key, callBack);
		function callBack(data) {
			$(".xianshi").load("adminyonghu.jsp");
		}
	});
	// 删除用户
	$(".xianshi").on("click",".yonghuanniu",function() {
				if (aid != -1) {
					$.post("../../AccountMgrServlet", "opr=accountDel&aid="+ aid, callBack);
					function callBack(data) {
						$(".biaoqianxianshi").load("adminguanli.jsp");
						$(".xianshi").load("adminyonghu.jsp");
						aid = -1;
						if(data==-1){
							alert("删除异常 请查看AccountDaoImpl")
						}else{
							alert("删除成功")
						}
					}
				}
	});
	//商品传值
	$(".biaoqianxianshi").on("click",".commodityInfo",function() {
				key = $(this).index();
				$.post("../../CommodityInformationMgrServlet","opr=key&key=" + key, callBack);
				function callBack(data) {
					$(".xianshi").load("adminshangpin.jsp");
				}
	});
	//商品修改按钮
	$(".xianshi").on("click",".update",function() {
		var shangpin=$("input[name=shangpin]").val();
		var jiage=$("input[name=jiage]").val();
		var kaifa=$("input[name=kaifa]").val();
		var faxing=$("input[name=faxing]").val();
		var jianjie=$("textarea[name=jianjie]").val();
		var guanyu=$("textarea[name=guanyu]").val();
		var ciid = $("input[name=ciid]").val();
		if(shangpin.length==0||jiage.length==0||kaifa.length==0||faxing.length==0||jianjie.length==0||guanyu.length==0||ciid.length==0){
			alert("各项不能为空");
			return;
		}
			
		$.post("../../CommodityInformationMgrServlet","opr=update&ciid=" + ciid+"&shangpin="+shangpin+"&jiage="+jiage+"&kaifa="+kaifa+"&faxing="+faxing+"&jianjie="+jianjie+"&guanyu="+guanyu, callBack);
		function callBack(data) {
			$(".biaoqianxianshi").load("adminguanli_sp.jsp");
			$(".xianshi").load("adminshangpin.jsp");
			if(data==0){
				alert("修改失败");
			}else if(data==-1){
				alert("修改异常 请查看CommodityInformationDaoImpl");
			}else{
				alert(shangpin+"修改成功");
			}
			
		}
	});
	//商品删除按钮
	$(".xianshi").on("click",".del",function() {
		var shangpin=$("input[name=shangpin]").val();
		var ciid = $("input[name=ciid]").val();
		if(shangpin.length==0||ciid.length==0){
			alert("各项不能为空");
			return;
		}
		$.post("../../CommodityInformationMgrServlet","opr=del&ciid=" + ciid, callBack);
		function callBack(data) {
			$(".biaoqianxianshi").load("adminguanli_sp.jsp");
			$(".xianshi").load("adminshangpin.jsp");
			if(data==0){
				alert("删除失败");
			}else if(data<0){
				alert("删除异常  请查看CommodityInformationDaoImpl");
			}else{
				alert(shangpin+"删除成功");
			}
			
		}
	});
	// 评论管理
	$(".biaoqianxianshi").on("click", ".comment", function() {
		$.post("../../CommentMgrServlet","opr=commentSelect", callBack);
		function callBack(data) {
			$(".xianshi").load("adminpinglun.jsp");
		}
	});
	//评论删除按钮
	$(".xianshi").on("click",".delComment",function() {
		var ctid = $(this).next().html()
		$.post("../../CommentMgrServlet","opr=del&ctid=" + ctid, callBack);
		function callBack(data) {
			$(".xianshi").load("adminpinglun.jsp");
			if(data==0){
				alert("删除失败");
			}else if(data<0){
				alert("删除异常  请查看CommodityInformationDaoImpl");
			}else{
				alert("删除成功");
			}
			
		}
	});
	
	// 标签管理
	$(".biaoqianxianshi").on("click", ".label", function() {
		$(".labelAll").toggle();
	});
	
	//玩法标签
	$(".biaoqianxianshi").on("click", ".label_Play", function() {
		$.post("../../PlayLabelMgrServlet","opr=playSelect", callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_palylabel.jsp");
		}
	});
	//所有复选框选中动画
	$(".xianshi").on("click", ".check", function() {
		var check = $(this).is(":checked");
		if(check==true){
			 $(this).next().removeAttr("disabled");
		}else{
			 $(this).next().attr("disabled","disabled");
		}
	});
	//玩法修改按钮
	$(".xianshi").on("click", ".playUpdate", function() {
		var size = $('.check:checked').length;
		var key = new Array([size]);
		var value = new Array([size]);
		var index = 0;
		if(size.length==0||key.length==0||value.length==0){
			alert("各项不能为空");
			return;
		}
		$('.check:checked').each(function(){
			key[index++]=$(this).val();
		}); 
		index = 0;
		$('.wenben:not(:disabled)').each(function(){ 
			value[index++]=$(this).val();
		}); 
		$.post("../../PlayLabelMgrServlet","opr=update&key="+key+"&value="+value, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_palylabel.jsp");
			if(data==0){
				alert("更新失败");
			}else if(data<0){
				alert("更新异常  请查看PlayLabelDaoImpl");
			}else{
				alert("更新成功");
			}
		}
	});
	//玩法删除按钮
	$(".xianshi").on("click", ".playDel", function() {
		var size = $('.check:checked').length;
		var key = new Array([size]);
		var index = 0;
		
		$('.check:checked').each(function(){
			key[index++]=$(this).val();
		}); 
		$.post("../../PlayLabelMgrServlet","opr=del&key="+key, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_palylabel.jsp");
			if(data==0){
				alert("删除失败");
			}else if(data<0){
				alert("删除异常  请查看PlayLabelDaoImpl");
			}else{
				alert("删除成功");
			}
		}
	});
	//玩法添加按钮
	$(".xianshi").on("click", ".playSave", function() {
		var save = $(".addLabel").val();
		if(save.length==0){
			alert("各项不能为空");
			return;
		}
		$.post("../../PlayLabelMgrServlet","opr=save&value="+save, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_palylabel.jsp");
			if(data==0){
				alert("保存失败");
			}else if(data<0){
				alert("保存异常  请查看PlayLabelDaoImpl");
			}else{
				alert("保存成功");
			}
		}
	});
	
	//类型标签
	$(".biaoqianxianshi").on("click", ".label_Type", function() {
		$.post("../../TypeLabelMgrServlet","opr=typeSelect", callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_typelabel.jsp");
		}
	});
	//类型修改按钮
	$(".xianshi").on("click", ".typeUpdate", function() {
		var size = $('.check:checked').length;
		var key = new Array([size]);
		var value = new Array([size]);
		var index = 0;
		if(size.length==0||key.length==0||value.length==0){
			alert("各项不能为空");
			return;
		}
		$('.check:checked').each(function(){
			key[index++]=$(this).val();
		}); 
		index = 0;
		$('.wenben:not(:disabled)').each(function(){ 
			value[index++]=$(this).val();
		}); 
		$.post("../../TypeLabelMgrServlet","opr=update&key="+key+"&value="+value, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_typelabel.jsp");
			if(data==0){
				alert("更新失败");
			}else if(data<0){
				alert("更新异常  请查看TypeLabelDaoImpl");
			}else{
				alert("更新成功");
			}
		}
	});
	//玩法删除按钮
	$(".xianshi").on("click", ".typeDel", function() {
		var size = $('.check:checked').length;
		var key = new Array([size]);
		var index = 0;
		$('.check:checked').each(function(){
			key[index++]=$(this).val();
			return;
		}); 
		$.post("../../TypeLabelMgrServlet","opr=del&key="+key, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_typelabel.jsp");
			if(data==0){
				alert("删除失败");
			}else if(data<0){
				alert("删除异常  请查看TypeLabelDaoImpl");
			}else{
				alert("删除成功");
			}
		}
	});
	
	//类型添加按钮
	$(".xianshi").on("click", ".typeSave", function() {
		var save = $(".addLabel").val();
		if(save.length==0){
			alert("各项不能为空");
			return;
		}
		$.post("../../TypeLabelMgrServlet","opr=save&value="+save, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_typelabel.jsp");
			if(data==0){
				alert("保存失败");
			}else if(data<0){
				alert("保存异常  请查看PlayLabelDaoImpl");
			}else{
				alert("保存成功");
			}
		}
	});
	
	//语言标签
	$(".biaoqianxianshi").on("click", ".label_Language", function() {
		$.post("../../LanguageLabelMgrServlet","opr=languageSelect", callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_languagelabel.jsp");
		}		
	});
	//语言修改按钮
	$(".xianshi").on("click", ".languageUpdate", function() {
		var size = $('.check:checked').length;
		var key = new Array([size]);
		var value = new Array([size]);
		var index = 0;
		if(size.length==0||key.length==0||value.length==0){
			alert("各项不能为空");
			return;
		}
		$('.check:checked').each(function(){
			key[index++]=$(this).val();
		}); 
		index = 0;
		$('.wenben:not(:disabled)').each(function(){ 
			value[index++]=$(this).val();
		}); 
		$.post("../../LanguageLabelMgrServlet","opr=update&key="+key+"&value="+value, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_languagelabel.jsp");
			if(data==0){
				alert("更新失败");
			}else if(data<0){
				alert("更新异常  请查看LanguageLabelDaoImpl");
			}else{
				alert("更新成功");
			}
		}
	});
	
	//玩法删除按钮
	$(".xianshi").on("click", ".languageDel", function() {
		var size = $('.check:checked').length;
		var key = new Array([size]);
		var index = 0;
		$('.check:checked').each(function(){
			key[index++]=$(this).val();
			return;
		}); 
		$.post("../../LanguageLabelMgrServlet","opr=del&key="+key, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_languagelabel.jsp");
			if(data==0){
				alert("删除失败");
			}else if(data<0){
				alert("删除异常  请查看TypeLabelDaoImpl");
			}else{
				alert("删除成功");
			}
		}
	});
	//语言添加按钮
	$(".xianshi").on("click", ".languageSave", function() {
		var save = $(".addLabel").val();
		if(save.length==0){
			alert("各项不能为空");
			return;
		}
		$.post("../../LanguageLabelMgrServlet","opr=save&value="+save, callBack);
		function callBack(data) {
			$(".xianshi").load("xianshi_languagelabel.jsp");
			if(data==0){
				alert("保存失败");
			}else if(data<0){
				alert("保存异常  请查看TypeLabelDaoImpl");
			}else{
				alert("保存成功");
			}
		}
	});
});
