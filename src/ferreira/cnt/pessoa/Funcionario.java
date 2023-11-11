package ferreira.cnt.pessoa;

import java.time.LocalDate;

import ferreira.cnt.composicao.Endereco;
import ferreira.cnt.composicao.Telefone;

public class Funcionario extends Pessoa{
	private int matricula;
	private String cargo;
	private double salario;
	private LocalDate dataAdmissao;
	
	
	// Métodos
	public void cadastrar(int matricula,
						  String cargo, 
						  double salario, 
						  LocalDate dataAdmissao, 
						  String nomeFunc, 
						  LocalDate dataNascimentoFunc,
						  Endereco enderecoFunc, 
						  Telefone telefoneFunc) {
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		
		
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

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
	

}
