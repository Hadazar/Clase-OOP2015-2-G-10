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
public class Objeto {
    
   private double[] posicion =  new double[2];
   private double vida;
   
   public Objeto(double[] posicion){
       establecerPosicion(posicion);
   }
  
   public void establecerPosicion(double[] posicion){
       this.posicion = posicion;
   }
   public double[] obtenerPosicion(){
       return posicion;
   }
   
   public void establecerVida(double vida){
       this.vida = vida;
   }
   public double obtenerVida(){
       return vida;
   }
}
