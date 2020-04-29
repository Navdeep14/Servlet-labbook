package cg.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	private static Connection connection = null;

	public static Connection getConnection() throws SQLException {

//		File file = null;
//		FileInputStream inputStream = null;

		// file = new
		// File("C:\\Module2\\Servletlab3\\src\\resources\\jdbc.properties");
			// inputStream = new FileInputStream(file);
			//
			// Properties properties = new Properties();
			// properties.load(inputStream);

			// String driver = properties.getProperty("db.driver");
			// String url = properties.getProperty("db.url");
			// String username = properties.getProperty("db.username");
			// String password = properties.getProperty("db.password");
			String url = "jdbc:oracle:thin:@10.51.103.201:1521:orcl11g";
			// Class.forName(driver);
			connection = DriverManager.getConnection(url, "Lab1ctrg22", "lab1coracle");
			// System.out.println("Connection Established");
		return connection;
	}
}