package cn.servlet.clientservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.service.client.ClientNoticeService;
import cn.service.client.impl.ClientNoticeServiceImpl;

public class NoticeServlet extends HttpServlet {

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
		if (opr.equals("noticeSelect")) {
			int mineId = Integer.parseInt(request.getParameter("mineId"));
			ClientNoticeService cns = new ClientNoticeServiceImpl();
			if (session.getAttribute("noticeSelect") != null)
				session.removeAttribute("noticeSelect");
			session.setAttribute("noticeSelect", cns.ClientQuery(mineId));
			response.sendRedirect("SteamJsp/pagemgr/siwangbiaoqian/notice.jsp");
		}else if (opr.equals("noticeOpen")) {
			if (session.getAttribute("index") != null)
				session.removeAttribute("index");
			String index = request.getParameter("index");
			session.setAttribute("index", index);
			response.sendRedirect("SteamJsp/pagemgr/siwangbiaoqian/noticeOpen.jsp");
		}else if(opr.equals("noticeDelete")){
			ClientNoticeService cns = new ClientNoticeServiceImpl();
			int nid = Integer.parseInt(request.getParameter("nid"));
			int mineId = Integer.parseInt(request.getParameter("mineId"));
			cns.ClientDelete(nid);
			response.sendRedirect("NoticeServlet?opr=noticeSelect&mineId="+mineId);
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
