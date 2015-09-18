
import java.util.Scanner;

public class Banco {

	public static void main (String[] args){
	
	//Función de lectura y variable principal
		Scanner Leer = new Scanner (System.in);
		System.out.print("Ingrese el monto que desea retirar: $");
		double Monto = Leer.nextDouble();
		System.out.println("");
		
		if (Monto%50 == 0){
		
		//Variables para billetes de últimas deniminaciones
			int Billete1 = 50000;
			int Billete2 = 20000;
			int Billete3 = 10000;
			
		//Cálculo de la cantidad de billetes y monedas que se necesitan de cada denominación
			int Cantidad_$50000 = (int)(Monto/Billete1);
			Monto = Monto-Cantidad_$50000*Billete1;
			int Cantidad_$20000 = (int)(Monto/Billete2);
			Monto = Monto-Cantidad_$20000*Billete2;
			int Cantidad_$10000 = (int)(Monto/Billete3);
			Monto = Monto-Cantidad_$10000*Billete3;
			int Cantidad_$5000 = (int)(10*Monto/Billete1);
			Monto = Monto-Cantidad_$5000*(Billete1/10);
			int Cantidad_$2000 = (int)(10*Monto/Billete2);
			Monto = Monto-Cantidad_$2000*(Billete2/10);
			int Cantidad_$1000 = (int)(10*Monto/Billete3);
			Monto = Monto-Cantidad_$1000*(Billete3/10);
			int Cantidad_$500 = (int)(100*Monto/Billete1);
			Monto = Monto-Cantidad_$500*(Billete1/100);
			int Cantidad_$200 = (int)(100*Monto/Billete2);
			Monto = Monto-Cantidad_$200*(Billete2/100);
			int Cantidad_$100 = (int)(100*Monto/Billete3);
			Monto = Monto-Cantidad_$100*(Billete3/100);
			int Cantidad_$50 = (int)(1000*Monto/Billete1);
			
		//Impresión en pantalla del retiro de dinero
			if (Cantidad_$50000 > 0){System.out.println("Billetes de $50.000: "+Cantidad_$50000);}
			if (Cantidad_$20000 > 0){System.out.println("Billetes de $20.000: "+Cantidad_$20000);}
			if (Cantidad_$10000 > 0){System.out.println("Billetes de $10.000: "+Cantidad_$10000);}
			if (Cantidad_$5000 > 0){System.out.println("Billetes de $5.000: "+Cantidad_$5000);}
			if (Cantidad_$2000 > 0){System.out.println("Billetes de $2.000: "+Cantidad_$2000);}
			if (Cantidad_$1000 > 0){System.out.println("Billetes de $1.000: "+Cantidad_$1000);}
			if (Cantidad_$500 > 0){System.out.println("Monedas de $500: "+Cantidad_$500);}
			if (Cantidad_$200 > 0){System.out.println("Monedas de $200: "+Cantidad_$200);}
			if (Cantidad_$100 > 0){System.out.println("Monedas de $100: "+Cantidad_$100);}
			if (Cantidad_$50 > 0){System.out.println("Monedas de $50: "+Cantidad_$50);}
			
			
		}else {System.out.println("Error, el monto ingresado debe ser múltiplo de $50");}
		
		Leer.close();
	}
	
}