package Paquete;

import java.util.Scanner;

public class Prueba {

	public static void main (String args []){
		
		Scanner leer = new Scanner (System.in);
		SistemaBancario sistemaBancario = new SistemaBancario();
		
		System.out.println("Seleccione su rol:\n\nA. Cliente.\nB. Banco.\nC.Salir.");
		char opcion = leer.next().toUpperCase().charAt(0);
		boolean continuidad = true;
		
		while (continuidad == true){
			switch (opcion){
				case 'A':
					System.out.printf("Seleccione una opción:\n\nA. Crear un banco.\nB. Acceder a un Banco ya existente\nC. Volver.");
					opcion = leer.next().toUpperCase().charAt(0);
					while (continuidad == true){
						switch (opcion){
							case 'A': 
								System.out.print("Nombre: ");
								Banco banco = new Banco ();
								banco.setnombre(leer.nextLine());
								sistemaBancario.setListaBancos(banco);
								break;
							case 'B':
								System.out.print("Nombre: ");
								Banco banco2 = sistemaBancario.getBanco(leer.nextLine());
								System.out.printf("%98s%ss\n\n","Bienvenido a ", banco2.getNombre(),"!");
								System.out.println("Seleccione una operación:\n\n1. Cobrar deudas.\n2. Colsultar cantidad de productos bancarios ofrecidos a un cliente.");
								while (continuidad == true){
									switch(opcion){
										case '1': 
											break;
										case '2':
											break;
										case '3':
											break;
									} //fin de switch
								} //fin de while
								break;
							case 'C': continuidad = false;
								break;
						} //fin de switch
						if (continuidad == false){continuidad = true; break;};
						System.out.print("\f");
					} //fin de while
				
					break;
				case 'B':
					
					break;
				case 'C':
					break;
			}; //fin de switch
			System.out.print("\f");
		}; //fin de while
		
		leer.close();
	}; //fin del método main
}
