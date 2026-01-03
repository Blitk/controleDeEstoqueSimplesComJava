package view;

import java.util.Scanner;

public static class Menu{

	public static int menuOpcoes(){
		int opcao;

		System.out.println("\n[==============================]\n");
		System.out.println(" 1)Ver estoque     2)Inserir");
		System.out.println(" 3)Alterar         4)Sair\n");
		System.out.println("[==============================]");
		System.out.print("Digite a opção: ");
		Scanner sc = new Scanner(System.in);
		opcao = sc.nextInt();
		sc.close();
		return opcao;
	}

}