package com.poo.exerciciospoo.exercicioslistas.lista1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Lista1Application{
	public static void main(String[] args) {
		SpringApplication.run(Lista1Application.class, args);
        String opcao;
		Scanner scanner = new Scanner(System.in);
        
		do {
            System.out.println("\n=============================================\n");
            System.out.println("          MENU LISTA 1 DE EXERCÍCIOS");
            System.out.println("\n=============================================\n");
            System.out.println("1) Soma dos Números");
            System.out.println("2) Olá, usuário");
            System.out.println("3) Conversão de Real para Dólar");
            System.out.println("4) Antecessor e Sucessor");
			System.out.println("5) Valor de uma Área");
			System.out.println("6) Gasto de Combustível");
			System.out.println("7) Média do Aluno");
			System.out.println("8) Conversão de Celsius para Fahrenheit");
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

		scanner.close(); // Fechar o scanner
	}

}