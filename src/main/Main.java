package main;
import java.util.Scanner;
import java.util.ArrayList;

import entidades.Aluno;
import entidades.Disciplina;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    System.out.println("Informe o codigo da disciplina:");
    String codigo = sc.nextLine();
    System.out.println("Informe o nome da dsiciplina: ");
    String nomeDisciplina = sc.nextLine();

    Disciplina disciplina= new Disciplina(codigo, nomeDisciplina);
    System.out.println("Informe o numero de alunos: ");
    int numeroalunos =  sc.nextInt();

    for (int i=0; i<numeroalunos; i++){
        System.out.println("Informe os dados do Aluno "+ (i+1) + ":");
        System.out.println("Matricula: ");
        int matricula=sc.nextInt();
        sc.nextLine();
        System.out.println("Nome: ");
        String nomeAluno = sc.nextLine();
        System.out.println("Nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.println("Nota 3: ");
        float nota3 = sc.nextFloat();

        disciplina.addAluno(new Aluno(matricula, nomeAluno, nota1, nota2, nota3));
        
    }

    System.out.println("Alunos Aprovados: ");
    ArrayList<Aluno> alunosAprovados = new ArrayList<>();

    alunosAprovados= disciplina.mostraAprovados();
    for(Aluno obj : alunosAprovados){
        System.out.println(obj);
    }
    System.out.println("");
    System.out.println("Melhor Aluno: ");
    System.out.println(disciplina.acharMelhor());


    sc.close();


    }   
}

