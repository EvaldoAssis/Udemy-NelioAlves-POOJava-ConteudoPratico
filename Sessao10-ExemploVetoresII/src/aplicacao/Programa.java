package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// Criação de um vetor de n produtos;
		// Neste caso o vetor é do tipo referência, referência a classe Produto com "n" elementos;
		Produto [] vect = new Produto[n];
		
		// .length significa a quantidade de elementos do vetor; 
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();			
		// A instanciação da classe vai fazer com que a posição aponte para o objeto;
			vect[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
		/* Para se fazer a média dos preços é necessário acessar  
			somente o preço, por isso a ultiliazação do getPreco; */
			soma = soma + vect[i].getPreco();
		}
		
		double mediaPrecos = soma/ vect.length;
		
		System.out.printf("Preço médio = %.2f%n" , mediaPrecos );

	}

}
