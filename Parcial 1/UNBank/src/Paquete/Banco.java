package Paquete;
import java.util.Scanner;

public class Banco {
	
	private static String nombre = "UNBank";
	
	public static void main (String args []){
		
		Scanner leer = new Scanner (System.in);
		
		
		System.out.printf("%98s%s%s\n\n%s\n\n%s\n%s\n", "Bienvenido a ", nombre, " !", "Seleccione su rol:", "A. Cliente", "B. Banco");
		char opcion = leer.next().toUpperCase().charAt(0);
		
		
		switch (opcion){
			case 'A': 
				System.out.printf("%s\n\n%s\n%s\n","Seleccione un producto bancario:", "1. Certificado de depósito a término (CDT).", "2. Cuenta de ahorros.");
				System.out.printf("%s\n%s\n%s\n","3. Cuenta joven.","4. Tarjeta crédito", "5. UNPréstamo");
				opcion =  leer.next().toUpperCase().charAt(0);
				switch (opcion){
					case '1':
						break;
					case '2':
						break;
					case '3':
						break;
					case '4':
						break;
					case '5':
						break;
					default:
				}
				break;
			case 'B':
				System.out.printf("%s\n\n%s\n%s\n%s\n","Seleccione una operación:", "1. Establecer el intereres","2. Cobrar deudas", "3. Consultar cantidad de productos bancarios activos");
				break;
			default: System.out.println("El carácter introducido no es válido, se seleccionará la opción A");
		};
		
		leer.close();
	};
}
