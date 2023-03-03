package View;

import java.util.Scanner;

import Controller.OperacoesController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacoesController soma = new OperacoesController();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		int naturais = soma.Soma(n);
		sc.close();
		System.out.println("A soma dos " + n + " primeiros nºs naturais é: " + naturais);

	}
}
