package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.LoginBean;
import com.dao.LoginDao;


/**
 * Servlet implementation class AddStudentController
 */
public class AddLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String NAME= request.getParameter("txtLoginName");
		LoginBean LoginBean = new LoginBean();
		LoginBean.setNAME(NAME);

		if (new LoginDao().addLogin(LoginBean)) {

			response.sendRedirect("LoginListController");

		} else {

			response.sendRedirect("error.jsp");
		}

		doGet(request, response);
	}

}
