import java.util.ArrayList;

public class PortaProxy extends CômodosCasa {

	private String email = "admin";
	private String senha = "admin";
	private FactoryCasa factory = new FactoryCasa();
	CômodosCasa comodo;
	private static int andando = 0;

	public PortaProxy(Chave chave) {
		if ((chave.getEmail().equals(this.email) && senha.equals(this.senha))) {
			System.out.print("Acesso a casA");
			this.andando++;
			this.comodo = factory.obterLocal(andando);

		} else {
			System.out.print("negado");

		}
	}

	@Override
	public void abrirPorta() {
		comodo.abrirPorta();

	}

	@Override
	public void local() {
		// TODO Auto-generated method stub
		comodo.local();
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		factory.obterLocal(andando + 1);
	}
	private void voltar() {
		this.andando--;
		andar();
	}

}
