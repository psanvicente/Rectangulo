
package rectanguloNavidad;

import utiles.Teclado;

/**
 * Rectángulos que cambian
 * 
 * Para aquellos alumnos que deben repasar los conceptos de POO del primer
 * trimestre (obligatoriamente para los suspensos...) Entrega un proyecto Java
 * que: Almacene un conjunto de rectángulos. Mediante la clase menú se le
 * permitirá al usuario gestionar el array de rectángulos. Cada vez que un
 * rectángulo cambie se mostrará la lista al completo. Inicialmente el usuario
 * indicará el total de rectángulos que va a crear Todos los rectángulos tendrán
 * inicialmente un tamaño de 2x1. Las longitudes de los lados serán enteras.
 * Cada uno de los rectángulos podrá: Engordar/adelgazar (a lo ancho)
 * Crecer/decrecer (a lo alto) El rectángulos más pequeño será de 1x1 Cada uno
 * de los rectángulos se dibujará mediante asteriscos con System.out.println().
 * De cada rectángulo se indicará también su área y que es un cuadrado (en caso
 * de serlo...) Así, por ejemplo, si tenemos una lista de dos rectángulos, uno
 * 1x1 y otro de 2x7 se mostrará: * * *** cuadrado de 1 m2 * * * * * * * * * * *
 * * * * **** rectángulo de 14 m2
 * 
 * @author Pablo Sánchez Sanvicente
 * @version 1.0
 */
public class MenuRectangulo {
	
	public static void main(String[] args) {

		
		int cantidad; // declarar variable
		Rectangulo[] rectangulo;

		do {
			cantidad = pedirCantidad();
			rectangulo = new Rectangulo[cantidad];

			// Le añado los rectángulos al array
			for (int i = 0; i < cantidad; i++)
				rectangulo[i] = new Rectangulo();

			menuOpciones(rectangulo, cantidad);
		} while (deseaContinuar());
		System.out.println("Hasta pronto!!");
	}// main

	
	private static int pedirCantidad() {
	
		int cantidad;
		System.out.println("Cuántos rectangulos deseas tener?:");
		do {
			cantidad = Teclado.leerEntero(); // valor entero
			if (cantidad < 1)
				System.out
						.println("Introduzca número positivo mayor de 0, por favor.");
		} while (cantidad < 1);// limitamos a que el numero sea entero positivo
		return cantidad;
	}

	

	
	static private void menuOpciones(Rectangulo[] rectangulo, int cantidad) {
		
		int opcion;
		
		int nRectangulo;
		do {
			do {
				System.out.println("¿Qué rectangulo desea manejar?");

				nRectangulo = (Teclado.leerEntero()) - 1;
				if (nRectangulo < 0 || nRectangulo > (rectangulo.length - 1))
					System.out.println("Tenemos " + rectangulo.length
							+ " rectangulo/s. Elija uno correcto");
			} while (nRectangulo < 0 || nRectangulo > (rectangulo.length - 1));
			System.out.println("¿Qué desea hacer con el rectangulo?");
			do {
				System.out
						.println("1-Crecer. 2-Decrecer. 3- Engordar. 4-Adelgazar. 5-Volver a elegir rectangulo. 6-Reiniciar o salir.");

				opcion = Teclado.leerEntero();
				if (opcion < 1 || opcion > 6)
					System.out
							.println("Elija una opción entre las disponibles[1-6].");
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
				.println("¿Desea reiniciar?En caso negativo, saldrá del programa (s/n)");
		char elegir = Teclado.leerCaracter();

		if (elegir == 's' || elegir == 'S') {
			return true;
		}// if
		else {
			return false;
		}// else
	}// Continuar
}// class
