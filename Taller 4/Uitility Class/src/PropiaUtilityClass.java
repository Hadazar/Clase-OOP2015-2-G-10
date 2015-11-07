
public class PropiaUtilityClass {
	
	public static double pi = 3.1416;
	public static double euler = 2.7182;
	
	public static int potenciaEnteros( int base, int exponente ){
		int potencia = 1;
		for ( int i = 0; i < exponente; i++ ){
			potencia = potencia * base;
		}
		return potencia;
	}
	
	public static double raiz( double radicando ){
		double raiz = radicando / 2;
		double registroAnterior = radicando;
		for (int i = 0; i < radicando * 5; i++){
			if (raiz * raiz < radicando){
				if (registroAnterior > raiz){double a = registroAnterior; registroAnterior = raiz; raiz = (raiz + a) / 2;}
				else{double a = registroAnterior; registroAnterior = raiz; raiz = (3 * raiz - a) / 2;}
			}
			else {
				if (registroAnterior > raiz){double a = registroAnterior; registroAnterior = raiz; raiz = (3 * raiz - a) / 2;}
				else{double a = registroAnterior; registroAnterior = raiz; raiz = (raiz + a) / 2;}
			}
		}
		return raiz;
	}
}
