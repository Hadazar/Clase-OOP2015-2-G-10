
public class Rectángulo {
	
	private double Largo;
	private double Ancho;
	
	public Rectángulo(){
		Largo = 1;
		Ancho = 1;
	}
	
	public void setLargo (double largo){
		Largo = largo;
		if (Largo < 0){Largo = -Largo;}
		if (Largo == 0){Largo = 1;}
		if (Largo > 20){Largo = 20;}
	}
	
	public void setAncho (double ancho){
		Ancho = ancho;
		if (Ancho<0){Ancho = -Ancho;}
		if (Ancho>20){Ancho = 20;}
	}
	
	public double Perímetro(){
		return 2*Largo+2*Ancho;
	};
		
	public double Área(){
		return Largo*Ancho;
	}
	
		
}