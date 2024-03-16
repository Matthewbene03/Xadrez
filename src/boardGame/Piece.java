package boardGame;

public class Piece {

    protected Posicao posicao;
    private Board board;

    public Piece (Board board){
        this.board = board;
    }

    public Piece[][] possibleMoves(){
        return;
    }

    public boolean possibleMove(Posicao posicao){
        return false;
    }

    public boolean isThereAnyPossibleMove(){
        return false;
    }
}
