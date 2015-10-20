package Paquete;
import java.util.endar;

public class ProductoBancario {
	
	String código;
	Calendar fechaDeOrigen;
	
	void setAtributos(String código, Calendar fechaDeOrigen){
		this.código = código;
		this.fechaDeOrigen = fechaDeOrigen;
	};
	
	String getCódigo(){
		return código;
	};
	
	Calendar getFechaDeOrigen(){
		return fechaDeOrigen;
	};
	
}
