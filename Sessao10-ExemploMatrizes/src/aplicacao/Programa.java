package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// Instanciando uma matriz
		int[][] mat = new int[n][n];

		// Criando primeiro for para simular as linhas
		// Criando segundo for para simular as colunas
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				// mat na linha i coluna j recebe o valor a ser digitado
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}

		int conta = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					conta++;
				}
			}
		}

		System.out.println("Numeros negativos = " + conta);
		
	}
}
