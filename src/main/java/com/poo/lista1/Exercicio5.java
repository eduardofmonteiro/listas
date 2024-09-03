package com.poo.lista1;

import java.util.Scanner;

public class Exercicio5 {
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