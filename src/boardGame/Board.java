package boardGame;

public class Board {
    private Integer linhas;
    private Integer colunas;
    private Piece[][] pieces;

    public Board (Integer linhas, Integer colunas){
        if(linhas < 1 || colunas < 1){
            throw new BoardException("\"Error creating board: There must be at least 1 row and 1 columns.");
        }
        this. linhas = linhas;
        this.colunas = colunas;
        this.pieces = new Piece[linhas][colunas];
    }

    public Integer getLinhas() {
        return linhas;
    }

    public Integer getColunas() {
        return colunas;
    }

    public Piece piece (Integer linha, Integer coluna){
        if(!this.positionExists(linha, coluna))
            throw new BoardException("Position not on the board");
        return pieces[linha][coluna];
    }

    public Piece piece (Posicao posicao){
        if(!this.positionExists(posicao))
            throw new BoardException("Position not on the board");
        return this.pieces[posicao.getLinha()][posicao.getColuna()];
    }

    public void placePiece(Piece piece, Posicao posicao){
        if(this.therelsAPiece(posicao))
        throw new BoardException("There is already a piece on position " + posicao);
        this.pieces[posicao.getLinha()][posicao.getColuna()] = piece;
        piece.posicao = posicao;
    }

    public Piece removePiece (Posicao posicao){
        return this.pieces[posicao.getLinha()][posicao.getColuna()];
    }

    private boolean positionExists (Integer linhas, Integer colunas){
        return linhas>=0 && linhas<this.linhas && colunas>=0 && colunas<this.colunas;
    }

    public boolean positionExists (Posicao posicao){
        return this.positionExists(posicao.getLinha(), posicao.getColuna());
    }

    public boolean therelsAPiece (Posicao posicao){
        if(!this.positionExists(posicao))
        throw new BoardException("Position not on the board");
        return this.piece(posicao) != null;
    }
}