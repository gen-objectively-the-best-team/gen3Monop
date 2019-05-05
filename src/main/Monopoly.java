package main;

import Game.MonopolyGame;

import java.util.Scanner;

public  class Monopoly {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many player? (2-8)");

        int playerNumber = myObj.nextInt();

      MonopolyGame m= new MonopolyGame(playerNumber);
       m.playGame();
    }
}
