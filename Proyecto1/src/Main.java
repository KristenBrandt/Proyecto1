/*
- Javier Ramirez Cospin 18099
- Kristen Brandt 171482
- Jose Garavito 18071
 */

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		Readfile read = new Readfile();
		
		int opcion1 = 0;
		String opcion2 = "";
		
		while(opcion1 != 2) {
			System.out.println("==========================");
			System.out.println("Menu Principal");
			System.out.println("==========================");
			System.out.println("Seleccionar una de las siguientes opciones: ");
			System.out.println("1. Ingresar operacion");
			System.out.println("2. Salir");
			System.out.println("");
			System.out.println("Ingresar su opcion: ");
			try {
				opcion1 = teclado.nextInt();
				
				if (opcion1 == 0) {
					System.out.println("Ingresar una opcion mayor a 0!");
				}
				
				if (opcion1 == 1) {
					System.out.println("Ha elegido ingresar una operacion!");
					System.out.println("");
					
					/*System.out.println("Por favor ingesar una operacion en lenguaje LISP");
					opcion2 = teclado.nextLine();
					String[] m = opcion2.split("(");
					System.out.println(m);
					*/
					
					/*System.out.println("Leer archivo de texto Operaciones.txt");
					read.Openfile();
					read.Readfile();
					read.Closefile();
					 */
				}
				
				if (opcion1 == 3) {
					System.out.println("Gracias por utilizar el programa!");
				}
				
				if (opcion1 >= 4) {
					System.out.println("Ingresar una opcion menor a 4!");
				}
				
			}
			catch (Exception e) {
				System.out.println(("No se pudo realizar la operacion!"));
			}
			
		}
		
	}	
}
