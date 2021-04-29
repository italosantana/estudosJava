import java.util.Scanner;

public class ProgramaFatorialRecursivo {

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
			fat = fatorial(numero - 1) * numero; 
		} 
		return fat; 
	}

}