package com.poo.exerciciospoo.exercicioslistas.lista4;

    /*3) Ainda utilizando o exercício do mercado, calcule o ticket médio de
    vendas do dia */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Numero3 {

    public static void resolucao()throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************************************");
        System.out.println("BEM VINDO(A) AO FECHAMENTO DO DIA DO SUPERMERCADO! ");
        System.out.println("PARA DEFINIR NOSSO TICKET, VAMOS AO NOSSO RENDIMENTO DE HOJE ");
        System.out.println("************************************************************");
        System.out.print("Número de vendas do dia: ");
        int numeroVendas = scanner.nextInt();

        double vendas[] = new double[numeroVendas];
        double totalVendas = 0;
        double valorMaior = 0;
        double valorMenor = 99999;

        for (int i = 0; i < numeroVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();

            if (vendas[i] > valorMaior && vendas[i] != 0) {
                valorMaior = vendas[i];
            }
            if (vendas[i] < valorMenor && vendas[i] != 0) {
                valorMenor = vendas[i];
            }
        }

        for (double venda : vendas) {
            totalVendas += venda;
        }

        double ticketMedio = totalVendas / numeroVendas;

        System.out.println("Total das vendas do dia: R$" + totalVendas);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Maior valor de venda: R$" + valorMaior);
        System.out.println("Menor valor de venda: R$" + valorMenor);
        System.out.println("Ticket médio: R$" + ticketMedio);
    }
}