package Paquete;
import java.util.Calendar;

public class CertificadoDeDep�sitoAT�rmino extends ProductoBancario{
	
	int periodo;
	Calendar fechaDeOrigen;
	double inter�s;
	
	void setAtributos(int periodo, Calendar fechaDeOrigen, double inter�s){
		this.periodo = periodo;
		this.fechaDeOrigen = fechaDeOrigen;
		this.inter�s = inter�s;
	};
	
	int getPeriodo(){
		return periodo;
	};
	
	Calendar getFechaDeOrigen(){
		return fechaDeOrigen;
	};
	
	double getInter�s(){
		return inter�s;
	};
}
