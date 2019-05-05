package Game;

import Player.Player;

import java.util.ArrayList;

public class MonopolyGame {
    private ArrayList<Player> players;
    private int roundCnt;
    private ArrayList<Die> dice;
    private Board board;

    public MonopolyGame(int nbOfPlayers) {
        if(nbOfPlayers<2||nbOfPlayers>8){
            throw new IllegalArgumentException("nbOfPlayers must be between 2 and 8");
        }

        roundCnt = 0;
        Cup cup = new Cup();

        board = new Board();
        players = new ArrayList<>();
        for( int i = 0;i < nbOfPlayers;i++){
            players.add(new Player("player"+(i+1),"player"+(i+1), board, cup));
        }
    }

    public void playGame(){
        while(roundCnt < 20){
            System.out.println("starting turn number "+ (roundCnt+1));
            playRound();
            roundCnt++;
        }
    }


    private void playRound(){
        for (Player p:players) {
            p.takeTurn();
        }
    }



}
