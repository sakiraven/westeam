<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${commodityIndex==null}">
	<script>
		location.href="zhuye.jsp";
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <!--引入css样式需要改名字-->
    <link rel="stylesheet" href="../css/shangpin.css">
    <link rel="stylesheet" href="../css/siwangbiaoqian.css">
    <link rel="stylesheet" href="../css/friend.css">
    <link rel="stylesheet" href="../css/tongzhi.css">
    <!--　<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no">-->
</head>
<!--默认-->
<iframe src="daohang.jsp" style=" position: absolute;z-index: 100;" scrolling="no" frameborder="0" width="1024px" height="300px"></iframe>
<body style="background-color:  rgb(27,40,56);">
<!--body代码全部写在 bodayall里面-->
<div class="bodayall">
    <div class="lunboshang">
        <div class="tupian">
            <div class="leibie">
                <a href="#" class="ciid"  name="${commodityIndex}" id="${commoditySelect[commodityIndex].ciid}">所有游戏</a>&nbsp;&gt;
                <!-- <a href="#">动作游戏</a>&nbsp;&gt; -->
                <a href="#">${commoditySelect[commodityIndex].name}</a>
            </div>
            <div class="dabeijing">
                <p class="biaoti">${commoditySelect[commodityIndex].name}</p>

                <div class="kantu">
                    <img class="zhanshi" src="" alt=""/>
                </div>
                <div class="tu">
                    <c:forEach items="${picture}" var = "item" begin="0" end="5">
                   	 <div class="tug"><img class="tugg" src="../shoppicture/${item.detailed}" alt=""/></div>
                    </c:forEach>
                   <!--  <div class="tug"><img src="../shoppicture/datu2.jpg" alt=""/></div>
                    <div class="tug"><img src="../shoppicture/datu3.jpg" alt=""/></div>
                    <div class="tug"><img src="../shoppicture/datu4.jpg" alt=""/></div>
                    <div class="tug"><img src="../shoppicture/datu5.jpg" alt=""/></div> -->
                </div>
                <!--<div id="zuojiantou" class="zuojiantou"><span></span></div>-->
                <div class="zuoanniu">
                    <button type="button"></button>
                </div>
                <div class="youanniu">
                    <button type="button"></button>
                </div>
                <div class="beigundongtiao">

                </div>
                <div class="jianjie">
                    <div class="anniu">
                        <button type="button">北大青鸟</button>
                    </div>
                    <div class="tututu">
                        <img class="fengmian" src="../shoppicture/${commoditySelect[commodityIndex].coverPicture}" alt=""/>
                    </div>
                    <p class="jieshao">
                      <!--   由虚幻4引擎打造的一款多人在线生存竞技网游，在一个超高自由度的开放世界里，可以体验采集、制造、打猎、收获、建造、研究以及驯服恐龙等超多自由内容，感受酷热白昼、冰冷夜晚的动态天气系统以及饥饿口渴等现实中的生存挑战，还要面对其它生存者的威胁，合作生存还是竞技厮杀，由你决定！ -->
                      ${commoditySelect[commodityIndex].playJianJie}
                      </p>
                </div>
                <div class="pingce">
                    <!-- <span hidden="true" class="zuijin">最近评测：</span> &nbsp;&nbsp;&nbsp;&nbsp;
                    <span class="pingjia">褒贬不一 <mm>(1,567)</mm></span> -->
                    <span class="quanbu">全部评测：</span>
                    <span class="zongpingjia">${wind[0]} </span>
                    <span class="faxingtime">发行日期：</span>
                    <span class="datime">${commoditySelect[commodityIndex].data}</span>
                    <span class="kaifashang">开发商：</span>
                    <a class="kaifashangname" href="#">${commoditySelect[commodityIndex].kaiFa}</a>
                    <span class="faxingshang">发行商：</span>
                    <a class="faxingshangname" href="#">${commoditySelect[commodityIndex].faXing}</a>
                    <span class="biaoqianshuoming">该产品的热门用户自定义标签：</span>

                    <div class="biaoqian">
                    <c:forEach items="${type}" var = "item" varStatus="status" begin="0" end="4">
                    	<button class="biaoqian${status.index+1}" type="button">${item}</button>
                    </c:forEach>
                        <!-- <button class="biaoqian1" type="button">生存</button>
                        <button class="biaoqian2" type="button">开放世界</button>
                        <button class="biaoqian3" type="button">恐龙</button>
                        <button class="biaoqian4" type="button">多人</button>
                        <button class="biaoqian5" type="button">制作</button>
                        <button class="suoyoubiaoqian" type="button">+</button> -->
                    </div>
                </div>
                <div class="goumaigame">
                    <h1>${commoditySelect[commodityIndex].name}</h1>

                    <div class="zhichixitong">
                        <span class="xiaotubiao"><img src="../images/icon_platform_win.png" alt=""/></span>
                        <!-- <span class="xiaotubiao"><img src="../images/icon_platform_mac.png" alt=""/></span>
                        <span class="xiaotubiao"><img src="../images/icon_platform_linux.png" alt=""/></span> -->
                    </div>
                    <p class="dazheshuoming">支持平台 ${commoditySelect[commodityIndex].from}</p>

                    <div class="goumai">
                        <div class="dazheyouhuibaifenbi">
                            <tit class="shouCang">收藏</tit>
                        </div>
                        <!--<div class="yuanmoney">￥198</div>-->
                        <div class="money">￥<span class="price">${commoditySelect[commodityIndex].money}</span></div>
                        <button class="tianjiagouwuche" type="button">添加至购物车</button>
                    </div>
                </div>
                <div class="guanyugame">
                    <h2>关于这款游戏</h2>
                    <img src="../images/maincol_gradient_rule.png" alt=""/>

                    <p>
                       <!--  孤身一人苏醒在空旷的海岸边，发现自己身处一个充满恐龙的神秘岛屿“ARK”，你身无寸缕，饥寒交迫，你必须学会打猎、获取资源，制作物品，种植庄稼，发展科技，建立庇护所，从而让你可以在这个世界中存活下去。同时，你也可以利用技巧杀死或者驯服、繁殖、骑乘那些生活在这片岛屿上的洪荒巨兽。你也可以与上百人建成部落，互相侵略，生存...以及逃离这片孤岛！
                        <br/><br/>
                        驯服，训练，繁殖 & 在活生生的生态中骑乘恐龙
                        <br/><br/>
                        恐龙，生物，以及繁殖！
                        游戏中提供了超过50种不同类别的原始生物可供玩家驯服。游戏采用了一套征服-保护的驯养机制，玩家需要先击晕恐龙来弱化并驯服他们，然后照顾他们直到恢复健康。一旦完成驯服，它将成为你最忠实的伙伴，你可以给他们下达命令，而他们也会根据你驯服和训练的方式的不同做出不同的反馈。宠物会不断升级和消耗食物，还可以运送物资和装备道具。游戏还提供了独具特色的繁殖系统，玩家可以择优选择宠物去培育最佳属性，也可以简单点，直接生养一个恐龙宝宝！你可以骑着翼龙飞跃雪山之巅，带领着迅猛龙群冲过危险密布的丛林，或者骑着霸王龙四处追捕落荒而逃的敌人！快来体验这个这个充满活力的实时生态圈吧，在捕食者与被捕食者的残酷等级阶层中找到属于你的位置。
                        <br/><br/>
                        食物，水源，温度及天气
                        <br/><br/>
                        食物和水是生存下去的必备要素。游戏中拥有许多不同种类的食物，不同食物也会有不同的营养价值（甚至还有人肉！）所有的行动都会消耗食物和水，长距离的旅行更是会持续性的消耗这些物品。携带物品的重量会影响你的行动速度，日夜转换和天气状况也会影响你周围的环境，，使你更加容易饥饿与口渴。制作衣服、建立庇护所并利用火去对抗当地恶劣、多变的环境，保护自己。
                        <br/><br/>
                        收割，建造房屋，绘制
                        <br/><br/>
                        伐木、采矿、采集各种物资，成为一代生产大师。利用你的双手、工作台和机床去制作越来越复杂和强力的装备。利用组装式的部件去建造你的大型基地，从茅草到木头到石头再到钢铁，各种材料随你选择。你还可以利用喷绘定制你的专属基地，放置可以写字的公告板宣誓你的领地。武器、衣服、护甲等也都可以被涂上不同颜色来显示你的个性和与众不同的品味。
 -->
 				${commoditySelect[commodityIndex].guanYu}

                    </p>

                    <div class="chakanquanbu">
                        <button type="button">点击查看全部介绍</button>
                    </div>
                </div>
                <div class="leixingbiaoqian">
                    <!--<div class="leibiebiaoqian1"><img src="../testimages/ico_singlePlayer.png" alt=""/><a
                            href="#" >单人</a></div>-->
                    <c:forEach items="${play}" var = "item" begin="0" end="5">
                   	 	<div style=" height: 27px; ">
                        	<span></span>

                        	<div class="leibiebiaoqian1"><span>${item}</span></div>
                       	    <div class="leibiebiaoqian1_1"><img src="../images/icon_platform_linux.png" style=""></div>
                    	</div>
                    </c:forEach>


                </div>
                <div class="yuyan">
                    <div class="yuyan_title">
                        语言:
                    </div>
                    <table class="game_yuyan" cellpadding="0" cellspacing="0">
                        <tr>
                            <th style="width: 94px;"></th>
                            <th class="checkcol">界面</th>
                            <th class="checkcol">完全音频</th>
                            <th class="checkcol">字幕</th>
                        </tr>

                <c:forEach items="${language}" var = "item" begin="0" end="5">
                	        <tr style="" class="">
                            <td style="width: 94px; text-align: left" class="yuyan1">
                               ${item}
                            </td>
                            <td class="checkcol">
                                <span>✔</span></td>
                            <td class="checkcol">
                                <span>✔</span></td>
                            <td class="checkcol">
                            </td>
                        </tr>

                </c:forEach>

                    </table>
                </div>
                <div class="beidaqingniao">
                    <img src="../images/logo.gif" alt="" style="width: 100px; height: 60px"/>

                    <p>北大青鸟 APTECH 独家赞助</p>
                </div>

                <div id="tongjibiao" class="tongjibiao">
                    <div class="tongjibiao_zongtibiao">
                        <div class="tongjibiao_jieshao">
                            <div class="tongjibiao_zongtitle">总体评测：${wind[1]}的用户给出好评</div>
                            <span class="tongjibiao_duoshaohaoping"
                                  data-tooltip-html="165,348 篇用户的游戏评测中有 69% 为好评。">${wind[0]}</span>
                            <span class="tongjibiao_pingceshu">(${wind[2]} 篇评测)</span>
                            <a class="tongjibiao_steamcopy" data-tooltip-text="此概要只使用从 SteamCopy 直接购买游戏的消费者评测。"><img
                                    src="../testimages/icon_questionmark.png"></a>
                        </div>
                    </div>

                    <div class="tongjibiao_yuefen">
                        <div class="1yue">一月</div>
                        <br/>

                        <div class="2yue">二月</div>
                        <br/>

                        <div class="3yue">三月</div>
                        <br/>

                        <div class="4yue">四月</div>
                        <br/>

                        <div class="5yue">五月</div>
                        <br/>

                        <div class="6yue">六月</div>
                        <br/>

                        <div class="7yue">七月</div>
                        <br/>

                        <div class="8yue">八月</div>
                        <br/>

                        <div class="9yue">九月</div>
                        <br/>

                        <div class="10yue">十月</div>
                        <br/>

                        <div class="11yue">十一月</div>
                        <br/>

                        <div class="12yue">十二月</div>
                        <br/>
                    </div>
                    <div class="tongjibiao_bj">
                        <div class="tongjibiao_tiaoxingtu1 ctMonth" style="width:${ctCount[1]*(400/wind[2])}px;" title="${ctCount[1]}"></div>
                        <div class="tongjibiao_tiaoxingtu2 ctMonth" style="width:${ctCount[0]*(400/wind[2])}px;" title="${ctCount[0]}"></div>
                        <div class="tongjibiao_tiaoxingtu3 ctMonth" style="width:${ctCount[3]*(400/wind[2])}px;" title="${ctCount[3]}"></div>
                        <div class="tongjibiao_tiaoxingtu4 ctMonth" style="width:${ctCount[2]*(400/wind[2])}px;" title="${ctCount[2]}"></div>
                        <div class="tongjibiao_tiaoxingtu5 ctMonth" style="width:${ctCount[5]*(400/wind[2])}px;" title="${ctCount[5]}"></div>
                        <div class="tongjibiao_tiaoxingtu6 ctMonth" style="width:${ctCount[4]*(400/wind[2])}px;" title="${ctCount[4]}"></div>
                        <div class="tongjibiao_tiaoxingtu7 ctMonth" style="width:${ctCount[7]*(400/wind[2])}px;" title="${ctCount[7]}"></div>
                        <div class="tongjibiao_tiaoxingtu8 ctMonth" style="width:${ctCount[6]*(400/wind[2])}px;" title="${ctCount[6]}"></div>
                        <div class="tongjibiao_tiaoxingtu9 ctMonth" style="width:${ctCount[9]*(400/wind[2])}px;" title="${ctCount[9]}"></div>
                        <div class="tongjibiao_tiaoxingtu10 ctMonth" style="width:${ctCount[8]*(400/wind[2])}px;" title="${ctCount[8]}"></div>
                        <div class="tongjibiao_tiaoxingtu11 ctMonth" style="width:${ctCount[11]*(400/wind[2])}px;" title="${ctCount[11]}"></div>
                        <div class="tongjibiao_tiaoxingtu12 ctMonth" style="width:${ctCount[10]*(400/wind[2])}px;" title="${ctCount[10]}"></div>
                        <div class="tongjibiao_tiaoxingtu13 ctMonth" style="width:${ctCount[13]*(400/wind[2])}px;" title="${ctCount[13]}"></div>
                        <div class="tongjibiao_tiaoxingtu14 ctMonth" style="width:${ctCount[12]*(400/wind[2])}px;" title="${ctCount[12]}"></div>
                        <div class="tongjibiao_tiaoxingtu15 ctMonth" style="width:${ctCount[15]*(400/wind[2])}px;" title="${ctCount[15]}"></div>
                        <div class="tongjibiao_tiaoxingtu16 ctMonth" style="width:${ctCount[14]*(400/wind[2])}px;" title="${ctCount[14]}"></div>
                        <div class="tongjibiao_tiaoxingtu17 ctMonth" style="width:${ctCount[17]*(400/wind[2])}px;" title="${ctCount[17]}"></div>
                        <div class="tongjibiao_tiaoxingtu18 ctMonth" style="width:${ctCount[16]*(400/wind[2])}px;" title="${ctCount[16]}"></div>
                        <div class="tongjibiao_tiaoxingtu19 ctMonth" style="width:${ctCount[20]*(400/wind[2])}px;" title="${ctCount[20]}"></div>
                        <div class="tongjibiao_tiaoxingtu20 ctMonth" style="width:${ctCount[19]*(400/wind[2])}px;" title="${ctCount[19]}"></div>
                        <div class="tongjibiao_tiaoxingtu21 ctMonth" style="width:${ctCount[22]*(400/wind[2])}px;" title="${ctCount[22]}"></div>
                        <div class="tongjibiao_tiaoxingtu22 ctMonth" style="width:${ctCount[21]*(400/wind[2])}px;" title="${ctCount[21]}"></div>
                        <div class="tongjibiao_tiaoxingtu23 ctMonth" style="width:${ctCount[24]*(400/wind[2])}px;" title="${ctCount[24]}"></div>
                        <div class="tongjibiao_tiaoxingtu24 ctMonth" style="width:${ctCount[23]*(400/wind[2])}px;" title="${ctCount[23]}"></div>
                    </div>

                </div>

                <div class="fabiaopinglun">
                    <input placeholder="请输入评论内容（最多500字）" class="fabiao_pinglun" type="text"
                           style="background: none;border: 1px solid #8e939d;background-color: transparent;color:white"
                           name="fabiao_pinglun">

                    <div class="woyaohaoping">
                        <button type="button" class="haoping">我要好评 (直接发表)</button>
                    </div>
                    <div class="woyaotucao">
                        <button type="button" class="chaping">我要吐槽 (直接发表)</button>
                    </div>
                </div>
                <div class="pinglun_zuijin">
                    <span class="zuijuyoujiazhipingce">全部用户的评测</span> &nbsp;
                    <span class="guoqutianshu"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <span class="zuijinfabupinglun"></span>

                </div>
                <img class="pinglunhengxian" src="../images/maincol_gradient_rule.png" alt=""/>
                <div id = "pinglun">
                    <!--价值评论-->
                <div>

                    <c:forEach items="${comment}" var ="item" begin="0" end="3" varStatus="status">


                    <div class="pinglun_ceshi">
                        <div class="pinglun_yonghu">
                            <img src="../userpicture/${ctName[status.index].picture}" class="touxiang" style="width:40px" alt=""/>

                            <div class="yonghuzongxx">
                                <div class="yonghuming">
                                    <a href="javascript:;">${ctName[status.index].nickName}</a></div>
                                <div class="yongyouchanpinshu">
                                    <a href="javascript:;">账户内拥有 ${gmCount[status.index]} 项产品</a></div>
                                <div class="leijipinglunshu">
                                    <a href="javascript:;">${ctUserCount[status.index]} 条评论</a></div>
                            </div>
                        </div>
                        <div class="tuijian">
                        <c:if test="${item.type==1}">
                            <img src="../images/dianzan.png" alt="" style="width: 30px;height: 34px;"/>
                             <div class="tuijiantxt">
                                <div class="tuijianname">
                                    <p>推荐</p>
                                </div>
                                <div class="tuijiantime">
                                    <p></p>
                                </div>
                            </div>
						</c:if>
						<c:if test="${item.type==0}">
                            <img src="../images/zaogao.png" alt="" style="width: 30px;height: 34px;"/>
                             <div class="tuijiantxt">
                                <div class="tuijianname">
                                    <p>不推荐</p>
                                </div>
                                <div class="tuijiantime">
                                    <p></p>
                                </div>
                            </div>
						</c:if>


                            <div class="youwanxitongtubiao">
                                <img src="../testimages/icon_platform_linux.png" alt=""/>
                            </div>
                        </div>
                        <div class="fabuxinxi">
                            <div class="fabiaopingluntime">
                                ${item.date}
                            </div>
                            <div class="pinglunneirong">
                                <p>
                                   ${item.neiRong}
                                </p>
                            </div>
                            <div class="pingceshifouyoujiazhi">
                                <p>这篇评测是否有价值？</p>

                                <div class="shifouhuanle">
                                    <div class="shi"><span>是</span></div>
                                    <div class="fou"><span>否</span></div>
                                    <div class="huanle"><span>欢乐</span></div>
                                </div>
                            </div>
                            <div class="duoshaorenjiazhi">
                                <p>有 <span class="duoshanrenjuedeyoujiazhi">640</span> <span>人觉得这篇评测很有价值</span></p>

                                <p>有 <span class="duoshaorenjuedebuxing">262</span> <span>人觉得这篇评测很宋肥山</span></p>
                            </div>
                        </div>

                    </div>
                    </c:forEach>



                </div>
                <!--价值评论-->



