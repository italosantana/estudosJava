// Crie um programa para receber uma nota e imprimir uma mensagem de acordo com a seguinte tabela:
/* De 0 até 3 – Você precisa melhorar muito!
Maior que 3 e menor que 7 – Você está quase conseguindo!
Maior ou igual a 7 e menor que 9 – Você conseguiu!
Maior ou igual a 9 – Você conseguiu com distinção!*/

import java.util.Scanner;

public class atividadeNove{
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        int nota = leitor.nextInt();
        
if(nota <= 3 ){
    System.out.println("Você precisa melhorar muito!");
}else if(nota > 3 && nota < 7){
    System.out.println("Você está quase conseguindo!");
} else if(nota >=7 && nota < 9){
    System.out.println("Você conseguiu!");
}else if(nota >= 9){
    System.out.println("Você conseguiu com distinção!o/");
}
    }
}