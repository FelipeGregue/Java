package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens;
	private int pontuacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	Usuario(String nome, String email, String nacionalidade){
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.quantidadeDePostagens = 0;
		postagens = new ArrayList<String>();
	}
	
	public void adicionaPostagem(String post){
		postagens.add(post);
		quantidadeDePostagens++;
		pontuacao = 0;
	}
	
	public void alteraPontuacao(int delta) {
		pontuacao += delta;
	}
	
	public int getQuantidadeDePostagens() {
		return quantidadeDePostagens;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public static void main(String[] args) {
		String nome, email, nacionalidade, postagem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite o seu email: ");
		email = sc.nextLine();
		System.out.println("Digite a sua nacionalidade: ");
		nacionalidade = sc.nextLine();
		Usuario usuario = new Usuario(nome, email, nacionalidade);
		System.out.println("Digite uma postagem: ");
		postagem = sc.nextLine();
		usuario.adicionaPostagem(postagem);
	}
}
