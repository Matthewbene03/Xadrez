package Chess;

import boardGame.Board;
import boardGame.Posicao;

public class ChessMatch {

    private Integer turn;
    private Color currentPlayer;
    private boolean Check;
    private ChessPiece enPassantVulnerable;
    private ChessPiece promoted;

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
        this.initialSetup();
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

    public ChessPiece[][] getPieces() {
        ChessPiece[][] chessPieces = new ChessPiece[board.getLinhas()][board.getColunas()];
        for (int i = 0; i < board.getLinhas(); i++) {
            for (int j = 0; j < board.getColunas(); j++) {
                chessPieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return chessPieces;
    }

    public boolean[][] possibleMoves(ChessPosition sourcePosition) {
        return null;
    }

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        return null;
    }

    public ChessPiece replacePromotedPiece(String type) {
        return null;
    }

    private void placeNewPiece (char coluna, Integer linha, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(coluna, linha).toPosition());
    }
    private void initialSetup() {

        placeNewPiece('e', 8, new King(board, Color.WHITE));
        placeNewPiece('e', 1, new King(board, Color.BLACK));
        placeNewPiece('d', 8, new Queen(board, Color.WHITE));
        placeNewPiece('d', 1, new Queen(board, Color.BLACK));

        placeNewPiece('c',8, new Bishop(board, Color.WHITE));
        placeNewPiece('f',8, new Bishop(board, Color.WHITE));
        placeNewPiece('c',1, new Bishop(board, Color.BLACK));
        placeNewPiece('f',1, new Bishop(board, Color.BLACK));

        placeNewPiece('b', 8, new Knight(board, Color.WHITE));
        placeNewPiece('g', 8, new Knight(board, Color.WHITE));
        placeNewPiece('b', 1, new Knight(board, Color.BLACK));
        placeNewPiece('g', 1,new Knight(board, Color.BLACK));

        placeNewPiece('a', 8, new Rook(board, Color.WHITE));
        placeNewPiece('h', 8, new Rook(board, Color.BLACK));
        placeNewPiece('a', 1, new Rook(board, Color.WHITE));
        placeNewPiece('h', 1, new Rook(board, Color.BLACK));

        /*for (int i = 0; i < 8; i++) {
            board.placePiece(new pawn(board, Color.BLACK), new Posicao(6, i));
        }
        for (int i = 0; i < 8; i++) {
            board.placePiece(new pawn(board, Color.WHITE), new Posicao(1, i));
        }*/
    }
}
