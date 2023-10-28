package ferreira.cnt.ocupacao;

public class Cargo {
	private String cbo;
	private String cargo;
	
	
	//Metodo
	public void cadastrar(String cbo, String cargo) {
		this.cbo = cbo;
		this.cargo = cargo;
	}
	
	// Getters e Setters
	public String getCbo() {
		return cbo;
	}
	public void setCbo(String cbo) {
		this.cbo = cbo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
	
}
