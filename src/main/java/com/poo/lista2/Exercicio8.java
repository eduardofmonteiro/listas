package com.poo.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao(){

        /*8) Crie um joguinho de perguntas e respostas de múltipla escolha. O programa
         * deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo.
         * Se o usuário chegar até o final o programa deve exibir o número de acertos.
         */

         Scanner leia = new Scanner(System.in);
          int chances = 3;
          int pontuacao = 0;

          System.out.println("Qual é o nome do famoso personagem pequeno que é elfo doméstico em Harry Potter?" +
          "\n"+
          "a) Yoda "+
          "b) Mago "+
          "c) Elfo "+
          "d) Dobby ");
          char resposta1 = leia.next().toLowerCase().charAt(0);
          if(resposta1 == 'd'){
            pontuacao ++;
          }else{
            chances--;
            System.out.println("Resposta errada, você tem apenas "+chances+"chances restantes.");  
          }
          if(chances > 0){
            System.out.println("Qual é o nome do herói que usa um escudo redondo nos filmes da Marvel?"+
            "\n"+
            "a) Homem de ferro "+
            "b) Hulk "+
            "c) Mario "+
            "d) Capitão América ");
            char resposta2 = leia.next().toLowerCase().charAt(0);
            if(resposta2 == 'd'){
                pontuacao++;
            }else{
                chances--;
                System.out.println("Resposta errada, você tem apenas "+chances+"chances restantes.");
            }
            if(chances > 0){
                System.out.println("Qual é o nome do universo de super-heróis criado por Stan Lee e Jack Kirby que inclui personagens como Spider-Man e Iron Man?"+
                "\n"+
                "a) DC "+
                "b) Harry Potter "+
                "c) Marvel "+
                "d) Senhor dos Anéis ");
                char resposta3 = leia.next().toLowerCase().charAt(0);
                if(resposta3 == 'c'){
                    pontuacao++;
                }else{
                    chances--;
                    System.out.println("Resposta errada, você tem apenas "+chances+"chances restantes.");
                }
            }
            if(chances > 0){
                System.out.println("Qual é o nome do famoso game de simulação de vida desenvolvido pela Maxis?"+
                "\n"+
                "a) Call of Duty "+
                "b) The Sims "+
                "c) inZoi "+
                "d) Roblox ");
                char resposta4 = leia.next().toLowerCase().charAt(0);
                if(resposta4 == 'b'){
                    pontuacao++;
                }else{
                    chances--;
                    System.out.println("Resposta errada, você tem apenas "+chances+"chances restantes.");
                }
        }
        if(chances > 0){
            System.out.println("Qual é o nome do famoso jogo de aventura e exploração onde o personagem principal é um encanador que deve salvar a Princesa dos vilões?"+
            "\n"+
            "a) Super Mario Bros "+
            "b) Fortnite "+
            "c) Five Nights at Freddys "+
            "d) Amnesia ");
            char resposta5 = leia.next().toLowerCase().charAt(0);
            if(resposta5 == 'a'){
                pontuacao++;
            }else{
                chances--;
                System.out.println("Resposta errada, você tem apenas "+chances+" chances restantes.");
            }

            }
            if(chances ==0){
            System.out.println("Você esgotou suas chances! Fim de jogo.");
            }else{
            System.out.println("Sua pontuação final: "+pontuacao+" de 5.");
            } 
        }
    }
}