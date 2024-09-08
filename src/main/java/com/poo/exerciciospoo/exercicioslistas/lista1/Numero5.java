package com.poo.exerciciospoo.exercicioslistas.lista1;

import java.util.Scanner;

/*5) Construa um algoritmo que calcule o valor de um terreno
baseado na sua área e valor por m2.*/

public class Numero5 {
    public static void resolucao(){

        double area, preco;

        System.out.println("Escreva a area: ");
        Scanner leia = new Scanner(System.in);
        area = leia.nextDouble();

        System.out.println("Escreva o valor por m2: ");
        preco = leia.nextDouble();

        System.out.println("O preço do terreno é de R$"+preco * area);
    }

}