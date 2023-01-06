import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Personas_SQL {

	public static void leerPersonas() {
		
		try {
			Statement sentencia = GestorDeConexiones.getMYSQL_Connection("escuela").createStatement();
			String sql="select * from personas";
			sentencia.executeQuery(sql);
			ResultSet resultado = sentencia.executeQuery(sql);
			
			while(resultado.next()) {
				System.out.println(resultado.getString("personas_id")+", "+resultado.getString("personas_nombre"));

			}
			
			GestorDeConexiones.getMYSQL_Connection("escuela").close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} //Fin leerPersonas
	
	
	public static void leerPersona(String nombre) {
		try {
			Statement sentencia = GestorDeConexiones.getMYSQL_Connection("escuela").createStatement();
			String sql="select * from personas where personas_nombre='"+nombre+"'";
			sentencia.executeQuery(sql);
			ResultSet resultado = sentencia.executeQuery(sql);
			
			while(resultado.next()) {
				System.out.println(resultado.getString("personas_nombre")+", "+
				resultado.getString(3)+", "+resultado.getString(4)+", "+resultado.getString(5)+", "+
				resultado.getString(6)+", "+resultado.getString(7));
			}
			
			GestorDeConexiones.getMYSQL_Connection("escuela").close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} //Fin leerPersona
	
	
	//Inserción
	public static Persona insertarPersona(Persona p1) {
		
		try {
			Statement sentencia = GestorDeConexiones.getMYSQL_Connection("escuela").createStatement();
			String sqlInsert="insert into personas(personas_nombre,personas_domicilio,personas_telefono,personas_correo,personas_fecha_nacimiento,personas_genero)"
					+ "values('"+p1.getNombre()+"','"+p1.getDomicilio()+"','"+p1.getTelefono()+"','"+p1.getCorreo()+"','"+p1.getFecha_nacimiento()+"','"+p1.getGenero()+"')";
			sentencia.executeUpdate(sqlInsert);
			//ResultSet resultado = sentencia.executeQuery(sqlInsert);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return p1;
		
	}
	
	
	
	//Modificación
	public static boolean modificarPersona(int id, String nombre,String direccion) {
		boolean res=false;
		try {
			Statement sentencia = GestorDeConexiones.getMYSQL_Connection("escuela").createStatement();
			String sqlModificar="update personas set personas_nombre='"+nombre+"', personas_domicilio='"+direccion+"' where personas_id="+id+"";
			sentencia.executeUpdate(sqlModificar);
			
			PreparedStatement ps = GestorDeConexiones.getMYSQL_Connection("escuela").prepareStatement(sqlModificar);
			
			int registros = ps.executeUpdate();
			System.out.println(registros);
			
			if(registros>0) {
				res = true;
			}else {
				res = false;
			}
			
			GestorDeConexiones.getMYSQL_Connection("escuela").close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}  // Fin modificar
	
	
	public static boolean borrarPersona(int id) {
		
		boolean res = false;
		
		try {
			Statement sentencia = GestorDeConexiones.getMYSQL_Connection("escuela").createStatement();
			String sqlDelete="delete from personas where personas_id="+id+" ";
			sentencia.executeUpdate(sqlDelete);
			
			PreparedStatement ps = GestorDeConexiones.getMYSQL_Connection("escuela").prepareStatement(sqlDelete);
			int registros = ps.executeUpdate();
			System.out.println(registros);
			
			if(registros>0) {
				res = true;
			}else {
				res = false;
			}
			
			GestorDeConexiones.getMYSQL_Connection("escuela").close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
