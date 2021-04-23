// Crie um programa para receber o comprimento de 3 pedaços de madeira
// e mostrar uma mensagem caso eles formem um triângulo.

// Dica: monte uma expressão usando operadores lógicos e 
// que seja verdadeira somente quando o comprimento de cada pedaço de madeira é 
// menor que a soma do comprimento dos 2 pedaços restantes (A < B + C e B < A + C e C < A + B).

import java.util.Scanner;

public class atividadeCinco{
    public static void main(String args[]){
        float medidaUm, medidaDois, medidaTres;
        Scanner leitor = new Scanner(System.in);
         System.out.println("Digite as três medidas do pedaço de madeira: ");
             medidaUm = leitor.nextFloat();
             medidaDois = leitor.nextFloat();
             medidaTres = leitor.nextFloat();
           
             float x = medidaDois + medidaTres;
             float y = medidaUm + medidaTres;        
             float z = medidaUm + medidaDois; 
             
             if((medidaUm < x) || (medidaDois < y) || (medidaTres < z)) { 
                           System.out.println("É um triângulo");
                }  
                    System.out.println("FIM!"); 
    }
}
    