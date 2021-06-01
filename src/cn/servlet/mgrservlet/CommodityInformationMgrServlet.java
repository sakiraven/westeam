package cn.servlet.mgrservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.entity.CommodityInformation;
import cn.service.manager.MgrCommentService;
import cn.service.manager.MgrCommodityInformationService;
import cn.service.manager.impl.MgrCommentServiceImpl;
import cn.service.manager.impl.MgrCommodityInformationServiceImpl;

public class CommodityInformationMgrServlet extends HttpServlet {

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
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String opr = request.getParameter("opr");
		if (opr.equals("commoditySelect")) {
			MgrCommodityInformationService mcis = new MgrCommodityInformationServiceImpl();
			if (session.getAttribute("key") != null)
				session.removeAttribute("key");
			if (session.getAttribute("commoditySelect") != null)
				session.removeAttribute("commoditySelect");
			session.setAttribute("commoditySelect", mcis.MgrQuery());
			response.sendRedirect("SteamJsp/adminpagemgr/adminguanli_sp.jsp");
		} else if (opr.equals("key")) {
			if (session.getAttribute("key") != null)
				session.removeAttribute("key");
			session.setAttribute("key", request.getParameter("key"));
			response.sendRedirect("SteamJsp/adminpagemgr/adminshangpin.jsp");
		} else if (opr.equals("update")) {
			MgrCommodityInformationService mcis = new MgrCommodityInformationServiceImpl();
			CommodityInformation ci = new CommodityInformation();
			ci.setCiid(Integer.parseInt(request.getParameter("ciid")));
			ci.setFaXing(request.getParameter("faxing"));
			ci.setKaiFa(request.getParameter("kaifa"));
			ci.setGuanYu(request.getParameter("guanyu"));
			ci.setMoney(Integer.parseInt(request.getParameter("jiage")));
			ci.setPlayJianJie(request.getParameter("jianjie"));
			ci.setName(request.getParameter("shangpin"));
			int result = mcis.MgrUpDate(ci);
			if (result == 0) {
				out.print(0);
			} else if (result == -1) {
				out.print(-1);
			} else {
				response.sendRedirect("CommodityInformationMgrServlet?opr=commoditySelect");
			}
		} else if (opr.equals("del")) {
			MgrCommodityInformationService mcis = new MgrCommodityInformationServiceImpl();
			int result = mcis.MgrDelete(Integer.parseInt(request
					.getParameter("ciid")));
			if (result == 0) {
				out.print(0);
			} else if (result == -1) {
				out.print(-1);
			} else {
				response.sendRedirect("CommodityInformationMgrServlet?opr=commoditySelect");
			}
		}
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
