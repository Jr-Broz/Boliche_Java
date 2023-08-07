package com.example;

import java.lang.Math;
import java.util.Scanner;  

public class Main {
    public static void main(String args[]) {
      
        boliche();
    }
    
    public static void boliche(){
        
        //Boliche tem 10 pinos.
        // Caso derrube 10 pinos, Strike, caso nao apenas mostrar quantos pinos foi derrubado.
        //Caso ele queira fazer uma segunda tentativa, Spare.
        
    
        // Jogada do Usuário:
        Scanner entrada = new Scanner(System.in);
        System.out.println("Jogue a bola de boliche! escreva 'jogar'");
        String usuario = entrada.nextLine();
      
        
    //Randomizar a Jogada.
        
   
        char escolha;

        do { 
                
        int numeroPinos = (int)(Math.random() * 11);

      switch(numeroPinos){

        case 0:

        System.out.println("Voce nao derrubou nenhum pino!");
        break;

        case 10:
        
        System.out.println("Parabens, foi um Strike!");
        break;

        case 1:

        System.out.println("Voce derrubou: " + numeroPinos + " pino");
        break;

        case 2:

        System.out.println("Voce derrubou: " + numeroPinos + " pinos");
        break;

        case 3:

        System.out.println("Voce derrubou: " + numeroPinos + " pinos");
        break;

        case 4:

        System.out.println("Voce derrubou: " + numeroPinos + " pinos");
        break;

        case 5:

        System.out.println("Voce derrubou: " + numeroPinos + " pinos");
        break;

        case 6:

        System.out.println("Voce derrubou: " + numeroPinos + "pinos");
        break;

        case 7:

        System.out.println("Voce derrubou: " + numeroPinos + " pinos");
        break;

        case 8:

        System.out.println("Voce derrubou: " + numeroPinos + " pinos");
        break;

        case 9:

        System.out.println("Voce derrubou: " + numeroPinos + " pinos");
        break;
      }

System.out.println("Voce quer jogar denovo ? (S|N)");
escolha = entrada.next().charAt(0);

if(escolha == 'n'  || escolha == 'N'){

    System.out.println("Obrigado por jogar, Volte Sempre!");
}


 }while(escolha == 'S' || escolha == 's');


      
 
 
    }
}