package Paquete;
import java.util.Calendar;

public class ProductoBancario {
	
	String codigo;
	Calendar fechaDeOrigen;
	
	void setAtributos(String codigo, Calendar fechaDeOrigen){
		this.codigo = codigo;
		this.fechaDeOrigen = fechaDeOrigen;
	};
	
	String getCodigo(){
		return codigo;
	};
	
	Calendar getFechaDeOrigen(){
		return fechaDeOrigen;
	};
	
}
