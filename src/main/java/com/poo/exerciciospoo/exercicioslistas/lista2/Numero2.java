package com.poo.exerciciospoo.exercicioslistas.lista2;

import java.util.Scanner;

/*2) Desenvolva um algoritmo que seja capaz de receber dois números digitados
pelo usuário e diga qual deles é maior.*/

public class Numero2 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        float num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = leia.nextFloat();

        System.out.print("Digite o segundo número: ");
        num2 = leia.nextFloat();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior do que o segundo.");
        } else {
            System.out.println("O segundo número é maior do que o primeiro.");
        }
    }
}