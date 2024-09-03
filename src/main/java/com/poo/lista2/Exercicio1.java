package com.poo.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){
        
        /*1) Escreva um programa que recebe um número digitado pelo usuário e responda
        se o número inserido é par ou ímpar ou 0. */
        
        int n1, marcador;
        
        System.out.println("Insira um número: ");
        Scanner leia = new Scanner(System.in);
        n1 = leia.nextInt();
        if(n1 == 0){
            System.out.println("seu número é 0!");
        }else{
            marcador =  n1 % 2;
            if(marcador == 0){
                System.out.println("O número é par!");
            }else{
                System.out.println("O número é impar!");
            }
        }
        leia.close();
    }
}
