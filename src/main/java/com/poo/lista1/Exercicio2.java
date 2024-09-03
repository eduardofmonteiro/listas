package com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        String nome, sobrenome;

        System.out.print("Digite o seu nome: ");
        nome = leia.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = leia.nextLine();

        System.out.print("Olá, "+nome+" "+sobrenome);
   
        leia.close();
    }
}
