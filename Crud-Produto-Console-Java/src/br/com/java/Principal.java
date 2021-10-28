package br.com.java;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		
		Scanner entrada = new Scanner(System.in);
		int opcao;

		while (1 > 0) {
			menu.listarMetodos();
			opcao = entrada.nextInt();
			menu.executeMetodo(opcao);
		}
	}

}
