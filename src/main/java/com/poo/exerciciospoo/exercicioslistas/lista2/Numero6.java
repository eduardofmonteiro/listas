package com.poo.exerciciospoo.exercicioslistas.lista2;

import java.util.Scanner;

/*6) Crie um programa que receba as notas de um aluno e informe se ele foi
aprovado ou reprovado. Se o aluno ficar com média acima de 6 nas 2 primeiras
provas ele passou. Senão o programa deverá perguntar a nota de recuperação
que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
somente para os alunos que precisarem.
 */

public class Numero6 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);
        
        //Variáveis iniciais das notas
        float nota1, nota2, nota3;

        System.out.print("Digite a nota do primeiro bimestre: ");
        nota1=leia.nextFloat();
        System.out.print("Digite a nota do segundo bimestre: ");
        nota2=leia.nextFloat();
    
        //Variável da média somando as notas e dividindo por 2 notas
        float media_inicial = (nota1 + nota2)/2;
        
        if (media_inicial >= 6) {
            System.out.print("Você está aprovado.");
            
        }else{
            System.out.println("Você está em recuperação");
            System.out.println("Digite sua nota de recuperação: ");
            nota3=leia.nextFloat();

            System.out.print("Digite 1 para substituir a primeira nota ou 2 para a segunda nota.");
            int escolha = leia.nextInt();

            if (escolha == 1) {
                nota1 = nota3;
            } else if(escolha == 2){
                nota2 = nota3;                
            } else {
                System.out.print("Opção inválida, tente novamente.");
            }

            float media_final = (nota1 + nota2) / 2;
            
            if (media_final >= 6) {
                System.out.println("Você está aprovado.");
                
            } else {
                System.out.println("Você está reprovado.");
            }
        }
    }
}

         