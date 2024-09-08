package com.poo.exerciciospoo.exercicioslistas.lista1;

import java.util.Scanner;

/*6) Construa um algoritmo que leia 1- a distância percorrida
por um veículo em km 2- o total gasto em combustível em
litros. No final deverá ser respondido o consumo médio deste
veículo em km/l. */

public class Numero6 {
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