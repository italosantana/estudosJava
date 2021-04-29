import java.util.Scanner;

public class ProgramaSubstring { 
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite seu nome completo:"); 
		String nome = leitor.next(); 
		if (nome.substring(0, 4).equalsIgnoreCase("João")) { 
			System.out.println("Olá João!"); 
		} else { 
			System.out.println("Epa, você não é João!"); 
		} 
	} 
}