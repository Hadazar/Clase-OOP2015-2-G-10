
import java.util.Scanner;

public class Par_numeros {

    public static void main(String[] args) {
       Scanner Lector = new Scanner (System.in);
       
       System.out.println("Ingrese dos n�meros enteros: ");
       System.out.print("Primer n�mero: ");
       double numero_entero_1 = Lector.nextDouble();
       System.out.print("Segundo n�mero: ");
       double numero_entero_2 = Lector.nextDouble();
       
       if ((numero_entero_1-(int)numero_entero_1 == 0) && (numero_entero_2-(int)numero_entero_2 == 0)){
           
           if (numero_entero_1%2 == 0){
               System.out.println("El primer n�mero es par");
           }else{System.out.println("El primer n�mero es impar");}
           
           if (numero_entero_2%2 == 0){
               System.out.println("El segundo n�mero es par");
           }else{System.out.println("El segundo n�mero es impar");}
           
           if (numero_entero_1 > numero_entero_2){
               System.out.println("El primer n�mero es mayor al segundo");
           }else if (numero_entero_1 == numero_entero_2){
               System.out.println("Los n�meros son iguales");
           }else{System.out.println("El segundo n�mero es mayor al primero");}
           
           if (numero_entero_2%numero_entero_1 == 0){
               System.out.println("El primer n�mero es m�ltiplo del segundo");
           }else{System.out.println("El primer n�mero no es m�ltiplo del segundo");}
           
       }else{System.out.println("Alguno de los dos n�meros introducidos no es entero");}
       
       Lector.close();
    
    }
    
}


