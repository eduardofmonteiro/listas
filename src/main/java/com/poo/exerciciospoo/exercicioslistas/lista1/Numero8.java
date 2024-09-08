package com.poo.exerciciospoo.exercicioslistas.lista1;

import java.util.Scanner;

/*8) Suponha que voce trabalhe em um laboratório e seu
colega mediu a temperatura de um objeto em Fahrenheit.
Escreva um programa capaz de converter em Celsius.*/

public class Numero8 {
    public static void resolucao() {
    Scanner leia = new Scanner(System.in);

    float Fahrenheit;

    System.out.println("Digite a temperatura em Fahrenheit: ");
    Fahrenheit = leia.nextFloat();

    double Celsius = (Fahrenheit - 32) / 1.8;

    System.out.printf("A temperatura em Celsius é: %.2f",Celsius);
    }
}