import java.util.Scanner;

public class Fecha {
	
	//Función para calcular el día de la semana
	public static int Cálculo(int dia, String mes, int año){
		
	//Variables de fecha
		int secular = (año/100);
		int bisiesto = (año/4)-(3/4)*secular;
		int primer_dia_del_año;
		
	//Cálculo del día de la semana al que corresponde el primer día del año
		if (año%4==0){
			primer_dia_del_año = (año%7)+((bisiesto-1)%7);
		}else {
			primer_dia_del_año = (año%7)+(bisiesto%7);
		};
		
		if (primer_dia_del_año>6){
			primer_dia_del_año-=7;
		};
		
		int primer_dia_del_mes = primer_dia_del_año;
		
	//Cálculo del día de la semana al que corresponde el primer día del mes
		switch (mes){
			case "enero": primer_dia_del_mes = primer_dia_del_año;
			break;
			case "febrero": primer_dia_del_mes = primer_dia_del_año+(31%7);
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "marzo": primer_dia_del_mes = primer_dia_del_año+((31+28)%7);
							if (año%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "abril": primer_dia_del_mes = primer_dia_del_año+((31+28+31)%7);
							if (año%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "mayo": primer_dia_del_mes = primer_dia_del_año+((31+28+31+30)%7);
							if (año%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "junio": primer_dia_del_mes = primer_dia_del_año+((31+28+31+30+31)%7);
							if (año%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "julio": primer_dia_del_mes = primer_dia_del_año+((31+28+31+30+31+30)%7);
							if (año%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "agosto": primer_dia_del_mes = primer_dia_del_año+((31+28+31+30+31+30+31)%7);
							if (año%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "septiembre": primer_dia_del_mes = primer_dia_del_año+((31+28+31+30+31+30+31+31)%7);
								if (año%4==0){primer_dia_del_mes++;};
								if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "octubre": primer_dia_del_mes = primer_dia_del_año+((31+28+31+30+31+30+31+31+30)%7);
							if (año%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "noviembre": primer_dia_del_mes = primer_dia_del_año+((31+28+31+30+31+30+31+31+30+31)%7);
								if (año%4==0){primer_dia_del_mes++;};
								if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "diciembre": primer_dia_del_mes = primer_dia_del_año+((31+28+31+30+31+30+31+31+30+31+30)%7);
								if (año%4==0){primer_dia_del_mes++;};
								if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
		}
		
	//Cálculo del día de la semana al que corresponde la fecha introducida
		int dia_de_fecha_introducida = primer_dia_del_mes+(dia%7)-1;
		if (dia_de_fecha_introducida>6){dia_de_fecha_introducida-=7;};
		
		return dia_de_fecha_introducida;
	};
	
	public static void main(String[] args){
		
		Scanner Lector = new Scanner(System.in);
		System.out.println("Ingrese una fecha:\n");
		
	//Variables de día, mes y año
		System.out.print("Día:"); 
		int Dia = Lector.nextInt();
		
		Scanner Lector2 = new Scanner(System.in);
		System.out.print("Mes:");
		String Mes = Lector2.nextLine();
		Mes = Mes.toLowerCase();
		
		System.out.print("Año:");
		int Año = Lector.nextInt();
		
		int fecha = Cálculo (Dia, Mes, Año);
		
	//Impresión del día de la semana al que corresponde la fecha introducida
		switch(fecha){
		case 2: System.out.print(Dia+"-"+Mes+"-"+Año+": Lunes.");
		break;
		case 3: System.out.print(Dia+"-"+Mes+"-"+Año+": Martes.");
		break;
		case 4: System.out.print(Dia+"-"+Mes+"-"+Año+": Miércoles.");
		break;
		case 5: System.out.print(Dia+"-"+Mes+"-"+Año+": Jueves.");
		break;
		case 6: System.out.print(Dia+"-"+Mes+"-"+Año+": Viernes.");
		break;
		case 0: System.out.print(Dia+"-"+Mes+"-"+Año+": Sábado.");
		break;
		case 1: System.out.print(Dia+"-"+Mes+"-"+Año+": Domingo.");
		break;
		};
		Lector.close();
		Lector2.close();
	}
}
