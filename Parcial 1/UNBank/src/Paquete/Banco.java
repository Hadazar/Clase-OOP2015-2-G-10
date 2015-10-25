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
	
	public Cliente getCliente (String cliente){
		int posicion = 0;
		while (posicion < cantidadClientes){
			if (listaClientesAdultos[posicion].getNombre() == cliente){
				break;
			}
			posicion++;
		}
		return listaClientesAdultos[posicion];
	};
	
	public void cobrarDeudas (String clientes){
		if (clientes == "todos los clientes"){
			for (int i = 0; i < cantidadClientes; i++){
				listaClientes[i].pagarDeudas
			}
		}
		else{
			
		}
	}
	
	
}
