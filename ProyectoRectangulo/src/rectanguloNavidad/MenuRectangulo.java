
package rectanguloNavidad;

import utiles.Teclado;

/**
 * Rect�ngulos que cambian
 * 
 * Para aquellos alumnos que deben repasar los conceptos de POO del primer
 * trimestre (obligatoriamente para los suspensos...) Entrega un proyecto Java
 * que: Almacene un conjunto de rect�ngulos. Mediante la clase men� se le
 * permitir� al usuario gestionar el array de rect�ngulos. Cada vez que un
 * rect�ngulo cambie se mostrar� la lista al completo. Inicialmente el usuario
 * indicar� el total de rect�ngulos que va a crear Todos los rect�ngulos tendr�n
 * inicialmente un tama�o de 2x1. Las longitudes de los lados ser�n enteras.
 * Cada uno de los rect�ngulos podr�: Engordar/adelgazar (a lo ancho)
 * Crecer/decrecer (a lo alto) El rect�ngulos m�s peque�o ser� de 1x1 Cada uno
 * de los rect�ngulos se dibujar� mediante asteriscos con System.out.println().
 * De cada rect�ngulo se indicar� tambi�n su �rea y que es un cuadrado (en caso
 * de serlo...) As�, por ejemplo, si tenemos una lista de dos rect�ngulos, uno
 * 1x1 y otro de 2x7 se mostrar�: * * *** cuadrado de 1 m2 * * * * * * * * * * *
 * * * * **** rect�ngulo de 14 m2
 * 
 * @author Pablo S�nchez Sanvicente
 * @version 1.0
 */
public class MenuRectangulo {
	
	public static void main(String[] args) {

		
		int cantidad; // declarar variable
		Rectangulo[] rectangulo;

		do {
			cantidad = pedirCantidad();
			rectangulo = new Rectangulo[cantidad];

			// Le a�ado los rect�ngulos al array
			for (int i = 0; i < cantidad; i++)
				rectangulo[i] = new Rectangulo();

			menuOpciones(rectangulo, cantidad);
		} while (deseaContinuar());
		System.out.println("Hasta pronto!!");
	}// main

	
	private static int pedirCantidad() {
	
		int cantidad;
		System.out.println("Cu�ntos rectangulos deseas tener?:");
		do {
			cantidad = Teclado.leerEntero(); // valor entero
			if (cantidad < 1)
				System.out
						.println("Introduzca n�mero positivo mayor de 0, por favor.");
		} while (cantidad < 1);// limitamos a que el numero sea entero positivo
		return cantidad;
	}

	

	
	static private void menuOpciones(Rectangulo[] rectangulo, int cantidad) {
		
		int opcion;
		
		int nRectangulo;
		do {
			do {
				System.out.println("�Qu� rectangulo desea manejar?");

				nRectangulo = (Teclado.leerEntero()) - 1;
				if (nRectangulo < 0 || nRectangulo > (rectangulo.length - 1))
					System.out.println("Tenemos " + rectangulo.length
							+ " rectangulo/s. Elija uno correcto");
			} while (nRectangulo < 0 || nRectangulo > (rectangulo.length - 1));
			System.out.println("�Qu� desea hacer con el rectangulo?");
			do {
				System.out
						.println("1-Crecer. 2-Decrecer. 3- Engordar. 4-Adelgazar. 5-Volver a elegir rectangulo. 6-Reiniciar o salir.");

				opcion = Teclado.leerEntero();
				if (opcion < 1 || opcion > 6)
					System.out
							.println("Elija una opci�n entre las disponibles[1-6].");
			} while (opcion < 1 || opcion > 6);
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


	static private void mostrarRectangulos(int cantidad, Rectangulo[] rectangulo) {
		for (int i = 0; i < cantidad; i++)
			rectangulo[i].mostrarDibujo();
	}

	static private boolean deseaContinuar() {

		System.out
				.println("�Desea reiniciar?En caso negativo, saldr� del programa (s/n)");
		char elegir = Teclado.leerCaracter();

		if (elegir == 's' || elegir == 'S') {
			return true;
		}// if
		else {
			return false;
		}// else
	}// Continuar
}// class
