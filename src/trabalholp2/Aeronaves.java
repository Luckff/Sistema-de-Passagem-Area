package trabalholp2;

public class Aeronaves {
    private int prefixo, capacidadeClasseA, capacidadeClasseB;
    private Voo[] voos = new Voo[50];

    public Aeronaves(int prefixo, int capacidadeClasseA, int capacidadeClasseB){
        this.prefixo = prefixo;
        this.capacidadeClasseA = capacidadeClasseA;
        this.capacidadeClasseB = capacidadeClasseB;
    }

    public int getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(int prefixo) {
        this.prefixo = prefixo;
    }

    public int getCapacidadeClasseA() {
        return capacidadeClasseA;
    }

    public void setCapacidadeClasseA(int capacidadeClasseA) {
        this.capacidadeClasseA = capacidadeClasseA;
    }

    public int getCapacidadeClasseB() {
        return capacidadeClasseB;
    }

    public void setCapacidadeClasseB(int capacidadeClasseB) {
        this.capacidadeClasseB = capacidadeClasseB;
    }

    public Voo[] getVoos() {
        return voos;
    }

    public void setVoos(Voo[] voos) {
        this.voos = voos;
    }
    
    
}
