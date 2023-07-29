package practice.loginreg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import practice.loginreg.model.Employee;
import practice.loginreg.util.ConnectionUtil;

public class RegistrationDAO {
	
	Connection connection = ConnectionUtil.getConnection();
	
	public int register(Employee employee) {
		int isRegistered = 0;
		try {
			System.out.println(connection);
			PreparedStatement stmt = connection.prepareStatement("INSERT INTO employee(firstname,lastname,username,password,address,contact) VALUES (?,?,?,?,?,?)");
			stmt.setString(1, employee.getFirstname());
			stmt.setString(2, employee.getLastname());
			stmt.setString(3, employee.getUsername());
			stmt.setString(4, employee.getPassword());
			stmt.setString(5, employee.getAddress());
			stmt.setString(6, employee.getContact());
			isRegistered = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isRegistered;
	}
}
