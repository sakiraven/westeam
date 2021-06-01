package cn.servlet.mgrservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.dao.UserInformationDao;
import cn.dao.impl.UserInformationDaoImpl;
import cn.service.manager.MgrAccountService;
import cn.service.manager.impl.MgrAccountServiceImpl;

public class AccountMgrServlet extends HttpServlet {

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
		if (opr.equals("accountSelect")) {
			MgrAccountService mas = new MgrAccountServiceImpl();
			UserInformationDao uid = new UserInformationDaoImpl();
			if (session.getAttribute("key") != null)
				session.removeAttribute("key");
			if (session.getAttribute("accountSelect") != null)
				session.removeAttribute("accountSelect");
			if (session.getAttribute("userInfoSelect") != null)
				session.removeAttribute("userInfoSelect");
			session.setAttribute("userInfoSelect", uid.UidQuery(0, 0));
			session.setAttribute("accountSelect", mas.MgrQuery());
			response.sendRedirect("SteamJsp/adminpagemgr/adminguanli.jsp");
		} else if (opr.equals("accountDel")) {
			MgrAccountService mas = new MgrAccountServiceImpl();
			int aid = Integer.parseInt(request.getParameter("aid"));
			int result = mas.MgrDelete(aid);
			if (result == -1) {
				out.print(-1);
			} else {
				response.sendRedirect("AccountMgrServlet?opr=accountSelect");
			}
		} else if (opr.equals("key")) {
			if (session.getAttribute("key") != null)
				session.removeAttribute("key");
			session.setAttribute("key", request.getParameter("key"));
			response.sendRedirect("SteamJsp/adminpagemgr/adminyonghu.jsp");
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
