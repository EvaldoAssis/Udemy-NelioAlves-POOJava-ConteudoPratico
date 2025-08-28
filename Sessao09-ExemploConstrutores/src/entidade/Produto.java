package entidade;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	// Criação do metodo construtor e passagem dos parametros que o construtor irá
	// receber
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double TotalValorNoEstoque() {
		return preco * quantidade;
	}

	public void AdicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void RemoverProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + "  unidades, Total: $ "
				+ String.format("%.2f", TotalValorNoEstoque());
	}

}
