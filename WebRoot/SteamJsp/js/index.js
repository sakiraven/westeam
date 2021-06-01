$(function(){
	var uploading = false;

	$("#ctn-input-file").on("change", function(){
	    if(uploading){
	        alert("文件正在上传中，请稍候");
	        return false;
	    }
	    $.ajax({
	        url: ctx + "/xxx/upload",
	        type: 'POST',
	        cache: false,
	        data: new FormData($('#infoLogoForm')[0]),
	        processData: false,
	        contentType: false,
	        dataType:"json",
	        beforeSend: function(){
	            uploading = true;
	        },
	        success : function(data) {
	            if (data.code == 1) {
	                $("#logo").attr("src", data.msg);
	            } else {
	                showError(data.msg);
	            }
	            uploading = false;
	        }
	    });
	});
})