<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                                发布于：2月6日
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
                            <p class="fabupingluntime">发布于：${item.date }</p>

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
