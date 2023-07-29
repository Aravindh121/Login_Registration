package practice.loginreg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtil {

	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","1234");
//			Context context = new InitialContext();
//			DataSource ds = (DataSource) context.lookup("java:comp/env/myResource");
//			connection = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Util:" + connection);
		return connection;

	}

}
