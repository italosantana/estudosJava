import java.util.Scanner;

public class ProgramaForSorteio{
    public static void main(String args[]){
        long numero = Math.round(Math.random() * 10);
        long chute;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        chute = leitor.nextLong();
        for(long i = 0; i <= 10; i++){
            if(numero != chute){
                System.out.println("Digite um número de 1 a 10: ");
                chute = leitor.nextLong();
                        } else {
                System.out.println("Acertou mizera!");
                break;
            }
        }
        
    }
}