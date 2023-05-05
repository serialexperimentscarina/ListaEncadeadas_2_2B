package view;

import br.com.serialexperimentscarina.listaint.ListaInt;
import controller.UniaoInterseccaoController;

public class Principal {

	public static void main(String[] args) {
		ListaInt listaA = new ListaInt(), listaB = new ListaInt(), listaU = new ListaInt(), listaI = new ListaInt();
		int[] valoresA = {3, 5, 8, 12, 9, 7, 16}, valoresB = {9, 6, 2, 3, 7};
		UniaoInterseccaoController unirInterCont = new UniaoInterseccaoController();
		
		try {
			System.out.print("Lista A : ");
			for (int valor : valoresA) {
				listaA.addLast(valor);
				System.out.print(valor + " ");
			}
			System.out.print("\nLista B : ");
			for (int valor : valoresB) {
				listaB.addLast(valor);
				System.out.print(valor + " ");
			}

			unirInterCont.criarListas(listaA, listaB, listaU, listaI);
			
			// U é a lista com a união de A e B
			System.out.print("\nUnião das listas : ");
			unirInterCont.imprimeLista(listaU);
			
			// I é a lista com a intersecção das listas A e B
			System.out.print("\nIntersecção das listas : ");
			unirInterCont.imprimeLista(listaI);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
