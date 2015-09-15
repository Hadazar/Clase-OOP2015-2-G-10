
import java.util.Scanner;

public class Par_numeros {

    public static void main(String[] args) {
       Scanner Lector = new Scanner (System.in);
       
       System.out.println("Ingrese dos números enteros: ");
       System.out.print("Primer número: ");
       double numero_entero_1 = Lector.nextDouble();
       System.out.print("Segundo número: ");
       double numero_entero_2 = Lector.nextDouble();
       
       if ((numero_entero_1-(int)numero_entero_1 == 0) && (numero_entero_2-(int)numero_entero_2 == 0)){
           
           if (numero_entero_1%2 == 0){
               System.out.println("El primer número es par");
           }else{System.out.println("El primer número es impar");}
           
           if (numero_entero_2%2 == 0){
               System.out.println("El segundo número es par");
           }else{System.out.println("El segundo número es impar");}
           
           if (numero_entero_1 > numero_entero_2){
               System.out.println("El primer número es mayor al segundo");
           }else if (numero_entero_1 == numero_entero_2){
               System.out.println("Los números son iguales");
           }else{System.out.println("El segundo número es mayor al primero");}
           
           if (numero_entero_2%numero_entero_1 == 0){
               System.out.println("El primer número es múltiplo del segundo");
           }else{System.out.println("El primer número no es múltiplo del segundo");}
           
       }else{System.out.println("Alguno de los dos números introducidos no es entero");}
       
       Lector.close();
    
    }
    
}


