package br.com.poo.trabalhoindividual;

import java.util.HashMap;
import java.util.Map;

public class Cartao extends Usuario {

	private String numeroDoCartao;
	private Double limite;
	private String cpfUsuario;
	public static Map<String, Cartao> mapaCartoes = new HashMap<>();
	// Construtor .

	public Cartao(String numeroDoCartao, Double limite, String cpfUsuario) {
		this.numeroDoCartao = numeroDoCartao;
		this.limite = limite;
		this.cpfUsuario = cpfUsuario;

		// TODO document why this constructor is empty
	}

	public String getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void setcpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getcpfUsuario() {
		return cpfUsuario;
	}

	// Método.

	@Override
	public String toString() {
		return "Número do Cartão: " + numeroDoCartao + "\n" + "Limite: " + limite + "\n" + "CPF do Usuário :"
				+ cpfUsuario + "\n";
	}
}