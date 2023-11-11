package ferreira.cnt.estrutura;

import ferreira.cnt.composicao.Telefone;

public class ListaDeTelefoneNaoOrdenado {
	private Telefone[] lstTelefones;
	private int tamanho;
	private static final int CAPACIDADE_PADRAO = 10;
	
	public ListaDeTelefoneNaoOrdenado() {
		this.lstTelefones = new Telefone[CAPACIDADE_PADRAO];
		this.tamanho = 0;
	}
	
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	public boolean isFull() {
		return tamanho == lstTelefones.length;
	}
	
	public void removerTelefone(Telefone lstTelefones) {
		int index = //buscarTelefoneIndex(Telefone)
	}
	
	private int buscarTelefoneIndex(Telefone Telefone) {
		for(int i = 0; i < tamanho; i++) {
			if(lstTelefones[i]. equals(telefone)) {
				return i;
			}
		}
	}
				

}
