package com.poo.lista2;

import java.util.Scanner;


public class Exercicio7 {
    public static void resolucao(){
    /*7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
        um determinado número informado pelo usuário é divisível por X (Que também
        deve ser informado pelo usuário)*/

        Scanner leia = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        numero2 = leia.nextInt();
        if(numero1%numero2 == 0){
            System.out.println(numero1 + " é divisível por " + numero2 + ".");

         }else{
            System.out.println(numero1 + " NÃO é divisível por " + numero2 + ".");
        }
        
        leia.close();
    }
}