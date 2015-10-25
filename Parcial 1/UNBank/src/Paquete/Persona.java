package Paquete;

public class Persona {
	
	 private String nombre;
	 private int edad;
	 private String documento;
	 private String telefono;
	 private double dineroBolsillo;
	 private double ingresosMensuales;
	 
	 Persona (String nombre, int edad, String documento, String telefono, double dineroBolsillo, double ingresosMensuales){
		 this.nombre = nombre;
		 this.edad = edad;
		 this.documento = documento;
		 this.telefono = telefono;
		 this.dineroBolsillo = dineroBolsillo;
		 this.ingresosMensuales = ingresosMensuales;
	 };
	 
	 public String getNombre(){
		 return nombre;
	 };
	 
	 public int getEdad(){
		 return edad;
	 };
	 
	 public String getDocumento(){
		 return documento;
	 };
	 
	 public String getTelefono(){
		 return telefono;
	 };
	 
	 public void setDineroBolsillo(double dineroBolsillo){
		 this.dineroBolsillo = dineroBolsillo;
	 }
	 
	 public double getDineroBolsillo(){
		 return dineroBolsillo;
	 };
	 
	 public void setIngresosMensuales(double ingresosMensuales){
		 this.ingresosMensuales = ingresosMensuales;
	 }
	 
	 public double getingresosMensuales(){
		 return ingresosMensuales;
	 };
}
