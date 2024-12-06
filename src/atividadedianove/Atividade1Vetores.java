package atividadedianove;

import java.util.Scanner;

public class Atividade1Vetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int indice = 0;
		int numerodigitado;
		int posicao = -1;

		// Entrada
		System.out.println("Digite um número: ");
		numerodigitado = leia.nextInt();

		// Processamento
		for (indice = 0; indice < 10; indice++) {

			if (numerodigitado == numeros[indice]) {
				
				posicao = indice;
			}

		}
		
		if (posicao != -1) {
			System.out.println("O número " + numerodigitado + " está localizado na posição " + posicao);
		}else {
			System.out.println("O número " + numeros + "não foi encontrado");
		}
	}
}
