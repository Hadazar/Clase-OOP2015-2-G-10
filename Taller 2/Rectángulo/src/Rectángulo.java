
public class Rectángulo {
	
	double Largo;
	double Ancho;
	
	public void setLargo (){
		if (Largo<0){Largo = -Largo;}
		if (Largo>20){Largo = 20;}
	}
	
	public void setAncho (){
		if (Largo<0){Ancho = -Ancho;}
		if (Largo>20){Ancho = 20;}
	}
	
	public double Perímetro(){
		return 2*Largo+2*Ancho;
	};
		
	public double Área(){
		return Largo*Ancho;
	}
	
		
}
