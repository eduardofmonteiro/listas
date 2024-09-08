package com.poo.exerciciospoo.exercicioslistas.lista4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

public class Lista4Application {
    public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Lista4Application.class, args);
        String opcao;
		Scanner scanner = new Scanner(System.in);
        
		do {
            System.out.println("\n=============================================\n");
            System.out.println("          MENU LISTA 4 DE EXERCÍCIOS");
            System.out.println("\n=============================================\n");
            System.out.println("1) Fechamento de Vendas");
            System.out.println("2) Maior e Menor Compra");
            System.out.println("3) Ticket Médio");
            System.out.println("4) Números Pares(Array)");
			System.out.println("5) Lista de Compras");
			System.out.println("6) Remover Item");
			System.out.println("7) Preço de Itens da Lista");
			System.out.println("8) Impressão de Preço");
			System.out.println("9) Sair");

            System.out.print("\nEscolha um exercício: ");
            
			
			opcao = scanner.nextLine(); 
   
            if ("9".equals(opcao)) { 
                System.out.println("Saindo...");
                break;
            }
            
            switch (opcao) {
                case "1":
					Numero1.resolucao();
                    break;
                case "2":
					Numero2.resolucao();
                    break;
                case "3":
					Numero3.resolucao();
                    break;
				case "4":
					Numero4.resolucao();
                    break;
				case "5":
					Numero5.resolucao();
                    break;
				case "6":
					Numero6.resolucao();
                    break;
				case "7":
					Numero7.resolucao();
                    break;
				case "8":
					Numero8.resolucao();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
			
        } 
		while (!"9".equals(opcao)); 

		scanner.close();
	}

}