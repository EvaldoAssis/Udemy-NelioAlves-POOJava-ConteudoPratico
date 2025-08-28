package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();


		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto.toString());
		
		System.out.print("Entre com o número de produtos para adicioná-los ao estoque: ");
		quantidade = sc.nextInt();
		produto.AdicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto.toString());
		
		System.out.print("Entre com o número de produtos para remove-los do estoque: ");
		quantidade = sc.nextInt();
		produto.RemoverProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto.toString());
		
	}

}
