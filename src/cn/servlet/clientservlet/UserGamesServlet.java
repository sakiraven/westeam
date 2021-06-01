package cn.servlet.clientservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.entity.UserInformation;
import cn.service.client.ClientUserGamesService;
import cn.service.client.ClientUserInformationService;
import cn.service.client.impl.ClientUserGamesServiceImpl;
import cn.service.client.impl.ClientUserInformationServiceImpl;

public class UserGamesServlet extends HttpServlet {

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
		if(opr.equals("gameBuy")){
			ClientUserGamesService cugs = new ClientUserGamesServiceImpl();
			ClientUserInformationService cuis = new ClientUserInformationServiceImpl();
			String strCiid = request.getParameter("ciid");
			int userInfoId = Integer.parseInt(request.getParameter("userInfoId"));
			int total = Integer.parseInt(request.getParameter("total"));
			String splitCiid[] = strCiid.split(",");
			int ciid[]= new int[splitCiid.length];
			for (int i = 0; i < splitCiid.length; i++) {
				ciid[i]=Integer.parseInt(splitCiid[i]);
			}
			cugs.ClientInsert(userInfoId, ciid, total);
			List<UserInformation> getlt = (List<UserInformation>)session.getAttribute("userInfo");
			session.removeAttribute("userInfo");
			getlt = cuis.ClientQuery(getlt.get(0).getAid());
			session.setAttribute("userInfo", getlt);
			out.print(getlt.get(0).getBlance());
		}else if(opr.equals("buyCarRe")){
			int ciid = Integer.parseInt(request.getParameter("ciid"));
			List<UserInformation> getlt = (List<UserInformation>)session.getAttribute("userInfo");
			ClientUserGamesService cugs = new ClientUserGamesServiceImpl();
			int result = cugs.ClientQueryRe(ciid, getlt.get(0).getUser_Info_Id());
			out.print(result);
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
