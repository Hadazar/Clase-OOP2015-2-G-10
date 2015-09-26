
public class EmpleadoTest {
	
	public static void main (String[] args){
		
		Empleado Empleado1 = new Empleado("Carlos","Barragán",5000000);
		Empleado Empleado2 = new Empleado("Julián","Ossa",10000000);
		Empleado Empleado3 = new Empleado("Andres","Valderrama",2500000);
		Empleado Empleado4 = new Empleado("Héctor","Daza",10000000);
		Empleado Empleado5 = new Empleado("Rigoberto","Patequiva",1750000);
		double Porcentaje = 0;
		double salarioMensual1  = Empleado1.getSalarioMensual();
		double salarioMensual2  = Empleado2.getSalarioMensual();
		double salarioMensual3  = Empleado3.getSalarioMensual();
		double salarioMensual4  = Empleado4.getSalarioMensual();
		double salarioMensual5  = Empleado5.getSalarioMensual();
		
		System.out.println("Salario anual:\n");
		for (int i = 0; i < 6; i++){
			
			salarioMensual1 = Empleado.Incremento_salarial(Porcentaje, salarioMensual1);
			salarioMensual2 = Empleado.Incremento_salarial(Porcentaje, salarioMensual2);
			salarioMensual3 = Empleado.Incremento_salarial(Porcentaje, salarioMensual3);
			salarioMensual4 = Empleado.Incremento_salarial(Porcentaje, salarioMensual4);
			salarioMensual5 = Empleado.Incremento_salarial(Porcentaje, salarioMensual5);
			
			if (Porcentaje == 10){System.out.println("Incremento del 10%:\n");};
			Porcentaje = 10;
			
			System.out.printf("Empleado 1: "+Empleado1.getNombre()+" "+Empleado1.getApellido()+"; "+"Salario anual: $"+"%.2f\n",(salarioMensual1*12));
			System.out.printf("Empleado 2: "+Empleado2.getNombre()+" "+Empleado2.getApellido()+"; "+"Salario anual: $"+"%.2f\n",(salarioMensual2*12));
			System.out.printf("Empleado 3: "+Empleado3.getNombre()+" "+Empleado3.getApellido()+"; "+"Salario anual: $"+"%.2f\n",(salarioMensual3*12));
			System.out.printf("Empleado 4: "+Empleado4.getNombre()+" "+Empleado4.getApellido()+"; "+"Salario anual: $"+"%.2f\n",(salarioMensual4*12));
			System.out.printf("Empleado 5: "+Empleado5.getNombre()+" "+Empleado5.getApellido()+"; "+"Salario anual: $"+"%.2f\n\n",(salarioMensual5*12));
		}	
	}
}
