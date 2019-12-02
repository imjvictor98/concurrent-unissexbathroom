
public class Executora { //Masculino Feminino
	public static void main(String[] args) {
		Banheiro b = new Banheiro();
		
		Pessoa a = new Pessoa("João", 'm', b);
		Pessoa c = new Pessoa("Ana", 'f', b);
		
		Pessoa d = new Pessoa("Rodrigo", 'm', b);
		Pessoa e = new Pessoa("Beatriz", 'f', b);
		
		Pessoa f = new Pessoa("Lucas", 'm', b);
		Pessoa g = new Pessoa("Larissa", 'f', b);
		
		a.start();
		c.start();
		
		d.start();
		e.start();
		
		f.start();
		g.start();
		

		
	
	}
}
