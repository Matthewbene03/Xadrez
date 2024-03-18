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
}
