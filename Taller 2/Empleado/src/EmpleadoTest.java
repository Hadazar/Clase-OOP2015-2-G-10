
public class EmpleadoTest {
	public static void main (String[] args){
		Empleado Empleado1 = new Empleado("Carlos","Barragán",5000000);
		Empleado Empleado2 = new Empleado("Julián","Ossa",10000000);
		Empleado Empleado3 = new Empleado("Andres","Valderrama",2500000);
		Empleado Empleado4 = new Empleado("Héctor","Daza",10000000);
		Empleado Empleado5 = new Empleado("Rigoberto","Patequiva",1750000);
		double Porcentaje = 0;
		
		for (int i = 0; i < 6; i++){
			Empleado1.Salario_mensual = Empleado.Incremento_salarial(Porcentaje, Empleado1.Salario_mensual);
			Empleado2.Salario_mensual = Empleado.Incremento_salarial(Porcentaje, Empleado2.Salario_mensual);
			Empleado3.Salario_mensual = Empleado.Incremento_salarial(Porcentaje, Empleado3.Salario_mensual);
			Empleado4.Salario_mensual = Empleado.Incremento_salarial(Porcentaje, Empleado4.Salario_mensual);
			Empleado5.Salario_mensual = Empleado.Incremento_salarial(Porcentaje, Empleado5.Salario_mensual);
			if (Porcentaje == 10){System.out.println("Incremento del 10%:\n");};
			Porcentaje = 10;
			System.out.printf("Empleado 1: "+Empleado1.Nombre+" "+Empleado1.Apellido+"; "+"Salario anual: $"+"%.2f\n",(Empleado1.Salario_mensual*12));
			System.out.printf("Empleado 2: "+Empleado2.Nombre+" "+Empleado2.Apellido+"; "+"Salario anual: $"+"%.2f\n",(Empleado2.Salario_mensual*12));
			System.out.printf("Empleado 3: "+Empleado3.Nombre+" "+Empleado3.Apellido+"; "+"Salario anual: $"+"%.2f\n",(Empleado3.Salario_mensual*12));
			System.out.printf("Empleado 4: "+Empleado4.Nombre+" "+Empleado4.Apellido+"; "+"Salario anual: $"+"%.2f\n",(Empleado4.Salario_mensual*12));
			System.out.printf("Empleado 5: "+Empleado5.Nombre+" "+Empleado5.Apellido+"; "+"Salario anual: $"+"%.2f\n\n",(Empleado5.Salario_mensual*12));
		}	
	}
}
