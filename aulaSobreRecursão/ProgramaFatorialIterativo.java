import java.util.Scanner;

public class ProgramaFatorialIterativo {

	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite um número:"); 
		int numero = leitor.nextInt(); 
		int fat = fatorial(numero); 
		if (fat > 0) { 
			System.out.println("O fatorial desse número é " + fat); 
		} else { 
			System.out.println("Não existe fatorial para números negativos!"); 
		} 
	} 

	public static int fatorial(int numero) { 
		int fat; 
		if (numero < 0) { 
			fat = -1; 
		} else if (numero == 0) { 
			fat = 1; 
		} else { 
			fat = 1; 
			for (int i = 2; i <= numero ; i++) { 
				fat = fat * i; 
			} 
		} 
		return fat; 
	}

}