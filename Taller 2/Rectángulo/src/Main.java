
public class Main {
	public static void main (String[] args){
		Rectángulo Primero = new Rectángulo();
		System.out.println("Primer rectágulo:"+"\n\nÁrea: "+Primero.Área()+"\n\nPerímetro: "+Primero.Perímetro());
		Rectángulo Segundo = new Rectángulo();
		Segundo.Largo = 25;
		Segundo.Ancho = 7;
		System.out.println("\n\nSegundo rectágulo:"+"\n\nÁrea: "+Segundo.Área()+"\n\nPerímetro: "+Segundo.Perímetro());
		Rectángulo Tercero = new Rectángulo();
		Tercero.Largo = 20;
		Tercero.Ancho = 7;
		System.out.println("\n\nTercer rectágulo:"+"\n\nÁrea: "+Tercero.Área()+"\n\nPerímetro: "+Tercero.Perímetro());
		Rectángulo Cuarto = new Rectángulo();
		Cuarto.Largo = 8;
		Cuarto.Ancho = 9;
		System.out.println("\n\nCuarto rectágulo:"+"\n\nÁrea: "+Cuarto.Área()+"\n\nPerímetro: "+Cuarto.Perímetro());
		Rectángulo Quinto = new Rectángulo();
		Quinto.Largo = 63;
		Quinto.Ancho = 10;
		System.out.println("\n\nQuinto rectágulo:"+"\n\nÁrea: "+Quinto.Área()+"\n\nPerímetro: "+Quinto.Perímetro());
		Rectángulo Sexto = new Rectángulo();
		Sexto.Largo = 15;
		Sexto.Ancho = 11;
		System.out.println("\n\nSexto rectágulo:"+"\n\nÁrea: "+Sexto.Área()+"\n\nPerímetro: "+Sexto.Perímetro());
		Rectángulo Séptimo = new Rectángulo();
		Séptimo.Largo = 12;
		Séptimo.Ancho = 30;
		System.out.println("\n\nSéptimo rectágulo:"+"\n\nÁrea: "+Séptimo.Área()+"\n\nPerímetro: "+Séptimo.Perímetro());
		Rectángulo Octavo = new Rectángulo();
		Octavo.Largo = -9;
		Octavo.Ancho = 7;
		System.out.println("\n\nOctavo rectágulo:"+"\n\nÁrea: "+Octavo.Área()+"\n\nPerímetro: "+Octavo.Perímetro());
		Rectángulo Noveno = new Rectángulo();
		Noveno.Largo = -5;
		Noveno.Ancho = -10;
		System.out.println("\n\nNoveno rectágulo:"+"\n\nÁrea: "+Noveno.Área()+"\n\nPerímetro: "+Noveno.Perímetro());
		Rectángulo Décimo = new Rectángulo();
		Décimo.Largo = -26;
		Décimo.Ancho = -2;
		System.out.println("\n\nDécimo rectágulo:"+"\n\nÁrea: "+Décimo.Área()+"\n\nPerímetro: "+Décimo.Perímetro());
		
	}
}
