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
public class Unidad extends Objeto{
   
   private double alcanze;
   private double armadura; 
   private double ataque;
   private double velocidad;
   
   public Unidad(int[] posicion){
       super(posicion);
   }
   
   public void establecerAlcanze(double alcanze){
       this.alcanze = alcanze;
   }
   public double obtenerAlcanze(){
       return alcanze;
   }
   public void establecerArmadura(double armadura){
       this.armadura = armadura;
   }
   public double obtenerArmadura(){
       return armadura;
   }
   public void establecerAtaque(double ataque){
       this.ataque = ataque;
   }
   public double obtenerAtaque(){
       return ataque;
   }
   public void establecerVelocidad(double velocidad){
       this.velocidad = velocidad;
   }
   public double obtenerVelocidad(){
       return velocidad;
   }
 
   public double atacar(Unidad unidad){
       return unidad.obtenerVida() - ataque + unidad.obtenerArmadura();
   }
   public void moverse throws Exception(int[] posicion){
      int distanciaX = this.posicion[0]-posicion[0];
      int distanciaY = this.posicion[1]-posicion[1];
      int distancia = distanciaX + distanciaY;
      if (distancia > velocidad){throw new Exception ("La casilla se sale del rango de movimiento de la unidad")};
       establecerPosicion(posicion);
   }
}
