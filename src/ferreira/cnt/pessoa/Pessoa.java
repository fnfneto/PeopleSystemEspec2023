package ferreira.cnt.pessoa;

// Importacao de bibliotecas do próprio java
import java.time.LocalDate;
import java.time.Period;

// Importação das classes personalizadas
import ferreira.cnt.composicao.Endereco;
import ferreira.cnt.composicao.Telefone;

//Declaração das variaveis da classe
public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private Telefone telefone;

	
	// metodo public void nao retorna nada
	public void cadastrar(String nome,
						  LocalDate dataNascimento,
						  Endereco endereco,
						  Telefone telefone) {
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
		LocalDate dataAtual = LocalDate.now();
		Period periodoPessoa = Period.between(dataNascimento, dataAtual);
		return idade = periodoPessoa.getYears();
		
	}

	
	// Getters e Setters -- Os sets são como as funções do excel
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
}
