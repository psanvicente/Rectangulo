
package rectanguloNavidad;

class Rectangulo {
	
	int h;
	
	int b;

	Rectangulo() {
		h = 2;
		b = 1;
	}

	
	void engordar() {
		b += 1;
		System.out.println("Se ha aumentado la base");
	}

	void adelgazar() {
		if (!esBaseMinima()) // Solo si la base es mayor de 1 nos
								// permitirá reducirla.
		{
			b--;
			System.out.println("Se ha disminuido la base");
		} else
			// en caso de no ser mayor de 1, no sale el
			// mensaje en pantalla
			System.out.println("No se puede reducir mas la base");
	}

	/**
	 * Metodo para hacer crecer la altura del rectangulo
	 */
	void crecer() {
		h++;
		System.out.println("Se ha aumentado la altura");
	}

	/**
	 * Metodo para hacer decrecer la altura del rectangulo
	 */
	void decrecer() {
		if (esAlturaMinima())
			System.out.println("No se puede reducir mas la altura");
		else {
			h--;
			System.out.println("Se ha disminuido la altura");
			if (esAlturaMinima())
				System.out.println("HE LLEGADO AL MÍNIMO DE ALTURA");
		}

	}

	/**
	 * Metodo booleano para comprobar si nuestro objeto rectángulo es en
	 * realidad un cuadrado.
	 * 
	 * @return devuelve verdadero si es un cuadrado, false si es un rectangulo
	 */
	boolean esCuadrado() {
		if (h == b)
			return true;
		else
			return false;
	}

	
	boolean esAlturaMinima() {
		if (h < 2)
			return true;
		else
			return false;

	}

	boolean esBaseMinima() {
		if (b < 2)
			return true;
		else
			return false;

	}

	void mostrarDibujo() {
		System.out.print("**");
		for (int i = 0; i < b; i++)
			System.out.print("*");
		System.out.println("");
		for (int i = 0; i < h; i++) {
			System.out.print("*");
			for (int j = 0; j < b; j++)
				System.out.print(" ");
			System.out.println("*");
		}
		System.out.print("");
		System.out.print("**");
		for (int i = 0; i < b; i++)
			System.out.print("*");
		if (esCuadrado())
			System.out.println(" Es un cuadrado de " + (b * h) + " m2.\n");
		else
			System.out.println(" Es un rectangulo de " + (b * h) + " m2.\n");
	}// dibujo
}// clase
