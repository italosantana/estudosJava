import java.util.Scanner;
public class atividadeDez {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        numero = leitor.nextInt();
        switch (numero) {
            case 9:
                System.out.println("O número é igual a 9.");
            case 10:
                System.out.println("O número é igual a 10.");
            case 11:
                System.out.println("O número é igual a 11.");
            default:
                System.out.println("O número não é nem 9, nem 10, nem 11.");
        }
    }
}