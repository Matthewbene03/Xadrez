package app;

import Chess.ChessMatch;

public class Xadrez {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
