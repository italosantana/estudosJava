/*
* Crie um programa que lê uma String e imprima apenas os caracteres de índice ímpar.
 */
package aulaSobreStrings;

import java.util.Scanner;

public class ProgramaImpar {
    public static void main(String args[]){
       Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String nome1 = leitor.next();
        System.out.println("Caracteres no indice impar são: ");
         for (int i = 0; i <= (nome1.length()-1); i = i + 2){
            System.out.print(nome1.charAt(i));
         }
         
    }
}
