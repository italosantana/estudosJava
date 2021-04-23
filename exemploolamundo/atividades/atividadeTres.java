//Escreva um programa que lê o nome de um aluno, o nome de uma disciplina e as notas de 4 provas realizadas
//Calcule e apresente na tela a média aritimética alcançada por essas notas. 
//Imprima essa informação através de uma mensagem que informe também o nome do aluno e da disciplina cursada.


import java.util.Scanner;

public class atividadeTres {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome de um aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o nome uma disciplina: ");
        String materia = leitor.nextLine();
        System.out.println("Digite agora a nota da primeira unidade:");
        double notaUm = leitor.nextDouble();
        System.out.println("Ok, sua primeira nota é:" + notaUm);
        System.out.println("Digite agora a nota da segunda unidade: ");
        double notaDois = leitor.nextDouble();
        System.out.println("Ok, sua segunda nota é:" + notaDois);
        System.out.println("Digite agora a nota da terceira unidade: ");
        double notaTres = leitor.nextDouble();
        System.out.println("Ok, sua terceira nota é:" + notaTres);
        System.out.println("Digite agora a nota da quarta unidade: ");
        double notaQuatro = leitor.nextDouble();
        leitor.close();
        double media = (notaUm+notaDois+notaTres+notaQuatro)/4
        System.out.println("O aluno: " + nome + " está com media: " + media);
    }
}