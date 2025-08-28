import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// Exemplo de escrita (Println e Print)

		System.out.println("JESUS, ME CAPACITE PARA APRENDER POO E CONSEGUIR FAZER PROGRAMAS !!!");
		System.out.println("Bom dia!");

		// Exemplo de escrita (Escrever valor da vari�vel)

		int y = 32;
		System.out.println(y);

		// Exemplo de formatar casas decimais

		double x = 10.35784;
		System.out.printf("%.2f%n", x);

		Locale.setDefault(Locale.US); // Classe que serve para configurar localiza��o do aplicativo
		System.out.printf("%.2f%n", x);

		// Exemplo de concatena��o

		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);

	}

}
