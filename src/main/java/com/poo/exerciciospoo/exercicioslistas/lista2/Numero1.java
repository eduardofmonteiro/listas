package com.poo.exerciciospoo.exercicioslistas.lista2;

import java.util.Scanner;

        /*1) Escreva um programa que recebe um número digitado pelo usuário e responda
        se o número inserido é par ou ímpar ou 0.*/

public class Numero1 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = leia.nextInt();

        if (num == 0) {
        System.out.println("Esse número é zero.");}
        
        else if (num % 2 == 0) {
        System.out.println("Esse número é par.");}

        else{ 
        System.out.println("Esse número é ímpar.");}
    }
    }

    