package atividadedianove;

import java.util.Scanner;

public class Atividade2Vetores {

	public static void main(String[] args) {
		
	}
	Scanner leia = new Scanner(System.in);
		
		int numero [] = new int [10];
		int indice;
		int numerodigitado;
		int soma;
		int elementosimpares;
		int elementospares;
		float media,
		
		
		for(indice = 0 ; indice < 10 ; indice ++) {
			System.out.println("Digite o número: ");
			numero [indice] = leia.nextInt();
		}
		
		for(indice = 0 ; indice < 10 ; indice ++){
		soma = soma + numero[indice];
		if (numero[indice] % 2 == 0) {
			elementospares = elementospares + numero[indice];
			}
		}
		media = soma / 10;
		for(indice = 1 ; indice < 10 ; indice ++){
		elementosimpares = elementosimpares = numero[indice];
		}
}
}
	
