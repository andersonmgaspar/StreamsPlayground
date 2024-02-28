package com.andi.test;

import java.util.Comparator;
import java.util.List;

import com.andi.test.model.Pessoa;

public class Playground {

	/*
	 * Intermediate Operations: filter(), map(), sorted(), distinct(), limit()
	 * 
	 * Terminal Operations: forEach(), average(), collect(), count(), allMatch()
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Starting the Stream API test..");

		List<Pessoa> pessoas = new Pessoa().populaPessoas();
		pessoas.stream().filter(p -> p.getNacionalidade().equals("Brasil"))
				.sorted(Comparator.comparing(Pessoa::getNome)).forEach(System.out::println);

	}

}
