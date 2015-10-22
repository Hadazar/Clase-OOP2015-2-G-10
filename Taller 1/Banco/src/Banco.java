
import java.util.Scanner;

public class Banco {

	
			if (Repeticiones_ciclo%3 == 0){Billete_moneda = (2*Billete_moneda)/5;}
			else {Billete_moneda /= 2;}
			Repeticiones_ciclo++;
			}
			
		}else {System.out.println("Error, el monto ingresado debe ser múltiplo de $50");}
		
		Leer.close();
	}
	
}
