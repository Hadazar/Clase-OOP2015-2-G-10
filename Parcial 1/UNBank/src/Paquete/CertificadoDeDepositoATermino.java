package Paquete;
import java.util.Calendar;

public class CertificadoDeDepositoATermino extends Cuenta{
	
	private int periodoTotal;
	private int periodoTranscurrido;
	private Calendar fechaTermino;
	private static double tasaInteresActual;
	private static double[ ] listaTasasInteres = new double[100];
	private static int cantidadTasasInteres = 0;
	private static Calendar[ ] fechasCambioTasaInteres = new Calendar [100];
	private static int cantidadFechasCambioInteres = 0;
	private double interes;
	private double inversion;
	
	CertificadoDeDepositoATermino(Calendar fechaDeOrigen, String bancoAsociado, double deposito, Calendar fechaTermino, Calendar fechaActual){
		super(fechaDeOrigen, bancoAsociado, deposito);
		listaTasasInteres[cantidadTasasInteres] = tasaInteresActual;
		cantidadTasasInteres++;
		fechasCambioTasaInteres[cantidadFechasCambioInteres] = fechaDeOrigen;
		cantidadFechasCambioInteres++;
		long cantidadMilisegundos = fechaActual.getTimeInMillis() - fechaDeOrigen.getTimeInMillis();
		periodoTranscurrido = (int)(cantidadMilisegundos / (1000 * 60 * 60 * 24 * 30));
		long cantidadTotalMilisegundos = fechaTermino.getTimeInMillis() - fechaDeOrigen.getTimeInMillis();
		periodoTotal = (int)(cantidadTotalMilisegundos / (1000 * 60 * 60 * 24 * 30));
		interes = periodoTranscurrido * tasaInteresActual * getDeposito();
		deposito = inversion + interes;
		
	};
	
	public int getPeriodoTotal(){
		return periodoTotal;
	};

	public int getPeriodoTranscurrido(){
		return periodoTranscurrido;
	};
	
	public void setTasaInteres(double tasaInteres, Calendar fechaCambio){
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
			posicion++;
		};
		deposito = inversion + interes;
	}
	
	double getTasaInteres(){
		return tasaInteresActual;
	};

	double getInteres(){
		return interes;
	};
	
	public double getCapital(){
		return capital;
	}
}
