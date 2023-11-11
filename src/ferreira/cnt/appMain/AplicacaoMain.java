package ferreira.cnt.appMain;

import ferreira.cnt.auxiliar.Endereco;
import ferreira.cnt.auxiliar.Telefone;
import ferreira.cnt.ocupacao.Cargo;
import ferreira.cnt.pessoa.Cliente;
import ferreira.cnt.pessoa.Funcionario;
import ferreira.cnt.pessoa.Pessoa;

// ou import ferreira.cnt.pessoa.*;

public class AplicacaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sintaxe Classe Identificador = new Construtor()
		// Pessoa objPessoa = new Pessoa(); //Classe apenas estrutural para classes Cliente e Funcionario
		Funcionario objFuncionario = new Funcionario();
		Cliente objCliente = new Cliente();
		Cargo objCargo = new Cargo();
		Telefone objTelefone = new Telefone();
		Endereco objEndereco = new Endereco();
		
		objFuncionario.cadastrar(1, "Professor", 2000, "28/10/2023", "Nunes", "11/09/1981", objEndereco, objTelefone);
		
		objCliente.cadastrar("1", "Contador", "Francisco", "11/09/1981", objEndereco, objTelefone);
		
		objCargo.cadastrar("512410", "Porteiro");
		
		objTelefone.cadastrar("83", "988066901");
		
		objEndereco.cadastrar("Rua", "Epitacio Pessoa", "1000", "Expedicionarios", "Edificio", "João Pessoa", "PB", "Brasil", "58000000");
		
	}

}
