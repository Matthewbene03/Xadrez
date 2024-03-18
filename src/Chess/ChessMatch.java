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
        this.board = new Board(8, 8);
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

    private void initialSetup() {
        board.placePiece(new King(board, Color.WHITE), new Posicao(0, 4));
        board.placePiece(new King(board, Color.BLACK), new Posicao(7, 4));
        board.placePiece(new Queen(board, Color.WHITE), new Posicao(0, 3));
        board.placePiece(new Queen(board, Color.BLACK), new Posicao(7, 3));

        board.placePiece(new Bishop(board, Color.WHITE), new Posicao(0, 2));
        board.placePiece(new Bishop(board, Color.WHITE), new Posicao(0, 5));
        board.placePiece(new Bishop(board, Color.BLACK), new Posicao(7, 5));
        board.placePiece(new Bishop(board, Color.BLACK), new Posicao(7, 2));

        board.placePiece(new Knight(board, Color.WHITE), new Posicao(0, 1));
        board.placePiece(new Knight(board, Color.WHITE), new Posicao(0, 6));
        board.placePiece(new Knight(board, Color.BLACK), new Posicao(7, 1));
        board.placePiece(new Knight(board, Color.BLACK), new Posicao(7, 6));

        board.placePiece(new Rook(board, Color.WHITE), new Posicao(0, 0));
        board.placePiece(new Rook(board, Color.BLACK), new Posicao(0, 7));
        board.placePiece(new Rook(board, Color.WHITE), new Posicao(7, 0));
        board.placePiece(new Rook(board, Color.BLACK), new Posicao(7, 7));

        for (int i = 0; i < 8; i++) {
            board.placePiece(new pawn(board, Color.BLACK), new Posicao(6, i));
        }
        for (int i = 0; i < 8; i++) {
            board.placePiece(new pawn(board, Color.WHITE), new Posicao(1, i));
        }
    }
}
