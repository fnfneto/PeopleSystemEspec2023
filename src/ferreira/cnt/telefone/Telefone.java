package ferreira.cnt.telefone;

public class Telefone {
	private String ddd;
	private String numero;
	
	
	public void cadastrar(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}

	
	
	// Getters e Setters
	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	
}