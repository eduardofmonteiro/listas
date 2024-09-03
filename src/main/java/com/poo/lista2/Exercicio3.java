package com.poo.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao(){
        /* 3) Um banco contratou você para que escreva um programa que será utilizado
        pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o
        cliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma
        das condições a seguir ele deve ser encaminhado para a fila preferencial. As
        condições são: Ter mais de 65 anos, se deficiente ou gestante.*/
        
        int idade;
        String def, ges;

        System.out.println("Insira sua idade: ");
        Scanner leia = new Scanner(System.in);
        idade = leia.nextInt();
        leia.nextLine();

        System.out.println("Possui algum tipo de deficiência? (S/N) ");
        def = leia.nextLine().trim().toLowerCase();
        
        System.out.println("Você é gestante? (S/N)");
        ges = leia.nextLine().trim().toLowerCase();

        if(idade > 65 || def.equals("s")|| ges.equals("s")){
            System.out.println("Fila preferencial.");
        }else{
            System.out.println("Fila comum!");
        }
        leia.close();
    }
}
