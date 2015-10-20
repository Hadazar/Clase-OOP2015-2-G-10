package Paquete;

public class Cliente {
	
	 String nombre;
	 String documento;
	 String teléfono;
	 double deuda;
	 double capitalTotal;
	 int dineroBolsillo;
	 String tipo;
	 int númeroDeProductosBancarios;
	 
	 void setAtributos(String nombre, String documento, String teléfono, double deuda, double capitalTotal, int dineroBolsillo, String tipo, int númeroDeProductosBancarios){
		 this.nombre = nombre;
		 this.documento = documento;
		 this.teléfono = teléfono;
		 this.deuda = deuda;
		 this.capitalTotal = capitalTotal;
		 this.dineroBolsillo = dineroBolsillo;
		 this.tipo = tipo;
		 this.númeroDeProductosBancarios = númeroDeProductosBancarios;
	 };
	 
	 String getNombre(){
		 return nombre;
	 };
	 
	 String getDocumento(){
		 return documento;
	 };
	 
	 String getTeléfono(){
		 return teléfono;
	 };
	 
	 double getDeuda(){
		 return deuda;
	 };
	 
	 double getCapitalTotal(){
		 return capitalTotal;
	 };
	 
	 int getDineroBolsillo(){
		 return dineroBolsillo;
	 };
	 
	 String getTipo(){
		 return tipo;
	 };
	 
	 int getNúmeroDeProductosBancarios(){
		 return númeroDeProductosBancarios;
	 };
	 
}
