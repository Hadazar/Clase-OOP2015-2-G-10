package Paquete;
import java.util.Calendar;

public class CertificadoDeDepósitoATérmino extends ProductoBancario{
	
	int periodo;
	Calendar fechaDeOrigen;
	double interés;
	
	void setAtributos(int periodo, Calendar fechaDeOrigen, double interés){
		this.periodo = periodo;
		this.fechaDeOrigen = fechaDeOrigen;
		this.interés = interés;
	};
	
	int getPeriodo(){
		return periodo;
	};
	
	Calendar getFechaDeOrigen(){
		return fechaDeOrigen;
	};
	
	double getInterés(){
		return interés;
	};
}
