import java.sql.Connection;
import java.sql.DatabaseMetaData;
public class DatabaseMetaDataEx {
	public static void main(String[] args)throws Exception {
		Connection con = DBConnectionUtils.createConnection();
		
		DatabaseMetaData dbmd = con.getMetaData();

		System.out.println("Database Name:"+dbmd.getDatabaseProductName());
		System.out.println("Database Product version:"+dbmd.getDatabaseProductVersion());
		System.out.println("Driver Name:"+dbmd.getDriverName());
		System.out.println("Driver Version:"+dbmd.getDriverVersion());
		
		con.close();
	}
}
