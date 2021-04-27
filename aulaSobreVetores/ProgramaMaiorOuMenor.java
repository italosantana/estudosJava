/*
*   Faça um programa que leia uma matriz MxN, onde M e N são informados pelo usuário
*   e que imprima o maior valor encontrado na matriz.
 */
import java.util.Scanner;

public class ProgramaMaiorOuMenor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de valores a digitar:");
		int[] valores = new int[leitor.nextInt()];
		System.out.println("Digite agora os valores:");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = leitor.nextInt();
		}
		System.out.println("Valores digitados:");
			for (int i = 0; i < valores.length; i++) {
		System.out.println(valores[i]);
	}
}
}