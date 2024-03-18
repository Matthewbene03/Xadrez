package Chess;

import boardGame.Posicao;

public class ChessPosition {
    private Integer coluna;
    private Integer linha;
    public ChessPosition(Integer coluna, Integer linha) {
        this.coluna = coluna;
        this.linha = linha;
    }

    protected Posicao toPosition(){
        return null;
    }

    protected ChessPosition fromPosition (Posicao posicao){
        return null;
    }
}
