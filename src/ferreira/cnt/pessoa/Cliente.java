package ferreira.cnt.pessoa;

public class Cliente extends Pessoa{
	private String codigo;
	private String profissao;
	
	
	//M�todos
	public void cadastrar(String codigo, 
						  String profissao, 
						  String nomeCli,
						  String dataNascimentoCli,
						  String enderecoCli, 
						  String telefoneCli) {
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