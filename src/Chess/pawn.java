package Chess;

import boardGame.Board;

public class pawn extends ChessPiece{

    public pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "P";
    }
}
