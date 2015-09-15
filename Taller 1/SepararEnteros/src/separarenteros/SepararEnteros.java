package SepararEnteros;
import java.util.Scanner;
 
public class SepararEnteros {
       
    public static void main(String[] args) {
        //este fragmento es para solicitar al usuario el valor del digito a separar importandolo.
        int num;
        Scanner x = new Scanner(System.in);
        System.out.println("digita un numero entero de maximo 9 digitos: ");
        num = x.nextInt();
        
        System.out.println( separa(num, "") );        
    }
    // un sencillo algoritmo encargado de espaciar los numeros en unicos digitos por medio de espacios, y de metodo repetitivo.
    private static String separa(int n, String r){
        if( n <10 ) 
            return r;        
        else if ( n/1 >= 10 && r.equals(""))
            return separa(n, " "+n%10);
        else
           return separa(n/10, " "+(((n/10))%10) + r );
    }    
    
}