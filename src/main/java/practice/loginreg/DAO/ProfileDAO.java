package practice.loginreg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import practice.loginreg.model.Employee;
import practice.loginreg.util.ConnectionUtil;

public class ProfileDAO {
		
	public static Employee getEmployee(int id) {
		Connection connection = null;
		Employee employee = null;
		try {
			connection = ConnectionUtil.getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM employee where id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String username = rs.getString("username");
				String address = rs.getString("address");
				String contact = rs.getString("contact");
				
				employee = new Employee(id, firstname, lastname, username, address, contact);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return employee;
	}
	
	public static int updateEmployee(Employee employee) {
		Connection connection = null;
		int res=0;
		try {
			connection = ConnectionUtil.getConnection();
			PreparedStatement stmt = connection.prepareStatement("UPDATE employee set firstname=?,lastname=?,username=?,address=?,contact=? where id=?");
			stmt.setString(1, employee.getFirstname());
			stmt.setString(2, employee.getLastname());
			stmt.setString(3, employee.getUsername());
			stmt.setString(4, employee.getAddress());
			stmt.setString(5, employee.getContact());
			stmt.setInt(6, employee.getId());
			res = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
}
