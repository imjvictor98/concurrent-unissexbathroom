
public class Seguranca {
	Banheiro banheiro;
	
	Seguranca(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	public synchronized int podeEntrarPessoaBanheiro(Pessoa p) {
		System.out.println("--> " + p.nome + ": posso entrar ?");
		if ((banheiro.homensNoBanheiro >= 0 && banheiro.mulheresNoBanheiro <= 0) && p.sexo == 'm') {
			this.banheiro.homensNoBanheiro += 1;
			
			return 0;
		} else if ((banheiro.mulheresNoBanheiro >= 0 && banheiro.homensNoBanheiro <= 0 ) && p.sexo == 'f') {
			this.banheiro.mulheresNoBanheiro += 1;
			
			return 1;
		}
		return -1;
	}
}
