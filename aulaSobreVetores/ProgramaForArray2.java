import java.util.Scanner;

public class ProgramaForArray2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de valores a digitar:");
		int[] valores = new int[leitor.nextInt()];
		System.out.println("Digite agora os valores:");
		for (int i = 0; i < 10; i++) {
			valores[i] = leitor.nextInt();
		}
		System.out.println("Valores digitados:");
		for (int i = 0; i < 10; i++) {
			System.out.println(valores[i]);
		}
	}
}