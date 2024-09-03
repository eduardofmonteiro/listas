package com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){
    int n1;

    System.out.println("Insira um número: ");
    Scanner leia = new Scanner(System.in);
    n1 = leia.nextInt();

    System.out.println("O antecessor é: "+(n1-1)+"\nE o sucessor é:"+(n1+1));   
    
    }
}
