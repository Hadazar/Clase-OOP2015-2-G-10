package Paquete;

public class Pr�stamo extends ProductoBancario{

	double monto;
	double deuda;
	double inter�s;
	String planDePago;
	int periodo;
	
	void setAtributos(double monto, double deuda, double inter�s, String planDePago, int periodo){
		this.monto = monto;
		this.deuda = deuda;
		this.inter�s = inter�s;
		this.planDePago = planDePago;
		this.periodo = periodo;
	};
	
	double getMonto(){
		return monto;
	};
	double getDeuda(){
		return deuda;
	};
	double getInter�s(){
		return inter�s;
	};
	String getPlanDePago(){
		return planDePago;
	};
	int getPeriodo(){
		return periodo;
	};
	void pagarDeuda(String c�digo, double pago){
		
	};
}
