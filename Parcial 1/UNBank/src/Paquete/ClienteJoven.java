package Paquete;

public class ClienteJoven extends Cliente{
  
  private CuentaJoven[] listaCuentasJoven = new CuentaJoven[100];
  private int cantidadCuentasJoven = 0;
  private UNPrestamo[] listaUNPrestamos = new UNPrestamo[100];
  private int cantidadUNPrestamos = 0;
  private int cantidadproductosBancariosActivos;
  
  ClienteJoven (String nombre, int edad, String documento, String telefono, double dineroBolsillo, double ingresosMensuales){
    super(nombre, edad, documento, telefono, dineroBolsillo, ingresosMensuales);
  }
  
  void setListaCuentasJoven(CuentaJoven cuentaJoven){
    listaCuentasJoven[cantidadCuentasJoven] = cuentaJoven;
    cantidadCuentasJoven++;
  }
  
  CuentaJoven getCuentaJoven(int codigo){
    int posicion = 0;
    while (posicion < cantidadCuentasJoven){
      if(listaCuentasJoven[posicion].getCodigo == codigo){break;}
      posicion++;
    }
    return listaCuentasJoven[posicion];
  }
  
  void setListaUNPrestamos(UNPrestamo uNPrestamo){
    listaUNPrestamos[cantidadUNPrestamos] = uNPrestamo;
    cantidadUNPrestamos++;
  }
  
  UNPrestamo getUNPrestamo(int codigo){
    int posicion = 0;
    while (posicion < cantidadUNPrestamo){
      if(listaUNPrestamos[posicion].getCodigo == codigo){break;}
      posicion++;
    }
    return listaUNPrestamos[posicion];
  }
  
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
		while (posicion < cantidadUNPrestamos){
			pago = listaUNPrestamos[posicion].pagarDeuda(pago);
			if (pago == 0){break;};
		}; // Fin de while
	}else {
		int posicion = 0;
		while (posicion < cantidadUNPrestamos){
			if (listaTarjetasCredito[posicion].getCodigo() == codigo){
				pago = listaUNPrestamos[posicion].pagarDeuda(pago);
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
	while (posicion < cantidadCuentasJoven){
		if (listaCuentasJoven[posicion].getCodigo() == codigo){break;}
		posicion++;
	}
	
	int posicion2 = 0;
	while (posicion2 < cantidadCuentasJoven{
		if (listaCuentasJoven[posicion2].getCodigo() == codigo2){break;}
	}
	transferencia = listaCuentasJoven[posicion].retirar(transferencia);
	listaCuentasJoven[posicion].depositar(transferencia);
  }
  
}
