// Crie um programa para receber uma letra do usuário e imprimir o nome de um país que se inicie com essa letra.
// Caso não exista um país com nome iniciado pela letra digitada, informar isso ao usuário.

import java.util.Scanner;

public class atividadeOnze{
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = leitor.nextLine().charAt(0);
        
switch (letra) {
    case 'a':
        System.out.println("Argentina JAJAJAJA");
        break;
    case 'b':    
        System.out.println("Brasil 7x1");
        break;
    case 'c':    
        System.out.println("Chile le le Chi chi le le");
        break;
    default:    
        System.out.println("Puts! Nenhum país foi encontrado com essa letra.");
}
    }
}