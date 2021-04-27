 /* Implementar um programa de notas
* Altere o ProgramaNotasArray para que imprima as notas na tela...
* depois de lidas mostrando sua localização no array em termos de índice (de zero à quantidade - 1)...
* e de ordem (de um a quantidade).
*/

import java.util.Scanner;

public class ProgramaNotasArray{
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas a serem lidas: ");
        int quantidade = leitor.nextInt();
        double notas[] =new double[quantidade];
        for(int i=0 ; i < quantidade ; i++){
            System.out.println("Digite a nota de número" + i);
            notas[i] = leitor.nextDouble();
        }
        System.out.println(notas[2]);
    }
    
}