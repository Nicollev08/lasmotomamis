package ejemplo1;

import ejemplo1.Iconexion;
import ejemplo1.ConexionVacia;
import ejemplo1.ConexionSQLServer;
import ejemplo1.ConexionPostgreSQL;
import ejemplo1.ConexionOracle;

public class ConexionFabrica {

	public Iconexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return (Iconexion) new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}
}
