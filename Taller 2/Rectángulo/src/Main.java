
public class Main {
	public static void main (String[] args){
		Rectángulo Primero = new Rectángulo();
		System.out.println("Primer rectágulo:"+"\n\nÁrea: "+Primero.Área()+"\nPerímetro: "+Primero.Perímetro());
		Rectángulo Segundo = new Rectángulo();
		Segundo.setLargo(25);
		Segundo.setAncho(7);
		System.out.println("\nSegundo rectágulo:"+"\n\nÁrea: "+Segundo.Área()+"\nPerímetro: "+Segundo.Perímetro());
		Rectángulo Tercero = new Rectángulo();
		Tercero.setLargo(8);
		Tercero.setAncho(-9);
		System.out.println("\nTercer rectágulo:"+"\n\nÁrea: "+Tercero.Área()+"\nPerímetro: "+Tercero.Perímetro());
		Rectángulo Cuarto = new Rectángulo();
		Cuarto.setLargo(10);
		Cuarto.setAncho(35);
		System.out.println("\nCuarto rectágulo:"+"\n\nÁrea: "+Cuarto.Área()+"\nPerímetro: "+Cuarto.Perímetro());
		Rectángulo Quinto = new Rectángulo();
		Quinto.setLargo(-50);
		Quinto.setAncho(6);
		System.out.println("\nQuinto rectágulo:"+"\n\nÁrea: "+Quinto.Área()+"\nPerímetro: "+Quinto.Perímetro());
		Rectángulo Sexto = new Rectángulo();
		Sexto.setLargo(-9);
		Sexto.setAncho(-7);
		System.out.println("\nSexto rectágulo:"+"\n\nÁrea: "+Sexto.Área()+"\nPerímetro: "+Sexto.Perímetro());
		Rectángulo Séptimo = new Rectángulo();
		Séptimo.setLargo(11);
		Séptimo.setAncho(14);
		System.out.println("\nSéptimo rectágulo:"+"\n\nÁrea: "+Séptimo.Área()+"\nPerímetro: "+Séptimo.Perímetro());
		Rectángulo Octavo = new Rectángulo();
		Octavo.setLargo(45);
		Octavo.setAncho(-50);
		System.out.println("\nOctavo rectágulo:"+"\n\nÁrea: "+Octavo.Área()+"\nPerímetro: "+Octavo.Perímetro());
		Rectángulo Noveno = new Rectángulo();
		Noveno.setLargo(2);
		Noveno.setAncho(-1);
		System.out.println("\nNoveno rectágulo:"+"\n\nÁrea: "+Noveno.Área()+"\nPerímetro: "+Noveno.Perímetro());
		Rectángulo Décimo = new Rectángulo();
		Décimo.setLargo(0);
		Décimo.setAncho(-3);
		System.out.println("\nDécimo rectágulo:"+"\n\nÁrea: "+Décimo.Área()+"\nPerímetro: "+Décimo.Perímetro());
		
	}
}
