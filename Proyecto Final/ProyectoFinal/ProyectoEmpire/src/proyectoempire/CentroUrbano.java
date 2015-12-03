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
public class CentroUrbano extends Edificio{
    
    public CentroUrbano(int[] posicion){
        super(posicion);
    }
    
    public Unidad crearUnidades(){
        Aldeano aldeano = new Aldeano(obtenerPosicion());
        return aldeano;
    }
}
