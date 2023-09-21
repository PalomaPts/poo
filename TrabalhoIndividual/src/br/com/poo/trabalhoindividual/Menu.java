package br.com.poo.trabalhoindividual;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.sb.io.LeituraEscrita;

public class Menu {
	private Scanner scanner;
	private Logger logger;

	public Menu() {
		scanner = new Scanner(System.in);
		logger = Logger.getLogger(Menu.class.getName());
		logger.setLevel(Level.INFO);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.INFO);
		logger.addHandler(handler);
	}

	public void executarMenu() throws IOException {
		boolean sair = false;
		while (!sair) {
			System.out.println("*****MENU*****");
			System.out.println("1. Imprimi os dados do arquivo ");
			System.out.println("2. Grava um relatório no arquivo TXT");
			System.out.println("3. Sair");
			System.out.println("Escolha uma opção :");

			int escolha = scanner.nextInt();
			scanner.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("Digite o nome do arquivo (sem extensão):");
				String nomeArquivo = scanner.nextLine();

				try {
					LeituraEscrita.escritor(nomeArquivo);

					System.out.println("Dados carregados com sucesso do arquivo " + nomeArquivo + ".txt");
					LeituraEscrita.leitor(nomeArquivo);
					Cartao cartoes = Cartao.mapaCartoes.get(nomeArquivo);
					Usuario us = Usuario.mapaUsuarios.get(nomeArquivo);
					System.out.println("\n" + us.getNome() + "\n" + cartoes);
				} catch (IOException e) {
					System.out.println("Erro ao carregar dados do arquivo " + nomeArquivo + ".txt");
				}
				break;
			case 2:
				System.out.println("Digite o CPF :");
				Scanner sc = new Scanner(System.in);
				String cpf = sc.next();
				LeituraEscrita.escritor(cpf);
				break;
			case 3:
				sair = true;
				System.out.println("Saindo do programa. Obrigado por usar!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

		scanner.close();
	}
}
