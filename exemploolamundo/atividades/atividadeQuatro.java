//Crie um programa em Java que receba 5 números e imprima a mensagem “Múltiplo de 2”
//caso a soma dos números digitados seja múltiplo de 2. 
//Dica: para saber se um número é multiplo de 2, basta verificar se o resto da divisão (operador %) 
//do número por 2 é igual a zero.



import java.util.Scanner;

public class atividadeQuatro{
    public static void main(String args[]){
        float nota1, nota2, nota3, nota4, nota5, soma;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite as cinco notas que você tirou: ");
             nota1 = leitor.nextFloat();
             nota2 = leitor.nextFloat();
             nota3 = leitor.nextFloat();
             nota4 = leitor.nextFloat();
             nota5 = leitor.nextFloat();
             soma = (nota1 + nota2 + nota3 + nota4 + nota5);
             leitor.close();        
             float i = soma % 2;
                     
             if(i == 0 ){
                System.out.println("É multiplo de 2");
                }   
                 System.out.println("FIM!"); 
        }
}