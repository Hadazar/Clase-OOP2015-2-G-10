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
public class GaleriaDeTiroConArco extends Edificio{
    
    public GaleriaDeTiroConArco(double[] posicion){
        super(posicion);
    }
    
    public Unidad crearUnidades(){
        Arquero arquero = new Arquero(obtenerPosicion());
        return arquero;
    }
}
