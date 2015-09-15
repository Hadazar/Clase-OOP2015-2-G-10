package TicTacToe;
import java.util.Scanner;
import java.util.Vector;

public class TicTacToe {
static int val, x;
// codigos encargados de generar el espacio de la dinamica.
    static boolean bandOcupado;
    static Scanner entrada = new Scanner(System.in);
    static Vector tablero = new Vector(9);
    static Ficha ficha;    
    public static void main(String[] args) { 
        //zona del espaciado del juego.
        for(x = 0; x < 9; x++)
            tablero.addElement(new Ficha(String.valueOf(x+1)));        
        mostrarTablero();        
        for(x = 0; x < 9; x++){
            
            if(x % 2 == 0){
                //a partir de aqui se inician a digitar codigos de solicitud al usuario.
                System.out.print("Jugador 1 >> digite posicion de tablero: ");
                val = entrada.nextInt();
                
                if(desocupado(val)){
                    //toma el valor designado como objeto y lo procesa para ubicarlo en el espacio de juego segun lo elegido por el usuario e imprime x o @.
                        ((Ficha)tablero.elementAt(val - 1)).setPiedra("@");
                        ((Ficha)tablero.elementAt(val - 1)).setJugador(1);
                        if(triqui(val, 1)){
                            System.out.print("Jugador 1 >> GANASTE!! TRIQUI");
                            break;
                        }
                }else{
                     do{
                         //condicional encargado de bloquear zonas ocupadas anteriormente durante el juego.
                         bandOcupado = false;
                         System.out.print("CASILLA OCUPADA. Jugador 1 >> REPITA posicion de tablero: ");
                         val = entrada.nextInt();
                         if(desocupado(val)){
                             // requisito para el triunfo del jugador.
                                 ((Ficha)tablero.elementAt(val - 1)).setPiedra("@");
                                 ((Ficha)tablero.elementAt(val - 1)).setJugador(1);
                                 bandOcupado = true;
                                 if(triqui(val, 1)){
                                    System.out.print("Jugador 1 >> GANASTE!! TRIQUI");
                                    x = 9;
                                 }
                         }
                       }while(!bandOcupado);
                 }                
                
            }else{
                // a partir de aqui el proceso se repite hasta completar la partida de triqui.
                System.out.print("Jugador 2 >> digite posicion de tablero: ");
                val = entrada.nextInt();
                
                if(desocupado(val)){
                        ((Ficha)tablero.elementAt(val - 1)).setPiedra("X");
                        ((Ficha)tablero.elementAt(val - 1)).setJugador(2);
                        if(triqui(val, 2)){
                            System.out.print("Jugador 2 >> GANASTE!! FELICIDADES");
                            break;
                        }
                }else{
                     do{
                            bandOcupado = false;
                            System.out.print("CASILLA OCUPADA. Jugador 2 >> REPITA posicion de tablero: "); 
                            val = entrada.nextInt();
                            if(desocupado(val)){
                                    ((Ficha)tablero.elementAt(val - 1)).setPiedra("X");
                                    ((Ficha)tablero.elementAt(val - 1)).setJugador(2);
                                    bandOcupado = true;
                                    if(triqui(val, 2)){
                                        System.out.print("Jugador 2 >> GANASTE!! TRIQUI");
                                        x = 9;
                                    }
                            }
                      }while(!bandOcupado);
                }                
            }
            mostrarTablero();
        }
        mostrarTablero();
    }
    
