package practice.loginreg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;

import practice.loginreg.util.ConnectionUtil;

public class LoginDAO {
	Connection connection = ConnectionUtil.getConnection();
	
	public ResultSet login(String username, String password) {
		ResultSet rs = null;
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM employee where username = ? and password = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
//		System.out.println("sdfg");
		return rs;
	}
	
}
