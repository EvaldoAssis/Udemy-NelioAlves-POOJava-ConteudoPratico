package entidade;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	// Construtor padrão
	public Produto() {
	}

	// Construtor com os 3 argumentos
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Construtor com 2 argumentos, iniciando a variável quantidade com 0
	// SOBRECARGA
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
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
