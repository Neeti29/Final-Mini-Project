package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	
	private static String connectionName = "jdbc:postgresql://ec2-23-21-244-254.compute-1.amazonaws.com:5432/dfubjb9egaeq50";
	private static  String userName  = "wikovyuzakmmot";
	private static  String password =  "4f68b3981ad7d3665e52371a0199f91a13a6e56f2f6ca714677e2d94c65c8202";
	private static String driverName = "org.postgresql.Driver";
	
	
	public static  Connection getConnection() {
		Connection	con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // cj is a latest driver //loading and registering the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ems", "root", "dhoom1234");
			
		}

		catch (Exception e) {
			System.out.println(e);
		}
		return con;
	
	}

	
	public static  Connection getPSConnection() {
		Connection	con= null;
		try {
			Class.forName(driverName); // cj is a latest driver //loading and registering the driver
			con = DriverManager.getConnection(connectionName, userName, password);
			
		}

		catch (Exception e) {
			System.out.println(e);
		}
		return con;
	
	}

}
