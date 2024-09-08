package com.poo.exerciciospoo.exercicioslistas.lista1;

import java.util.Scanner;

/*2) Escreva um programa que pergunte o nome e o
sobrenome do usuário e escreva na tela: "Olá, -usuário-".*/

public class Numero2 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);

        String nome, sobrenome;

        System.out.print("Digite o seu nome: ");
        nome = leia.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = leia.nextLine();

        System.out.print("Olá, "+nome+" "+sobrenome);


    }
}