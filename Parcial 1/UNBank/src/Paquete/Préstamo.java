package Paquete;

public class Préstamo extends ProductoBancario{

	double monto;
	double deuda;
	double interés;
	String planDePago;
	int periodo;
	
	void setAtributos(double monto, double deuda, double interés, String planDePago, int periodo){
		this.monto = monto;
		this.deuda = deuda;
		this.interés = interés;
		this.planDePago = planDePago;
		this.periodo = periodo;
	};
	
	double getMonto(){
		return monto;
	};
	double getDeuda(){
		return deuda;
	};
	double getInterés(){
		return interés;
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
