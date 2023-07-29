package practice.loginreg.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.loginreg.DAO.ProfileDAO;
import practice.loginreg.model.Employee;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		Employee employee = ProfileDAO.getEmployee(id);
		
		RequestDispatcher rd = request.getRequestDispatcher("editProfile.jsp");
		request.setAttribute("employee", employee);
		rd.forward(request,response);
	}

}
