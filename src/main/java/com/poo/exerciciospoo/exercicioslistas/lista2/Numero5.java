package com.poo.exerciciospoo.exercicioslistas.lista2;

import java.util.Scanner;

import java.io.Console; //adicionado para inserir console.

public class Numero5 {
    
    
    /*5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
    algum deles estiver errado o programa deve retornar ao usuário quais das opções
    está errada, se é o login ou a senha. */
    
   
        public static void resolucao() {
            
            Scanner leia = new Scanner(System.in);
            Console console = System.console(); //item para ler sem exibir os caracteres.
            String cad_login, cad_senha;
    
            System.out.println("Para realizar um cadastro preencha os campos a seguir.");
            System.out.print("Digite um usuário: ");
            cad_login = leia.nextLine();
            System.out.print("Digite uma senha: ");
            //cad_senha = leia.nextLine();
            //-----------teste comando senha oculta-------------
            cad_senha = leia.nextLine();
            //----------fim comando senha oculta----------------  
            System.out.println("-------------------------------");
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("-------------------------------");
            boolean loginCorreto = false;
    
            System.out.println("\nInsira seus dados para realizar o login. ");
    
            while (!loginCorreto) {
            
            String login, senha;
    
            System.out.print("\nDigite o seu usuário: ");
            login = leia.nextLine();
            System.out.print("Digite sua senha: ");
            //senha = leia.nextLine();
            //-----------teste comando senha oculta-------------
            char [] senhaArray2 = console.readPassword();
            senha = new String(senhaArray2);
            //----------fim comando senha oculta----------------    
            if (cad_login.equals(login) && cad_senha.equals(senha)) {
                System.out.println("\n----------------------------");
                System.out.println("Login realizado com sucesso.");
                System.out.println("----------------------------");
                loginCorreto = true;
            } else if (!cad_login.equals(login)){
                System.out.println("\n--------------------------------------------------------");
                System.out.println("O login informado não esta correto, tente novamente.");
                System.out.println("--------------------------------------------------------");
            } else if (!cad_senha.equals(senha)){
                System.out.println("\n--------------------------------------------------------");
                System.out.println("A senha informada não esta correta, tente novamente.");
                System.out.println("--------------------------------------------------------");
            }
        }
    }
}