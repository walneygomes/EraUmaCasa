
public class Pessoa {
	Chave chave;
	CômodosCasa porta;

	public Pessoa(Chave chave) {
		this.chave = new Chave();
	}

	public void abrirPorta() {

		this.porta = new PortaProxy(this.chave);

	}

	public void local() {
		// TODO Auto-generated method stub
		this.porta.local();

	}

	public void andar() {
		// TODO Auto-generated method stub
		this.porta.andar();

	}

}
