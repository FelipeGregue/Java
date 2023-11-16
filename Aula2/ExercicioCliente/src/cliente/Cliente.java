package cliente;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private int idade;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	Cliente(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = 0;
	}
	public static void main() {
		String nome;
		String cpf;
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do cliente: ");
		nome = sc.nextLine();
		System.out.println("Digite o CPF do cliente: ");
		cpf = sc.nextLine();
		Cliente cliente = new Cliente(nome, cpf);
	}
}
