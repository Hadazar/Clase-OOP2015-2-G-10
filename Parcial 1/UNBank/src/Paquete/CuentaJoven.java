package Paquete;
import java.util.Calendar;

public class CuentaJoven extends Cuenta{
	
	private double limiteOperecionGratuita = 700000;
	
	CuentaJoven (Calendar fechaDeOrigen, String bancoAsociado, double deposito){
		super(fechaDeOrigen, bancoAsociado, deposito);
	};
	
	public void setLimiteDeOperaciongratuita(double limiteOperecionGratuita){
		this.limiteOperecionGratuita = limiteOperecionGratuita;
	}

	 public double retirar (double retiro){
		 if (retiro > limiteOperecionGratuita){
			 setDeposito (getDeposito() - retiro - retiro * getCostoRetiro());
			 if (getDeposito() < 0){retiro += getDeposito(); setDeposito(0);}
		 return retiro;
		 }else {
			 setDeposito (getDeposito() - retiro - retiro * getCostoRetiro());
			 if (getDeposito() < 0){retiro += getDeposito(); setDeposito(0);}
		 }
		 return retiro;
	 };
	 
	 public double depositar (double deposito){
		 setDeposito(getDeposito() + deposito);
		 return -deposito;
	 };
}
