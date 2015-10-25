package Paquete;
import java.util.Calendar;

public class Prestamo extends ProductoBancario{

	private double monto = 0;
	private double deuda = 0;
	private static double tasaInteresActual = 0.05;
	private static double[ ] listaTasasInteres = new double[100];
	private static int cantidadTasasInteres = 0;
	private static Calendar[ ] fechasCambioTasaInteres = new Calendar[100];
	private static int cantidadFechasCambioInteres = 0;
	private double interes = 0;
	private String planDePago;
	private int periodo;
	
	Prestamo(Calendar fechaDeOrigen, String bancoAsociado, double monto, String planDePago, int periodo, Calendar fechaActual){
		super(fechaDeOrigen, bancoAsociado);
		this.monto = monto;
		this.planDePago = planDePago;
		this.periodo = periodo;
		listaTasasInteres[cantidadTasasInteres] = tasaInteresActual;
		cantidadTasasInteres++;
		fechasCambioTasaInteres[cantidadFechasCambioInteres] = fechaDeOrigen;
		cantidadFechasCambioInteres++;
		long cantidadMilisegundos = fechaActual.getTimeInMillis() - fechaDeOrigen.getTimeInMillis();
		long cantidadMeses = cantidadMilisegundos / (1000 * 60 * 60 * 24 * 30);
		interes = cantidadMeses * tasaInteresActual * monto;
		deuda = monto + interes;
	};
	
	public void setTasaInteres (double tasaInteres, Calendar fechaCambio){
		tasaInteresActual = tasaInteres;
		listaTasasInteres[cantidadTasasInteres] = tasaInteresActual;
		cantidadTasasInteres++;
		fechasCambioTasaInteres[cantidadFechasCambioInteres] = getFechaDeOrigen();
		cantidadFechasCambioInteres++;
		int posicion = 1;
		interes = 0;
		while (posicion < cantidadFechasCambioInteres){
			long cantidadMilisegundos = fechasCambioTasaInteres[posicion].getTimeInMillis() - fechasCambioTasaInteres[posicion - 1].getTimeInMillis();
			long cantidadMeses = cantidadMilisegundos / (1000 * 60 * 60 * 24 * 30);
			interes = interes + cantidadMeses * tasaInteresActual * monto;
			posicion++;
		};
		deuda = monto + interes;
	}
	
	public double getTasaInteres (){
		return tasaInteresActual;
	};
	
	public Calendar getUltimafechaCambio (){
		return fechasCambioTasaInteres[cantidadFechasCambioInteres];
	};
	
	public void setMonto (double monto){
		this.monto = monto;
	};
	
	public double getMonto(){
		return monto;
	};
	
	public void setDeuda (double deuda){
		this.deuda = deuda;
	};
	
	public double getDeuda(){
		return deuda;
	};
	
	public void setInteres (double interes){
		this.interes = interes;
	};
	
	public double getInteres(){
		return interes;
	};
	
	public String getPlanDePago(){
		return planDePago;
	};
	
	public int getPeriodo(){
		return periodo;
	};
	
	public double pagarDeuda(double pago){
		deuda -= pago;
		if (deuda < 0){pago = - deuda; deuda = 0;}
		else {pago = 0;};
		return pago;
	};
}
