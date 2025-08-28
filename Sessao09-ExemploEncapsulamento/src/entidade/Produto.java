package entidade;

public class Produto {

	/*
	 * Encapsular é proteger os dados, ou seja, usar o modificador de acesso private
	 * ao invés de usar public. Isso fará com que esses atributos não possam ser
	 * acessados por outra classe,
	 * desde que não usem os metódos geters e seter
	 */

	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {

	}

	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
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
