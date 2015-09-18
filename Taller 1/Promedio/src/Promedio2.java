
import java.util.Scanner;

public class Promedio2 {

	public static void main (String[] args){
		Scanner Leer = new Scanner (System.in);
		System.out.println("Ingrese los números que desea promediar (9999 para salir): ");
	
	//Varibles
		boolean Tester = false;
		double Número;
		double Acumulado = 0;
		int Cantidad_números = 0;
	
	//Lectura de datos ingresados por el usuario
		while(Tester == false){
			Número = Leer.nextDouble();
			if (Número == 9999){Tester = true;}
			else {Acumulado = Acumulado+Número; Cantidad_números++;}
		}
	
	//Cálculo e impresión del promedio
		double Promedio = Acumulado/Cantidad_números;
		System.out.println("El promedio es: "+Promedio);
		Leer.close();
	}
	
}
