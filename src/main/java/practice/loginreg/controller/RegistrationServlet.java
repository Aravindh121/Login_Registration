package practice.loginreg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.loginreg.DAO.RegistrationDAO;
import practice.loginreg.model.Employee;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		Employee employee = new Employee();
		employee.setFirstname(firstName);
		employee.setLastname(lastName);
		employee.setUsername(userName);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setContact(contact);
		
		if(password !=confirmPassword) {
			
		}
		
		RegistrationDAO dao = new RegistrationDAO();
		int isRegistered = dao.register(employee);
		
		
		
		if(isRegistered>0) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			request.setAttribute("status", "success");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			request.setAttribute("status", "failed");
			rd.include(request, response);
		}
		
	}

}
