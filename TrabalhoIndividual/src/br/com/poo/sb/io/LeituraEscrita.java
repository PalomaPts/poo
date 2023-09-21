package br.com.poo.sb.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.com.poo.trabalhoindividual.Cartao;
import br.com.poo.trabalhoindividual.Usuario;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO))) {
			String linha = "";
			while (true) {
				linha = bufferedreader.readLine();
				if (linha != null) {
					String[] dados = linha.split(";");
					if (dados[0].equalsIgnoreCase("USUARIO")) {
						Usuario u = new Usuario(dados[0], dados[1]);
						Usuario.mapaUsuarios.put(dados[1], u);
					} else if (dados[0].equalsIgnoreCase("Numero do Cartao")) {
						Cartao c = new Cartao(dados[1], Double.parseDouble(dados[2]), (dados[3]));
						Cartao.mapaCartoes.put(dados[2], c);
					}
				} else {
					break;
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void escritor(String cpf) throws IOException {

		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + cpf + EXTENSAO, true));
		Cartao cartao = Cartao.mapaCartoes.get(cpf);
		Usuario usuario = Usuario.mapaUsuarios.get(cpf);

		buffWriter.append("\nNome do usuário:" + usuario.getNome());
		buffWriter.append("\nNumero do cartão: " + cartao.getNumeroDoCartao());
		buffWriter.append("\nLimite R$: " + cartao.getLimite());

		buffWriter.close();

	}

}
