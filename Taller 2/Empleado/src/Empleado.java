
public class Empleado {
	
	String Nombre;
	String Apellido;
	double Salario_mensual;
	
	public Empleado(String nombre, String apellido, double salario){
		this.Nombre = nombre;
		this.Apellido = apellido;
		if (salario < 0){salario = 0;}
		this.Salario_mensual = salario;
	};
	
	public static double Incremento_salarial (double Porcentaje, double Salario_mensual){
		return Salario_mensual * (1 + Porcentaje / 100);
	}
}
