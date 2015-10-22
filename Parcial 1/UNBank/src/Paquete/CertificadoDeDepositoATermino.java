package Paquete;
import java.util.Calendar;

public class CertificadoDeDepositoATermino extends ProductoBancario{
	
	int periodo;
	Calendar fechaDeOrigen;
	double interes;
	
	void setAtributos(int periodo, Calendar fechaDeOrigen, double interes){
		this.periodo = periodo;
		this.fechaDeOrigen = fechaDeOrigen;
		this.interes = interes;
	};
	
	int getPeriodo(){
		return periodo;
	};
	
	Calendar getFechaDeOrigen(){
		return fechaDeOrigen;
	};
	
	double getInteres(){
		return interes;
	};
}
