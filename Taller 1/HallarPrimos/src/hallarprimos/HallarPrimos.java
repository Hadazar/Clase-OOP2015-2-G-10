import java.util.Scanner;


public class HallarPrimos {
    

    public static void main(String[]args){
        //codigo encargado de solicitarle al usuario un valor rango para hallar los primos.
        int total;         
        Scanner x = new Scanner(System.in);
        System.out.println("digita un numero limite para hallar los primos: ");
        total = x.nextInt();
        int num[]= new int[total];
        //algoritmo para identificar los valores primos menores al designado por el usuario.
        for(int i=2;i<total;i++)
        {
            num[i]=i;
        }
        for(int i=2;i<total;i++)
        {
            if(num[i] !=0)
            {
                for(int j=2*i;j<total;j+=i)
                {
                    num[j]=0;
                    
                }
            }
            
        }
        for(int  i=2;i<total;i++)
        {
            if(num[i] !=0)
            {
                System.out.print(num[i]+"\n");
            }
        }
    }
}
