import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorDeConexiones {

	private final static String MYSQL_DB_USUARIO="root";
	private final static String MYSQL_DB_PASSWORD="eugenioPJ11";
	
	private final static String MYSQL_DB_DRIVER="com.mysql.cj.jdbc.Driver";
	private final static String MYSQL_DB_URL="jdbc:mysql://localhost/";
	
	public static Connection getMYSQL_Connection(String database) {
		Connection conexion = null;
		
		try {
			Class.forName(MYSQL_DB_DRIVER);
			conexion=DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","eugenioPJ11");
		}catch (ClassNotFoundException ex) {
			ex.getMessage();
		}catch(SQLException eq) {
			eq.getMessage();
		}
		
		return conexion;
		
	}
	
}
