
public class Programa {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG";

		String conversao01 = original.toLowerCase();
		String conversao02 = original.toUpperCase();
		String conversao03 = original.trim();
		String conversao04 = original.substring(2);
		String conversao05 = original.substring(2, 9);
		String conversao06 = original.replace("abc", "x");

		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("String Original - " + original + "\n");

		System.out.println("Conversão p/ minúsculo - " + conversao01);
		System.out.println("Conversão p/ maiúsculo - " + conversao02);

		System.out.println("Eliminando espaços nos cantos da String - " + conversao03 + "-");

		// Neste caso, como o argumento foi o no 2, a função partirá a String após o
		// segundo caractere
		System.out.println("Subtring com UM argumento - " + conversao04);

		// Neste caso, como o argumento foi o no 2 e no 9, a função partirá a String
		// após o segundo caractere e antes do nono
		System.out.println("Subtring com DOIS argumentos - " + conversao05);

		System.out.println("Replace troca uma letras por outras - " + conversao06);

		// Informa a primeira posição do substring indicada na String original
		System.out.println(i);

		// Informa a primeira última do substring indicada na String original
		System.out.println(j);

	}

}
