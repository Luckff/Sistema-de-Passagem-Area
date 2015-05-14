package trabalholp2;

public class Voo {
    private String cidadeOrigem, cidadeDestino;
    private int idVoo, valorPontos;
    private float valorReal;
    private Data[] date = new Data[50];

    public Voo(String cidadeOrigem, String cidadeDestino, int idVoo, int valorPontos, float valorReal) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.idVoo = idVoo;
        this.valorPontos = valorPontos;
        this.valorReal = valorReal;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public int getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
    }

    public int getValorPontos() {
        return valorPontos;
    }

    public void setValorPontos(int valorPontos) {
        this.valorPontos = valorPontos;
    }

    public float getValorReal() {
        return valorReal;
    }

    public void setValorReal(float valorReal) {
        this.valorReal = valorReal;
    }

    public Data[] getDate() {
        return date;
    }

    public void setDate(Data[] date) {
        this.date = date;
    }
    
}
