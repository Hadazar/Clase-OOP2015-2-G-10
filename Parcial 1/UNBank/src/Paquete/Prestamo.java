package Paquete;

public class Prestamo extends ProductoBancario{

	double monto;
	double deuda;
	double interes;
	String planDePago;
	int periodo;
	
	void setAtributos(double monto, double deuda, double interes, String planDePago, int periodo){
		this.monto = monto;
		this.deuda = deuda;
		this.interes = interes;
		this.planDePago = planDePago;
		this.periodo = periodo;
	};
	
	double getMonto(){
		return monto;
	};
	double getDeuda(){
		return deuda;
	};
	double getInteres(){
		return interes;
	};
	String getPlanDePago(){
		return planDePago;
	};
	int getPeriodo(){
		return periodo;
	};
	void pagarDeuda(String código, double pago){
		
	};
}
