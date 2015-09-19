import java.util.Scanner;

public class Fecha {
	
	//Funci�n para calcular el d�a de la semana
	public static int C�lculo(int dia, String mes, int a�o){
		
	//Variables de fecha
		int secular = (a�o/100);
		int bisiesto = (a�o/4)-(3/4)*secular;
		int primer_dia_del_a�o;
		
	//C�lculo del d�a de la semana al que corresponde el primer d�a del a�o
		if (a�o%4==0){
			primer_dia_del_a�o = (a�o%7)+((bisiesto-1)%7);
		}else {
			primer_dia_del_a�o = (a�o%7)+(bisiesto%7);
		};
		
		if (primer_dia_del_a�o>6){
			primer_dia_del_a�o-=7;
		};
		
		int primer_dia_del_mes = primer_dia_del_a�o;
		
	//C�lculo del d�a de la semana al que corresponde el primer d�a del mes
		switch (mes){
			case "enero": primer_dia_del_mes = primer_dia_del_a�o;
			break;
			case "febrero": primer_dia_del_mes = primer_dia_del_a�o+(31%7);
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "marzo": primer_dia_del_mes = primer_dia_del_a�o+((31+28)%7);
							if (a�o%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "abril": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31)%7);
							if (a�o%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "mayo": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31+30)%7);
							if (a�o%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "junio": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31+30+31)%7);
							if (a�o%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "julio": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31+30+31+30)%7);
							if (a�o%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "agosto": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31+30+31+30+31)%7);
							if (a�o%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "septiembre": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31+30+31+30+31+31)%7);
								if (a�o%4==0){primer_dia_del_mes++;};
								if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "octubre": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31+30+31+30+31+31+30)%7);
							if (a�o%4==0){primer_dia_del_mes++;};
							if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "noviembre": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31+30+31+30+31+31+30+31)%7);
								if (a�o%4==0){primer_dia_del_mes++;};
								if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
			case "diciembre": primer_dia_del_mes = primer_dia_del_a�o+((31+28+31+30+31+30+31+31+30+31+30)%7);
								if (a�o%4==0){primer_dia_del_mes++;};
								if (primer_dia_del_mes>6){primer_dia_del_mes-=7;};
			break;
		}
		
	//C�lculo del d�a de la semana al que corresponde la fecha introducida
		int dia_de_fecha_introducida = primer_dia_del_mes+(dia%7)-1;
		if (dia_de_fecha_introducida>6){dia_de_fecha_introducida-=7;};
		
		return dia_de_fecha_introducida;
	};
	
	public static void main(String[] args){
		
		Scanner Lector = new Scanner(System.in);
		System.out.println("Ingrese una fecha:\n");
		
	//Variables de d�a, mes y a�o
		System.out.print("D�a:"); 
		int Dia = Lector.nextInt();
		
		Scanner Lector2 = new Scanner(System.in);
		System.out.print("Mes:");
		String Mes = Lector2.nextLine();
		Mes = Mes.toLowerCase();
		
		System.out.print("A�o:");
		int A�o = Lector.nextInt();
		
		int fecha = C�lculo (Dia, Mes, A�o);
		
	//Impresi�n del d�a de la semana al que corresponde la fecha introducida
		switch(fecha){
		case 2: System.out.print(Dia+"-"+Mes+"-"+A�o+": Lunes.");
		break;
		case 3: System.out.print(Dia+"-"+Mes+"-"+A�o+": Martes.");
		break;
		case 4: System.out.print(Dia+"-"+Mes+"-"+A�o+": Mi�rcoles.");
		break;
		case 5: System.out.print(Dia+"-"+Mes+"-"+A�o+": Jueves.");
		break;
		case 6: System.out.print(Dia+"-"+Mes+"-"+A�o+": Viernes.");
		break;
		case 0: System.out.print(Dia+"-"+Mes+"-"+A�o+": S�bado.");
		break;
		case 1: System.out.print(Dia+"-"+Mes+"-"+A�o+": Domingo.");
		break;
		};
		Lector.close();
		Lector2.close();
	}
}
