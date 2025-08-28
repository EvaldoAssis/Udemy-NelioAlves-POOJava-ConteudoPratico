package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Essa instanciação é de acordo com o construtor padrão, que não recebe nenhum
		 * parâmetro
		 */
		// Produto p = new Produto();

		System.out.println("Insira os dados do produto: ");

		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();

		/* Essa instanciação é de acordo com o construtor que recebe 2 parâmetros */
		Produto produto = new Produto(nome, preco);

		produto.setNome("Computador");
		System.out.println("Nome do produto editado com sucesso!!! " + produto.getNome());

		produto.setPreco(1200.00);
		System.out.println("Preço do produto editado com sucesso!!! " + produto.getPreco());

		System.out.println();
		System.out.println("Dados do produto: " + produto.toString());

		System.out.print("Entre com o número de produtos para adiciona-los ao estoque: ");
		int quantidade = sc.nextInt();
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
