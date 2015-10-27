package Paquete;

public class Cliente extends Persona{
	
	 
	 private double deuda;
	 private double capitalTotal;
	 private double capitalNeto;
	 
	 Cliente (String nombre, int edad, String documento, String telefono, double dineroBolsillo, double ingresosMensuales){
		 super (nombre, edad, documento, telefono, dineroBolsillo, ingresosMensuales);
		 deuda = 0;
		 capitalTotal = dineroBolsillo;
		 capitalNeto = dineroBolsillo;
	 }
	 
	 void setDeuda(double deuda){
	 	this.deuda = deuda;
	 }
	 
	 public double getDeuda(){
		 return deuda;
	 };
	 
	 public double getCapitalTotal(){
		 return capitalTotal;
	 };
	 
	 public double getcapitalNeto(){
		 return capitalNeto;
	 };
}
