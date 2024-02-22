package com.andi.test;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	String id;
	String nome;
	String nacionalidade;
	int idade; // gets e sets omitidos

	public Pessoa() {
	}

	public Pessoa(String id, String nome, String nacionalidade, int idade) {
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}

	public List<Pessoa> populaPessoas() {
		Pessoa pessoa1 = new Pessoa("p1", "Luis Inacio Lula da Silva", "Brasil", 78);
		Pessoa pessoa2 = new Pessoa("p2", "Joe Biden", "EUA", 81);
		Pessoa pessoa3 = new Pessoa("p3", "Justin Trudeau", "Canada", 52);
		Pessoa pessoa4 = new Pessoa("p4", "Jair Bolsonaro", "Brasil", 68);
		List<Pessoa> list = new ArrayList<Pessoa>();
		list.add(pessoa1);
		list.add(pessoa2);
		list.add(pessoa3);
		list.add(pessoa4);
		return list;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}