package prog;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatos {
	
	static public Connection conexion;
	
	public void abrirConexion( String nombreBD ) {
		try {
			Class.forName("org.sqlite.JDBC");
			conexion = DriverManager.getConnection("jbc:sqlite" +  nombreBD);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void cerrarConexion() {
		try {
			conexion.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
