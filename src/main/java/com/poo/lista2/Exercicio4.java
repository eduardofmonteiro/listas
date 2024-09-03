package com.poo.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){
        /*4) Um cliente que promove eventos e solicitou um programa que seja capaz de
        identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não
        podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
        responsáveis. Maiores de 18 podem entrar normalmente.*/
        

        Scanner leia = new Scanner(System.in);

        int idade;
        String nome, sobrenome;

        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("\nOlá cliente, para iniciar o atendimento por favor preencha os campos a seguir.\n");
        System.out.println("\n-----------------------------------------------------------------------------\n");
        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = leia.nextLine();

        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        if (idade >= 16 && idade < 18) {
            System.out.println("Olá "+ nome + " "+ sobrenome + ", sua entrada é permitida somente acompanhado pelos responsáveis.");
        } else if (idade < 16) {
            System.out.println("Olá "+ nome + " "+ sobrenome + ", sua entrada não é permitida.");
        }
        else{
            System.out.println("Olá "+ nome + " "+ sobrenome + ", sua entrada está permitida.");
        }
        
        leia.close();
    }
}
