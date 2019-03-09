/*
- Javier Ramirez Cospin 18099
- Kristen Brandt 171482
- Jose Garavito 18071
 */

import java.util.*;
import java.io.*;

public class Readfile {
	
	private Scanner x;
	
	public void OpenFile() {
		try {
			x = new Scanner(new File("Operaciones.txt"));
		}
		catch (Exception e) {
			System.out.println("No se pudo leer archivo txt");
		}
	}
	
	public void ReadFile() {
		while(x.hasNext()) {
			String parentesis = x.next();
			String operador = x.next();
			String l1 = x.next();
			String l2 = x.next();
			String parentesis2 = x.next();
			
			System.out.printf("%s %s %s %s %s", parentesis, operador, l1, l2, parentesis2);
		}
	}
	
	public void CloseFile() {
		x.close();
	}
}
