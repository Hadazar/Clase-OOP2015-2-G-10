package Paquete;
import java.util.Calendar;

public class CuentaDeAhorros extends Cuenta{
	
	private static double tasaInteresActual = 0.01;
	private static double[] listaTasasInteres = new double[100];
	private static int cantidadTasasInteres = 0;
	private static Calendar[] fechasCambioTasaInteres =new Calendar[100];
	private static int cantidadFechasCambioInteres = 0;
	private double interes;
	private double capital;
	
	CuentaDeAhorros (Calendar fechaDeOrigen, String bancoAsociado, double deposito, Calendar fechaActual){
		super(fechaDeOrigen, bancoAsociado, deposito);
		listaTasasInteres[cantidadTasasInteres] = tasaInteresActual;
		cantidadTasasInteres++;
		fechasCambioTasaInteres[cantidadFechasCambioInteres] = fechaDeOrigen;
		cantidadFechasCambioInteres++;
		long cantidadMilisegundos = fechaActual.getTimeInMillis() - fechaDeOrigen.getTimeInMillis();
		long cantidadMeses = cantidadMilisegundos / (1000 * 60 * 60 * 24 * 30);
		interes = cantidadMeses * tasaInteresActual * deposito;
		capital = deposito + interes;
	}
	
	public void setTasaInteres (double tasaInteres, Calendar fechaCambio){
		tasaInteresActual = tasaInteres;
		listaTasasInteres[cantidadTasasInteres] = tasaInteresActual;
		cantidadTasasInteres++;
		fechasCambioTasaInteres[cantidadFechasCambioInteres] = fechaCambio;
		cantidadFechasCambioInteres++;
		int posicion = 1;
		interes = 0;
		while (posicion < cantidadFechasCambioInteres){
			long cantidadMilisegundos = fechasCambioTasaInteres[posicion].getTimeInMillis() - fechasCambioTasaInteres[posicion - 1].getTimeInMillis();
			long cantidadMeses = cantidadMilisegundos / (1000 * 60 * 60 * 24 * 30);
			interes = interes + cantidadMeses * tasaInteresActual * getDeposito();
		};
		capital = getDeposito() + interes;
	}
	
	public double getTasaInteres (){
		return tasaInteresActual;
	};
	
	public Calendar getUltimafechaCambio (){
		return fechasCambioTasaInteres[cantidadFechasCambioInteres];
	};
	
	public double getInteres (){
		return interes;
	};
	
	public double getCapital (){
		return capital;
	};
}
