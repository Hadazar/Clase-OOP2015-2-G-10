
import java.util.Scanner;

public class Promedio2 {

	public static void main (String[] args){
		Scanner Leer = new Scanner (System.in);
		System.out.println("Ingrese los n�meros que desea promediar (9999 para salir): ");
		boolean Tester = false;
		double N�mero;
		double Acumulado = 0;
		int Cantidad_n�meros = 0;
		while(Tester == false){
			N�mero = Leer.nextDouble();
			if (N�mero == 9999){Tester = true;}
			else {Acumulado = Acumulado+N�mero; Cantidad_n�meros++;}
		}
		double Promedio = Acumulado/Cantidad_n�meros;
		System.out.println("El promedio es: "+Promedio);
		Leer.close();
	}
	
}
