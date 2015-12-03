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
public class Cuartel extends Edificio{
    
    public Cuartel(double[] posicion){
        super(posicion);
    }
    
    public Unidad crearUnidades(){
        Espadachin espadachin = new Espadachin(obtenerPosicion());
        return espadachin;
    }
}
