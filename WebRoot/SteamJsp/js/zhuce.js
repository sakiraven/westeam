$(function () {


    $("#mailbutton").attr("disabled", true);
    var email = 0;
    //var key = 1;
//	验证昵称规则
    var ncint = 0;
//	验证用户名规则
    var yhmint = 0;
//	验证密码规则
    var mm = 0;
//	验证确认密码规则
    var qrmm = 0;
//	验证昵称规则
    var xyxz = 0;
    //验证验证码规则
    var yzm = 0;
    //验证码随机数 x为上限，y为下限,rand为随机数结果
    var strYhm = "";
    var x = 99999;
    var y = 10000;
    var rand = 0;
//当发送验证码按钮点击时会执行发送验证码的代码
    $("#mailbutton").click(function () {
    	rand = parseInt(Math.random() * (x - y + 1) + y);
        var mail = $("#username").val();
        strYhm = $("#username").val();
        var steam = "http://api.guaqb.cn/music/yx/qq.php?user=steamcopy@qq.com&password=abyyfoxcgcxrdeei&email=" + mail + "&bt=SteamCopy&nr=验证码：" + rand;
        window.open(steam);
        alert("验证码发送成功");
        //rand = parseInt(Math.random() * (x - y + 1) + y);
        //return rand;

        var count11 = 60;
        var countdown = setInterval(CountDown, 1000);
        
        function CountDown() {
            $("#mailbutton").attr("disabled", true);
            $("#mailbutton").text(count11);
            if (count11 == 0) {
                $("#mailbutton").text("重新发送").removeAttr("disabled");
                clearInterval(countdown);
            }
            count11--;
        }
    })

    // 同意协议并注册按钮 的点击事件
    $("#tongyixx").click(function () {

        // 获取昵称
        var text1 = $("#nicheng").val();
        // 获取用户名
        var text2 = $("#username").val();
        // 获取密码
        var password = $("#login_password").val();
        // 获取确认密码
        var repsword = $("#confirm_password").val();
        // 获取用户协议
        //

        var isChecked = $('#kuang').prop('checked');
        // 获取用户名是不是邮箱
        var str = $("#username").val();
        var ret = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
        if (text1.length == 0) {
            ncint = 0;
            $("#ncnull").html("*昵称不能为空*")
            $("#nicheng").css("border", "1px solid red");
        }
        if (text2 == "") {
            yhmint = 0;
            $("#yhmnull").html("*用户名不能为空*");
            $("#username").css("border", "1px solid red");
            $("#yhmnull").css("color", "#e16366");
        }
        if (password.length == 0) {
            mmint = 0;
            $("#mmnull").html("*密码不能为空*")
            $("#login_password").css("border", "1px solid red");
        }
        if (repsword.length == 0) {
            qrmmint = 0;
            $("#qrmmnull").html("*确认密码不能为空*")
            $("#confirm_password").css("border", "1px solid red");
        }


        if (isChecked == false) {
            xyxz = 0;
            $("#yhxynull").show();
        }

//		alert(key)
//		if(key>0){
//
//			location.href="../pagemgr/zhuye.jsp";
//
//		}

        var mail = $("#mailyzm").val();
        if (mail == "") {
            alert("验证码不能为空");
            yzm=0;
        } else if (mail == rand&&strYhm==$("#username").val()) {
            yzm++;
        } else {
            alert("验证码错误");
            yzm = 0;
        }
//        验证所有条件是否成立，全部成立才执行注册事件
        if (ncint > 0 && yhmint > 0 && mm > 0 && qrmm > 0 && xyxz > 0 && yzm > 0) {
            $.post("../../AccountServlet", "nickname=" + text1 + "&yhm=" + text2 + "&mm=" + password + "&opr=zhuce", callBack, "Text");
            function callBack(data) {
                if (data > 0) {
                    alert("注册成功");
                    location.href = "denglu.jsp";
                } else {
                    alert("注册异常，请联系管理员QQ2784260366");
                }
            }
        } else {
            alert("有规则未成立");
        }
    });

    // 验证昵称规则是否成立
    $('#nicheng').on('input propertychange', function () {
        // 获取昵称
        var text1 = $("#nicheng");
        if (text1.val() == "") {
            ncint = 0;
            $("#ncnull").html("*昵称不能为空*")
            $("#nicheng").css("border", "1px solid red");
        } else {
            var count = $(this).val().length;
            if (count > 0 && count < 7) {
                // 正则表达式
                var ce = new RegExp("^[A-Za-z0-9\u4e00-\u9fa5]+$");
                // 获取输入框中的值
                var usernamee = document.getElementById("nicheng").value.trim();
                if (!ce.test(usernamee)) {
                    $("#ncnull").html("*昵称只能由中文 英文 数字组成*")
                    ncint = 0;
                } else {
                    //第一次++
                    ncint++;
                    $("#ncnull").html("");
                    $("#nicheng").css("border", "none");
                }
            } else if (count == 0) {
                ncint = 0;
                $("#ncnull").html("*昵称不能为空*")
                $("#nicheng").css("border", "1px solid red");
            } else if (count > 6) {
                ncint = 0;
                $("#ncnull").html("昵称最多6个字符");
            }
        }
    })
    // 验证用户名规则是否成立
    $('#username').on('input propertychange', function () {
        var text2 = $("#username");
        if (text2.val() == "") {
            yhmint = 0;
            $("#yhmnull").html("*用户名不能为空*");
            email = 0;
            $("#username").css("border", "1px solid red");
            $("#yhmnull").css("color", "#e16366");
            $("#mailbutton").attr("disabled", true);

            $("#mailbutton").css("color", "#467da2");
            $("#mailbutton").css("background-color", "#203b52")

        } else {
            var strr = $("#username").val();
            var rett = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
            if (rett.test(strr)) {
                //第二次++
                yhmint++;
                email++;
                $("#yhmnull").html("");
                $("#username").css("border", "none");
                $("#mailbutton").removeAttr("disabled");
                $("#mailbutton").css("color", "#67c1f5");
                $("#mailbutton").css("background-color", "#2b4e6e")
            } else {
                yhmint = 0;
                $("#yhmnull").html("*用户名必须为邮箱*")
                $("#yhmnull").css("color", "#e16366");
                email = 0;
                $("#mailbutton").attr("disabled", true);
                $("#mailbutton").css("color", "#467da2");
                $("#mailbutton").css("background-color", "#203b52")
            }
        }
    })
    // 验证密码规则是否成立
    $('#login_password').on('input propertychange', function () {
        // 获取密码
        var password = $("#login_password");
        // 获取确认密码
        var repsword = $("#confirm_password");
        if (password.val() == "") {
            mm = 0;
            $("#mmnull").html("*密码不能为空*")
            $("#login_password").css("border", "1px solid red");
        } else {
            var count = $(this).val().length;
            if (password.val() == repsword.val()) {
                //第三次++
                $("#qrmmnull").html("")
            } else {
                qrmm = 0;
                $("#qrmmnull").html("*两次密码输入不一致*")
            }
            $('#login_password').keyup(function () {
                var strongRegex = new RegExp("^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).*$", "g");
                var mediumRegex = new RegExp("^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$", "g");
                var enoughRegex = new RegExp("(?=.{6,}).*", "g");
                if (false == enoughRegex.test($(this).val())) {
                    var count = $(this).val().length;
                    mm = 0;
                    qrmm = 0;
                    $("#mmnull").html("*密码强度：弱*")
                    $("#login_password").css("border", "1px solid red");
                    $("#mmnull").css("color", "#e16366");
                    // 密码小于六位的时候，密码强度图片都为灰色
                    var password = $("#login_password");
                    // 获取确认密码
                    var repsword = $("#confirm_password");
                    if (password.val() == "") {
                        mm = 0;
                        qrmm = 0;
                        $("#mmnull").html("*密码不能为空*")
                        $("#login_password").css("border", "1px solid red");
                        $("#qrmmnull").html("")
                    }
                } else if (strongRegex.test($(this).val())) {
                    //第四次++
                    mm++;
                    qrmm++;
                    $("#mmnull").html("*密码强度：强*")
                    $("#login_password").css("border", "none");
                    $("#mmnull").css("color", " #67c1f5");
                    var password = $("#login_password");
                    // 获取确认密码
                    var repsword = $("#confirm_password");
                    // 密码为八位及以上并且字母数字特殊字符三项都包括,强度最强
                } else if (mediumRegex.test($(this).val())) {
                    $("#mmnull").html("*密码强度：中*")
                    mm = 0;
                    qrmm = 0;
                    $("#login_password").css("border", "none");
                    $("#mmnull").css("color", "#ffac55");
                    var password = $("#login_password");
                    // 获取确认密码
                    var repsword = $("#confirm_password");
                    /*if (password.val() == repsword.val()) {
                     $("#qrmmnull").html("")
                     }*/

                    // 密码为七位及以上并且字母、数字、特殊字符三项中有两项，强度是中等
                } else {
                    mm = 0;
                    qrmm = 0;
                    $("#mmnull").html("*密码强度：弱*")
                    $("#login_password").css("border", "1px solid red");
                    $("#mmnull").css("color", "#e16366");
                    var password = $("#login_password");
                    //获取确认密码
                    var repsword = $("#confirm_password");
                    /*if (password.val() == repsword.val()) {
                     $("#qrmmnull").html("")
                     }*/
                    /*if (password.val() == "") {

                     $("#mmnull").html("*密码不能为空*")
                     $("#login_password").css("border","1px solid red");
                     $("#qrmmnull").html("")
                     }*/
                    // 如果密码为6为及以下，就算字母、数字、特殊字符三项都包括，强度也是弱的
                }
                //return true;
            });
        }
        // 验证确认密码规则是否成立
        $('#confirm_password').on('input propertychange', function () {
            //获取密码
            var password = $("#login_password");
            // 获取确认密码
            var repsword = $("#confirm_password");
            if (password.val() == "") {
                mm = 0;
                qrmm = 0;
                $("#mmnull").html("*密码不能为空*")
                $("#login_password").css("border", "1px solid red");
            } else {
                var count = $(this).val().length;
                if (password.val() == repsword.val()) {
                    $("#qrmmnull").html("")
                } else {
                    mm = 0;
                    qrmm = 0;
                    $("#qrmmnull").html("*两次密码输入不一致*")
                }
            }
        })
    })
//验证码规则是否成立

//判断协议选项是否被选中
    $("#kuang").click(function () {
        var isChecked = $('#kuang').prop('checked');
        if (isChecked == false) {
            $("#yhxynull").show();
            xyxz = 0;
        } else {
            xyxz++;
            $("#yhxynull").hide();
        }
    })
    //当用户在用户名输入框那里离开的时候会执行 阿贾克斯 代码，从数据库里实时判断此账号是否存在
    $("#username").blur(function () {
        if (email > 0) {
            var yhm = $("#username").val();
            $.post("../../AccountServlet", "yhm=" + yhm + "&opr=yzyhm", callBack);
            function callBack(data) {
                if (data > 0) {
                    $("#yhmnull").html("*用户名已经被注册*");
                    $("#username").css("border", "1px solid red");
                    $("#yhmnull").css("color", "#e16366");
                    $("#mailbutton").attr("disabled", true);
                    $("#mailbutton").css("color", "#467da2");
                    $("#mailbutton").css("background-color", "#203b52")
                } else {
                    $("#yhmnull").html("用户名可以注册");
                    $("#username").css("none");
                    $("#yhmnull").css("color", "#67c1f5");
                    $("#mailbutton").removeAttr("disabled");
                    $("#mailbutton").css("color", "#67c1f5");
                    $("#mailbutton").css("background-color", "#2b4e6e")
                }
            }
        }
    })


})

