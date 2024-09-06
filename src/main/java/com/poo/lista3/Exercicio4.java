package com.poo.lista3;

import java.util.Scanner;
import java.io.Console;

public class Exercicio4 {
    public static void resolucao(){

        /*4) Jogo da adivinhação. Peça para alguém escolher um número. Depois peça
        para outra pessoa tentar adivinhar. O programa deverá retornar dicas como:
        "Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio".*/

        int numeroPalpite;
        String cad_numero; 

        Scanner leia = new Scanner(System.in);
        Console console = System.console();

        System.out.println("Digite um número: ");
        
        char [] numeroArray2 = console.readPassword();
        cad_numero = new String(numeroArray2);
        int numero = Integer.parseInt(cad_numero);

        do{
            System.out.println("Tente adivinhar o número digitado: ");
            numeroPalpite = leia.nextInt();

            if (numeroPalpite == numero) {
                System.out.println("Parabéns! Você acertou.");
                

            } else if (numeroPalpite == (numero - 1) || numeroPalpite == (numero + 1) ){
                System.out.println("Está quente!");

            } else {
                System.out.println("Tá frio!");
            }

        }while(numeroPalpite != numero);

        
        

    }
}