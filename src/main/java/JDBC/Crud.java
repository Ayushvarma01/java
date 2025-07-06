package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Crud {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "ayush";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			create(connection);
			read(connection);
			update(connection);
			delate(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void create(Connection connection) throws Exception {
		String query = "INSERT INTO jdbc (id,name,email,password) values (?,?,?,?)";
		PreparedStatement preStatement = connection.prepareStatement(query);
		preStatement.setInt(1, 1);
		preStatement.setString(1, "Ayush varma");
		preStatement.setString(3, "ayush@gmai.com");
		preStatement.setString(4, "ayush");
		preStatement.execute();
		preStatement.close();
		connection.close();

	}

	public static void read(Connection connection) throws Exception {
		String query = "SELECT * FROM jdbc";
		PreparedStatement preStatement = connection.prepareStatement(query);
		ResultSet resultSet = preStatement.getResultSet();
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString("email"));
			System.out.println(resultSet.getString("password"));
		}
		preStatement.execute();
		preStatement.close();
		connection.close();
	}

	public static void update(Connection connection) throws Exception {
		String query = "Update jdbc set name =(?) where name = 'Ayush'";
		PreparedStatement preStatement = connection.prepareStatement(query);
		preStatement.setString(1, "Ayush varma");
		preStatement.executeUpdate();
		preStatement.close();
		connection.close();
	}

	public static void delate(Connection connection) throws Exception {
		String query = "delete from jdbc where id = '1'";
		PreparedStatement preStatement = connection.prepareStatement(query);
		preStatement.execute();
		preStatement.close();
		connection.close();
	}
}
