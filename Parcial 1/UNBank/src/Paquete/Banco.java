package Paquete;
import java.util.Scanner;

public class Banco {
	
	public static void main (String args []){
		
		Scanner leer = new Scanner (System.in);
		
		
		System.out.printf("%98s\n\n%s\n\n%s\n%s", "Bienvenido a UNBank!", "Seleccione su rol:", "A. Cliente", "B. Banco");
		char opcion = leer.next().toLowerCase().charAt(0);
		leer.close();
		
		switch (opcion){
			case 'A': 
				System.out.printf("%s\n\n%s\n%s","Seleccione un producto bancario:", "1. Certificado de depósito a término (CDT).", "2. Cuenta de ahorros.");
				System.out.printf("%s\n%s\n%s","3. Cuenta joven.","4. Tarjeta crédito", "5. UNPréstamo");
				break;
			case 'B':
				break;
			default: System.out.println("El carácter introducido no es válido, se seleccionará la opción A");
		};
		
		
	};
}
