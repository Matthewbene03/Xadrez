package Chess;

public class ChessMatch {
    private Integer turn;
    private Color currentPlayer;
    private boolean Check;
    private ChessPiece enPassantVulnerable;
    private ChessPiece promoted;
    public ChessMatch(Integer turn, Color currentPlayer, boolean check, ChessPiece enPassantVulnerable,
            ChessPiece promoted) {
        this.turn = turn;
        this.currentPlayer = currentPlayer;
        Check = check;
        this.enPassantVulnerable = enPassantVulnerable;
        this.promoted = promoted;
    }

    public ChessPiece[][] getPieces (){
        return null;
    } 

    public boolean[][] possibleMoves (ChessPosition sourcePosition){
        return null;
    }
    
    public ChessPiece performChessMove (ChessPosition sourcePosition, ChessPosition targetPosition){
        return null;
    }

    public ChessPiece replacePromotedPiece(String type){
        return null;
    }
}
