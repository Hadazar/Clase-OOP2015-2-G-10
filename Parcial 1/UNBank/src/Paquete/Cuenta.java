package Paquete;
import java.util.Calendar;

public class Cuenta extends ProductoBancario{

	private double deposito;
	private double costoRetiro;
	private double costoTranferencia;
	
	Cuenta(Calendar fechaDeOrigen, String bancoAsociado, double deposito){
		super(fechaDeOrigen, bancoAsociado);
		costoRetiro = 0.001;
		costoTranferencia = 0.001;
	}
	
	 public void setDeposito(double deposito){
		 this.deposito = deposito;
	 };
	 
	 public double getDeposito(){
		 return deposito;
	 };

	 public void setCostoRetiro(double costoRetiro){
		 this.costoRetiro = costoRetiro;
	 };
	 
	 public double getCostoRetiro(){
		 return costoRetiro;
	 };

	 public void setcostoTranferencia(double costoTranferencia){
		 this.costoTranferencia = costoTranferencia;
	 };
	 
	 public double getCostoTranferencia(){
		 return costoTranferencia;
	 };
	 
	 public double retirar (double retiro){
		 deposito = deposito - retiro - retiro * costoRetiro;
		 if (deposito < 0){retiro += deposito; deposito = 0;}
		 return retiro;
	 };
	 
	 public double depositar (double deposito){
		 this.deposito = this.deposito + deposito;
		 return -deposito;
	 };
}
