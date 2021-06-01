package cn.servlet.clientservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.entity.Comment;
import cn.entity.Message;
import cn.service.client.ClientMessageService;
import cn.service.client.impl.ClientMessageServiceImpl;

public class MessageServlet extends HttpServlet {

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
		if (opr.equals("messageSelect")) {
			ClientMessageService cms = new ClientMessageServiceImpl();
			if (session.getAttribute("mineId") != null)
				session.removeAttribute("mineId");
			if (session.getAttribute("messageSelect") != null)
				session.removeAttribute("messageSelect");
			if (session.getAttribute("friendIndex") != null)
				session.removeAttribute("friendIndex");
			int friendIndex = Integer.parseInt(request.getParameter("friendIndex"));
			session.setAttribute("friendIndex", friendIndex);
			int mineId =Integer.parseInt(request.getParameter("mineId"));
			int friendId=Integer.parseInt(request.getParameter("friendId"));
			session.setAttribute("mineId",mineId);
			List<Message> getlt = cms.ClientQuery(friendId,mineId);
			session.setAttribute("messageSelect", getlt);
			if(getlt.size()!=0){
				response.sendRedirect("SteamJsp/pagemgr/siwangbiaoqian/message.jsp");
			}else{
				out.print(0);
			}
		}else if(opr.equals("messageSend")){
			ClientMessageService cms = new ClientMessageServiceImpl();
			Message me = new Message();
			me.setMessage(request.getParameter("message"));
			me.setSend_User_Id(Integer.parseInt(request.getParameter("mineId")));
			me.setSendto_User_Id(Integer.parseInt(request.getParameter("friendId")));
			int result = cms.ClientInser(me);
			String friendIndex=request.getParameter("friendIndex");
			if(result==0)
				out.print(0);
			else
				response.sendRedirect("MessageServlet?opr=messageSelect&mineId="+request.getParameter("mineId")+"&friendId="+request.getParameter("friendId")+"&friendIndex="+friendIndex);
		}else if(opr.equals("messageDelete")){
			ClientMessageService cms = new ClientMessageServiceImpl();
			int friendId= Integer.parseInt(request.getParameter("friendId"));
			int mineId = Integer.parseInt(request.getParameter("mineId"));
			int rusult = cms.ClientDelete(friendId,mineId );
			int friendIndex = Integer.parseInt(request.getParameter("friendIndex"));
			response.sendRedirect("MessageServlet?opr=messageSelect&mineId="+mineId+"&friendId="+friendId+"&friendIndex="+friendIndex);
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
