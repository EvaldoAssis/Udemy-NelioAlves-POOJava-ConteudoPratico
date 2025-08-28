package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator Calc = new Calculator();
		
		double raio;
		double circuferencia;
		double volume;
		
		System.out.print("Entre com o raio: ");
		raio = sc.nextDouble();
		
		circuferencia = Calc.circuferencia(raio);
		volume = Calc.circuferencia(raio);
		
		System.out.printf("Circuferência: %.2f%n" , circuferencia);
		System.out.printf("Volume: %.2f%n" , volume);
		System.out.printf("Valor do PI: %.2f%n" , Calc.PI);
		
	}

}
