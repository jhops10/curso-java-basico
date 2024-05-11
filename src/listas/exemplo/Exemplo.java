package listas.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("MARIA");
		list.add("JOAO");
		list.add("ANA");
		list.add("FRANCISCO");
		list.add(2, "PEDRO"); //Adiciona o nome "PEDRO" no indice 2 da lista.
		list.add("MARINA");
		
		
		
		System.out.println("TAMANHO DA LISTA = " + list.size()); // Retorna o tamanho da lista;
		System.out.println();
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("----------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //Semelhante a arrow function, remove o item (chamado de x) que tenha o primeiro caractere 'M';
		
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("----------------------------------");
		System.out.println("INDEX OF JOAO: " + list.indexOf("JOAO")); 
		System.out.println("INDEX OF MARIO: " + list.indexOf("MARIO")); //Retorna o valor -1 caso não encontre o valor "MARIO" na lista
		System.out.println("----------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String name : result) {
			System.out.println(name);
		}
		System.out.println("----------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
