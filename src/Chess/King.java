package Chess;

import boardGame.Board;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    public String toString(){
        return "K";
    }
}
