package Paquete;
import java.util.Calendar;

public class ProductoBancario {
	
	private String codigo;
	private Calendar fechaDeOrigen;
	private static Calendar fechaActual;
	
	public void setAtributos(String codigo, Calendar fechaDeOrigen, Calendar fechaActual){
		this.codigo = codigo;
		this.fechaDeOrigen = fechaDeOrigen;
		this.fechaActual = fechaActual;
	};
	
	public String getCodigo(){
		return codigo;
	};
	
	public Calendar getFechaDeOrigen(){
		return fechaDeOrigen;
	};
	
	public Calendar getFechaActual(){
		return fechaActual;
	};
	
}
