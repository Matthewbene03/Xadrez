package boardGame;

public class Posicao {
    private Integer linha;
    private Integer coluna;

    public Posicao() {
    }

    public Posicao(Integer linha, Integer coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public Integer getLinha() {
        return linha;
    }

    public Integer getColuna() {
        return coluna;
    }
    
    public void setValor (Integer linha, Integer coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return this.linha + ", " + this.coluna;
    }
}
