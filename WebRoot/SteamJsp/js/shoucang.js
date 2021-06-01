$(function(){
	$("body").on("click",".er",function(){
		var scIndex = $(this).index();
		location.href="../../CommodityInformationServlet?opr=openSc&scIndex="+scIndex;
	});
});
$(function(){
    $(".er").hover(function(){
        $("#nbnb").show();
        $("#nbnb").attr("src", $(this).find("img:eq(0)").attr("src"));
        if($(this).index()>2){
        	$("#nbnb").removeClass("beee");
        	$("#nbnb").addClass("veee");
        }else{
        	$("#nbnb").removeClass("veee");
        	$("#nbnb").addClass("beee");
        }
    },function(){
        $("#nbnb").hide();
    })
})