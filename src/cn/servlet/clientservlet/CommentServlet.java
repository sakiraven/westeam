package cn.servlet.clientservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.entity.Comment;
import cn.entity.UserInformation;
import cn.service.client.ClientCommentService;
import cn.service.client.ClientUserInformationService;
import cn.service.client.impl.ClientCommentServiceImpl;
import cn.service.client.impl.ClientUserInformationServiceImpl;

public class CommentServlet extends HttpServlet {

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
		response.setContentType("text/html;charset:utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String opr=request.getParameter("opr");
		if(opr.equals("commentSelect")){
			ClientCommentService ccs = new ClientCommentServiceImpl();
			ClientUserInformationService cuis = new ClientUserInformationServiceImpl();
			//获取获取评论
			if(session.getAttribute("comment")!=null)
				session.removeAttribute("comment");
			int ciid = Integer.parseInt(session.getAttribute("ciid").toString().trim());
			List<Comment> getCtLt = ccs.ClientQuery(ciid, 0, 1000);
			session.setAttribute("comment", getCtLt);
			//获取评论用户信息
			List<UserInformation> getUiLt = new ArrayList<UserInformation>();
			List<Integer> getNumLt = new ArrayList<Integer>();
			for (int i = 0; i < getCtLt.size(); i++) {
				getUiLt.add( cuis.ClientCtName(getCtLt.get(i).getUser_Info_Id()));
				getNumLt.add(ccs.ClientQueryCommentNum(getCtLt.get(i).getUser_Info_Id()));
			}
			if(session.getAttribute("ctName")!=null)
				session.removeAttribute("ctName");
			session.setAttribute("ctName", getUiLt);
			if(session.getAttribute("ctUserCount")!=null)
				session.removeAttribute("ctUserCount");
			session.setAttribute("ctUserCount", getNumLt);
			if(session.getAttribute("commentKey")==null){
				response.sendRedirect("SteamJsp/pagemgr/shangpin.jsp");
			}else{
				session.removeAttribute("commentKey");
				response.sendRedirect("SteamJsp/pagemgr/comment/comment.jsp");
			}
		}else if(opr.equals("commentSend")){
			ClientCommentService ccs = new ClientCommentServiceImpl();
			Comment ct = new Comment();
			ct.setNeiRong(request.getParameter("text"));
			ct.setCiid(Integer.parseInt(request.getParameter("ciid")));
			ct.setType(Integer.parseInt(request.getParameter("type")));
			ct.setUser_Info_Id(Integer.parseInt(request.getParameter("userId")));
			int result = ccs.ClientInsert(ct);
			if(result>0){
				session.setAttribute("commentKey", 1);
				session.setAttribute("ciid", request.getParameter("ciid"));
				response.sendRedirect("CommentServlet?opr=commentSelect");
			}else{
				out.print(result);
			}
			
		}	else if(opr.equals("ctMonthSelect")){
			ClientCommentService ccs = new ClientCommentServiceImpl();
			ClientUserInformationService cuis = new ClientUserInformationServiceImpl();
			int month = Integer.parseInt(request.getParameter("ctMonth"));
			int ciid = Integer.parseInt(request.getParameter("ciid"));
			int type = Integer.parseInt(request.getParameter("type"));
			List<Comment> getCtLt = ccs.ClientQueryCommentMM(2019,month,ciid,type);
			List<UserInformation> getUiLt = new ArrayList<UserInformation>();
			List<Integer> getNumLt = new ArrayList<Integer>();
			for (int i = 0; i < getCtLt.size(); i++) {
				getUiLt.add(cuis.ClientCtName(getCtLt.get(i).getUser_Info_Id()));
				getNumLt.add(ccs.ClientQueryCommentNum(getCtLt.get(i).getUser_Info_Id()));
			}
			if(session.getAttribute("comment")!=null)
				session.removeAttribute("comment");
			session.setAttribute("comment", getCtLt);
			if(session.getAttribute("ctName")!=null)
				session.removeAttribute("ctName");
			session.setAttribute("ctName", getUiLt);
			if(session.getAttribute("ctUserCount")!=null)
				session.removeAttribute("ctUserCount");
			session.setAttribute("ctUserCount", getNumLt);
			response.sendRedirect("SteamJsp/pagemgr/comment/comment.jsp");
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
