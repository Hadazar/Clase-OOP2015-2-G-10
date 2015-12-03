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
public class Establo extends Edificio{
    
    public Establo (double[] posicion){
        super(posicion);
    }
    
    public Unidad crearUnidades(){
        Jinete jinete = new Jinete(obtenerPosicion());
        return jinete;
    }
}
