package cn.servlet.clientservlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.entity.UserInformation;
import cn.service.client.ClientMessageService;
import cn.service.client.ClientUserGamesService;
import cn.service.client.ClientUserInformationService;
import cn.service.client.impl.ClientMessageServiceImpl;
import cn.service.client.impl.ClientUserGamesServiceImpl;
import cn.service.client.impl.ClientUserInformationServiceImpl;

public class UserInformationServlet extends HttpServlet {

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
		String pathUser = request.getSession().getServletContext().getRealPath("SteamJsp/userpicture/");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String opr = request.getParameter("opr");
		if(opr.equals("friendSelect")){
			int userInfoId = Integer.parseInt(request.getParameter("mineId"));
			ClientUserInformationService cuis = new ClientUserInformationServiceImpl();
			if(session.getAttribute("friendSelect")!=null)
				session.removeAttribute("friendSelect");
			List<UserInformation> sd = cuis.ClientFriendQuery(userInfoId);
			session.setAttribute("friendSelect",sd);
			
			ClientMessageService cms = new ClientMessageServiceImpl();
			int status[] =new int[sd.size()];
			List<Integer> getStatusLt = new ArrayList<Integer>(); 
			for (int i = 0; i < sd.size(); i++) {
				int value=0;
				int cqs =  cms.ClientQueryStatus(sd.get(i).getUser_Info_Id(), userInfoId).size();
				if(cqs==0){
					getStatusLt.add(1);
					//status[i]=1;
					continue;
				}
				for (int j = 0; j < cqs; j++) {
					int reUserInfoId = cms.ClientQueryStatus(sd.get(i).getUser_Info_Id(), userInfoId).get(j).getSend_User_Id();
					if(reUserInfoId==userInfoId){
						if(j==cqs-1)
							getStatusLt.add(1);
						continue;
					}else{
						value = cms.ClientQueryStatus(sd.get(i).getUser_Info_Id(), userInfoId).get(j).getStatus();
						if(value==0){
							getStatusLt.add(0);
							break;
						}
						if(j==cqs-1)
							getStatusLt.add(1);
							//status[i]=0;
					}
				}
			}
			if(session.getAttribute("messageStatus")!=null)
				session.removeAttribute("messageStatus");
			session.setAttribute("messageStatus",getStatusLt);
			response.sendRedirect("SteamJsp/pagemgr/siwangbiaoqian/friend.jsp");
		}else if(opr.equals("friendFind")){
			String userName = request.getParameter("userName");
			ClientUserInformationService cuis = new ClientUserInformationServiceImpl();
			UserInformation ui = cuis.ClientFriendQuery(userName);
			if(ui!=null){
				if(session.getAttribute("friendFind")!=null)
					session.removeAttribute("friendFind");
				session.setAttribute("friendFind", ui);
				response.sendRedirect("SteamJsp/pagemgr/siwangbiaoqian/friendFind.jsp");
			}
			else
				out.print(0);
		}else if(opr.equals("mineUpdate")){
			boolean flage = true;
			String uploadFileName="";		//�ϴ��ļ���
	    	String fieldName="";			//���ֶ�Ԫ�ص�name����ֵ
	    	String name="";
	    	//������Ϣ�е������Ƿ���nultipart����
	    	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	    	//�ϴ��ļ��Ĵ洢·��(�������ļ�ϵͳ�ϵľ����ļ�·��)
	    	//request.getSession().getServletContext().getRealPath("SteamJsp/userpicture/")
	    	if(isMultipart)
	    	{
	    		FileItemFactory factory = new DiskFileItemFactory();
	    		ServletFileUpload upload= new ServletFileUpload(factory);
	    		
	    		try{
	    			upload.setFileSizeMax(1024*1024*10);
	    			//����form���������ļ�
	    			List<FileItem> items = upload.parseRequest(request);
	    			Iterator<FileItem> iter = items.iterator();
	    			while(iter.hasNext())				//���δ���ÿ���ļ�
	    			{
	    				FileItem item =(FileItem)iter.next();
	    				if(item.isFormField())			//��ͨ���ֶ�
	    				{
	    					fieldName = item.getFieldName();//���ֶε�name����ֵ
	    					if(fieldName.equals("user"))
	    					{
	    						//������ֶε�ֵ
	    						out.print(item.getString("UTF-8")+"�ϴ����ļ���");
	    					}
	    				}else{	//�ļ����ֶ�
	    					String fileName = item.getName();
	    					if(fileName!=null&&!fileName.equals("")){
	    						String houZhui = fileName.substring(fileName.indexOf("."));
	    						if(!(houZhui.equals(".png")||houZhui.equals(".jpg"))){
	    							out.print(-2);
	    							flage = false;
	    							return;
	    						}
	    						name=UUID.randomUUID().toString().replace("-", "")+houZhui;
	    						File fullFile = new File(item.getName());
	    						//fullFile.getName()
	    						File saveFile = new File(pathUser,name);
	    						item.write(saveFile);
	    						uploadFileName = fullFile.getName();
	    						
	    					}
	    				}
	    			}
	    		}catch(Exception e){
	    			e.printStackTrace();
	    			out.print(-1);
	    		}finally{
	    			if(flage)
	    				response.sendRedirect("UserInformationServlet?opr=userInfoUpdate&picture="+name+"&key=0");
	    		}
	 
	    	}
		}else if(opr.equals("userInfoUpdate")){
			ClientUserInformationService cuis = new ClientUserInformationServiceImpl();
			List<UserInformation> ui =(List<UserInformation>)session.getAttribute("userInfo");
			int key = Integer.parseInt(request.getParameter("key"));
			if(key==0){
				if(!ui.get(0).getPicture().equals("picture.jpg")){
					File f = new File(pathUser+ui.get(0).getPicture());
					f.delete();
				}
				String picture = request.getParameter("picture");
				ui.get(0).setPicture(picture);
			}else if(key==1){
				cuis.ClientChongZhi(Integer.parseInt(request.getParameter("money")), ui.get(0).getUser_Info_Id());
				if(session.getAttribute("userInfo")!=null)
					session.removeAttribute("userInfo");
				List<UserInformation> getlt =  cuis.ClientQuery(ui.get(0).getAid());
				session.setAttribute("userInfo", getlt);
				out.print(getlt.get(0).getBlance());
				return;
			}else if(key==2){}
			cuis.ClientUpDate(ui.get(0));
			if(session.getAttribute("userInfo")==null)
				session.removeAttribute("userInfo");
			session.setAttribute("userInfo", cuis.ClientQuery(ui.get(0).getAid()));
			response.sendRedirect("SteamJsp/pagemgr/yonghuxinxi.jsp");
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
