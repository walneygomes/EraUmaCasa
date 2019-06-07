
public class Teste {

	public static void main(String[] args) {
		Chave chave = new Chave();
		chave.setSenha("Admin");
		chave.setEmail("Admin");

		Pessoa pessoa = new Pessoa(chave);
		pessoa.abrirPorta();
		pessoa.local();
		pessoa.andar();
		pessoa.local();

	}
}
