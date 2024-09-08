package com.poo.exerciciospoo.exercicioslistas.lista2;

import java.util.Scanner;

public class Numero8 {
    public static void resolucao(){

        /*8) Crie um joguinho de perguntas e respostas de múltipla escolha. O programa
         * deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo.
         * Se o usuário chegar até o final o programa deve exibir o número de acertos.
         */

         Scanner leia = new Scanner(System.in);
          int chances = 3;
          int pontuacao = 0;

          System.out.print("Qual é o nome do famoso personagem pequeno que é elfo doméstico em Harry Potter?" +
          "\n"+
          "a) Yoda"+
          "\n"+
          "b) Mago"+
          "\n"+
          "c) Elfo"+
          "\n"+
          "d) Dobby"+
          "\n"+
          "R: ");
          char resposta1 = leia.next().toLowerCase().charAt(0);
          if(resposta1 == 'd'){
            pontuacao ++;
          }else{
            chances--;
            System.out.print("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");  
          }
          if(chances > 0){
            System.out.print("Qual é o nome do herói que usa um escudo redondo nos filmes da Marvel?"+
            "\n"+
            "a) Homem de ferro"+
            "\n"+
            "b) Hulk"+
            "\n"+
            "c) Mario"+
            "\n"+
            "d) Capitão América"+
            "\n"+
            "R: ");
            char resposta2 = leia.next().toLowerCase().charAt(0);
            if(resposta2 == 'd'){
                pontuacao++;
            }else{
                chances--;
                System.out.print("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");
            }
            if(chances > 0){
                System.out.print("Qual é o nome do universo de super-heróis criado por Stan Lee e Jack Kirby que inclui personagens como Spider-Man e Iron Man?"+
                "\n"+
                "a) DC"+
                "\n"+
                "b) Harry Potter"+
                "\n"+
                "c) Marvel"+
                "\n"+
                "d) Senhor dos Anéis"+
                "\n"+
                "R: ");
                char resposta3 = leia.next().toLowerCase().charAt(0);
                if(resposta3 == 'c'){
                    pontuacao++;
                }else{
                    chances--;
                    System.out.print("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");
                }
                }
                if(chances > 0){
                System.out.print("Qual é o nome do famoso game de simulação de vida desenvolvido pela Maxis?"+
                "\n"+
                "a) Call of Duty"+
                "\n"+
                "b) The Sims"+
                "\n"+
                "c) inZoi"+
                "\n"+
                "d) Roblox"+
                "\n"+
                "R: ");
            char resposta4 = leia.next().toLowerCase().charAt(0);
            if(resposta4 == 'b'){
                pontuacao++;
            }else{
                chances--;
                System.out.print("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");
            }
            }
            if(chances > 0){
            System.out.print("Qual é o nome do famoso jogo de aventura e exploração onde o personagem principal é um encanador que deve salvar a Princesa dos vilões?"+
            "\n"+
            "a) Super Mario Bros"+
            "\n"+
            "b) Fortnite"+
            "\n"+
            "c) Five Nights at Freddys"+
            "\n"+
            "d) Amnesia"+
            "\n"+
            "R: ");
            char resposta5 = leia.next().toLowerCase().charAt(0);
            if(resposta5 == 'a'){
            pontuacao++;
            }else{
            chances--;
            System.out.println("Resposta errada, você tem apenas "+chances+" chances restantes."+"\n");
        }
        }
        if(chances ==0){
        System.out.println("Você esgotou suas chances! Fim de jogo.");
        }else{
        System.out.println("Sua pontuação final é de: "+pontuacao+" de 5. Parabéns, você ganhou!");
    }leia.close();}
     }     }       