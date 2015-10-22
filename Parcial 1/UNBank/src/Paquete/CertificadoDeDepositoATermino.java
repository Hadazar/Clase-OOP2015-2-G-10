package Paquete;
import java.util.Calendar;

public class CertificadoDeDepositoATermino extends ProductoBancario{
	
	int periodoTotal;
	int periodotrancurrido;
	double interes;
	double capitalInvertido;
	double capitalTotal;
	
	CertificadoDeDepositoATermino(Cliente clienteAsociado, double capitalInvertido, String código,int periodoTotal, Calendar fechaDeOrigen, Calendar fechaActual){
		super(codigo, fechaDeOrigen, fechaActual, clienteAsociado);
		this.periodoTotal = periodoTotal;
		this.periodoTrancurrido = 
		this.interes = interes;
		this.capitalInvertido = capitalInvertido;
		capitalTotal = capitalInvertido + capitalInvertido * interes * periodoTrancurrido;
	};
	
	void setInteres(double interes){
		this.interes = interes;	
	}
	
	int getPeriodo(){
		return periodo;
	};
	
	double getInteres(){
		return interes;
	};
	
	double getCapital(){
		return capital;
	}
	
	void retirar(double retiro){
		capitalTotal = capitalTotal - retiro;
		dinero
	}
}
