// Crie um programa que receba o nome e a idade de duas pessoas que nasceram em anos diferentes
// e que diga o nome da pessoa mais velha.

import java.util.Scanner;
        
public class atividadeSete{
        public static void main(String args[]){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o nome e a idade da primeira pessoa: ");
            String nome1 = leitor.next();
            int idade1 = leitor.nextInt();
            System.out.println("Digite o nome e a idade da segunda pessoa: ");
            String nome2 = leitor.next();
            int idade2 = leitor.nextInt();
            leitor.close();
            
if (idade1 > idade2){
    System.out.println(nome1 + " " + "é mais velha");
} else{
    System.out.println(nome2 + " " + "é mais velha");
}
        }
}