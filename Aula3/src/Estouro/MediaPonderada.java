package Estouro;

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        // Solicitando os dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite o peso da nota 1: ");
        float peso1 = scanner.nextFloat();

        System.out.println("Digite a nota 2: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Digite o peso da nota 2: ");
        float peso2 = scanner.nextFloat();

        System.out.println("Digite a nota 3: ");
        float nota3 = scanner.nextFloat();

        System.out.println("Digite o peso da nota 3: ");
        float peso3 = scanner.nextFloat();

        // Chamando a função para calcular a média ponderada
        float mediaPonderada = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);

        // Exibindo o resultado
        System.out.println("A média ponderada é: " + mediaPonderada);

        // Fechando o scanner
        scanner.close();
    }

    // Função para calcular a média ponderada
    public static float calcularMediaPonderada(float nota1, float nota2, float nota3, float peso1, float peso2, float peso3) {
        // Calculando a média ponderada
        float somaNotas = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        float somaPesos = peso1 + peso2 + peso3;
        float mediaPonderada = somaNotas / somaPesos;

        return mediaPonderada;
    }
}
