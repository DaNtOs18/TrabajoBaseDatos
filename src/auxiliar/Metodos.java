package auxiliar;

import java.util.Scanner;

public class Metodos {
	// Leer datos desde teclado
		public void leerTeclado() {
			// ===== In Java 5, Java.util,Scanner is used for this purpose.
			Scanner in = new Scanner(System.in);
			System.out.print("Please enter user name : ");
			String username = in.nextLine();
			System.out.println("You entered : " + username);

		}

		public void mantenimientoMySQL() {

			String tecleado = "XYZ";
			while (tecleado.compareToIgnoreCase("q") != 0) {

				System.out.println("\t\t MENU PRINCIPAL");
				System.out.println("\t\t 1.SELECT");
				System.out.println("\t\t 2.INSERT");
				System.out.println("\t\t 3.UPDATE");
				System.out.println("\t\t 4.DELETE");
				System.out.println("\t\t q,Q SALIR");
				Scanner teclado = new Scanner(System.in);
				tecleado = teclado.nextLine();
				System.out.println("Usted ha tecleado: " + tecleado);
				switch (tecleado) {
				case "1":
					String eleccion1 = "Redirigiendo a la Opci�n ";
					System.out.println(eleccion1 + tecleado);
					break;
				case "2":
					String eleccion2 = "Redirigiendo a la Opci�n ";
					System.out.println(eleccion2 + tecleado);
					
					break;
				case "3":
					String eleccion3 = "Redirigiendo a la Opci�n ";
					System.out.println(eleccion3 + tecleado);
					
					break;
				case "4":
					String eleccion4 = "Redirigiendo a la Opci�n ";
					System.out.println(eleccion4 + tecleado);
					break;
				}
			
			}
			System.out.println("Hasta la pr�xima");

		}

}
