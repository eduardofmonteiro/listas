package com.poo.exerciciospoo.exercicioslistas.lista1;

import java.util.Scanner;

  /*7) Escreva um programa que receba quatro notas de um
  aluno e calcule a média aritmética dessas notas.*/

  public class Numero7 {
  public static void resolucao() {

    String aluno, disciplina;
    float nota_1, nota_2, nota_3, nota_4;
        
      System.out.println("Digite o nome do aluno: ");
      Scanner leia = new Scanner(System.in);
     aluno = leia.nextLine();

      System.out.println("Digite a disciplina: ");
      disciplina = leia.nextLine();

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