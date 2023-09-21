package br.com.poo.trabalhoindividual;

import br.com.poo.trabalhoindividual.Cartao;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
	private String nome;
	private String cpf;
	public static Map<String, Usuario> mapaUsuarios = new HashMap<>();

	public Usuario() {
		super();
	}

	// Construtor
	public Usuario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}

	// Getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
