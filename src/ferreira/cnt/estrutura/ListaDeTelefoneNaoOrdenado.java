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

}
