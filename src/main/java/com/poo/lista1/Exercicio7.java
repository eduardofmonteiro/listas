package com.poo.lista1;

import java.util.Scanner;

public class Exercicio7 {
   
    public static void resolucao() {

        String aluno;
        String disciplina;
        float nota_1;
        float nota_2;
        float nota_3;
        float nota_4;

        System.out.println("Digite o nome do aluno: "); //Identico ao escreva no Portugol
        Scanner leia = new Scanner(System.in); //Criar o comando leia do Portugol
        aluno = leia.nextLine(); //Comando leia após ser criado na linha acima

        System.out.println("Digite a disciplina: "); //Comando escreva:
        disciplina = leia.nextLine(); //Comando leia

        System.out.println("Digite a nota do primeiro bimestre: ");
        nota_1 = leia.nextFloat();

        System.out.println("Digite a nota do segundo bimestre: ");
        nota_2 = leia.nextFloat();

        System.out.println("Digite a nota do terceiro bimestre: ");
        nota_3 = leia.nextFloat();

        System.out.println("Digite a nota do quarto bimestre: ");
        nota_4 = leia.nextFloat();

        System.out.println("Media do aluno(a) "+ aluno + " na disciplina: " + disciplina + " é "+ ((nota_1+nota_2+nota_3+nota_4)/4));

    }

}
