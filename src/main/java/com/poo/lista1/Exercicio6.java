package com.poo.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        float Dist_percorrida, Total_gasto, consumo_medio;

        System.out.println("Digite a distancia percorrida (Km): ");
        Dist_percorrida = leia.nextFloat();

        System.out.println("Digite o total gasto de combustível (L): ");
        Total_gasto = leia.nextFloat();

        consumo_medio = Dist_percorrida / Total_gasto;

        System.out.println("O consumo médio em (Km/l) foi: "+ consumo_medio);

    }
}
