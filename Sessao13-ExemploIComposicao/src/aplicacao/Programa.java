package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Departamento;
import entidade.Funcionario;
import entidade.HorasContrato;
import entidade.enums.NivelFuncionario;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Funcionário: ");
		System.out.print("Nome: ");
		String nomeFuncionario = sc.nextLine();
		System.out.print("Nível: ");
		String nivelFuncionario = sc.nextLine();
		System.out.print("Base salarial:");
		double baseSalarial = sc.nextDouble();
		
		//Instanciando e fazendo as associações.
		//Funciona da seguinte forma, é feita a instanciação* de um novo objeto funcionário e os dados do objeto são os seguintes:
		//Nome digitado pelo usuário;
		//Uma instancia da classe NivelFuncionario, sendo que essa classe é do time ENUM, então o que for digitado pelo usuário vai ser convertido
		//Valor do salário base digitado pelo usuário
		//Por fim, terá associado ao objeto funcionario o objeto departamento, onde é passado o nome departamento conforme mostra o código:
		Funcionario func = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivelFuncionario), baseSalarial, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos esse funcionário teve esse mês ? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do " + i + "° contrato: ");
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração em horas: ");
			int qntHoras = sc.nextInt();
			HorasContrato contrato = new HorasContrato(dataContrato, valorPorHora, qntHoras);
			func.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com o mês e o ano para calcular o salário final (MM/AAAA): ");
		//Recortando a string para pegar o mês e o ano que desejamos saber a renda total
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + func.getName());
		System.out.println("Departamento: " + func.getDepartamento().getName());
		System.out.println("Salário total no " + monthAndYear + ": " + String.format("%.2f",func.rendaTotal(year, month)));
	}

}
