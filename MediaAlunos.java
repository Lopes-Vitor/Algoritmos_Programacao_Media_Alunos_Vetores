package exercicios;

public class media_de_alunos_vetores {

	public static void main(String[] args) {
		int[] salas = { 35, 4, 22, 20, 36, 30 }; // Iniciando o Array
		int media = 0, mediafinal; // Declarando as variaveis
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

		for (int i = 0; i < salas.length; i++) { // Iniciando um Loop (enquanto i for menor que a quantidade de salas, faça)
													
			if (salas[i] > mediafinal) { // Utilizando a estrutura de decisao IF para ver se cada sala é maior que a media
											
				System.out.println("Sala " + (i + 1) + " - " + salas[i] + " alunos"); // imprimindo uma mensagem
			}
		}
	}
}
