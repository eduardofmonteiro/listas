package com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao(){
        Scanner leia = new Scanner(System.in);
    
        float num1;
    
        System.out.println("Digite um valor em (R$): ");
        num1 = leia.nextFloat();
    
        System.out.println("O valor convertido será: $" + (num1 / 5.25));
        
        leia.close();
    }
}
