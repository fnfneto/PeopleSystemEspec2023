package ferreira.cnt.pessoa;

import ferreira.cnt.endereco.Endereco;
import ferreira.cnt.telefone.Telefone;

public class Funcionario extends Pessoa{
	private int matricula;
	private String cargo;
	private double salario;
	private String dataAdmissao;
	
	
	// Métodos
	public void cadastrar(int matricula,
						  String cargo, 
						  double salario, 
						  String dataAdmissao, 
						  String nomeFunc, 
						  String dataNascimentoFunc,
						  Endereco enderecoFunc, 
						  Telefone telefoneFunc) {
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		setNome(nomeFunc);
		setDataNascimento(dataNascimentoFunc);
		setEndereco(enderecoFunc);
		setTelefone(telefoneFunc);
		
	}
	
	
	// Métodos
	public void reajustarSalario(double percentual) {
		this.salario = this.salario * percentual;
	}
	
	public void promover(String novoCargo) {
		this.cargo = novoCargo;
	}

	
	// Getters e Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
	

}
