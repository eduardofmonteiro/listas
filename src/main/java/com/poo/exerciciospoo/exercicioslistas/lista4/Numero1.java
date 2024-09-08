package com.poo.exerciciospoo.exercicioslistas.lista4;

        /*1) Voce é gerente de um supermercado e sabe que os valores das
        vendas do dia são gravados em um vetor. Digite um código que faça o
        fechamento (soma) de vendas do dia de maneira automatizada.*/

import java.util.Scanner;

public class Numero1 {
        
    public static void resolucao()throws InterruptedException {
    
            Scanner scanner = new Scanner(System.in);
            
    
            System.out.println("**************************************************");
            System.out.println("BEM VINDO(A) AO FECHAMENTO DO DIA DO SUPERMERCADO! ");
            System.out.println("**************************************************");
            System.out.print("Digite o número de vendas do dia: ");
            int numeroVendas = scanner.nextInt();

            
            double vendas[] = new double [numeroVendas];
            double totalVendas = 0;
    
            for (int i = 0; i < numeroVendas; i++) {
                System.out.print("Digite o valor da venda " + (i + 1) + ": ");
                vendas[i] = scanner.nextDouble();
            }
            
            for (double venda : vendas) {
                totalVendas += venda;
            }
            System.out.println("Total das vendas do dia foi de: R$ " + totalVendas+". Ótimo trabalho hoje!");

            scanner.close();
        }
}