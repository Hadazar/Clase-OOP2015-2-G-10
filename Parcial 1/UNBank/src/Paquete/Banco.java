package Paquete;

public class Banco {
	
	private String nombre;
	private ClienteAdulto[] listaClientesAdultos = new ClienteAdulto[100];
	private int cantidadClientesAdultos = 0;
	private ClienteJoven[] listaClientesjoven = new ClienteJoven[100];
	private int cantidadClientesJoven = 0;
	private int cantidadClientes = 0;
	
	public void setNombre (String nombre){
		this.nombre = nombre;
	};
	
	public String getNombre (){
		return nombre;
	};
	
	public void setListaClientesAdultos (ClienteAdulto cliente){
		listaClientesAdultos[cantidadClientesAdultos] = cliente;
	};
	
	public ClienteAdulto getClienteAdulto (String cliente){
		int posicion = 0;
		while (posicion < cantidadClientesAdultos){
			if (listaClientesAdultos[posicion].getNombre() == cliente){
				break;
			}
			posicion++;
		}
		return listaClientesAdultos[posicion];
	};
	
	public void setListaClientesJovenes (ClienteJoven cliente){
		listaClientesJovenes[cantidadClientesJovenes] = cliente;
	};
	
	public ClienteJovene getClienteJoven (String cliente){
		int posicion = 0;
		while (posicion < cantidadClientesJovenes){
			if (listaClientesJovenes[posicion].getNombre() == cliente){
				break;
			}
			posicion++;
		}
		return listaClientesJovenes[posicion];
	};
	
	public void cobrarDeudas (String cliente){
		if (clientes == "todos los clientes"){
			for (int i = 0; i < cantidadClientesAdultos; i++){
				listaClientesAdultos[i].calcularDeuda();
				double deuda = listaClientesAdultos[i].getDeuda();
				listaClientesAdultos[i].pagarDeudas(0, deuda, false);
				listaClientesJovenes[i].calcularDeuda();
				deuda = listaClientesJovenes[i].getDeuda();
				listaClientesJovenes[i].pagarDeudas(0, deuda, false);
			}
		}
		else{
			int posicion = 0;
			booleano esAdulto = false;
			while (posicion < cantidadClientesAdultos){
				if(listaClientesAdultos[posicion].getNombre == nombre){esAdulto = true; break;}
				posicion++;
			}
			if (esAdulto == false){
				posicion = 0;
				while (posicion < cantidadClientesJovenes){
				if(listaClientesJovenes[posicion].getNombre == nombre){break;}
				posicion++;
				}
			}
			if(esAdulto == true){listaClientesAdultos[posicion].(0, deuda, false);}
			else{listaClientesJovenes[posicion].(0, deuda, false);}
		}
	}
	
	
}
