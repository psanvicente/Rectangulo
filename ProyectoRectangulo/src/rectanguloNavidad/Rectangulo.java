package rectanguloNavidad;

/**
 * Represents a rectangle and contains method to change and checks its dimensions
 * @author Pablo Sanchez Sanvicente
 * @version 1.0
 */
class Rectangulo {
	/** Rectangle height*/
	int h;
	/** Rectangle width*/
	int b;

	/**
	 * Constructor. Set height to 2 and base to 1
	 */
	Rectangulo() {
		h = 2;
		b = 1;
	}//Rectangulo

	/**
	 * Increases width in 1 unit
	 */
	void engordar() {
		b += 1;
		System.out.println("Se ha aumentado la base");
	}//engordar

	/**
	 * Decreases width in 1 unit if it is bigger than a minimal size
	 */
	void adelgazar() {
		if (!esBaseMinima())
		{
			b--;
			System.out.println("Se ha disminuido la base");
		} else
			System.out.println("No se puede reducir mas la base");
	}//adelgazar

	/**
	 * Increases height in 1 unit
	 */
	void crecer() {
		h++;
		System.out.println("Se ha aumentado la altura");
	}//crecer

	/**
	 * Decreases height if it is bigger than a minimal size
	 */
	void decrecer() {
		if (esAlturaMinima())
			System.out.println("No se puede reducir mas la altura");
		else {
			h--;
			System.out.println("Se ha disminuido la altura");
			if (esAlturaMinima())
				System.out.println("HE LLEGADO AL M�NIMO DE ALTURA");
		}
	}//decrecer

	/**
	 * Checks if the figure is really a square
	 * @return true if it is a square, false if not
	 */
	boolean esCuadrado() {
		if (h == b)
			return true;
		else
			return false;
	}//esCuadrado

	/**
	 * Checks if its height is less than 2
	 * @return true if it is less than 2
	 */
	boolean esAlturaMinima() {
		if (h < 2)
			return true;
		else
			return false;
	}//esAlturaMinima

	/**
	 * Checks if its base is less than 2
	 * @return true if it is less than 2, false if it is higher
	 */
	boolean esBaseMinima() {
		if (b < 2)
			return true;
		else
			return false;
	}//esBaseMinima

	/**
	 * Prints a picture representing the rectangle
	 */
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
	}//mostrarDibujo
	
}//Rectangulo