    public static boolean triqui(int pos, int jugador){
        boolean band = false;
        switch(pos){
            //la zona a posicionar el signo elegido segun el numero elegido por alguno de los usuarios separados en casos para ubicarlos.
            case 1:
                if( ((Ficha)tablero.elementAt(1)).getJugador() == jugador && ((Ficha)tablero.elementAt(2)).getJugador() == jugador || ((Ficha)tablero.elementAt(3)).getJugador() == jugador && ((Ficha)tablero.elementAt(6)).getJugador() == jugador || ((Ficha)tablero.elementAt(4)).getJugador() == jugador && ((Ficha)tablero.elementAt(8)).getJugador() == jugador )
                    band = true;
                break;
            case 2:
                if( ((Ficha)tablero.elementAt(0)).getJugador() == jugador && ((Ficha)tablero.elementAt(2)).getJugador() == jugador || ((Ficha)tablero.elementAt(4)).getJugador() == jugador && ((Ficha)tablero.elementAt(7)).getJugador() == jugador  )
                    band = true;
                break;
            case 3:
                if( ((Ficha)tablero.elementAt(0)).getJugador() == jugador && ((Ficha)tablero.elementAt(1)).getJugador() == jugador || ((Ficha)tablero.elementAt(5)).getJugador() == jugador && ((Ficha)tablero.elementAt(8)).getJugador() == jugador || ((Ficha)tablero.elementAt(4)).getJugador() == jugador && ((Ficha)tablero.elementAt(6)).getJugador() == jugador  )
                    band = true;
                break;
            case 4:
                if( ((Ficha)tablero.elementAt(0)).getJugador() == jugador && ((Ficha)tablero.elementAt(6)).getJugador() == jugador || ((Ficha)tablero.elementAt(4)).getJugador() == jugador && ((Ficha)tablero.elementAt(5)).getJugador() == jugador  )
                    band = true;
                break;
            case 5:
                if( ((Ficha)tablero.elementAt(1)).getJugador() == jugador && ((Ficha)tablero.elementAt(7)).getJugador() == jugador || ((Ficha)tablero.elementAt(3)).getJugador() == jugador && ((Ficha)tablero.elementAt(5)).getJugador() == jugador || ((Ficha)tablero.elementAt(0)).getJugador() == jugador && ((Ficha)tablero.elementAt(8)).getJugador() == jugador || ((Ficha)tablero.elementAt(2)).getJugador() == jugador && ((Ficha)tablero.elementAt(6)).getJugador() == jugador )
                    band = true;
                break;
            case 6:
                if( ((Ficha)tablero.elementAt(2)).getJugador() == jugador && ((Ficha)tablero.elementAt(8)).getJugador() == jugador || ((Ficha)tablero.elementAt(3)).getJugador() == jugador && ((Ficha)tablero.elementAt(4)).getJugador() == jugador  )
                    band = true;
                break;
            case 7:
                if( ((Ficha)tablero.elementAt(0)).getJugador() == jugador && ((Ficha)tablero.elementAt(3)).getJugador() == jugador || ((Ficha)tablero.elementAt(7)).getJugador() == jugador && ((Ficha)tablero.elementAt(8)).getJugador() == jugador  || ((Ficha)tablero.elementAt(2)).getJugador() == jugador && ((Ficha)tablero.elementAt(4)).getJugador() == jugador)
                    band = true;
                break;
            case 8:
                if( ((Ficha)tablero.elementAt(1)).getJugador() == jugador && ((Ficha)tablero.elementAt(4)).getJugador() == jugador || ((Ficha)tablero.elementAt(6)).getJugador() == jugador && ((Ficha)tablero.elementAt(8)).getJugador() == jugador  )
                    band = true;
                break;
            case 9:
                if( ((Ficha)tablero.elementAt(2)).getJugador() == jugador && ((Ficha)tablero.elementAt(5)).getJugador() == jugador || ((Ficha)tablero.elementAt(6)).getJugador() == jugador && ((Ficha)tablero.elementAt(7)).getJugador() == jugador  || ((Ficha)tablero.elementAt(0)).getJugador() == jugador && ((Ficha)tablero.elementAt(4)).getJugador() == jugador )
                    band = true;
                break;
        }
        return band;
    } 
    
    public static boolean desocupado(int pos){
        //comando que permite al usuario ubicar su turno en la zona que el mismo designo.
        boolean band = false;
        if( (((Ficha)tablero.elementAt(pos - 1)).getJugador()!=1) && (((Ficha)tablero.elementAt(pos - 1)).getJugador()!=2) )
            band = true;
        
        return band;
    }
    
    public static void mostrarTablero(){
        //diseño del tablero.
        int c =0;
        for(int x = 0; x < 9; x++){
            c++;
            if((c-1) % 3 == 0){
                System.out.println();
                System.out.print("------------------------");
                System.out.println();
            }
            System.out.print("   "+((Ficha)tablero.elementAt(x)).getPiedra()+"   |");
        }
        System.out.println("\n");
    }
}
class Ficha{
    //intercambio entre turnos de jugadores.
    int jugador=0;
    String piedra;
    Ficha(String pos){
       piedra = pos;
    }
    public void setJugador(int jugador){
        this.jugador = jugador;
    }
    public int getJugador(){
        return jugador;
    }
    public void setPiedra(String pos){
        piedra = pos;
    }
    public String getPiedra(){
        return piedra;
    }
}