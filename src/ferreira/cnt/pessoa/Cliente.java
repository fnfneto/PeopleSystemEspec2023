package ferreira.cnt.pessoa;

import ferreira.cnt.endereco.Endereco;
import ferreira.cnt.telefone.Telefone;

public class Cliente extends Pessoa{
	private String codigo;
	private String profissao;
	
	
	//Métodos
	public void cadastrar(String codigo, 
						  String profissao, 
						  String nomeCli,
						  String dataNascimentoCli,
						  Endereco enderecoCli, 
						  Telefone telefoneCli) {
		this.codigo = codigo;
		this.profissao = profissao;
		setNome(nomeCli);
		setDataNascimento(dataNascimentoCli);
		setEndereco(enderecoCli);
		setTelefone(telefoneCli);
		
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
