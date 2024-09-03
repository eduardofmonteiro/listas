package com.poo.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao(){
        /*2) Desenvolva um algoritmo que seja capaz de receber dois números digitados
        pelo usuário e diga qual deles é maior.*/
        
        int n1, n2;

        System.out.println("Insira o primeiro número: ");
        Scanner leia = new Scanner(System.in);
        n1 = leia.nextInt();
        
        System.out.println("Insira o segundo número: ");
        n2 = leia.nextInt();

        if(n1 > n2){
            System.out.println(n1 + " é maior que "+ n2);
        }else{
            System.out.println(n2 +" é maior que "+ n1);
        }        
    }
}
