package hello;

import java.util.Scanner;

public class HelloWorld{
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner ler = new Scanner(System.in);
		String string = ler.nextLine();
		System.out.println(string + " foi o dado digitado");
	}
}