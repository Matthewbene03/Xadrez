package Chess;

import boardGame.Board;

public class ChessMatch {
    private Integer turn;
    private Color currentPlayer;
    private boolean Check;
    private ChessPiece enPassantVulnerable;
    private ChessPiece promoted;

    private Board board;

    
    
    public ChessMatch() {
        this.board = new Board(8,8);
    }

    public ChessMatch(Integer turn, Color currentPlayer, boolean check, ChessPiece enPassantVulnerable,
            ChessPiece promoted) {
        this.board = new Board(8, 8);
        this.turn = turn;
        this.currentPlayer = currentPlayer;
        Check = check;
        this.enPassantVulnerable = enPassantVulnerable;
        this.promoted = promoted;
    }

    public ChessPiece[][] getPieces (){
        ChessPiece[][] chessPieces = new ChessPiece[board.getLinhas()][board.getColunas()];
        for (int i = 0; i < board.getLinhas(); i++) {
            for (int j = 0; j < board.getColunas(); j++) {
                chessPieces[i][j] = (ChessPiece)board.piece(i, j);
            }
        }
        return chessPieces;
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
