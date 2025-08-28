package aplicacao;

public class Programa {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println();
		System.out.println("Ao invés de imprimir os valores do vetor com o for da maneira acima, podemos \n"
				+ "usar o laço for each, que irá percorrer todos os elementos do vetor declarado, \n"
				+ "chamando todos por um apelido. No caso abaixo, o apelido é obj. Ou seja, \n"
				+ "imprimir obj no laço abaixo, terá o mesmo efeito que imprimir vect[i]");
		System.out.println();

		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
