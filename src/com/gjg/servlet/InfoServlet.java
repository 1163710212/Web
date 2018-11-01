package com.gjg.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gjg.bean.Info;
import com.gjg.service.InfoService;
import com.gjg.service.impl.InfoServiceImpl;

public class InfoServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public InfoServlet() {
		super();
	}

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

		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		//����service
		InfoService   is=new InfoServiceImpl();
		//�õ�ǰ̨���������ܵĲ�����m
		String m=request.getParameter("m");
		if(m.equals("query")){
			List<Info>  infos=is.query();
			//���������������
			request.setAttribute("infos", infos);
			//��ת���ύ����
			request.getRequestDispatcher("query.jsp").forward(request, response);
       	}else if(m.equals("add"))
       	{
       		//����ǰ̨add.jsp�еı��еĸ��ֱ�Ԫ�ص�����
       		String id=request.getParameter("id");
       		String name=request.getParameter("name");
       		String idcard=request.getParameter("idcard");
       		String phone=request.getParameter("phone");
       		String mark=request.getParameter("mark");
       		Info  info=new Info(id,name,idcard,phone,mark);
       		is.add(info);
       		response.sendRedirect("common?m=query");
       	}else if(m.equals("remove"))
       	{ 
       		String id=request.getParameter("id"); 
       		is.remove(id);
       		response.sendRedirect("common?m=query");
       	}else if(m.equals("queryById"))
       	{ 
       		String id=request.getParameter("id"); 
       		Info  info=is.queryById(id);
       		request.getSession().setAttribute("info", info);
       		response.sendRedirect("queryById.jsp");
       	}else if(m.equals("modify"))
       	{
       		//����ǰ̨add.jsp�еı��еĸ��ֱ�Ԫ�ص�����
       		String id=request.getParameter("id");
       		String name=request.getParameter("name");
       		String idcard=request.getParameter("idcard");
       		String phone=request.getParameter("phone");
       		String mark=request.getParameter("mark");
       		Info  info=new Info(id,name,idcard,phone,mark);
       		is.modify(info);
       		response.sendRedirect("common?m=query");
       	}
	
		
		out.flush();
		out.close();
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

		 doGet(request,response);
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
