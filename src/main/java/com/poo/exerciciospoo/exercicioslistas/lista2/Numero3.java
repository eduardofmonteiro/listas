package com.poo.exerciciospoo.exercicioslistas.lista2;

import java.util.Scanner;

/*3) Um banco contratou você para que escreva um programa que será utilizado
pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o
cliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma
das condições a seguir ele deve ser encaminhado para a fila preferencial. As
condições são: Ter mais de 65 anos, se deficiente ou gestante */

public class Numero3 {
    public static void resolucao() {
    Scanner leia = new Scanner(System.in);

    String nome; 
    int condicao;
    int idade;
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nOlá cliente, para iniciar o atendimento por favor preencha os campos a seguir.\n");
    System.out.println("\n-----------------------------------------------------------------------------");
    System.out.print("\nDigite seu nome: ");
        nome = leia.nextLine();

    System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

    System.out.print("Digite sua condição (1 - Gestante / 2 - Deficiente / 0 - Nenhuma das alternativas): ");
        condicao = leia.nextInt();

     if (idade >= 65 || condicao == 1 || condicao == 2) {
        System.out.print("\nPor favor use a fila preferencial.\n");
    } else {
        System.out.print("\nPor favor use a fila comum.\n");
    }
        System.out.print("\nPrograma encerrado.\n");
    }
}