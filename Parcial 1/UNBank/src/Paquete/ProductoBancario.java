package Paquete;
import java.util.Calendar;

public class ProductoBancario {
	
	String c�digo;
	Calendar fechaDeOrigen;
	
	void setAtributos(String c�digo, Calendar fechaDeOrigen){
		this.c�digo = c�digo;
		this.fechaDeOrigen = fechaDeOrigen;
	};
	
	String getC�digo(){
		return c�digo;
	};
	
	Calendar getFechaDeOrigen(){
		return fechaDeOrigen;
	};
	
}
