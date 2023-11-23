package Estouro;

import java.util.Scanner;

public class ConcatenarString {
	public static void main(String[] args) {
		String nome1, nome2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira String: ");
		nome1 = sc.nextLine();
		System.out.println("Digite a segunda String: ");
		nome2 = sc.nextLine();
		System.out.println(nome1+nome2);
	}
}
