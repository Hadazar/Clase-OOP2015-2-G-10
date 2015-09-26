
public class Empleado {
	
	private String nombre;
	private String apellido;
	private double salarioMensual;
	
	public Empleado(String nombre, String apellido, double salario){
		this.nombre = nombre;
		this.apellido = apellido;
		if (salario < 0){salario = 0;}
		salarioMensual = salario;
	};
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public double getSalarioMensual(){
		return salarioMensual;
	}
	
	public static double Incremento_salarial (double Porcentaje, double Salario_mensual){
		return Salario_mensual * (1 + Porcentaje / 100);
	}
}
