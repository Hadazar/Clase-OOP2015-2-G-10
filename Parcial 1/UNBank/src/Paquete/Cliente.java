package Paquete;

public class Cliente {
	
	 String nombre;
	 String documento;
	 String telefono;
	 double deuda;
	 double capitalTotal;
	 int dineroBolsillo;
	 String tipo;
	 int númeroDeProductosBancarios;
	 
	 void setAtributos(String nombre, String documento, String telefono, double deuda, double capitalTotal, int dineroBolsillo, String tipo, int númeroDeProductosBancarios){
		 this.nombre = nombre;
		 this.documento = documento;
		 this.telefono = telefono;
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
	 
	 String getTelefono(){
		 return telefono;
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
