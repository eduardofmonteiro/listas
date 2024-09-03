package com.poo.lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        float Fahrenheit;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        Fahrenheit = leia.nextFloat();

        double Celsius = (Fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura em Celsius é: %.2f",Celsius);
   
        leia.close();
    }
}