package trabalholp2;

public class Passagem {
    private int codigoPassagem;
    private boolean bebida;
    private String comida, classeDoAviao;
    private Cliente cliente;
    private int precoDaPassagem;

    public Passagem(int codigoPassagem, boolean bebida, String comida, String classeDoAviao, Cliente cliente, int precoDaPassagem) {
        this.codigoPassagem = codigoPassagem;
        this.bebida = bebida;
        this.comida = comida;
        this.classeDoAviao = classeDoAviao;
        this.cliente = cliente;
        this.precoDaPassagem = precoDaPassagem;
    }

    public int getCodigoPassagem() {
        return codigoPassagem;
    }

    public void setCodigoPassagem(int codigoPassagem) {
        this.codigoPassagem = codigoPassagem;
    }

    public boolean isBebida() {
        return bebida;
    }

    public void setBebida(boolean bebida) {
        this.bebida = bebida;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getClasseDoAviao() {
        return classeDoAviao;
    }

    public void setClasseDoAviao(String classeDoAviao) {
        this.classeDoAviao = classeDoAviao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPrecoDaPassagem() {
        return precoDaPassagem;
    }

    public void setPrecoDaPassagem(int precoDaPassagem) {
        this.precoDaPassagem = precoDaPassagem;
    }
   
    public int converterPontos(){  //Metodo incompleto.
        return(getPrecoDaPassagem());
    }
    
}