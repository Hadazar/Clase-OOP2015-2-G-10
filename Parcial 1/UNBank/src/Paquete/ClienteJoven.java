package Paquete;

public class ClienteJoven extends Cliente{
  
  private CuentaJoven[] listaCuentasJoven = new CuentaJoven[100];
  private int cantidadCuentasJoven = 0;
  private UNPrestamo[] listaUNPrestamos = new UNPrestamo[100];
  private int cantidadUNPrestamos = 0;
  
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
  
	public void pagarDeudas(int codigo, double pago){
		setDineroBolsillo(getDineroBolsillo() - pago);
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
