package atividadedianove;

import java.util.Scanner;

public class Tentativa2Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero [] = new int [10];
		int indice;
		int numerodigitado;
		int soma;
		
		for(indice = 0 ; indice < 10 ; indice ++){
			System.out.println("Digite o número: ");
			numero [indice] = leia.nextInt();
		}
		
		for(indice = 0 ; indice < 10 ; indice ++){
			if (numerodigitado % 2 == 0) {
			System.out.println("Elementos pares: " + numerodigitado);
		}
			}
		
		else {
			System.out.println("Elementos impares: " + numerodigitado);
			}
		
		
