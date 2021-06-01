package cn.servlet.clientservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;

import com.mysql.fabric.xmlrpc.Client;

import cn.entity.Comment;
import cn.entity.CommodityInformation;
import cn.service.client.ClientCommentService;
import cn.service.client.ClientCommodityInformationService;
import cn.service.client.ClientDetailedPictureService;
import cn.service.client.ClientLanguageLabelService;
import cn.service.client.ClientPlayLabelService;
import cn.service.client.ClientTypeLabelService;
import cn.service.client.ClientUserGamesService;
import cn.service.client.ClientUserInformationService;
import cn.service.client.impl.ClientCommentServiceImpl;
import cn.service.client.impl.ClientCommodityInformationServiceImpl;
import cn.service.client.impl.ClientDetailedPictureServiceImpl;
import cn.service.client.impl.ClientLanguageLabelServiceImpl;
import cn.service.client.impl.ClientPlayLabelServiceImpl;
import cn.service.client.impl.ClientTypeLabelServiceImpl;
import cn.service.client.impl.ClientUserGamesServiceImpl;
import cn.service.client.impl.ClientUserInformationServiceImpl;

public class CommodityInformationServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset:utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String opr=request.getParameter("opr");
		if(opr.equals("commoditySelect")){
			ClientCommodityInformationService ccis=new ClientCommodityInformationServiceImpl();
			String selectType = request.getParameter("selectType");
			//初始化页
			int pageIndex=0;
			if(selectType.equals("hot")||selectType.equals("hotNext")){
				//上下页类型
				if(session.getAttribute("pageType")!=null)
					session.removeAttribute("pageType");
				session.setAttribute("pageType", "0");
				//判断是否为第一页
				if(request.getParameter("pageIndex")!=null)
					pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
				//返回当前页
				if(session.getAttribute("pageIndex")!=null)
					session.removeAttribute("pageIndex");
				session.setAttribute("pageIndex", pageIndex);
				//显示类型
				ClientTypeLabelService ctls=new ClientTypeLabelServiceImpl();
				if(session.getAttribute("typeSelect")==null)
					session.setAttribute("typeSelect",ctls.ClientQuery());
			}
			//查看商品 热销和主页通用
			if(session.getAttribute("commoditySelect")!=null)
				session.removeAttribute("commoditySelect");
			session.setAttribute("commoditySelect", ccis.ClientQuery(pageIndex, 11));
			
			if(selectType.equals("hot")){
				out.print("<script>location.href='SteamJsp/pagemgr/rexiao.jsp'</script>");
			}else if(selectType.equals("hotNext")){
				//out.print("<script>location.href='SteamJsp/pagemgr/rexiao/rexiao.jsp'</script>");
				response.sendRedirect("SteamJsp/pagemgr/rexiao/rexiao.jsp");
			}else{
				out.print("<script>location.href='SteamJsp/pagemgr/zhuye.jsp'</script>");
			}
		}else if(opr.equals("gameBoxSelect")){
			ClientCommodityInformationService ccis = new ClientCommodityInformationServiceImpl();
			if(session.getAttribute("gameBoxSelect")!=null)
				session.removeAttribute("gameBoxSelect");
			session.setAttribute("gameBoxSelect", ccis.ClientQuery(Integer.parseInt(request.getParameter("mineId"))));
			response.sendRedirect("SteamJsp/pagemgr/siwangbiaoqian/gamebox.jsp");
		}else if(opr.equals("shopSelect")){
			ClientDetailedPictureService cdps = new ClientDetailedPictureServiceImpl();
			ClientTypeLabelService ctls = new ClientTypeLabelServiceImpl();
			ClientLanguageLabelService clls = new ClientLanguageLabelServiceImpl();
			ClientPlayLabelService cpls = new ClientPlayLabelServiceImpl();
			ClientCommentService ccs = new ClientCommentServiceImpl();
			ClientCommodityInformationService ccis = new ClientCommodityInformationServiceImpl();
			
			//获取选中索引
			int index =Integer.parseInt(request.getParameter("commodityIndex"));
			//获取商品组
			List<CommodityInformation> getCiLt =  (List<CommodityInformation>)session.getAttribute("commoditySelect");
			//商品id
			int ciid =getCiLt.get(index).getCiid();
			if(session.getAttribute("ciid")!=null)
				session.removeAttribute("ciid");
			session.setAttribute("ciid", ciid);
			
			//商品索引
			if(session.getAttribute("commodityIndex")!=null)
				session.removeAttribute("commodityIndex");
			session.setAttribute("commodityIndex", index);
			
			//获取详细图片
			if(session.getAttribute("picture")!=null)
				session.removeAttribute("picture");
			session.setAttribute("picture", cdps.ClientQuery(ciid));
			
			//获取类型
			if(session.getAttribute("type")!=null)
				session.removeAttribute("type");
			session.setAttribute("type", ctls.ClientQuery(ciid));
			
			//获取语言
			if(session.getAttribute("language")!=null)
				session.removeAttribute("language");
			session.setAttribute("language", clls.ClientQuery(ciid));
			
			//获取玩法
			if(session.getAttribute("play")!=null)
				session.removeAttribute("play");
			session.setAttribute("play", cpls.ClientQuery(ciid));
			
			//获取获取评论
			if(session.getAttribute("comment")!=null)
				session.removeAttribute("comment");
			List<Comment> getCtLt = ccs.ClientQuery(ciid, 0, 10);
			session.setAttribute("comment", getCtLt);
			
			//获取评论用户拥有产品数量
			if(session.getAttribute("gmCount")!=null)
				session.removeAttribute("gmCount");
			List<Integer> getGame = new ArrayList<Integer>();
			for (Comment gm : getCtLt) {
				int size=ccis.ClientQuery(gm.getUser_Info_Id()).size();
				getGame.add(size);
			}
			session.setAttribute("gmCount", getGame);
			
			
			
			//获取1-12月评价数量
			if(session.getAttribute("ctCount")!=null)
				session.removeAttribute("ctCount");
			List<Integer> getWinLt = ccs.ClientQueryCount(2019,ciid);
			session.setAttribute("ctCount", getWinLt);
			
			//**************************************************************评论风向
			if(session.getAttribute("wind")!=null)
				session.removeAttribute("wind");
			List<String> windLt = new ArrayList<String>();
			double good=0;
			double bad=0;
			for (int i=0;i<getWinLt.size();i+=2) {
				bad+=getWinLt.get(i);
				good+=getWinLt.get(i+1);
			}
			String wind = "";
			double goodDu =Math.round(good/(good+bad)*100);
			if(good>bad){
				wind="好评居多";
			}else if(bad>good){
				wind="差评居多";
			}else{
				wind="暂无评价";
			}
			
			windLt.add(wind);
			windLt.add((int)goodDu+"%");
			windLt.add((int)(good+bad)+"");
			session.setAttribute("wind", windLt);
			//response.sendRedirect("SteamJsp/pagemgr/shangpin.jsp");
			response.sendRedirect("CommentServlet?opr=commentSelect");
		}else if(opr.equals("typeSelect")){
			out.print("<script>location.href='SteamJsp/pagemgr/rexiao/rexiao.jsp'</script>");
		}else if(opr.equals("commodityType")){
			int key = Integer.parseInt(request.getParameter("key"));
			String strTypeId=request.getParameter("typeId");
			String strSpilt[]=strTypeId.split(",");
			int typeId[]=new int[strSpilt.length];
			//上下页类型
			if(session.getAttribute("pageType")!=null)
				session.removeAttribute("pageType");
			session.setAttribute("pageType", "2");
			if(key!=2){
				//上下页类型
				if(session.getAttribute("pageType")!=null)
					session.removeAttribute("pageType");
				session.setAttribute("pageType", "1");
				for (int i = 0; i < strSpilt.length; i++) {
					typeId[i]=Integer.parseInt(strSpilt[i]);          
				}
			}
			ClientCommodityInformationService ccis=new ClientCommodityInformationServiceImpl();
			int pageIndex=0;
			//判断是否为第一页
			if(request.getParameter("pageIndex")!=null)
				pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
			//返回当前页
			if(session.getAttribute("pageIndex")!=null)
				session.removeAttribute("pageIndex");
			session.setAttribute("pageIndex", pageIndex);
			//获取商品索引
			if(session.getAttribute("commoditySelect")!=null)
				session.removeAttribute("commoditySelect");
			if(key==0){
				session.setAttribute("commoditySelect", ccis.ClientQuery(typeId, key, "", pageIndex, 11));
			}else if(key==1){
				String name = request.getParameter("name");
				session.setAttribute("commoditySelect", ccis.ClientQuery(typeId, key, name, pageIndex, 11));
			}else if(key==2){
				String name = request.getParameter("name");
				session.setAttribute("commoditySelect", ccis.ClientQuery(typeId, key, name, pageIndex, 11));
			}
			out.print("<script>location.href='SteamJsp/pagemgr/rexiao/rexiao.jsp'</script>");
		}else if(opr.equals("sousuo")){
			String name = request.getParameter("name");
			ClientCommodityInformationService ccis = new ClientCommodityInformationServiceImpl();
			if(session.getAttribute("commoditySelect")!=null)
				session.removeAttribute("commoditySelect");
			session.setAttribute("commoditySelect", ccis.ClientQuery(name));
			response.sendRedirect("SteamJsp/pagemgr/daohang/daohang_sousuo.jsp");
		}else if(opr.equals("remove")){
			session.removeAttribute("commoditySelect");
			/*response.sendRedirect("CommodityInformationServlet?opr=commoditySelect&selectType=hotNext&pageIndex=0");*/
		}else if(opr.equals("shoucang")){
			List<CommodityInformation> getlt = (List<CommodityInformation>)session.getAttribute("commoditySelect");
			int commodityIndex = Integer.parseInt(request.getParameter("commodityIndex"));
			CommodityInformation ci = getlt.get(commodityIndex);
			List<CommodityInformation> shouCang = (List<CommodityInformation>)session.getAttribute("shouCang");
			if(shouCang==null)
				shouCang=new ArrayList<CommodityInformation>();
			if(shouCang.size()>5)
				shouCang.remove(0);
			for (CommodityInformation sc : shouCang) {
				if(sc.getCiid()==ci.getCiid()){
					out.print(-1);
					return;
				}
			}
			shouCang.add(ci);
			if(session.getAttribute("shouCang")!=null)
				session.removeAttribute("shouCang");
			session.setAttribute("shouCang", shouCang);
			out.print(1);
			
			/*String getStrCoo = "";
			//获取cookie
			Cookie getCoo[] = request.getCookies();
			for (Cookie co : getCoo) {
				if(co.getName().equals("shoucang"));
				getStrCoo=co.getValue();
			}
			String splict[] =getStrCoo.split("-0-");
			int i = splict.length;
			//存储value
			String cooValue="ciid&^&"+ci.getCiid()+"+_+coverPicture&^&"+ci.getCoverPicture()+"+_+data&^&"
			+ci.getData()+"+_+faXing&^&"+ci.getFaXing()+"+_+from&^&"+ci.getFrom()+"+_+guanYu&^&"+ci.getGuanYu()
			+"+_+kaiFa&^&"+ci.getKaiFa()+"+_+money&^&"+ci.getMoney()+"+_+name&^&"+ci.getName()+"+_+playJianJie&^&"+ci.getPlayJianJie();
			if(getStrCoo!="")
				getStrCoo+="-0-";
			getStrCoo+=cooValue;
			//设置cookie
			Cookie setCoo = new Cookie("shoucang", cooValue);
			response.addCookie(setCoo);*/
			
		}else if(opr.equals("openSc")){
			int scIndex = Integer.parseInt(request.getParameter("scIndex"));
			List<CommodityInformation> shouCang = (List<CommodityInformation>)session.getAttribute("shouCang");
			shouCang.get(scIndex);
			List<CommodityInformation> commoditySelect = new ArrayList<CommodityInformation>();
			commoditySelect.add(shouCang.get(scIndex));
			if(session.getAttribute("commoditySelect")!=null)
				session.removeAttribute("commoditySelect");
			session.setAttribute("commoditySelect",commoditySelect);
			if(session.getAttribute("commodityIndex")!=null)
				session.removeAttribute("commodityIndex");
		
			session.setAttribute("commodityIndex", 0);
			response.sendRedirect("CommodityInformationServlet?opr=shopSelect&commodityIndex=0");
		}
		/*else if(opr.equals("buy")){
			String strJson = request.getParameter("jsonBuy");
			JSONArray json = JSONArray.fromObject(strJson);
		}*/
		/*else if(opr.equals("commodityHotSelect")){
			ClientCommodityInformationService ccis=new ClientCommodityInformationServiceImpl();
			if(session.getAttribute("commodityHotSelect")!=null)
				session.removeAttribute("commodityHotSelect");
			session.setAttribute("commodityHotSelect", ccis.ClientQuery(0, 25));
			response.sendRedirect("SteamJsp/pagemgr/rexiao.jsp");
		}*/
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
