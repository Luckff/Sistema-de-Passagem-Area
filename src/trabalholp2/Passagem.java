package trabalholp2;

public class Passagem {
    private int codigoPassagem;
    private boolean bebida;
    private String comida, classeDoAviao;
    private Cliente cliente;
    private Voo vooEscolhido;

    public Passagem(int codigoPassagem, boolean bebida, String comida, String classeDoAviao, Cliente cliente, Voo vooEscolhido) {
        this.codigoPassagem = codigoPassagem;
        this.bebida = bebida;
        this.comida = comida;
        this.classeDoAviao = classeDoAviao;
        this.cliente = cliente;
        this.vooEscolhido = vooEscolhido;
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
    
    public Voo getVoo(){
        return vooEscolhido;
    }
    
    public void setVoo(Voo vooEscolhido){
        this.vooEscolhido = vooEscolhido;
    }
    
}
