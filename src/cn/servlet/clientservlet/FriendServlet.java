package cn.servlet.clientservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.dao.UserInformationDao;
import cn.entity.UserInformation;
import cn.service.client.ClientFriendService;
import cn.service.client.ClientNoticeService;
import cn.service.client.ClientUserInformationService;
import cn.service.client.impl.ClientFriendServiceImpl;
import cn.service.client.impl.ClientNoticeServiceImpl;
import cn.service.client.impl.ClientUserInformationServiceImpl;

public class FriendServlet extends HttpServlet {

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
		if (opr.equals("friendDelete")) {
			ClientFriendService cfs = new ClientFriendServiceImpl();
			int mineId = Integer.parseInt(request.getParameter("mineId"));
			int friendId = Integer.parseInt(request.getParameter("friendId"));
			int result = cfs.ClientDelete(mineId, friendId);
			if (result > 0)
				response.sendRedirect("UserInformationServlet?opr=friendSelect&mineId="
						+ mineId + "&friendId+=" + friendId);
			else
				out.print(result);
		} else if (opr.equals("friendAdd")) {
			int mineId = Integer.parseInt(request.getParameter("mineId"));
			int friendAddId = Integer.parseInt(request.getParameter("friendAddId"));
			ClientFriendService cfs = new ClientFriendServiceImpl();
			List<UserInformation> ui = (List<UserInformation>) session.getAttribute("userInfo");
			if (mineId == friendAddId) {
				out.print(-1);
			} else {
				int result = cfs.ClientInsert(mineId, friendAddId, ui.get(0)
						.getNickName());
				if (result == 0)
					out.print(0);
				else
					out.print(result);
			}
		} else if (opr.equals("friendAcc")) {
			ClientFriendService cfs = new ClientFriendServiceImpl();
			int mineId = Integer.parseInt(request.getParameter("mineId"));
			int friendId = Integer.parseInt(request.getParameter("friendId"));
			int result = cfs.ClientInsert(mineId, friendId);
			if(result>0){
				int nid = Integer.parseInt(request.getParameter("nid"));
			/*	ClientNoticeService cns = new ClientNoticeServiceImpl();
				cns.ClientDelete(nid);
				response.sendRedirect("NoticeServlet?opr=noticeSelect&mineId="+mineId);*/
				response.sendRedirect("NoticeServlet?opr=noticeDelete&mineId="+mineId+"&nid="+nid);
			}else{
				out.print(result);
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
