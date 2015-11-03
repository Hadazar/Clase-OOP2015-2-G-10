package Paquete;

public class ClienteAdulto extends Cliente{
	
	String tipo;
	CuentaDeAhorros[] listaCuentasDeAhorros = new CuentaDeAhorros[100];
	int cantidadCuentasDeAhorros = 0;
	CertificadoDeDepositoATermino[] listaCertificadosDeDepositoATermino = new CertificadoDeDepositoATermino[100];
	int cantidadCertificadosDeDepositoATermino = 0;
	TarjetaCredito[] listaTarjetasCredito;
	int cantidadTarjetasCredito = 0;
	int canitdadProductosBancariosActivos;
	
	ClienteAdulto(String nombre, int edad, String documento, String telefono, double dineroBolsillo, double ingresosMensuales){
		super(nombre, edad, documento, telefono, dineroBolsillo, ingresosMensuales);
		if (ingresosMensuales <= 2000000){tipo = "Plateado";}
		else if (ingresosMensuales >= 2000000 && ingresosMensuales <= 20000000){tipo = "Dorado";}
		else {tipo = "Platino";};
	}
	
	public void setListaCuentasDeAhorros (CuentaDeAhorros cuentaDeAhorros){
		listaCuentasDeAhorros[cantidadCuentasDeAhorros] = cuentaDeAhorros;
		cantidadCuentasDeAhorros++;
	};
	
	public CuentaDeAhorros getCuentaDeAhorros (int codigo){
		int posicion = 0;
		while (posicion < cantidadCuentasDeAhorros){
			if (listaCuentasDeAhorros[posicion].getCodigo() == codigo){
				break;
			}
			posicion++;
		}
		return listaCuentasDeAhorros[posicion];
	};
	
	public void setListaCertificadosDeDepositoATermino (CertificadoDeDepositoATermino certificadoDeDepositoATermino){
		listaCertificadosDeDepositoATermino[cantidadCertificadosDeDepositoATermino] = certificadoDeDepositoATermino;
		cantidadCertificadosDeDepositoATermino++;
	};
	
	public CertificadoDeDepositoATermino getCertificadoDeDepositoATermino (int codigo){
		int posicion = 0;
		while (posicion < cantidadCertificadosDeDepositoATermino){
			if (listaCertificadosDeDepositoATermino[posicion].getCodigo() == codigo){
				break;
			}
			posicion++;
		}
		return listaCertificadosDeDepositoATermino[posicion];
	};
	
	public void setListaTarjetasCredito (TarjetaCredito tarjetaCredito){
		listaTarjetasCredito[cantidadTarjetasCredito] = tarjetaCredito;
		cantidadTarjetasCredito++;
	};
	
	public TarjetaCredito getTarjetaCredito (int codigo){
		int posicion = 0;
		while (posicion < cantidadTarjetasCredito){
			if (listaTarjetasCredito[posicion].getCodigo() == codigo){
				break;
			}
			posicion++;
		}
		return listaTarjetasCredito[posicion];
	};
	
	public void setCantidadProductosBancariosActivos(){
		int cantidadProductosBancariosActivos = 0;
		
		for (int i = 0; i < cantidadCuentasDeAhorros; i++){
			if (listaCuentasDeAhorros[i].getDeposito > 0 ){cantidadProductosBancariosActivos++;};
		}
		
		for (int i = 0; i < cantidadCertificadosDeDepositoAtermino; i++){
			if (listaertificadosDeDepositoAtermino[i].getDeposito > 0 ){cantidadProductosBancariosActivos++;};	
		}
		for (int i = 0; i < cantidadTarjetascredito; i++){
			if (listaTarjetascredito[i].getDeuda> 0 ){cantidadTarjetascredito++;};
		}
	}
	
	public void calcularDeuda(){
		double deuda = 0;
		for (int i = 0; i < cantidadTarjetasCredito, i++){
			deuda += listaTarjetasCredito[posicion].getDeuda();
		}
		setDeuda(deuda);
	}
	
	public void pagarDeudas(int codigo, double pago, boolean enEfectivo){
		if (enEfectivo == true){
			if (getDineroBolsillo() - pago < 0){pago = getDineroBolsillo();}
			else{setDineroBolsillo(getDineroBolsillo() - pago);}
		}
		else{	
			double acumulado = 0;
			double retiro;
			for(int i = 0; i < cantidadCuentasDeAhorros; i++){
				retiro = listaCuentasDeAhorros[i].retirar(pago);
				acumulado = acumulado + retiro;
				if (retiro == pago){break;}
				pago = pago - acumulado;
			}
			pago = acumulado;
		}
		if (codigo == 0){
			int posicion = 0;
			while (posicion < cantidadTarjetasCredito){
				pago = listaTarjetasCredito[posicion].pagarDeuda(pago);
				if (pago == 0){break;};
			}; // Fin de while
		}else {
			int posicion = 0;
			while (posicion < cantidadTarjetasCredito){
				if (listaTarjetasCredito[posicion].getCodigo() == codigo){
					pago = listaTarjetasCredito[posicion].pagarDeuda(pago);
				}; // Fin de Condicional
			}; // Fin de while
		} // Fin de Condicional
		setDineroBolsillo(getDineroBolsillo() + pago);
	}; // Fin de método pagarDeudas
	
	public void pagarDeudasPorCompleto(){
		calcularDeuda();
		double deuda = getDeuda();
		pagarDeudas(0, deuda, true);
		calcularDeuda();
		deuda = getDeuda();
		pagarDeudas(0, deuda, false);
	}
	
	public void transferirCuenta (double transferencia, int codigo, int codigo2){
		int posicion = 0;
		boolean seEncontro = false;
		boolean esCDT = false;
		boolean esCDT2 = false;
		while (posicion < cantidadCuentasDeAhorros){
			if (listaCuentasDeAhorros[posicion].getCodigo() == codigo){seEncontro = true; break;}
		}
		if (seEncontro == false){
			posicion = 0;
			while (posicion < cantidadCertificadosDeDepositoATermino){
				if (listaCertificadosDeDepositoATermino[posicion].getCodigo() == codigo){break;}
			};
			esCDT = true;
		};
		int posicion2 = 0;
		seEncontro = false;
		while (posicion2 < cantidadCuentasDeAhorros){
			if (listaCuentasDeAhorros[posicion2].getCodigo() == codigo2){seEncontro = true; break;}
		}
		if (seEncontro == false){
			posicion2 = 0;
			while (posicion2 < cantidadCertificadosDeDepositoATermino){
				if (listaCertificadosDeDepositoATermino[posicion2].getCodigo() == codigo2){break;}
			};
			esCDT2 = true;
		};
		if (esCDT == false){transferencia = listaCuentasDeAhorros[posicion].retirar(transferencia);}
		else {transferencia = listaCertificadosDeDepositoATermino[posicion].retirar(transferencia);}
		if (esCDT2 == false){listaCuentasDeAhorros[posicion2].depositar(transferencia);}
		else {listaCertificadosDeDepositoATermino[posicion2].depositar(transferencia);}
	}
}
