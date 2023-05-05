package controller;

import br.com.serialexperimentscarina.listaint.ListaInt;

public class UniaoInterseccaoController {
	
	// Popula as listas de união e intersecção
	public void criarListas(ListaInt listaA, ListaInt listaB, ListaInt listaU, ListaInt listaI) throws Exception {
		int tamanhoA = listaA.size();
		for (int i = 0; i < tamanhoA; i++) {
			listaU.addFirst(listaA.get(i));
		}
		
		int tamanhoB = listaB.size();
		for (int i = 0; i < tamanhoB; i++) {
			int valor = listaB.get(i);
			
			if(existe(listaA, tamanhoA, valor)) {
				listaI.addFirst(valor);
			} else {
				listaU.addFirst(valor);
			}
		}
	}
	
	// Imprime uma lista passada como parâmetro
	public void imprimeLista(ListaInt lista) throws Exception {
		int tamanho = lista.size();
		for (int i = 0; i < tamanho; i++) {
			System.out.print(lista.get(i) + " ");
		}
	}
	
	// Checa se um valor existe na lista
	private boolean existe(ListaInt lista, int tamanho, int valor) throws Exception {
		for (int i = 0; i < tamanho; i++) {
			if (lista.get(i) == valor) {
				return true;
			}
		}
		return false;
	}

}
