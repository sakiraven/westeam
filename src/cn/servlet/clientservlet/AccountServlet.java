package cn.servlet.clientservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.entity.Account;
import cn.entity.UserInformation;
import cn.service.client.ClientAccountService;
import cn.service.client.ClientUserInformationService;
import cn.service.client.impl.ClientAccountServiceImpl;
import cn.service.client.impl.ClientUserInformationServiceImpl;

public class AccountServlet extends HttpServlet {

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
		//创建session作用域 
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String opr = request.getParameter("opr");
		if (opr.equals("login")) {
			//创建对应账户表的对象
			ClientAccountService cas = new ClientAccountServiceImpl();
			//创建对象用户信息表的对象
			ClientUserInformationService cuis = new ClientUserInformationServiceImpl();
			//调用查询方法
			Account at = cas.ClientDengLu(username, password);
			//判断返回值 -1异常
			if (at == null) {
				out.print(-1);
			} else {
				//判断值
				if(session.getAttribute("login")==null)
					session.removeAttribute("login");//删除之
				if(session.getAttribute("userInfo")==null)//判断值
					session.removeAttribute("userInfo");//删除值
				session.setAttribute("userInfo", cuis.ClientQuery(at.getAid()));//创建session
				session.setAttribute("login", at);//创建session
				//判断用户级别
				if (at.getAdmin() == 1) {
					out.print(1);
				} else {
					out.print(0);
				}
			}
		}else if (opr.equals("zhuce")) {
			ClientAccountService cas = new ClientAccountServiceImpl();
			ClientUserInformationService cuis=new ClientUserInformationServiceImpl();
			String nc=request.getParameter("nickname");
			String yhm=request.getParameter("yhm");
			String mm=request.getParameter("mm");
			Account at=new Account();
			at.setName(yhm);
			at.setPassword(mm);
			UserInformation ui=new UserInformation();
			ui.setNickName(nc);
			if (cas.ClientZhuCe(at,ui)>0) {
				out.print(1);
			}else if(cas.ClientZhuCe(at, ui)==0)
			{
				out.print(0);
			}else {
				out.print(-1);
			}
		}else if(opr.equals("yzyhm")){
		    ClientAccountService cas=new ClientAccountServiceImpl();
		    String yhm=request.getParameter("yhm");
		    if (cas.ClientYanZheng(yhm)==null) {
				out.print(0);
			}else {
				out.print(1);
			}
		}else if(opr.equals("zhuXiao")){
			session.removeAttribute("login");
			session.removeAttribute("userInfo");
			response.sendRedirect("SteamJsp/pagemgr/denglu.jsp");
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
