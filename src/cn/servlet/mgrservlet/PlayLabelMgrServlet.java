package cn.servlet.mgrservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;

import cn.service.manager.MgrLanguageLabelService;
import cn.service.manager.MgrPlayLabelService;
import cn.service.manager.impl.MgrLanguageLabelServiceImpl;
import cn.service.manager.impl.MgrPlayLabelServiceImpl;

public class PlayLabelMgrServlet extends HttpServlet {

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
		
		if (opr.equals("playSelect")) {
			MgrPlayLabelService mps = new MgrPlayLabelServiceImpl();
			if(session.getAttribute("playSelect")!=null)
				session.removeAttribute("playSelect");
			session.setAttribute("playSelect", mps.MgrQuery());
			response.sendRedirect("SteamJsp/adminpagemgr/xianshi_palylabel.jsp");
		}else if(opr.equals("update")){
			String str = request.getParameter("key");
			String []  keyString= str.split(","); 
			int key[]=new int[keyString.length];
			for (int i = 0; i < keyString.length; i++) {
				key[i] = Integer.parseInt(keyString[i]);
			}
			str = request.getParameter("value");
			String []  value= str.split(","); 
			
			MgrPlayLabelService mps = new MgrPlayLabelServiceImpl();
			int result = mps.MgrUpDate(key, value);
			if(result==0){
				out.print(0);
			}else if(result<0){
				out.print(result);
			}else{
				response.sendRedirect("PlayLabelMgrServlet?opr=playSelect");
			}
		}else if(opr.equals("del")){
			MgrPlayLabelService mps = new MgrPlayLabelServiceImpl();
			String str = request.getParameter("key");
			String []  keyString= str.split(","); 
			int key[]=new int[keyString.length];
			for (int i = 0; i < keyString.length; i++) {
				key[i] = Integer.parseInt(keyString[i]);
			}
			int result = mps.MgrDelete(key);
			if(result==0){
				out.print(0);
			}else if(result<0){
				out.print(result);
			}else{
				response.sendRedirect("PlayLabelMgrServlet?opr=playSelect");
			}
		}else if(opr.equals("save")){
			MgrPlayLabelService mps = new MgrPlayLabelServiceImpl();
			int result = mps.MgrInsert(request.getParameter("value"));
			if(result==0){
				out.print(0);
			}else if(result<0){
				out.print(result);
			}else{
				response.sendRedirect("PlayLabelMgrServlet?opr=playSelect");
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
