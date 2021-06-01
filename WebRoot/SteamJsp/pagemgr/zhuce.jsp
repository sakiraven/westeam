<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <link rel="stylesheet" href="../css/zhuce.css">
</head>
<iframe src="daohang.jsp"  scrolling="no"   frameborder="0" width="1024px" height="300px"></iframe>
<body style="background-color:  rgb(27,40,56);">
<div class="zhuti" style="text-align: center;position:relative;z-index:4;" >
    <div enctype="multipart/form-data">
        <!--<input class="zhuwen" type="file">-->
        <!--<img src="../testimages/hema.jpg" width="50" height="40" border="0">-->
        <div style="width:500px;float:left;margin:0 20px;">
            <div class="chuangjian" style="font-size:28px;color: #ccd9d9">创建用户</div>
            <br/>

            <label class="zhucheng" for="nicheng" id="nich1" class="l">昵称</label>
            <label  class="ncnull"  id="ncnull" style="color:#e16366;font-size: 10px;position: absolute;right: 550px;"></label>
            <br/>
            <div class="d">
                <input  id="nicheng" type="text" class="i" placeholder="请输入昵称" >
            </div>
            <br/><br/>

            <label class="qidi" for="username" class="l">用户名</label>
            <label  class="ncnull"  id="yhmnull" style="color:#e16366;font-size: 10px;position: absolute;right: 550px;"></label>
            <br/>

            <div class="zhuqi" style="height:35px;width:300px;position:relative;display:inline;">
                <input id="username" type="text" placeholder="请输入用户名(邮箱)" style="height:30px;width:250px;padding-right:50px;" >
                <button id="mailbutton" >发送验证码</button>
                <span style="position:absolute;right:18px;top:2px;height:16px;width:16px;display:inline-block;"></span>
            </div>
            <br/><br/>

            <label class="zhuwi" for="login_password" class="l">登录密码</label>
            <label  class="ncnull"  id="mmnull" style="color:#e16366;font-size: 10px;position: absolute;right: 550px;"></label>
            <br/>

            <div class="d">
                <input class=" zhuli"  placeholder="请输入密码 " id="login_password" type="text" class="i">
            </div>
            <br/><br/>

            <label class="zhufi" for="confirm_password" class="l">确认密码</label>
            <label  class="ncnull"  id="qrmmnull" style="color:#e16366;font-size: 10px;position: absolute;right: 550px;"></label>
            <br/>

            <div class="d">
                <input class="zhuki" placeholder="请确认密码" id="confirm_password" type="text" class="i" style="width: 300px;height: 30px;">
            </div>
            <br/><br/>

            <div style="" class="juzhudi">

                <input type="text" placeholder="请输入邮箱验证码" id="mailyzm"/>
                <br/>

            </div>
            <br/><br/>
            <input class="zhuhi" hidden="false" id="kuang" type="checkbox" name="agree" style="margin-left:100px;display:inline-block;"
                   value="0"/>
            <label hidden="true" class="ncnull"  id="yhxynull" style="color:#e16366;font-size: 10px;position: absolute;right: 655px;top:440px;">*请勾选用户协议*</label>
            <span  class="zhuji" id="zhuji"  style="font-size:10px;" >我已阅读并同意《用户注册协议》</span>
            <br/><br/>
            <input class="zhugi" id="tongyixx" type="submit" value="同意以上协议并注册"
                   style="margin-left:100px;height:30px;width:300px;background-color:#2b4e6e;display:inline-block;border:none;"/>
        </div>
        <div class="shuoming">
            <div class="login">
                <h2>为什么加入 STEAM？</h2>
                <ul id="list">
                    <li>购买和下载完整零售游戏</li>
                    <li>加入 Steam 社区</li>
                    <li>游戏时与好友聊天</li>
                    <li>在任何电脑上都能玩</li>
                    <li>安排游戏、比赛或 LAN 聚会</li>
                    <li>获取自动游戏更新以及更多！</li>
                </ul>
                <br>
                <img src="../images/denglujiemianyoucetupian.png" width="200" height="120" border="0">
                <br>
                <span id="zhichixitong">支持的操作系统</span>
                <div id="xitongbanben">
                    Windows 7、8、8.1、10 或更新版本。<br><br>

                    Intel Mac、OS X 版本 10.11（El Capitan）或更新版本。<br><br>
                    Ubuntu Linux （最新版本）。<br><br>
                    互联网连接（推荐使用宽带）					</div>
                <br><br>
            </div>
        </div>
    </div>
</div>
</form>

<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/zhuce.js"></script>
</body>
</html>
