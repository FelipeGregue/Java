package Estouro;

import java.util.Scanner;

public class Paridade {
	public static void main(String[] args) {
		int x;
		String resposta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		resposta = ParImpar(x);
		System.out.println(resposta);
	}
	public static String ParImpar(int x) {
		if(x%2==0) {
			return "Par";
		}else {
			return "Impar";
		}
	}
}
