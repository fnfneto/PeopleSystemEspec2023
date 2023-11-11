package ferreira.cnt.pessoa;

import java.time.LocalDate;

import ferreira.cnt.composicao.Endereco;
import ferreira.cnt.composicao.Telefone;

public class Cliente extends Pessoa{
	private String codigo;
	private String profissao;
	
	
	//Métodos
	public void cadastrar(String codigo, 
						  String profissao, 
						  String nomeCli,
						  LocalDate dataNascimentoCli,
						  Endereco enderecoCli, 
						  Telefone telefoneCli) {
		this.codigo = codigo;
		this.profissao = profissao;
		
		
	}


	//Getters e Setters
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	


}
