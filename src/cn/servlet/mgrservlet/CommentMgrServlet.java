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
import cn.entity.UserInformation;
import cn.service.manager.MgrCommentService;
import cn.service.manager.MgrCommodityInformationService;
import cn.service.manager.MgrNoticeService;
import cn.service.manager.MgrUserInformationService;
import cn.service.manager.impl.MgrCommentServiceImpl;
import cn.service.manager.impl.MgrCommodityInformationServiceImpl;
import cn.service.manager.impl.MgrNoticeServiceImpl;
import cn.service.manager.impl.MgrUserInformationServiceImpl;
import cn.servlet.clientservlet.CommentServlet;

public class CommentMgrServlet extends HttpServlet {

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
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String opr = request.getParameter("opr");
		if (opr.equals("commentSelect")) {
			MgrCommentService mcs = new MgrCommentServiceImpl();
			MgrCommodityInformationService mcis = new MgrCommodityInformationServiceImpl();
			
			if(session.getAttribute("commentSelect")!=null)
				session.removeAttribute("commentSelect");
			if(session.getAttribute("commoditySelect")!=null)
				session.removeAttribute("commoditySelect");
			session.setAttribute("commoditySelect", mcis.MgrQueryComment());
			session.setAttribute("commentSelect", mcs.MgrQuery());
			response.sendRedirect("SteamJsp/adminpagemgr/adminpinglun.jsp");
		}if (opr.equals("del")) {
			MgrUserInformationService mis = new MgrUserInformationServiceImpl();
			MgrNoticeService mns = new MgrNoticeServiceImpl();
			int userinfoid = Integer.parseInt(request.getParameter("ctid"));
			mns.MgrDelete(mis.MgrQueryComment(userinfoid).get(0).getUser_Info_Id(), "您的评论因违规 已被删除");
			MgrCommentService mcs = new MgrCommentServiceImpl();
			int result = mcs.MgrDeleteSingle(Integer.parseInt(request.getParameter("ctid")));
			if(result==0){
				out.print(0);
			}else if(result<0){
				out.print(result);
			}else{
				
				response.sendRedirect("CommentMgrServlet?opr=commentSelect");
			}
			
		}
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
