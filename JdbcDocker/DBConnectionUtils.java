import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionUtils {
	private static Properties props = null;
	static{
		try {
			props = new Properties();
			props.load(new FileInputStream("connection.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection createConnection(){
		Connection con = null;
		try{
			Class.forName(props.getProperty("jdbc.driverClass"));
			con = DriverManager.getConnection(props.getProperty("jdbc.url"), props.getProperty("jdbc.username"), props.getProperty("jdbc.password"));
		}catch(SQLException e){ //Exception handling
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
