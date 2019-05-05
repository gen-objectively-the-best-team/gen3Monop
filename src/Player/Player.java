package Player;

import Game.*;

import java.util.ArrayList;

/**
 * class representing a player in a monopoly game
 * @author @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 */
public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private Cup cup;
    private int cash;

    /**
     * Name Player constructor
     * @param name Player name
     */
    public Player(String name) {
        this.name = name;
        cash = 1500;
    }
    /**
     * Player constructor
     * @param name Player name
     */
    public Player(String name, String piece, Board board, Cup cup) {
        this(name);
        this.piece = new Piece(piece, board.getSquare(0));
        this.board = board;
        this.cup = cup;

    }
    public void addCash(int cash) {
        if(cash > 0) {
            this.cash += cash;
        } else {
            throw new IllegalArgumentException("can't add a negative value");
        }
    }
    public void reduceCash(int cash) {
        if(cash > 0) {
            this.cash -= cash;
        } else {
            throw new IllegalArgumentException("can't reduce with a negative value");
        }
    }

    /**
     * Player getter
     * @return Player name
     */
    public String getName() {
        return name;
    }
    public void setLocation(Square location) {
        piece.setLocation(location);
    }

    /**
     * Sequence of actions of a player taking his turn
     */
    public void takeTurn() {
        cup.roll();

        System.out.println("Player " + name +
                " rolled the cup for " + cup.getTotal());
        piece.setLocation(board.getSquare(piece.getLocation(), cup.getTotal()));
        System.out.println("Player " + name +
                " landed on square " + piece.getLocation().getName());

        //piece.getLocation().landedOn(this);
    }

    public Piece getPiece(){
        return piece;
    }

    public int getNetWorth() {
        return  cash;
    }

    public Piece getPiece(){
        return piece;
    }
}
