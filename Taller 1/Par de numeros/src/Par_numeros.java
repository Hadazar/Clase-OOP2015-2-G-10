
import java.util.Scanner;

public class Par_numeros {

    public static void main(String[] args) {
       Scanner Lector = new Scanner (System.in);
      
      //Varibles de los n�meros introducidos
       System.out.println("Ingrese dos n�meros enteros: ");
       System.out.print("Primer n�mero: ");
       double numero_entero_1 = Lector.nextDouble();
       System.out.print("Segundo n�mero: ");
       double numero_entero_2 = Lector.nextDouble();
       
       //Verificaci�n de que los n�meros son enteros
       if ((numero_entero_1-(int)numero_entero_1 == 0) && (numero_entero_2-(int)numero_entero_2 == 0)){
           
    	 //Verificaci�n de que el primer n�mero es par o impar
           if (numero_entero_1%2 == 0){
               System.out.println("El primer n�mero es par");
           }else{System.out.println("El primer n�mero es impar");}
           
      	 //Verificaci�n de que el segundo n�mero es par o impar
           if (numero_entero_2%2 == 0){
               System.out.println("El segundo n�mero es par");
           }else{System.out.println("El segundo n�mero es impar");}
           
          //Determinaci�n de cu�l es el mayor de los dos
           if (numero_entero_1 > numero_entero_2){
               System.out.println("El primer n�mero es mayor al segundo");
           }else if (numero_entero_1 == numero_entero_2){
               System.out.println("Los n�meros son iguales");
           }else{System.out.println("El segundo n�mero es mayor al primero");}
           
          //Verificaci�n de que el primer n�mero es m�ltiplo del segundo
           if (numero_entero_2%numero_entero_1 == 0){
               System.out.println("El primer n�mero es m�ltiplo del segundo");
           }else{System.out.println("El primer n�mero no es m�ltiplo del segundo");}
           
       }else{System.out.println("Alguno de los dos n�meros introducidos no es entero");}
       
       Lector.close();
    
    }
    
}