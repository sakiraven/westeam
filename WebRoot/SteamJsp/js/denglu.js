$("#dee").click(
		function() {
			var username = $("#username").val();
			var password = $("input[name=psw]").val();
			if (username == "" || password == "") {
				// 0代表失败
				alert("请输入用户名密码");
			} else {
				// 1代表成功
				$.post("../../AccountServlet", "username=" + username
						+ "&password=" + password + "&opr=login", callBack,
						"Text");

			}

			function callBack(data) {
				if (data == 1) {
					alert("管理员登陆成功");
					location.href = "../adminpagemgr/admin.jsp";
				} else if (data == 0) {
					alert("用户登录成功");
					location.href = 'zhuye.jsp';
				} else {
					alert("用户名或密码错误");
				}
			}
		});
