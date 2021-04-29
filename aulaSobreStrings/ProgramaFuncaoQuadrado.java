import java.util.Scanner;

public class ProgramaFuncaoQuadrado { 
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite um número:"); 
		double num = leitor.nextDouble(); 
		System.out.println("O quadrado desse número é:" + quadrado(num)); 
		// ... Aqui o programa faz um monte de coisa 
		// ... Aqui o programa faz um monte de coisa 
		// ... Aqui o programa faz um monte de coisa 
		// ... Aqui o programa faz um monte de coisa 
		// ... Depois de muito código, precisa-se calcular 
		// ...    novamente o quadrado 
		double num2 = leitor.nextDouble(); 
		System.out.println("O quadrado do segundo número digitado é:" + quadrado(num2)); 
        }
	public static double quadrado(double numero) { 
		return numero*numero; 
	}

        }