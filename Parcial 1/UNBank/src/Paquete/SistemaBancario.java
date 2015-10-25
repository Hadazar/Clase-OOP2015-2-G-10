package Paquete;

public class SistemaBancario {

	private Banco[] listaBancos = new Banco[100];
	private int cantidadBancos = 0;
	
	public void setListaBancos (Banco banco){
		listaBancos[cantidadBancos] = banco;
		cantidadBancos++;
	}
	
	public Banco getBanco (String banco){
		int posicion = 0;
		while (posicion < cantidadBancos){
			if (listaBancos[posicion].getNombre() == banco){
				break;
			}
			posicion++;
		}
		return listaBancos[posicion];
	}
}
