package com.poo.lista2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Lista2Application{
	public static void main(String[] args) {
		SpringApplication.run(Lista2Application.class, args);
        String opcao;
		Scanner scanner = new Scanner(System.in);
        
		do {
            System.out.println("\n=============================================\n");
            System.out.println("          MENU LISTA 2 DE EXERCÍCIOS");
            System.out.println("\n=============================================\n");
            System.out.println("1) Par ou ímpar");
            System.out.println("2) Maior ou menor");
            System.out.println("3) Fila do banco");
            System.out.println("4) Entrada do evento");
			System.out.println("5) Login");
			System.out.println("6) Média escolar");
			System.out.println("7) Identificador de divisibilidade");
			System.out.println("8) Quiz");
			System.out.println("9) Sair");

            System.out.print("\nEscolha um exercício: ");
            
			
			opcao = scanner.nextLine(); // Lê a opção como uma string
            

            //encerra o loop do menu
            if ("9".equals(opcao)) { 
                System.out.println("Saindo...");
                break;
            }
            
            switch (opcao) {
                case "1":
					Exercicio1.resolucao();
                    break;
                case "2":
					Exercicio2.resolucao();
                    break;
                case "3":
					Exercicio3.resolucao();
                    break;
				case "4":
					Exercicio4.resolucao();
                    break;
				case "5":
					Exercicio5.resolucao();
                    break;
				case "6":
					Exercicio6.resolucao();
                    break;
				case "7":
					Exercicio7.resolucao();
                    break;
				case "8":
					Exercicio8.resolucao();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
			
        } 
		while (!"9".equals(opcao)); 

		scanner.close(); // Fechar o scanner
	}

}
