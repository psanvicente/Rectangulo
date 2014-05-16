

package utiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Contains method to read integers, lines and characters from keyboard
 * @version 1.0
 * @author lmg
*/
public class Teclado {

	/**
	 * Reads a line from keyboard and returns it
	 * @return read line
	 */
	public static String leerCadena() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); //Lee una l�nea de texto (hasta intro)
		} catch( Exception e ) {
			cadena = "";
		}
		return cadena;
	}//leerCadena

	/**
	 * Reads a character from keyboard and returns it. If an exception is thrown,<br/>
	 * the character returned will hold the value '0'
	 * @return read character
	 */
	 public static char leerCaracter() {
		char caracter;
		try {
			caracter = leerCadena().charAt(0);
		} catch( Exception e ) {
			caracter = 0;
		}
		return caracter;
	}//leerCaracter
	
	 /**
	 * Reads an integer from keyboard and returns it. If an exception is thrown,<br/>
	 * the value returned will be '0'
	 * @return read integer
	 */
	public static int leerEntero() {
	
		int x;
		try {
			x = Integer.parseInt(leerCadena().trim()); //Quita los espacios del String y convierte a int
		} catch( Exception e ) {
			x = 0;
		}
		return x;
	}//leerEntero
}//Teclado