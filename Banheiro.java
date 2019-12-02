
public class Banheiro {//Masculino - Feminino
	int homensNoBanheiro = 0;
	int mulheresNoBanheiro = 0;
	Seguranca seguranca = new Seguranca(this);
	
	public Banheiro() {
		
	}
	
	//porta/fechadura
	public void usarBanheiro(Pessoa p) {
		int fechadura = seguranca.podeEntrarPessoaBanheiro(p);
		
		if (fechadura == 0) {	
			System.out.println("Segurança: " + p.nome + ",pode entrar.");
			try {
				System.out.println(p.nome + ": obrigado, estou entrando.");
				
				
				System.out.printf("\n---CONTADOR HOMENS[%d] --- MULHERES[%d]---\n",
						homensNoBanheiro, 
						mulheresNoBanheiro);
				
				Thread.sleep(2000);
				
				this.sairBanheiro(p);
				
				System.out.println(p.nome + ": estou saindo do banheiro!");
				
				System.out.printf("\n---CONTADOR HOMENS[%d] --- MULHERES[%d]---\n",
						homensNoBanheiro, 
						mulheresNoBanheiro);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} else if (fechadura == 1) {		
			System.out.println("Segurança: " + p.nome + ",pode entrar.");
			try {
				System.out.println(p.nome + ": obrigado, estou entrando.");
				
				
				System.out.printf("\n---CONTADOR HOMENS[%d] --- MULHERES[%d]---\n",
						homensNoBanheiro, 
						mulheresNoBanheiro);
				
				Thread.sleep(2000);
				
				this.sairBanheiro(p);
				
				System.out.println(p.nome + ": estou saindo do banheiro!");
				
				
				System.out.printf("\n---CONTADOR HOMENS[%d] --- MULHERES[%d]---\n",
						homensNoBanheiro, 
						mulheresNoBanheiro);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("--->Segurança: " + p.nome + ",não pode entrar ainda, aguarde na fila..");
			p.beber();
		}
	}
	
	public void sairBanheiro(Pessoa p) throws InterruptedException {
		System.out.println(p.nome + ": estou saindo do banheiro...");
		
		if (p.sexo == 'm' ) {
			this.homensNoBanheiro -= 1;
		}
		else if (p.sexo == 'f') {
			this.mulheresNoBanheiro -= 1;
		}
		
		System.out.println(p.nome + ": Segurança avisa ai que quem quiser pode entrar, flw. Pokas.");
		
	}
}
