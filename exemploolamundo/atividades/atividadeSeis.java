// Crie um programa para receber um número e indicar se ele é par ou ímpar.
import java.util.Scanner;

public class atividadeSeis{
    public static void main(String args[]){
    int numero;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um número: ");
    numero = leitor.nextInt();
if(numero%2 == 0){
    System.out.println("É par");
    } else{
    System.out.println("É impar");
            }
    }
}