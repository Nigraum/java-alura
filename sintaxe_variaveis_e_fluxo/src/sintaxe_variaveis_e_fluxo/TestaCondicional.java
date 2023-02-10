package sintaxe_variaveis_e_fluxo;

import java.util.Scanner;

public class TestaCondicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner qt = new Scanner(System.in);
		
		System.out.print("Qual sua idade? ");
		int idade = sc.nextInt();
		
		System.out.print("Quantas pessoas estão com você? ");
		int quantidadePessoas = qt.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem-vindo.");
		}
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 mas está acompanhado com " 
			+ quantidadePessoas + ", pode entrar.");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}
		}
	}
}
