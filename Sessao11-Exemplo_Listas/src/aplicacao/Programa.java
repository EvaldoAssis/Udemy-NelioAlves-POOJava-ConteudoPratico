package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		
		//Declaração de uma lista:
		//Instanciação de uma lista
			List<String> list = new ArrayList<>();
			
		//Adicionando Elementos a lista
			list.add("Maria");
			list.add("Alex");
			list.add("Bob");
			list.add("Anna");
		//Inserindo elemento na posição que deseja
			list.add(2, "Joaquim");	
		//Tamanho da lista
			System.out.println(list.size());
			System.out.println("------------------");
						
			for (String x : list) {
				System.out.println(x);
			}
			
			System.out.println("------------------");
		//Remover elemento da lista pelo "nome"
			list.remove("Anna");
		//Remover elemento da lista pela posição
			list.remove(1);
		//Removendo todo que começam com "tal" letra, remover por predicado
			
			list.removeIf(x -> x.charAt(0) == 'M');
			
			for (String x : list) {
				System.out.println(x);
			}
			
			System.out.println("------------------");
		//Encontrar a posição de um elemento
			System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//Caso seja procurado uma pessoa ou ago que não esteja na lista, retornará -1
			System.out.println("Index of Bob: " + list.indexOf("Marco"));
		
			System.out.println("------------------");
		//Filtrar a lista com todos que comecem com alguma letra, no exemplo acima a letra é o J
			List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
			
			for (String x : resultado) {
				System.out.println(resultado);
			}
			
			System.out.println("------------------");
		//Encontrar o primeiro elemento que comece com alguma letra (O PRIMEIRO ELEMENTO QUE ATENDA O PREDICA)
			String nome = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
			System.out.println(nome);


	}

}
