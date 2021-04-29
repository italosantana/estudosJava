import java.util.Scanner;

public class ProgramaMedia { 
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite a primeira nota:");
		double nota1 = leitor.nextDouble(); 
		System.out.println("Digite a segunda nota:");
		double nota2 = leitor.nextDouble(); 
		System.out.println("Digite a terceira nota:"); 
		double nota3 = leitor.nextDouble(); 
		System.out.println("Digite a quarta nota:"); 
		double nota4 = leitor.nextDouble(); 
		double media = (nota1 + nota2 + nota3 + nota4)/4; 
		System.out.println("Sua média foi: " + media); 
	}
}