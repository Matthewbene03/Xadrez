package Chess;

import boardGame.Board;

public class Knight extends ChessPiece{

    public Knight(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString() {
        return "C";
    }
}
