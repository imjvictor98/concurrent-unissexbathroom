
public class Pessoa extends Thread {
	String nome;
	char sexo;
	Banheiro banheiro;
	
	public Pessoa(String nome, char sexo, Banheiro banheiro) {
		super(nome);
		this.nome = nome;
		this.sexo = sexo;
		this.banheiro = banheiro;
	}
	
	@Override
	public void run() {
		while (true) {
			beber();
			usarBanheiro();	
		}
	}
	
	void beber() {
		try {
			System.out.println(this.nome + " está bebendo...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void usarBanheiro() {
		try {
			this.banheiro.usarBanheiro(this);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
