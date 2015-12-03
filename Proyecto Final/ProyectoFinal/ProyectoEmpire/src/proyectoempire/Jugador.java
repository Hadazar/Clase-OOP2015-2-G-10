/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempire;

/**
 *
 * @author HéctorAugusto
 */
public class Jugador {
    
    int cantidadUnidades = 0;
    int recursos;
    Unidad[] unidades = new Unidad[ 100 ];
    
    public Jugador(){
        
    }
    
    public void establecerRecursos(int recursos){
        this.recursos = recursos;
    }
    
    public int obtenerRecursos(){
        return recursos;
    }
    
    public void establecerUnidades(Unidad unidad){
        unidades[ cantidadUnidades ] = unidad;
        cantidadUnidades++;
    }
    
    public Unidad obtenerUnidades(int[] posicion){
        int buscador = 0;
        while ( buscador < cantidadUnidades ){
            if ( unidades[ buscador].obtenerposicion() == posicion ){break;}
            buscador++;
        }
        return unidades[buscador];
    }
}
