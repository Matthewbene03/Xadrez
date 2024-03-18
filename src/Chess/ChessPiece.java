package Chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Posicao;

public class ChessPiece extends Piece{
    private Color color;
    private Integer moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public ChessPosition getChessPosition(){
        return null;
    }

    protected boolean isThereOpponentPiece(Posicao posicao){
        return false;
    }

    protected void increaseMoveCout (){

    }

    protected void decreaseMoveCout(){

    }

    public Color getColor() {
        return color;
    }
}
