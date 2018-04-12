package principal;

import auxiliar.Metodos;
import modelo.dao.AccesoDatos;

public class Principal {

	public static void main(String[] args) {
		Metodos md = new Metodos();
		AccesoDatos ad = new AccesoDatos();
		//String sql = "SELECT * FROM " + tabla;
		ad.getAllRecords("localhost", "jonathan", "Jonathan", "qwerty", "Cine");
		md.mantenimientoMySQL();
	}

}
