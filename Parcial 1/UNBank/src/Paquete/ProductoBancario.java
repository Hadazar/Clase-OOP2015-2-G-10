package Paquete;
import java.util.Calendar;

public class ProductoBancario {
	
	private int codigo;
	private static int referencia = 100000;
	private Calendar fechaDeOrigen;
	private static Calendar fechaActual;
	private String bancoAsociado;
	
	ProductoBancario (Calendar fechaDeOrigen, String bancoAsociado){
		this.fechaDeOrigen = fechaDeOrigen;
		this.bancoAsociado = bancoAsociado;
		codigo = referencia + 1;
		referencia++;
		
	}
	
	public int getCodigo(){
		return codigo;
	};
	
	public Calendar getFechaDeOrigen(){
		return fechaDeOrigen;
	};
	
	public static void setFechaActual(Calendar fechaEstablecida){
		fechaActual = fechaEstablecida;
	};
	
	public Calendar getFechaActual(){
		return fechaActual;
	};
	
	public String bancoAsociado(){
		return bancoAsociado;
	}
}
