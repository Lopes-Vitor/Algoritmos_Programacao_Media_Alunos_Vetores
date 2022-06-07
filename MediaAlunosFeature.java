package exercicios;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int[] salas = new int[6]; // Iniciando o Array
		int media = 0, mediafinal; // Declarando as variaveis

		for (int X = 0; X < salas.length; X++) { // Iniciando um Loop (enquanto X for menor que a quantidade de salas, faça)
													
			System.out.println("Digite a quantidade de alunos da " + (X + 1) + "º sala: "); // Imprimindo uma mensagem
			salas[X] = leitor.nextInt(); // Recebendo uma resposta em uma variavel
		}

		System.out.println(" "); // imprimindo uma mensagem

		for (int i = 0; i < salas.length; i++) { // Iniciando um Loop (enquanto i for menor que a quantidade de salas, faça)
													
			System.out.println("Sala " + (i + 1) + " - " + salas[i]); // Imprimindo uma mensagem

		}

		System.out.println(" "); // imprimindo uma mensagem

		for (int i = 0; i < salas.length; i++) { // Iniciando um Loop (enquanto i for menor que a quantidade de salas, faça)
													
			media += salas[i]; // Somando a quantidade de aluno por sala
		}
		mediafinal = media / salas.length; // dividindo o total de alunos pelo total de salas para ter a media
		System.out.println("Media de alunos por sala: " + media / salas.length); // imprimindo uma mensagem
		System.out.println(" "); // imprimindo uma mensagem
		System.out.println("Salas acima da media: "); // imprimindo uma mensagem

		for (int i = 0; i < salas.length; i++) { // Iniciando um Loop (enquanto i for menor que a quantidade de salas, Faca)
													
			if (salas[i] > mediafinal) { // Utilizando a estrutura de decisao IF para ver se cada sala é maior que a media
											
				System.out.println("Sala " + (i + 1) + " - " + salas[i] + " alunos"); // imprimindo uma mensagem
			}
		}

		System.out.println(" "); // imprimindo uma mensagem
		System.out.println("Salas abaixo da media: "); // imprimindo uma mensagem

		for (int i = 0; i < salas.length; i++) { // Iniciando um Loop (enquanto i for menor que a quantidade de salas, faça)
													
			if (salas[i] < mediafinal) { // Utilizando a estrutura de decisao IF para ver se cada sala é maior que a media
											
				System.out.println("Sala " + (i + 1) + " - " + salas[i] + " alunos"); // imprimindo uma mensagem
			}
		}
	}
}