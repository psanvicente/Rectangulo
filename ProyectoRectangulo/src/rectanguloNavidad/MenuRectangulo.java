
package rectanguloNavidad;

import utiles.Teclado;

/**
 * Rectangulos que cambian<br/>
 * 
 * Para aquellos alumnos que deben repasar los conceptos de POO del primer<br/>
 * trimestre (obligatoriamente para los suspensos...) Entrega un proyecto Java que:<br/><br/>
 *
 * <ul>
 *	<li> Almacene un conjunto de rectangulos.</li>
 *	<li>Mediante la clase menu se le permitira al usuario gestionar el array de rectangulos.</li>
 *	<li>Cada vez que rectangulo cambie se mostrara la lista al completo.</li>
 *	<li>Inicialmente el usuario indicara el total de rectangulos que va a crear.</li>
 *	<li>Todos los rectangulos tendran inicialmente un tamano de 2x1.</li>
 *	<li> Las longitudes de los lados seran enteras.</li>
 *	<li>Cada uno de los rectangulos podra:
 *		<ul>
 *			<li>Engordar/adelgazar (a lo ancho)</li>
 *			<li>Crecer/decrecer (a lo alto) El rectangulos mas pequeno sera de 1x1</li>
 *			<li>Cada de los rectangulos se dibujara mediante asteriscos con System.out.println().</li>
 *			<li>De cada rectangulo se indicara tambien su area y que es un cuadrado (en casode serlo...)<br/> 
 *			Asi, por ejemplo, si tenemos una lista de dos rectangulos, uno 1x1 y otro de 2x7 se mostrara: <br/>
 *			cuadrado de 1 m2 rectangulo de 14 m2</li>
 *		</ul>
 *	</li>
 * </ul>
 *
 * 
 * @author Pablo Sanchez Sanvicente
 * @version 1.0
 */
public class MenuRectangulo {
	
	/**
	 * Asks user for an amount of rectangles to be created and allows to operate
	 * with them through menuOpciones method
	 * @param args Array of String
	 */
	public static void main(String[] args) {
		int cantidad; 
		Rectangulo[] rectangulo;

		do {
			cantidad = pedirCantidad();
			rectangulo = new Rectangulo[cantidad];

			
			for (int i = 0; i < cantidad; i++)
				rectangulo[i] = new Rectangulo();

			menuOpciones(rectangulo, cantidad);
		} while (deseaContinuar());
		System.out.println("Hasta pronto!!");
	}// main

	/**
	 * Asks user for an amount and returns it
	 * @return Amount inserted by user
	 */
	private static int pedirCantidad() {
	
		int cantidad;
		System.out.println("Cuantos rectangulos deseas tener?:");
		do {
			cantidad = Teclado.leerEntero();
			if (cantidad < 1)
				System.out
						.println("Introduzca numero positivo mayor de 0, por favor.");
		} while (cantidad < 1);
		return cantidad;
	}//pedirCantidad

	

	/**
	 * Shows a menu containing options to operate with a set of rectangles, takes the
	 * option selected by user and performs it
	 * @param rectangulo Array of Rectangulo
	 * @param cantidad Amount of Rectangulo objects in the array
	 */
	static private void menuOpciones(Rectangulo[] rectangulo, int cantidad) {
		
		int opcion;
		
		int nRectangulo;
		do {
			do {
				System.out.println("¿Que rectangulo desea manejar?");

				nRectangulo = (Teclado.leerEntero()) - 1;
				if (nRectangulo < 0 || nRectangulo > (rectangulo.length - 1))
					System.out.println("Tenemos " + rectangulo.length
							+ " rectangulo/s. Elija uno correcto");
			} while (nRectangulo < 0 || nRectangulo > (rectangulo.length - 1));
			System.out.println("¿Que desea hacer con el rectangulo?");
			do {
				System.out
						.println("1-Crecer. 2-Decrecer. 3- Engordar. 4-Adelgazar. 5-Volver a elegir rectangulo. 6-Reiniciar o salir.");

				opcion = Teclado.leerEntero();
				if (opcion < 1 || opcion > 6)
					System.out
							.println("Elija una opcion entre las disponibles[1-6].");
			} while (opcion < 1 || opcion > 6)
			switch (opcion) {
			case 1:
				rectangulo[nRectangulo].crecer();
				mostrarRectangulos(cantidad, rectangulo);
				break;
			case 2:
				rectangulo[nRectangulo].decrecer();
				mostrarRectangulos(cantidad, rectangulo);
				break;
			case 3:
				rectangulo[nRectangulo].engordar();
				mostrarRectangulos(cantidad, rectangulo);
				break;
			case 4:
				rectangulo[nRectangulo].adelgazar();
				mostrarRectangulos(cantidad, rectangulo);
				break;
			case 5:
				break;
			case 6:
				break;

			}// switch
		} while (opcion != 6);
	}// menu

	/**
	 * Draws a set of rectangles by using its mostrarDibujo method
	 * @param cantidad Amount of Rectangulo objects
	 * @param rectangulo Array of Rectangulo object
	 */
	static private void mostrarRectangulos(int cantidad, Rectangulo[] rectangulo) {
		for (int i = 0; i < cantidad; i++)
			rectangulo[i].mostrarDibujo();
	}//mostrarRectangulos

	/**
	 * Asks user if he/she wants to continue
	 * @return true if he/she wants to continue, false if not
	 */
	static private boolean deseaContinuar() {

		System.out.println("¿Desea reiniciar?En caso negativo, saldra del programa (s/n)");
		char elegir = Teclado.leerCaracter();

		if (elegir == 's' || elegir == 'S') {
			return true;
		}
		else {
			return false;
		}
	}//continuar
}//MenuRectangulo
