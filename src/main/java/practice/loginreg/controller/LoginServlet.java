package practice.loginreg.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import practice.loginreg.DAO.LoginDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginDAO dao = new LoginDAO();
		ResultSet rs = dao.login(username, password);
		RequestDispatcher rd = null;
		try {
			if(rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("start", "true");
				session.setAttribute("id", rs.getInt(1));
				session.setAttribute("firstname", rs.getString(2));
				session.setAttribute("lastname", rs.getString(3));
				rd = request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}
			else {
				rd = request.getRequestDispatcher("login.jsp");
				request.setAttribute("status", "failed");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
