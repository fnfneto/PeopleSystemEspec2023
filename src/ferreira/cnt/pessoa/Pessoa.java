package ferreira.cnt.pessoa;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String endereco;
	private String telefone;

	
	// metodo public void nao retorna nada
	public void cadastrar(String nome,
						  String dataNascimento,
						  String endereco,
						  String telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}
	
	// public construtor() {
		// exemplo de construtor
	// }
	
	//metodo public int(variavel) retorna algo
	public int obterIdade() {
		// retorna algo
		int idade = 0;
		//subtrair o ano atual do ano de nascimento.
		return idade;
		
	}

	
	// Getters e Setters -- Os sets são como as funções do excel
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
