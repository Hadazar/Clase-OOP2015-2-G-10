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
public abstract class Edificio extends Objeto{
    
    public Edificio (double[] posicion){
        super(posicion);
    }
    
    public abstract Unidad crearUnidades ();

    
}