<!--更新评测-->

                <div class="nicaishibushibeijing">
                <c:forEach items="${comment}" var ="item" begin="4" end="7" varStatus="status">
                    <div class="zuijinfabude">
                        <div class="zan_wanjia_time">
                            <img src="../testimages/icon_thumbsDown_v6.png" alt=""/>

                            <div class="nishirenleima">
                                <span>${ctName[status.index].nickName}</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <span></span>
                            </div>
                            <div class="wobushirenlei">
                                <img src="../testimages/icon_platform_linux.png" alt=""/></div>
                        </div>
                        <div class="time_neirong_jiazhi">
                            <p class="fabupingluntime">发布于：${item.date}</p>

                            <div class="pinglunneirong1">${item.neiRong}</div>
                            <div class="heixian"></div>
                            <div class="jiazhizainali">
                                <span class="nizaixiangshenme">是否有价值？</span>

                                <div class="shi"><span>是</span></div>
                                <div class="fou"><span>否</span></div>
                                <div class="huanle"><span>欢乐</span></div>
                            </div>
                        </div>
                    </div>
   </c:forEach>

                    </div>
                </div>
         <!--
                <div class="woyaohaoping">
                        <button type="button">上一页</button>
                    </div>
                    <div class="woyaotucao">
                        <button type="button">下一页</button>
                    </div> -->
            </div>
        </div>
    </div>
</div>

<!--<div class="beijingse"></div>-->

<%@ include file="siwangbiaoqian.jsp" %>
<script src="../js/jquery-1.12.4.js"></script>
<script src="../js/siwangbiaoqian.js"></script>
<script src="../js/shangpin.js"></script>

</body>
</html>
