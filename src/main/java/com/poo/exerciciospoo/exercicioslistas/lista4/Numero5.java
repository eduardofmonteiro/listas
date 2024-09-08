package com.poo.exerciciospoo.exercicioslistas.lista4;

    /*5) Escreva um programa que sirva como uma lista de compras de
    mercado. Você irá criar um menu que pergunte se o usuário quer inserir
    um item ou ver a lista. */

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Numero5 {

        public static void resolucao()throws InterruptedException {
        
            ArrayList<String> listaCompras = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            int opcao = 0;

    
            while (opcao != 3) {
            
            System.out.println("\n****** LISTA DE COMPRAS ******");
            System.out.println("1. Inserir itens");
            System.out.println("2. Ver a lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha a opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                   
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    listaCompras.add(item);
                    System.out.println("Item '" + item + "' adicionado à lista.");
                    break;
                
            
                case 2:
                    
                    System.out.println("\nLista de Compras: ");
                    
                    if (listaCompras.isEmpty()) {
                        
                        System.out.println("A lista está vazia.");
                    
                    } else {
                        for (int i = 0; i < listaCompras.size(); i++) {
                            
                            System.out.println((i + 1) + ". " + listaCompras.get(i));
                        }
                    }
                    break;
                
                
                case 3:
                    
                    System.out.println("Saindo...");
                    break;
                default:
                    
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
} 