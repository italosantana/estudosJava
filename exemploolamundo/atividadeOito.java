// Crie um programa para receber dois números e verificar se eles são iguais ou se um é maior que o outro.
// Imprima uma mensagem indicando se os números são iguais ou, no caso deles serem diferentes, imprima o maior valor digitado.

import java.util.Scanner;

public class atividadeOito{
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numeroUm = leitor.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numeroDois = leitor.nextInt();
        leitor.close();       
        
if(numeroUm == numeroDois){
    System.out.println("Os número são iguais");
} else if(numeroUm > numeroDois ) {
    System.out.println(numeroUm + " " + "é maior.");
    } else if(numeroDois > numeroUm){
        System.out.println(numeroDois + " " + "é maior.");
            } else if(numeroUm != numeroDois || numeroDois != numeroUm){
            System.out.println("Os números são diferentes um do outro.");
            }
    }
}    