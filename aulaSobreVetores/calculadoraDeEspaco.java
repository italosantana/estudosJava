/*
* Calcule o espaço ocupado na memória por vetores do tamanho do vetor
* para os tipos de dados char, short, long, float e double.
*/

import java.util.Scanner;

public class calculadoraDeEspaco {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int inteiro = leitor.nextInt();
                System.out.println("Digite um número fracionário: ");
                double fracionario = leitor.nextDouble();
                System.out.println("Digite outro número fracionário: ");
                  float outrofracionario = leitor.nextFloat();
                  System.out.println("Digite uma palavra: ");
                char palavra = leitor.next().charAt(0);
                System.out.println("Digite um número inteiro longo: ");
                long inteiroLongo = leitor.nextLong();  
                 System.out.println(inteiro*4 +" "+"bytes");
                System.out.println(fracionario*8 +" "+"bytes");
                System.out.println(outrofracionario*4 +" "+"bytes");
                System.out.println(palavra*2 +" "+"bytes");
                System.out.println(inteiroLongo*8 +" "+"bytes");
        }
       
}   