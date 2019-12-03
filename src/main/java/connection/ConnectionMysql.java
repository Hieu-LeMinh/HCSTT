package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class ConnectionMysql 
{
	private static final String PROTOCOL = "jdbc:mysql://";
	private static final String SERVER = "localhost";
	private static final int PORT = 3306;
	private static final String DNAME = "hcstt";
	private static final String UNAME = "root";
	private static final String UPASSWORD = "";
	private static final String SSL = "?autoReconnect&useSSL=false";
	
	public String getURL() {
		String url = PROTOCOL + SERVER + ":" + PORT + "/" + DNAME +SSL;
		return url;
	}
	
	public Connection getConnection() {
		Connection cnn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnn = DriverManager.getConnection(this.getURL(), UNAME, UPASSWORD);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
			
		} catch (SQLException e) {
				e.printStackTrace();
		}
		return cnn;
	}	
		
	
	
	
    public static void main( String[] args )
    {
        ConnectionMysql app = new ConnectionMysql();
        System.out.println(app.getConnection());
    }
}
