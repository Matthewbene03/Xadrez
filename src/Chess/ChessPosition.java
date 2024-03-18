package Chess;

import boardGame.Posicao;

public class ChessPosition {
    private char coluna;
    private Integer linha;
    public ChessPosition(char coluna, Integer linha) {
        if(this.coluna < 'a' || this.coluna > 'h' || this.linha < 1 || this.linha > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    protected Posicao toPosition(){
        return new Posicao(8-this.linha, this.coluna - 'a');
    }

    protected static ChessPosition fromPosition (Posicao posicao){
        return new ChessPosition((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
    }

    public char getColuna() {
        return coluna;
    }

    public Integer getLinha() {
        return linha;
    }

    public String toString (){
        return "" + this.coluna + this.linha;
    }
}
