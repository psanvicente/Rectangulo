package rectanguloNavidad;

/**
 * Contains a method that creates a Rectangulo object and calls its methods
 * @author Pablo Sanchez Sanvicente
 * @version 1.0
 */
public class TestRectangulo {

	/**
	 * Performs operation over a Rectangulo object to show its behaviour
	 * @param args Array of String
	 */
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();

		rectangulo.adelgazar();
		rectangulo.decrecer();

		rectangulo.decrecer();

		rectangulo.decrecer();

		rectangulo.crecer();
		rectangulo.crecer();
		rectangulo.engordar();
		rectangulo.engordar();
		rectangulo.engordar();
		rectangulo.adelgazar();

		rectangulo.mostrarDibujo();
	}//main

}//TestRectangulo
