package br.fai.ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		
		System.out.println("Digite o Valor do produto: ");
		
		Scanner scanner = new Scanner(System.in);
		//atalho  para executar os imports: ctrl + shift + 0
		
		double valor = scanner.nextDouble();
		
		//exemplo do cast
		int valoroCmcast = (int) valor;
		
		System.out.println("\n Valor com casas decimais: " + valor
				+ "| Valor inteiro: " + valor);
		
		
		
		
	}
}
