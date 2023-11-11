package ferreira.cnt.auxiliar;

public class Endereco {
	private String tipoLogradouro;
	private String Logradouro;
	private String numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String uf;
	private String pais;
	private String cep;
	
	
	public void cadastrar(String tipoLogradouro,
						  String Logradouro,
						  String numero,
						  String bairro,
						  String complemento,
						  String cidade,
						  String uf,
						  String pais,
						  String cep) {
		this.tipoLogradouro = tipoLogradouro;
		this.Logradouro = Logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;
		this.cep = cep;
	}
	
	
	// Getters e Setters
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	

}
