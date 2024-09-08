package com.poo.exerciciospoo.exercicioslistas.lista4;

/*2) Agora que voce sabe o fechamento do dia, monte um código que
identifique a compra de menor valor e a compra de maior valor */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Numero2 {

    public static void resolucao()throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************************************");
        System.out.println("BEM VINDO(A) AO FECHAMENTO DO DIA DO SUPERMERCADO! ");
        System.out.println("VAMOS DAR UMA OLHADA PARA O NOSSO RENDIMENTO NO DIA DE HOJE? ");
        System.out.println("************************************************************");
        System.out.print("Número de vendas do dia: ");
        int numeroVendas = scanner.nextInt();

        double vendas[] = new double [numeroVendas];
        double totalVendas = 0;
        double valorMaior = 0;
        double valorMenor = 99999;

        for (int i = 0; i < numeroVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();

            if(vendas[i] > valorMaior && vendas[i] !=0){
                valorMaior = vendas[i];
            }
            if(vendas[i] < valorMenor && vendas[i] !=0){
                valorMenor = vendas[i];
            }
        }
        for (double venda : vendas) {
            totalVendas += venda;
        }
        System.out.println("Total das vendas do dia: R$" + totalVendas);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Maior valor de venda: " + valorMaior);
        System.out.println("Menor valor de venda: " + valorMenor);
}
}