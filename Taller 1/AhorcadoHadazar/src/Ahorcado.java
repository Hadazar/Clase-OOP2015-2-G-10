
import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class Ahorcado {
	
	public static void main(String[] args) throws IOException{
			
		//Lectura de pantalla y de archivo
			Scanner Lectura = new Scanner (System.in);
			File Palabras = new File ("Palabras.txt");
			FileReader Leer = new FileReader(Palabras);
			BufferedReader Lector = new BufferedReader (Leer);
			
		//Selección de una palabra al azar
			Random Aleatorio = new Random();
			int Número_aleatorio = Aleatorio.nextInt(450);
			int w = 0;
			String Palabra = "";
			while (w<Número_aleatorio){
				Palabra = Lector.readLine();
				w++;
			};
			
		//Variables y arreglos principales
			int aciertos = 0;
			int errores = 0;
			int longitud_palabra = Palabra.length();
			int posicion = 0;
			boolean tester = false;
			char [] Arreglo_palabra = Palabra.toCharArray();
			char [] Palabra_oculta = new char [longitud_palabra];
			char [] Dibujo = {'q','(','x','_','x',')','p'};
			char [] Ahorcado = {' ',' ',' ',' ',' ',' ',' '};
			char [] Letras_usadas = new char [30];
		
		//llenado de la palabra oculta
			w = 0;
			while (w<longitud_palabra){
				Palabra_oculta[w] = '_';
				w++;
			};
			
		//Llenado de letras usadas
			w = 0;
			while (w<30){
				Letras_usadas[w] = ' ';
				w++;
			};
		
		//Desarrollo del juego--------------------------------
			while (aciertos<longitud_palabra&&errores<7){
				
			//Impresión de palabra oculta
				w = 0;
				while (w<longitud_palabra){
					System.out.print(Palabra_oculta[w]+" ");
					w++;
				};
				
				System.out.print("               ");
				System.out.print(Ahorcado);System.out.print("               ");
				System.out.println(Letras_usadas);
				
				char Letra = Lectura.next().charAt(0);
			
			//Comparación de letra con letras usadas
				w = 0;
				tester = false;
				while (Letras_usadas[w] != ' '){
					if (Letra == Letras_usadas[w]){tester = true; break;}
					w++;
				};
			
				if (tester == true){System.out.println("Letra repetida");}
				else{
					//Comparación de letra introducida con palabra
						w = 0;
						tester = false;
						while (w<longitud_palabra){
							if (Letra == Arreglo_palabra[w]){Palabra_oculta[w] = Letra;aciertos++; tester = true;}
							w++;
						};
						if (tester == false){errores++;Ahorcado[errores-1] = Dibujo[errores-1];};
						Letras_usadas[posicion] = Letra;
						posicion++;
				};
				
			};
		
		//Victoria
			if (aciertos == longitud_palabra){
				
			//Impresión de palabra oculta
				w = 0;
				while (w<longitud_palabra){
					System.out.print(Palabra_oculta[w]+" ");
					w++;
				};
				
				System.out.println(" ");
				System.out.println("Has ganado!!!");
				};
		
		//Derrota
			if (errores == 7){
				
				//Impresión de palabra oculta
				w = 0;
				while (w<longitud_palabra){
					System.out.print(Palabra_oculta[w]+" ");
					w++;
				};
			
				System.out.print("               ");
				System.out.println(Ahorcado);
				System.out.println(" ");
				System.out.println("Has perdido!!!, la palabra secreta era: "+Palabra+".");
				};
			Lectura.close();
			Lector.close();
	};
}