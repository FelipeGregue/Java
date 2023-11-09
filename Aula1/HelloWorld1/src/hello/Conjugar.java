package hello;

import java.util.Scanner;

import verbo.Verbo;

public class Conjugar {
	
	public static void main(String[] args) {
		String rad, suf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o radical: ");
		rad = sc.nextLine();
		System.out.println("Digite o sufixo: ");
		suf = sc.nextLine();
		Verbo verbo = new Verbo(rad, suf);
		verbo.conjugar();
	}
}