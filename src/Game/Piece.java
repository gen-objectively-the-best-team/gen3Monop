package Game;

/**
 * class representing a piece in a monopoly game
 * @author @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 */
public class Piece {
    private String name;
    private Square location;

    /**
     * Piece Constructor
     * @param name Piece name
     */
    public Piece(String name, Square location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Name getter
     * @return Piece name
     */
    public String getName() {
        return name;
    }

    /**
     * Location getter
     * @return a square of the location
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Location setter
     * @param location
     */
    public void setLocation(Square location) {
        this.location = location;
    }
}
