package br.com.poo.trabalhoindividual;
import java.io.IOException;

import br.com.poo.sb.io.LeituraEscrita;

public class Principal {

	public static void main(String[] args) throws IOException {

		String nomeArquivo = "banco";
		LeituraEscrita.leitor(nomeArquivo);
		Menu menu = new Menu();
		menu.executarMenu();
	}

}
