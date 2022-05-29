package mart.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	static Connection con = null;
	public static Connection myConnection() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
		
		System.out.println(con);
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
}
