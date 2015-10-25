package Paquete;
import java.util.Calendar;

public class TarjetaCredito extends Prestamo{
	
	double cupo;
	
	TarjetaCredito(Calendar fechaDeOrigen, String bancoAsociado, double monto, String planDePago, int periodo, Calendar fechaActual, double ingresosMensuales){
		super (fechaDeOrigen, bancoAsociado, monto, planDePago, periodo, fechaActual);
		cupo = 3 * ingresosMensuales;
		setMonto(0);
		setDeuda(0);
		setInteres(0);
	};
	
	public double getCupo(){
		return cupo;
	};
	
	public void gastar(double gasto){
		if (getMonto() + gasto > cupo){
			gasto = cupo - getMonto();
			System.out.println("Ha sobrepasado el l�mite de endeudamiento, solo se le permiti� gastar: $" + gasto);
			setMonto(cupo);
			}
		else {setMonto(getMonto() + gasto);}
	}
	
}
