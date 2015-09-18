
import java.util.Scanner;

public class Banco {

	public static void main (String[] args){
	
	//Función de lectura y variable principal
		Scanner Leer = new Scanner (System.in);
		System.out.print("Ingrese el monto que desea retirar: $");
		double Monto = Leer.nextDouble();
		System.out.println("");
		
		if (Monto%50 == 0){
		
		//Variables
			int Billete_moneda = 50000;
			int Repeticiones_ciclo = 0;
			
		//Cálculo de la cantidad de billetes y monedas que se necesitan de cada denominación y su impresión en pantalla
			while (Billete_moneda>=50){
			int Cantidad_Billete = (int)(Monto/Billete_moneda);
			if (Cantidad_Billete>0 && Billete_moneda>500){System.out.println("Billetes de $"+Billete_moneda+": "+Cantidad_Billete);}
			if (Cantidad_Billete>0 && Billete_moneda<1000){System.out.println("Monedas de $"+Billete_moneda+": "+Cantidad_Billete);}
			Monto = Monto-Cantidad_Billete*Billete_moneda;
			if (Monto == 0){break;}
			if (Repeticiones_ciclo%3 == 0){Billete_moneda = (2*Billete_moneda)/5;}
			else {Billete_moneda /= 2;}
			Repeticiones_ciclo++;
			}
			
		}else {System.out.println("Error, el monto ingresado debe ser múltiplo de $50");}
		
		Leer.close();
	}
	
}