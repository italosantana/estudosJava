//1. Implemente o ProgramaForAsterisco mostrado e indique qual a resposta produzida pelo programa.
//2. Implemente o ProgramaFor2 mostrado anteriormente e indique qual a resposta produzida pelo programa.
//3. Comente em cima da quantidade de vezes em que o laço dentro do programa é executado.
//4. Implemente e execute o ProgramaForInfinito. Relate o que acontece e como você para a execução do programa.
//5. Implemente um programa que realiza um laço infinito e que, em cada laço, mostre a quantidade de vezes que ele já 
//...foi executado.



import java.util.Scanner;

public class ProgramaForAsterisco{
    public static void main(String args[]){
        String texto = "*";
        for(int i = 1; i <= 10; i++){
            System.out.println(texto);
                    texto = texto + "*";
    }
}
}