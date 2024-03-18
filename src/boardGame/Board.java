package boardGame;

public class Board {
    private Integer linhas;
    private Integer colunas;
    private Piece[][] pieces;

    public Board (Integer linhas, Integer colunas){
        this. linhas = linhas;
        this.colunas = colunas;
        this.pieces = new Piece[linhas][colunas];
    }

    public Integer getLinhas() {
        return linhas;
    }

    public void setLinhas(Integer linhas) {
        this.linhas = linhas;
    }

    public Integer getColunas() {
        return colunas;
    }

    public void setColunas(Integer colunas) {
        this.colunas = colunas;
    }

    public Piece piece (Integer linha, Integer coluna){
        return pieces[linha][coluna];
    }

    public Piece piece (Posicao posicao){
        return this.pieces[posicao.getLinha()][posicao.getColuna()];
    }

    public void placePiece(Piece piece, Posicao posicao){
        this.pieces[posicao.getLinha()][posicao.getColuna()] = piece;
        piece.posicao = posicao;
    }

    public Piece removePiece (Posicao posicao){
        return this.pieces[posicao.getLinha()][posicao.getColuna()];
    }

    public boolean positionExists (Posicao posicao){
        return false;
    }

    public boolean therelsAPiece (Posicao posicao){
        return false;
    }
}
